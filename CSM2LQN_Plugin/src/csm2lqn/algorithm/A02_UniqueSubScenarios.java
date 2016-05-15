package csm2lqn.algorithm;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import ca.carleton.sce.puma.CSM.RefinementType;
import ca.carleton.sce.puma.CSM.ScenarioType;
import ca.carleton.sce.puma.CSM.StepType;
import csm2lqn.utility.Csm2LqnLogger;
import csm2lqn.wrapper.ScenarioTypeWrapper;

/**
 * 
 * @author Jeevithan Muttulingam
 * 
 * This step copies sub-scenarios so that each reference to the sub-scenario is unique. 
 *
 */
public class A02_UniqueSubScenarios {

	ArrayList<ScenarioTypeWrapper> scenarioTypeWrapperList;
	ArrayList<String> subScenarioList; //Names of subscenarios that needs to be removed from the top level scenarioTypeWrapperList after flattening 
	boolean enablestandardLogging = true; 
	
	public A02_UniqueSubScenarios(ArrayList<ScenarioTypeWrapper> scenarioTypeWrapperList, boolean enableLogging) 
	{
		this.scenarioTypeWrapperList = scenarioTypeWrapperList; 
		this.subScenarioList = new ArrayList<>(); 
		enablestandardLogging = enableLogging; 
	}

	private void log( String msg ) {
		log( msg, enablestandardLogging );
	}
	
	private void log( String msg, boolean enable ) {
		if ( enable ) {
			Csm2LqnLogger.getLogger().info( msg );
		}
	}
	
	private void forceLog( String msg ) {
		Csm2LqnLogger.getLogger().info( msg );
	}
		
	public void createSubscenarioInstances() 
	{	
		for (ScenarioTypeWrapper stw: scenarioTypeWrapperList)
		{
			EList<StepType> stepList = stw.getAllStepTypes(); 
			for (StepType stepType : stepList)
			{
				if (stepType.getRefinement() != null)
				{
					RefinementType refinementType = stepType.getRefinement();
					
					ScenarioType subScenario = refinementType.getSubScenario(); //returns a ScenarioType, the sub-scenario!
					ScenarioType newSubScenario = (ScenarioType)EcoreUtil.copy(subScenario); 
					refinementType.setSubScenario(newSubScenario); 
					
					//keep track of all the sub-scenario names
					subScenarioList.add(subScenario.getName()); 
				}
			}
		}
	}

	public ScenarioTypeWrapper findTheSingleTopLevelScenario() 
	{
		Iterator<ScenarioTypeWrapper> itr = scenarioTypeWrapperList.iterator(); 
		
		while(itr.hasNext()) {
			ScenarioTypeWrapper stw = itr.next(); 
			if (subScenarioList.contains(stw.getName())){
				log("Found a sub-scenario in the top level"); 
				itr.remove(); 
			}
		}
		
		if (scenarioTypeWrapperList.size() != 1) {
			forceLog( "WARNING: Multiple top level scenarios found" ); 
		}
		
		log( "Remaining Top Level Scenario: " + scenarioTypeWrapperList.get(0).getName() ); 
		return scenarioTypeWrapperList.get(0);
	}
}