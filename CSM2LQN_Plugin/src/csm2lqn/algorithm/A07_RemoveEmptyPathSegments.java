package csm2lqn.algorithm;

import ca.carleton.sce.puma.CSM.BranchType;
import ca.carleton.sce.puma.CSM.EndType;
import ca.carleton.sce.puma.CSM.ForkType;
import ca.carleton.sce.puma.CSM.JoinType;
import ca.carleton.sce.puma.CSM.MergeType;
import ca.carleton.sce.puma.CSM.PathConnectionType;
import ca.carleton.sce.puma.CSM.SequenceType;
import ca.carleton.sce.puma.CSM.StartType;
import ca.carleton.sce.puma.CSM.StepType;
import ca.carleton.sce.puma.CSM.impl.PathConnectionTypeImpl;
import ca.carleton.sce.puma.CSM.impl.SequenceTypeImpl;
import csm2lqn.utility.Csm2LqnLogger;
import csm2lqn.wrapper.ScenarioTypeWrapper;

/**
 * 
 * @author Jeevithan Muttulingam
 * @date Jan 20, 2013
 *
 *  THIS STEP IS NOT FULLY IMPLEMENTED YET. NOT NEEDED FOR NOW.
 * This step adds host demands of all steps on a segment, removes pass segments with no demand that are not followed by a join/branch/merge or forks
 * and it replaces forks with only a single successor by sequences
 * 
 * 
 */
public class A07_RemoveEmptyPathSegments {	

	ScenarioTypeWrapper scenario;
	boolean enablestandardLogging = true; //this turns on/off normal logger. All error logging are made regardless of this flag
	
	public A07_RemoveEmptyPathSegments(ScenarioTypeWrapper scenarioTypeWrapper,  boolean enableLogging) {
		this.scenario = scenarioTypeWrapper;
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

	public void identifyPathSegmentsWithNoDemand()
	{
		StartType start = scenario.getScenarioType().getStartList().get(0); 
		
		StepType step = start.getTarget().get(0); 
		traverseAStepType(step);
	}

	private PathConnectionType traverseAStepType(StepType step)
	{
		
		step.getComponent().getHost(); 
		PathConnectionType successor = step.getSuccessor();  
		
		return traverseAPathConnectionType(successor);
	}
	
	private PathConnectionType traverseAPathConnectionType(PathConnectionType aPathConnection)
	{
		if (aPathConnection instanceof StartType){
			throw new IllegalArgumentException("Start type shouldn't be here"); 
		}
		else if (aPathConnection instanceof EndType){
			return null; 
		}
		else if (aPathConnection instanceof BranchType || aPathConnection instanceof ForkType){
			
			//only a single segment from this branch/fork, so replace this branch/fork with a sequence
			if (aPathConnection.getTarget().size() == 1){
				
			}
			else{
			
				PathConnectionType aJoinOrMerge = null; 
				StepType nextStep = null; 
				
				//Traverse across each segment
				for(StepType aStep : aPathConnection.getTarget()){
					PathConnectionType tmp = traverseAStepType(aStep); 
					if (tmp != null){
						aJoinOrMerge = tmp;
					}
				}
				
				if (aJoinOrMerge != null){
					//at least one of the segment hit a merge (i.e. not all the segments ended with an EndType)
					nextStep = aJoinOrMerge.getTarget().get(0);
					
					return traverseAStepType(nextStep);
				}
				return null;
			}
			
		}
		else if (aPathConnection instanceof SequenceType){
			//go to the next step
			return traverseAStepType(aPathConnection.getTarget().get(0)); 
		}
		else if (aPathConnection instanceof MergeType || aPathConnection instanceof JoinType){
			//just return itself, the branch or fork that started the segment will take care of continuing to the next step.
			return aPathConnection; 
		}
		
		throw new IllegalArgumentException("Shouldn't have reached here"); 

	}
}
