package csm2lqn.algorithm;

import org.eclipse.emf.common.util.EList;

import ca.carleton.sce.puma.CSM.BranchType;
import ca.carleton.sce.puma.CSM.ComponentType;
import ca.carleton.sce.puma.CSM.EndType;
import ca.carleton.sce.puma.CSM.ForkType;
import ca.carleton.sce.puma.CSM.JoinType;
import ca.carleton.sce.puma.CSM.MergeType;
import ca.carleton.sce.puma.CSM.PathConnectionType;
import ca.carleton.sce.puma.CSM.ResourceAcquireType;
import ca.carleton.sce.puma.CSM.ResourcePassType;
import ca.carleton.sce.puma.CSM.ResourceReleaseType;
import ca.carleton.sce.puma.CSM.ScenarioType;
import ca.carleton.sce.puma.CSM.SequenceType;
import ca.carleton.sce.puma.CSM.StartType;
import ca.carleton.sce.puma.CSM.StepType;
import csm2lqn.utility.Csm2LqnLogger;
import csm2lqn.utility.Utilities;
import csm2lqn.wrapper.ScenarioTypeWrapper;

/**
 * 
 * @author Jeevithan Muttulingam
 * 
 * This step Removes duplicate ResourceAcquire and ResourceReleases in sub-scenarios
 *
 */

public class A04_RemoveDuplicateRARR {

	ScenarioTypeWrapper scenarioTypeWrapper;
	boolean enablestandardLogging = true; 
	StepType lastResourceReleaseInTheSubscenario = null; 
	
	public A04_RemoveDuplicateRARR(ScenarioTypeWrapper scenarioTypeWrapper, boolean enableLogging) 
	{
		this.scenarioTypeWrapper = scenarioTypeWrapper; 
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
	
	
	public void removeDuplicateRAandRR() 
	{
		//Start
//		StartType start = scenarioTypeWrapper.getScenarioType().getStartList().get(0); 
//		StepType step = start.getTarget().get(0); 
//		
//		traverseAStepType(step);
		
		EList<StepType> steps = scenarioTypeWrapper.getAllStepTypes(); 
		
		ComponentType parentComponent;
		for (StepType step: steps){
			if (step.getRefinement() != null){
				parentComponent = step.getComponent(); 
				lastResourceReleaseInTheSubscenario = null;
				
				ScenarioType subScenario = step.getRefinement().getSubScenario();
				StartType start = subScenario.getStartList().get(0); 
				StepType stepNew = start.getTarget().get(0); 
				
				traverseASubscenarioStepType(stepNew, parentComponent, false);
				
				//now check if the component released from the last ResourceAcquire from the subscenario is same as that of the parent step
				//If that's the case, then remove that ResourceAcquire altogether.
				
				if (lastResourceReleaseInTheSubscenario != null && lastResourceReleaseInTheSubscenario.getComponent() != null){
					
					ComponentType releasedComponent = lastResourceReleaseInTheSubscenario.getComponent();
					if (releasedComponent.equals(parentComponent)){
						System.out.println("Last RR ("+step.getId() + ") component is same as parent component");
						Utilities.removeTheGivenStep(lastResourceReleaseInTheSubscenario);
					}
				}
				
			}
		}
	}
	
	private PathConnectionType traverseASubscenarioStepType(StepType step, ComponentType parentComponent, boolean isFirstResourceAcquire) {
		
		ComponentType currentComponent;
		
		if (step instanceof ResourceAcquireType) {
			if (((ResourceAcquireType) step).getAcquire() instanceof ComponentType) {
				
				currentComponent = (ComponentType) ((ResourceAcquireType) step).getAcquire(); 
				
				if (currentComponent.equals(parentComponent) && !isFirstResourceAcquire){
					System.out.println("First RA ("+step.getId() + ") component is same as parent component");
					
					//Only do this for the first ResourceAcquire in the subscenario.
					isFirstResourceAcquire = true; 
					
					//so remove this Step
					Utilities.removeTheGivenStep(step);
					
					
					
				}
			}
		}
		else if (step instanceof ResourceReleaseType) {
			if (((ResourceReleaseType) step).getRelease() instanceof ComponentType) {
				
				lastResourceReleaseInTheSubscenario = step;

			}
		}
		else if (step instanceof ResourcePassType) {
			// step.setComponent(currentComponent);

		}
		else // StepType
		{
			//do nothing
		}

		PathConnectionType successor = step.getSuccessor();

		return traverseASubscenarioPathConnectionType(successor, parentComponent, isFirstResourceAcquire);
	}

	private PathConnectionType traverseASubscenarioPathConnectionType(PathConnectionType aPathConnection, ComponentType parentComponent, boolean isFirstResourceAcquire) {
		if (aPathConnection instanceof StartType) {
			throw new IllegalArgumentException("Start type shouldn't be here");
		}
		else if (aPathConnection instanceof EndType) {
			// aPathConnection.setPathSegmentID(segmentId); //End doesn't have a
			// segment id
			return null;
		}
		else if (aPathConnection instanceof BranchType || aPathConnection instanceof ForkType) {
			PathConnectionType aJoinOrMerge = null;
			StepType nextStep = null;

			// Traverse across each segment
			for (StepType aStep : aPathConnection.getTarget()) {
				PathConnectionType tmp = traverseASubscenarioStepType(aStep, parentComponent, isFirstResourceAcquire);
				if (tmp != null) {
					aJoinOrMerge = tmp;
				}
			}

			if (aJoinOrMerge != null) {
				// at least one of the segment hit a merge (i.e. not all the
				// segments ended with an EndType)
				nextStep = aJoinOrMerge.getTarget().get(0);

				return traverseASubscenarioStepType(nextStep, parentComponent, isFirstResourceAcquire);
			}
			return null;

		}
		else if (aPathConnection instanceof SequenceType) {
			// go to the next step
			return traverseASubscenarioStepType(aPathConnection.getTarget().get(0), parentComponent, isFirstResourceAcquire);
		}
		else if (aPathConnection instanceof MergeType || aPathConnection instanceof JoinType) {
			// just return itself, the branch or fork that started the segment
			// will take care of continuing to the next step.
			return aPathConnection;
		}

		throw new IllegalArgumentException("Shouldn't have reached here");
	}

}
