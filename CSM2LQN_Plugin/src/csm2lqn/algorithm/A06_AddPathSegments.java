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
import csm2lqn.utility.Csm2LqnLogger;
import csm2lqn.wrapper.ScenarioTypeWrapper;

/**
 * 
 * @author Jeevithan Muttulingam
 * @date Jan 20, 2013
 *
 * This step adds path segment id attribute to steps and path connections
 */

public class A06_AddPathSegments {
	
	private int pathSegmentId = 0; 
	boolean enablestandardLogging = true; //this turns on/off normal logger. All error logging are made regardless of this flag
	ScenarioTypeWrapper scenario;
	
	public A06_AddPathSegments(ScenarioTypeWrapper scenarioTypeWrapper, boolean enableLogging) 
	{
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
	
	public void addPathSegmentIDs()
	{
		StartType start = scenario.getScenarioType().getStartList().get(0); 
		//start.setPathSegmentID(pathSegmentId); //Start doesn't have a segment id
		
		StepType step = start.getTarget().get(0); 
		traverseAStepType(step, pathSegmentId);
	}

	private PathConnectionType traverseAStepType(StepType step, int segmentId)
	{
		step.setPathSegmentID(segmentId); 
		
		PathConnectionType successor = step.getSuccessor();  
		
		return traverseAPathConnectionType(successor, segmentId);
	}
	
	private PathConnectionType traverseAPathConnectionType(PathConnectionType aPathConnection, int segmentId)
	{
		if (aPathConnection instanceof StartType){
			throw new IllegalArgumentException("Start type shouldn't be here"); 
		}
		else if (aPathConnection instanceof EndType){
			//aPathConnection.setPathSegmentID(segmentId); //End doesn't have a segment id 
			return null; 
		}
		else if (aPathConnection instanceof BranchType || aPathConnection instanceof ForkType){
//			int numForks = aPathConnection.getTarget().size();
//			log("branching/forking off. id: "+ aPathConnection.getId() + " number of branches/forks: "+ numForks);
			PathConnectionType aJoinOrMerge = null; 
			StepType nextStep = null; 
			
			//Traverse across each segment
			for(StepType aStep : aPathConnection.getTarget()){
				segmentId++; 
				PathConnectionType tmp = traverseAStepType(aStep, segmentId); 
				if (tmp != null){
					aJoinOrMerge = tmp;
				}
			}
			
			if (aJoinOrMerge != null){
				//at least one of the segment hit a merge (i.e. not all the segments ended with an EndType)
				segmentId++;
				nextStep = aJoinOrMerge.getTarget().get(0);
				
				return traverseAStepType(nextStep, segmentId);
			}
			return null;
			
		}
		else if (aPathConnection instanceof SequenceType){
			aPathConnection.setPathSegmentID(segmentId); 
			//go to the next step
			return traverseAStepType(aPathConnection.getTarget().get(0), segmentId); 
		}
		else if (aPathConnection instanceof MergeType || aPathConnection instanceof JoinType){
			//just return itself, the branch or fork that started the segment will take care of continuing to the next step.
			return aPathConnection; 
		}
		
		throw new IllegalArgumentException("Shouldn't have reached here"); 
		

	}
}
