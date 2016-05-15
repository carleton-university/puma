package csm2lqn;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;

import ca.carleton.sce.puma.CSM.CSMPackage;
import ca.carleton.sce.puma.CSM.CSMType;
import ca.carleton.sce.puma.CSM.ProcessingResourceType;
import ca.carleton.sce.puma.CSM.ScenarioType;
import ca.carleton.sce.puma.CSM.util.CSMResourceFactoryImpl;
import ca.carleton.sce.puma.CSM.util.CSMResourceImpl;
import csm2lqn.algorithm.A09_AssignComponents;
import csm2lqn.algorithm.A06_AddPathSegments;
import csm2lqn.algorithm.A01_CSMValidation;
import csm2lqn.algorithm.A08_CleanUpRARR;
import csm2lqn.algorithm.A12_GenerateLQN;
import csm2lqn.algorithm.A04_RemoveDuplicateRARR;
import csm2lqn.algorithm.A05_FlattenSubScenarios;
import csm2lqn.algorithm.A10_CleanUpCommSteps;
import csm2lqn.algorithm.A11_InteractionDiscovery;
import csm2lqn.algorithm.A02_UniqueSubScenarios;
import csm2lqn.algorithm.A03_AssignComponents;
import csm2lqn.utility.Csm2LqnLogger;
import csm2lqn.wrapper.ScenarioTypeWrapper;


public class CSMReader {

	/**
	 * User settings for logging
	 */
	boolean enablestandardLogging = true; //this turns on/off normal logger. All error logging are made regardless of this flag
	boolean enableA01Logging = false;
	boolean enableA02Logging = false;
	boolean enableA03Logging = false;
	boolean enableA04Logging = false; 
	boolean enableA05Logging = false;
	boolean enableA06Logging = false; 
	boolean enableA07Logging = false;
	boolean enableA08Logging = false;
	boolean enableA09Logging = false; 
	boolean enableA10Logging = false; 
	boolean enableA11Logging = false;
	boolean enableA12Logging = true; 
		
	public static String HAS_ERROR = "HAS ERROR";
	
	ArrayList<ScenarioTypeWrapper> scenarioTypeWrapperList; 
	ScenarioTypeWrapper scenarioTypeWrapper; //The single top level scenario type. Obtained from step 2
	String csmFilePath; 
	CSMType csmType;
	
	public static void main (String args[]){
		final String csmDirectory = "C:\\Users\\dorin\\Google Drive\\CSM";
//		final String csmDirectory = "E:\\jeevithan\\consulting\\ProfWoodside\\data\\csm2lqnEclipseProject\\TestCSMs\\June 7 2014";
//		String csmPath2 = "E:\\jeevithan\\consulting\\ProfWoodside\\data\\Andrew'sTestCSMs\\Jeeves2.csm";
//		String csmPath3 = "E:\\jeevithan\\consulting\\ProfWoodside\\data\\Andrew'sTestCSMs\\csmtest1_fixed.csm";
//		CSMReader csmReader = new CSMReader(csmPath); 
				
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run() {
				File currentDirectory = new File(csmDirectory); 
				try {
                    UIManager.setLookAndFeel(
                            UIManager.getSystemLookAndFeelClassName());
                } catch(Exception e) {
                    e.printStackTrace();
                }
				
				JFileChooser fc;
				fc = new JFileChooser(currentDirectory);
				fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
				
				int returnVal = fc.showOpenDialog(null);
				
				if (returnVal == JFileChooser.APPROVE_OPTION) {
		            File file = fc.getSelectedFile();
		            CSMReader csmReader2 = new CSMReader(file.getPath(), csmDirectory); 		            
				}
				else{
					Csm2LqnLogger.getLogger().info("No files were chosen"); 
				}
			}
		});
	}
	
	public CSMReader(String csmFile, String csmDirectory){
		this.csmFilePath = csmFile;
		csmType = loadCSMFile(csmFile);
		
		scenarioTypeWrapperList = new ArrayList<>(); 
		createScenarioTypeWrapperList(); //the wrapper list contains helper methods

		System.out.println("CSM2LQN for \"" + csmFile + "\"\n");
		
		System.out.println("A01 CSM Validation...");
		A01_CSMValidation a01 = new A01_CSMValidation(scenarioTypeWrapperList, enableA01Logging);
		if( a01.validateCSM() ) {
			System.out.println("...A01 CSM is valid\n");
//			printScenarioTypeWrapperList();  
		}
		else {
			System.out.println("...A01 CSM is NOT valid\n");
			printScenarioTypeWrapperList();
		}
				
		System.out.println("A02 Create Unique Sub-Scenarios...");
		A02_UniqueSubScenarios a02 = new A02_UniqueSubScenarios(scenarioTypeWrapperList, enableA02Logging);
		a02.createSubscenarioInstances();
		System.out.println("...A02 done\n");

		scenarioTypeWrapper = a02.findTheSingleTopLevelScenario(); 
//		printScenarioTypeWrapperList();
		
		System.out.println("A03 Assign Components to all Step types...");
		A03_AssignComponents a03 = new A03_AssignComponents(scenarioTypeWrapper, csmType, enableA03Logging);
		a03.assignComponents();
		System.out.println("...A03 done\n");
//		printScenarioTypeWrapperList();
		
		System.out.println("A04 Remove duplicate ResourceAcquire/ResourceRelease...");
		A04_RemoveDuplicateRARR a04 = new A04_RemoveDuplicateRARR(scenarioTypeWrapper, enableA04Logging);
		a04.removeDuplicateRAandRR();
		System.out.println("...A04 done\n");
//		printScenarioTypeWrapperList();
		
		System.out.println("A05 Flatten sub-scenarios...");
		A05_FlattenSubScenarios a05 = new A05_FlattenSubScenarios(scenarioTypeWrapper, enableA05Logging);
		a05.flattenScenarios();
		System.out.println("...A05 done\n");
//		printScenarioTypeWrapperList();
		
		System.out.println("A06 Add path segments...");
		A06_AddPathSegments a06 = new A06_AddPathSegments(scenarioTypeWrapper, enableA06Logging); 
		a06.addPathSegmentIDs(); 
		System.out.println("...A06 done\n");
//		printScenarioTypeWrapperList();
		
		System.out.println("A08 Clean up unnecessary ResourceAcquire/ResourceRelease...");
		A08_CleanUpRARR a08 = new A08_CleanUpRARR(scenarioTypeWrapper, csmType, enableA08Logging); 
		a08.cleanupRAsAndRRs(false);
		System.out.println("...A08 done\n");
//		printScenarioTypeWrapperList();
		
		System.out.println("A09 Assign components...");
		A09_AssignComponents a09 = new A09_AssignComponents(scenarioTypeWrapper, csmType, enableA09Logging); 
		a09.setComponentsForSteps(); 
		System.out.println("...A09 done\n");
//		printScenarioTypeWrapperList();
		
		System.out.println("A10 Clean up CommSteps...");
		A10_CleanUpCommSteps a10 = new A10_CleanUpCommSteps(scenarioTypeWrapper, enableA10Logging); 
		a10.checkForCommSteps(); 
		System.out.println("...A10 done\n");
//		printScenarioTypeWrapperList();
		
		System.out.println("A11 Interaction discovery...");
		A11_InteractionDiscovery a11 = new A11_InteractionDiscovery(scenarioTypeWrapper, enableA11Logging); 
		boolean redoRARRCleanup = a11.resolveInteraction(); 
		System.out.println("...A11 done\n");
//		printScenarioTypeWrapperList();
		
		if( redoRARRCleanup ) {
			System.out.println("Redo: A08 Clean up unnecessary ResourceAcquire/ResourceRelease...");
			a08.cleanupRAsAndRRs(true);
			System.out.println("...A08 done\n");
//			printScenarioTypeWrapperList();
		}
		
		System.out.println("A12 Generate LQN...");
		A12_GenerateLQN a12 = new A12_GenerateLQN(scenarioTypeWrapper, csmType, enableA12Logging, csmFile);
		a12.generateLQN();		
	}
	
	private void log(String msg){
		log(msg, enablestandardLogging);
	}
	
	private void log(String msg, boolean enable){
		if (enable){
			Csm2LqnLogger.getLogger().info(msg);
		}
		
	}
	
	public void printScenarioTypeWrapperList(){
		
		for (ScenarioTypeWrapper stw: scenarioTypeWrapperList)
		{
			log("--------------");
			log(stw.toString()); 
			log("");
			log("");
		}
	}
	
	public void createScenarioTypeWrapperList()
	{
		
		EList<ScenarioType> list = (EList<ScenarioType>) csmType.getScenarioList();
		for (ScenarioType scenarioType: list)
		{
			ScenarioTypeWrapper stw = new ScenarioTypeWrapper(scenarioType); 
			scenarioTypeWrapperList.add(stw); 
			
			
			
			//Print for testing
//			printIDs(stw.getAllStartTypeIDs(), "Start"); 
//			printIDs(stw.getAllStepTypeIDs(), "Step");
//			printIDs(stw.getAllResourceAcquireTypeIDs(), "ResourceAcquire");
//			printIDs(stw.getAllResourceReleaseTypeIDs(), "ResourceRelease");
			
		}
		
	}
	
	private void printIDs(ArrayList<String> ids, String type){
		log(type); 
		
		for (String id:ids){
			System.out.print(id + " "); 
		}
		
		log(""); 
	}
	
	
	
	
	
	public CSMType loadCSMFile(String csmPath)
	{
		CSMType csmType = null;
		String message = null;
		String error = null;
		
		File csmFile = new File( csmPath );

		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put( "csm", new CSMResourceFactoryImpl() );
		resourceSet.getPackageRegistry().put( "CSM.xsd", CSMPackage.eINSTANCE );
		
		CSMResourceImpl csmResource = new CSMResourceImpl( URI.createFileURI( csmPath ));
		
		resourceSet.getResources().add( csmResource );

		Map<String, Object> loadOptions = new HashMap<String, Object>();
		loadOptions.put( XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE );
//		loadOptions.put( XMLResource.OPTION_SCHEMA_LOCATION_IMPLEMENTATION, Boolean.TRUE );
		loadOptions.put( XMLResource.SCHEMA_LOCATION, "java://ca.carleton.sce.puma.CSM.CSMPackage" );
		
		try {
			FileInputStream is = new FileInputStream( csmFile );
			csmResource.load( is, loadOptions );
			csmType = (CSMType) EcoreUtil.getObjectByType( csmResource.getContents(), CSMPackage.eINSTANCE.getCSMType() );
		} catch (FileNotFoundException e) {
			message = "CSM File \"" + csmPath + "\" could not be found.";
			error = e.getMessage();
		} catch (IOException e1) {
			e1.printStackTrace();
			message = "An I/O error occurred with CSM File \"" + csmPath + "\".";
		        error = e1.getMessage();
		} 
		
		if( error != null ){
		    log(message, true);
		    log(error, true);
		}

//		log("Return csmType "+ csmType); 
		return csmType;
	}
	
}
