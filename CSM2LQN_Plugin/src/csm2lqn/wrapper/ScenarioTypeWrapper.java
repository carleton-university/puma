package csm2lqn.wrapper;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import org.eclipse.emf.common.util.EList;

import ca.carleton.sce.puma.CSM.BranchType;
import ca.carleton.sce.puma.CSM.CommStepType;
import ca.carleton.sce.puma.CSM.ComponentType;
import ca.carleton.sce.puma.CSM.EndType;
import ca.carleton.sce.puma.CSM.ForkType;
import ca.carleton.sce.puma.CSM.JoinType;
import ca.carleton.sce.puma.CSM.MergeType;
import ca.carleton.sce.puma.CSM.PathConnectionType;
import ca.carleton.sce.puma.CSM.RefinementType;
import ca.carleton.sce.puma.CSM.ResourceAcquireType;
import ca.carleton.sce.puma.CSM.ResourcePassType;
import ca.carleton.sce.puma.CSM.ResourceReleaseType;
import ca.carleton.sce.puma.CSM.ScenarioElementType;
import ca.carleton.sce.puma.CSM.ScenarioType;
import ca.carleton.sce.puma.CSM.SequenceType;
import ca.carleton.sce.puma.CSM.StartType;
import ca.carleton.sce.puma.CSM.StepType;

/**
 * 
 * @author Jeevithan Muttulingam
 * @date Nov 11, 2012
 *
 * This is a wrapper class for ScenarioType. Contains helper methods
 * 
 * TODO: Need to incorporate ResourcePassType once that's added to the csm.xsd
 *  	
 */

public class ScenarioTypeWrapper{
	ScenarioType scenarioType; 
	StringBuffer stringBuffer = new StringBuffer(); //used in toString();
	
	public ScenarioTypeWrapper (ScenarioType scenarioType)
	{
		this.scenarioType = scenarioType; 
		
	}
	
	public String getName()
	{
		return scenarioType.getName(); 
	}
	
	/*
	 * returns StartType ID's of all StartTypes in the scenario
	 */
	public ArrayList<String> getAllStartTypeIDs()
	{
		
		return getIDs(scenarioType.getStartList()); 
	}
	
	/*
	 * returns EndType ID's of all EndTypes in the scenario
	 */
	public ArrayList<String> getAllEndTypeIDs()
	{
		
		return getIDs(scenarioType.getEndList()); 
	}
	
	/*
	 * returns SequenceType ID's of all SequenceTypes in the scenario
	 */
	public ArrayList<String> getAllSequenceTypeIDs()
	{
		return getIDs(scenarioType.getSequenceList()); 
	}
	
	/*
	 * returns ForkType ID's of all ForkTypes in the scenario
	 */
	public ArrayList<String> getAllForkTypeIDs()
	{
		return getIDs(scenarioType.getForkList()); 
	}
	
	/*
	 * returns JoinType ID's of all JoinTypes in the scenario
	 */
	public ArrayList<String> getAllJoinTypeIDs()
	{
		return getIDs(scenarioType.getJoinList()); 
	}
	
	/*
	 * returns BranchType ID's of all BranchTypes in the scenario
	 */
	public ArrayList<String> getAllBranchTypeIDs()
	{
		return getIDs(scenarioType.getBranchList()); 
	}
	
	/*
	 * returns MergeType ID's of all MergeTypes in the scenario
	 */
	public ArrayList<String> getAllMergeTypeIDs()
	{
		return getIDs(scenarioType.getMergeList()); 
	}
	
	/*
	 * returns StepType ID's of all StepTypes in the scenario
	 */
	public ArrayList<String> getAllStepTypeIDs()
	{
		return getIDs(scenarioType.getStepList()); 
	}
	
	public ArrayList<String> getAllCommStepTypeIDs()
	{
		return getIDs(scenarioType.getCommStepList()); 
	}
	
	public ArrayList<String> getAllResourceAcquireTypeIDs()
	{
		return getIDs(scenarioType.getResourceAcquireList()); 
		
	}
	
	public ArrayList<String> getAllResourceReleaseTypeIDs()
	{
		return getIDs(scenarioType.getResourceReleaseList()); 
		
	}
	
	public ArrayList<String> getAllResourcePassTypeIDs()
	{
		return getIDs(scenarioType.getResourcePassList()); 
	}
	
	
	//getPathConnections Source, targets
	//get path connections by source id?
	//get
	
	/*
	 * Utility method that returns ID's of the passed in list. Returns an ArrayList of ID's
	 */
	private ArrayList<String> getIDs(EList<? extends ScenarioElementType> list){
		ArrayList<String> ids = new ArrayList<>(); 
		
		for (ScenarioElementType element: list)
		{
			
			if (element.getId() == null){
				System.out.println("SEVERE: Element missing an ID. Description: "+ element.getDescription());
				throw new NoSuchElementException("Element missing an ID. Description: "+ element.getDescription());
			}
			ids.add(element.getId()); 
		}
		
		return ids;
	}
	
	public ScenarioType getScenarioType()
	{
		return scenarioType;
	}
	
	public EList<StartType> getAllStartTypes()
	{
		return (EList<StartType>) scenarioType.getStartList(); 
	}
	
	public EList<EndType> getAllEndTypes()
	{
		return (EList<EndType>) scenarioType.getEndList(); 
	}
	
	public EList<SequenceType> getAllSequenceTypes()
	{
		return (EList<SequenceType>) scenarioType.getSequenceList(); 
	}
	
	public EList<ForkType> getAllForkTypes()
	{
		return (EList<ForkType>) scenarioType.getForkList(); 
	}
	
	public EList<JoinType> getAllJoinTypes()
	{
		return (EList<JoinType>) scenarioType.getJoinList(); 
	}
	
	public EList<BranchType> getAllBranchTypes()
	{
		return (EList<BranchType>) scenarioType.getBranchList(); 
	}
	
	public EList<MergeType> getAllMergeTypes()
	{
		return (EList<MergeType>) scenarioType.getMergeList(); 
	}
	
	public EList<StepType> getAllStepTypes()
	{
		return (EList<StepType>) scenarioType.getStepList(); 
	}
	
	public EList<CommStepType> getAllCommStepTypes()
	{
		return (EList<CommStepType>) scenarioType.getCommStepList(); 
	}
	
	public EList<ResourceAcquireType> getAllResourceAcquireTypes()
	{
		return scenarioType.getResourceAcquireList(); 
	}
	
	public EList<ResourceReleaseType> getAllResourceReleaseTypes()
	{
		return scenarioType.getResourceReleaseList(); 
	}
	
	public EList<ResourcePassType> getAllResourcePassTypes()
	{
		return scenarioType.getResourcePassList(); 
	}
	
	
//	private String printPathConnectionType(PathConnectionType aPathConnection){
//		String returnString;
//		
//		
//		if (aPathConnection instanceof StartType){
//			throw new IllegalArgumentException("Start type shouldn't be here"); 
//		}
//		else if (aPathConnection instanceof EndType){
//			return "End id: "+ aPathConnection.getId() + " source id: "+ aPathConnection.getSource().get(0).getId(); 
//		}
//		else if (aPathConnection instanceof BranchType){
//			
//			for(StepType aStep : aPathConnection.getTarget()){
//				returnString = "Branch id: "+ aPathConnection.getId() + " source id: "+ aPathConnection.getSource().get(0).getId() + " target id: "+ aPathConnection.getTarget().get(0).getId();
//				returnString += "\n";
//				return returnString + printStepType(aStep); 
//			}
//		}
//		else if (aPathConnection instanceof ForkType){
//			
//			returnString = "Fork id: "+ aPathConnection.getId() + " source id: "+ aPathConnection.getSource().get(0).getId(); 
//			returnString += "\n";
//			
//			for(StepType aStep : aPathConnection.getTarget()){
//				returnString += printStepType(aStep); 
//				returnString += "\n";
//			}
//			return returnString;
//		}
//		else if (aPathConnection instanceof SequenceType){
//			returnString = "Sequence id: "+ aPathConnection.getId() + " source id: "+ aPathConnection.getSource().get(0).getId() + " target id: "+ aPathConnection.getTarget().get(0).getId();
//			returnString += "\n";
//			return returnString + printStepType(aPathConnection.getTarget().get(0)); 
//		}
//		else if (aPathConnection instanceof MergeType){
//			returnString = "Merge id: "+ aPathConnection.getId() + " source id: #hard to print "/*+ aPathConnection.getSource().get(0).getId() */+  " target id: "+ aPathConnection.getTarget().get(0).getId();
//			returnString += "\n";
//			return returnString + printStepType(aPathConnection.getTarget().get(0)); 
//		}
//		else if (aPathConnection instanceof JoinType){
//			returnString = "Join id: "+ aPathConnection.getId() + " source id: #hard to print "/*+ aPathConnection.getSource().get(0).getId() */+  " target id: "+ aPathConnection.getTarget().get(0).getId();
//			returnString += "\n";
//			return returnString + printStepType(aPathConnection.getTarget().get(0)); 
//		}
//		
//		throw new IllegalArgumentException("Shouldn't have reached here"); 
//	}
//	
//	private String printStepType(StepType aStep){
//		String returnString;
//		
//		String stepstring;
//		if (aStep instanceof StepType){
//			stepstring = "Step";
//		}
//		else if (aStep instanceof ResourceAcquireType){
//			stepstring = "ResourceAcquire";
//		}
//		else if (aStep instanceof ResourceReleaseType){
//			stepstring = "ResourceRelease";
//		}
//		else{
//			stepstring = "ResourcePass";
//		}
//			
//		returnString = stepstring + " id: "+ aStep.getId() + " predecessor: "+ aStep.getPredecessor().get(0).getId() + " successor: "+ aStep.getSuccessor().get(0).getId();
//		returnString += "\n";
//		return returnString + printPathConnectionType((PathConnectionType)aStep.getSuccessor().get(0));
//	}
//	
//	private String printScenarioType(){
//		String toReturn; 
//		
//		toReturn = "Scenario id: "+ scenarioType.getId() + " name: " + scenarioType.getName();
//		toReturn += "\n";
//		
//		for(StartType start: getAllStartTypes()){
//			toReturn += "Start id: "+ start.getId() + " target: " + start.getTarget().get(0).getId();
//			toReturn += "\n";
//			toReturn += printStepType(start.getTarget().get(0)); 
//			
//		}
//		
//		return toReturn.toString(); 
//		
//	}
	
	//-----------------------------------------------------------------------------
	//-----------------------------------------------------------------------------
	
	private PathConnectionType printPathConnectionType_method_2(PathConnectionType aPathConnection){
		
		if (aPathConnection instanceof StartType){
			throw new IllegalArgumentException("Start type shouldn't be here"); 
		}
		else if (aPathConnection instanceof EndType){
			stringBuffer.append("End ("+ aPathConnection.getId() + ")").append("\n");
			return null;
		}
		else if (aPathConnection instanceof BranchType || aPathConnection instanceof ForkType){
			int numForks = aPathConnection.getTarget().size();
//			System.out.println("branching/forking off. id: "+ aPathConnection.getId() + " number of branches/forks: "+ numForks);
			PathConnectionType aJoinOrMerge = null; 
			StepType nextStep = null;
			
			if (aPathConnection instanceof BranchType){
				stringBuffer.append("Branch ("+ aPathConnection.getId() + ")");
			}
			else{
				stringBuffer.append("Fork ("+ aPathConnection.getId() + ")");
			}
			
			//List all the steps in the branch/fork
			for(StepType aStep : aPathConnection.getTarget()){
				stringBuffer.append(" - Step: "+ aStep.getId()); 
			}
			stringBuffer.append("\n");
			
			//Traverse each individual segment after the branch/fork
			for(StepType aStep : aPathConnection.getTarget()){
				PathConnectionType tmp = printStepType_method_2(aStep); 
				if (tmp != null){
					aJoinOrMerge = tmp;
				}
			}
			
			if (aJoinOrMerge != null){
				//at least one of the segment hit a merge (i.e. not all the segments ended with an EndType)
				nextStep = aJoinOrMerge.getTarget().get(0);
				
				return printStepType_method_2(nextStep);
			}
			return null;
			
		}
		else if (aPathConnection instanceof SequenceType){
			stringBuffer.append("     Sequence ("+ aPathConnection.getId() + ")").append("  SegmentID "+aPathConnection.getPathSegmentID()).append("\n");
			
			return printStepType_method_2(aPathConnection.getTarget().get(0)); 
		}
		else if (aPathConnection instanceof MergeType || aPathConnection instanceof JoinType){
			if (aPathConnection instanceof MergeType){
				stringBuffer.append("Merge ("+ aPathConnection.getId() + ")").append("\n");; 
			}
			else{
				stringBuffer.append("Join ("+ aPathConnection.getId() + ")").append("\n");; 
			}
			
			
			return aPathConnection; 
		}

		
		throw new IllegalArgumentException("Shouldn't have reached here"); 
	}
	
	/**
	 * Prints the StepType and continues. If the step has a sub-scenario, it prints the
	 * sub-scenario as well. 
	 */
	private PathConnectionType printStepType_method_2(StepType aStep){
		
		
		if (aStep instanceof ResourceAcquireType){
			stringBuffer.append("+ ResourceAcquire");
		}
		else if (aStep instanceof ResourceReleaseType){
			stringBuffer.append("- ResourceRelease");
		}
		else if (aStep instanceof ResourcePassType){
			stringBuffer.append("* ResourcePass");
		}
		else if (aStep instanceof CommStepType){
			stringBuffer.append("CommStep");
		}
		else{
			stringBuffer.append("Step");
		}
			
		String componentName = (aStep.getComponent() != null) ? aStep.getComponent().getName() : "none"; 
		stringBuffer.append(" ("+ aStep.getId() + ")").append("  SegmentID "+aStep.getPathSegmentID()).append("  Component: "+componentName);
		if (aStep instanceof CommStepType){
			stringBuffer.append(" MsgKind: "+ ((CommStepType)aStep).getMsgKind());
		}
		stringBuffer.append("\n");
		
		
		//check if the step has a sub-scenario
		if (aStep.getRefinement() == null){
			return printPathConnectionType_method_2(aStep.getSuccessor());
		}
		else //Step has sub-scenarios
		{
			RefinementType refinementType = aStep.getRefinement(); 
			ScenarioType subScenario = refinementType.getSubScenario();
			
			//First print the sub-scenario
			printScenarioType_method_2(subScenario);
			//Then continue along the path and print the next PathconnectionType
			return printPathConnectionType_method_2(aStep.getSuccessor());
		}
		
	}	
	
	private void printScenarioType_method_2(ScenarioType aScenario){
		
		stringBuffer.append("Scenario id: "+ aScenario.getId() + " name: " + aScenario.getName());
		stringBuffer.append("\n");
		
		for(StartType start: aScenario.getStartList()){//since a scenario should only have a single start, the for loop is not necessary
			stringBuffer.append("Start ("+ start.getId() + ")"); 
			stringBuffer.append("\n");
			
			//find the first step and print it
			printStepType_method_2(start.getTarget().get(0)); 
			
		}
		
		
		
		//return toReturn.toString(); 
		
	}
	
	/**
	 * There are two ways in which the scenario type can be printed: 
	 *   method_1 - is a detail list
	 *   method_2 - is a shorter version
	 */
	public String toString(){
		stringBuffer.setLength(0);// clears the stringBuffer 
		
		printScenarioType_method_2 (scenarioType);
		return stringBuffer.toString(); 
	}
}
