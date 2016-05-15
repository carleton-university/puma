package csm2lqn.algorithm;

import java.util.Stack;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import ca.carleton.sce.puma.CSM.BranchType;
import ca.carleton.sce.puma.CSM.CommStepType;
import ca.carleton.sce.puma.CSM.ComponentType;
import ca.carleton.sce.puma.CSM.EndType;
import ca.carleton.sce.puma.CSM.ForkType;
import ca.carleton.sce.puma.CSM.JoinType;
import ca.carleton.sce.puma.CSM.MergeType;
import ca.carleton.sce.puma.CSM.PathConnectionType;
import ca.carleton.sce.puma.CSM.ResourceAcquireType;
import ca.carleton.sce.puma.CSM.ResourcePassType;
import ca.carleton.sce.puma.CSM.ResourceReleaseType;
import ca.carleton.sce.puma.CSM.SequenceType;
import ca.carleton.sce.puma.CSM.StartType;
import ca.carleton.sce.puma.CSM.StepType;
import ca.carleton.sce.puma.CSM.impl.CommStepTypeImpl;
import ca.carleton.sce.puma.CSM.impl.SequenceTypeImpl;
import csm2lqn.utility.Csm2LqnLogger;
import csm2lqn.utility.Utilities;
import csm2lqn.wrapper.ScenarioTypeWrapper;

/*
 * This algorithm step checks for presence of Commsteps. It adds new CommSteps if they are missing.
 * Commstep needs to be there before each ResourceAcquire of a component after the first one. 
 */
public class A10_CleanUpCommSteps {

	boolean enablestandardLogging = true; // this turns on/off normal logger.
											// All error logging are made
											// regardless of this flag
	ScenarioTypeWrapper scenario;
	boolean firstComponentAcquired = false;

	public A10_CleanUpCommSteps(ScenarioTypeWrapper scenarioTypeWrapper, boolean enableLogging) {
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

	/**
	 * checks for presence of CommSteps. It adds new CommSteps if the are
	 * missing
	 */
	public void checkForCommSteps() {
		StartType start = scenario.getScenarioType().getStartList().get(0);
		// start.setPathSegmentID(pathSegmentId); //Start doesn't have a segment
		// id

		StepType step = start.getTarget().get(0);
		traverseAStepType(step);
	}

	private PathConnectionType traverseAStepType(StepType step) {
		if (step instanceof ResourceAcquireType) {
			if (((ResourceAcquireType) step).getAcquire() instanceof ComponentType) {
				if (!firstComponentAcquired) {
					log("First component acuquired");
					firstComponentAcquired = true;
				}
				else {
					StepType tmp = step.getPredecessor().getSource().get(0);

					if (!(tmp instanceof CommStepType)) {
						String stepName = step.getName() != null ? step.getName() : "";
						log("Missing CommStep before ResourceAcquire " + stepName + " (" + step.getId() + ")", true);

						PathConnectionType predecessor = step.getPredecessor();
						
						//create a new CommStep and insert it before this
						insertANewCommStep(predecessor, step);
						
					}
				}

			}
		}
		else if (step instanceof ResourceReleaseType) {

		}
		else if (step instanceof ResourcePassType) {
			// step.setComponent(currentComponent);

		}
		else // StepType
		{

		}

		PathConnectionType successor = step.getSuccessor();

		return traverseAPathConnectionType(successor);
	}

	private PathConnectionType traverseAPathConnectionType(PathConnectionType aPathConnection) {
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
				PathConnectionType tmp = traverseAStepType(aStep);
				if (tmp != null) {
					aJoinOrMerge = tmp;
				}
			}

			if (aJoinOrMerge != null) {
				// at least one of the segment hit a merge (i.e. not all the
				// segments ended with an EndType)
				nextStep = aJoinOrMerge.getTarget().get(0);

				return traverseAStepType(nextStep);
			}
			return null;

		}
		else if (aPathConnection instanceof SequenceType) {
			// go to the next step
			return traverseAStepType(aPathConnection.getTarget().get(0));
		}
		else if (aPathConnection instanceof MergeType || aPathConnection instanceof JoinType) {
			// just return itself, the branch or fork that started the segment
			// will take care of continuing to the next step.
			return aPathConnection;
		}

		throw new IllegalArgumentException("Shouldn't have reached here");
	}

	public void insertANewCommStep(PathConnectionType predecessor, StepType currentTarget) {

		EList<StepType> predecessorsOldTargets = predecessor.getTarget(); // predecessor's
																			// old
																			// targets

		// We can't easily change only the specific target that was pointing to
		// the step. Hence, create a new collection
		// and assign the collection.
		EList<StepType> predecessorNewTargets = new BasicEList<>();

		System.out.println("Printing Targets before inserting commStep");
		Utilities.printTargets(predecessor);

		CommStepType commStep = new CommStepTypeImpl();
		commStep.setId(currentTarget.getId() + "Comm");

		// Now need to find the right predecessor's old target that was pointing
		// to the step in question
		for (StepType aTarget : predecessorsOldTargets) {
			if (aTarget == currentTarget) {
				// point the predecessor's target to the the first step in the
				// sub-scenario
				predecessorNewTargets.add(commStep);
			}
			else {
				// If the target is not this step, then leave it as it was
				predecessorNewTargets.add(aTarget);
			}
		}

		predecessor.setTarget(predecessorNewTargets);
		
		commStep.setPredecessor(predecessor);

		System.out.println("Printing Targets after inserting commStep");
		Utilities.printTargets(predecessor);

		/*
		 * Before: --sequence--RA Now: --sequence--CommStep--newSequence--RA
		 */
		SequenceType newSequence = new SequenceTypeImpl();
		newSequence.setId(currentTarget.getId() + "SQ");
		commStep.setSuccessor(newSequence);

		// now set the source for the newsequence
		EList<StepType> sequenceSrc = new BasicEList<>();
		sequenceSrc.add(commStep);
		newSequence.setSource(sequenceSrc);

		// now set the target for the newSequence
		EList<StepType> sequenceTarget = new BasicEList<>();
		sequenceTarget.add(currentTarget);
		newSequence.setTarget(sequenceTarget);
		
		currentTarget.setPredecessor(newSequence); 

	}
}
