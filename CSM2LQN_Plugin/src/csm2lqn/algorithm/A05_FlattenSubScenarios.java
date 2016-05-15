package csm2lqn.algorithm;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import ca.carleton.sce.puma.CSM.BranchType;
import ca.carleton.sce.puma.CSM.EndType;
import ca.carleton.sce.puma.CSM.ForkType;
import ca.carleton.sce.puma.CSM.InBindingType;
import ca.carleton.sce.puma.CSM.JoinType;
import ca.carleton.sce.puma.CSM.MergeType;
import ca.carleton.sce.puma.CSM.OutBindingType;
import ca.carleton.sce.puma.CSM.PathConnectionType;
import ca.carleton.sce.puma.CSM.RefinementType;
import ca.carleton.sce.puma.CSM.ScenarioType;
import ca.carleton.sce.puma.CSM.SequenceType;
import ca.carleton.sce.puma.CSM.StartType;
import ca.carleton.sce.puma.CSM.StepType;
import csm2lqn.utility.Csm2LqnLogger;
import csm2lqn.wrapper.ScenarioTypeWrapper;

/**
 * This algorithm step flattens the scenario. It gets rid of sub-scenarios 
 */

public class A05_FlattenSubScenarios {

	ScenarioTypeWrapper scenarioTypeWrapper;
	boolean enablestandardLogging = true; //this turns on/off normal logger. All error logging are made regardless of this flag

	public A05_FlattenSubScenarios(ScenarioTypeWrapper scenarioTypeWrapper, boolean enableLogging) 
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
	
	public void flattenScenarios() {
		flattenEachScenario( scenarioTypeWrapper );
	}
	
	/*
	 * Find the startStep and pass it along to traverseAStepType()
	 */
	private void flattenEachScenario( ScenarioTypeWrapper aScenario ) {
		//Start
		StartType start = aScenario.getScenarioType().getStartList().get(0);
		StepType step = start.getTarget().get(0); 
		traverseAStepType(step);
	}
	
	/*
	 * (1) Call flattenAStepAndAdance() which would automatically flatten a step if needed and returns the next PathConnectionType
	 * on the chain
	 * (2) Continue along the chain by calling traverseAPathConnectionType()
	 */
	private PathConnectionType traverseAStepType( StepType step ) {
		PathConnectionType successor;
		successor = flattenAStepAndAdvance(step);
		return traverseAPathConnectionType(successor);
	}
	
	/*
	 * This is a tricky method. It helps traverse along the chain. When it finds a fork (or a branch)
	 * it calculates the number of forks and traverses along each segment.   
	 */
	private PathConnectionType traverseAPathConnectionType( PathConnectionType aPathConnection ) {
		if( aPathConnection instanceof StartType ) {
			throw new IllegalArgumentException( "Start type shouldn't be here" );
		}
		else if( aPathConnection instanceof EndType ) {
			return null; 
		}
		else if( aPathConnection instanceof BranchType || aPathConnection instanceof ForkType ) {
			int numForks = aPathConnection.getTarget().size();
			log( "branching/forking of "+ aPathConnection.getId() + " number of branches/forks: "+ numForks);
			PathConnectionType aJoinOrMerge = null; 
			StepType nextStep = null; 
			
			//Traverse across each segment
			for( StepType aStep : aPathConnection.getTarget() ) {
				PathConnectionType tmp = traverseAStepType(aStep); 
				log( "returned from a segment" );
				if( tmp != null ) {
					aJoinOrMerge = tmp;
				}
			}
			
			if( aJoinOrMerge != null ) {
				//at least one of the segment hit a merge (i.e. not all the segments ended with an EndType)
				nextStep = aJoinOrMerge.getTarget().get(0);
				return traverseAStepType( nextStep );
			}
			return null;
		}
		else if( aPathConnection instanceof SequenceType ) {
			//go to the next step
			return traverseAStepType( aPathConnection.getTarget().get(0) ); 
		}
		else if( aPathConnection instanceof MergeType || aPathConnection instanceof JoinType ) {
			//just return itself, the branch or fork that started the segment will take care of continuing to the next step.
			return aPathConnection; 
		}
		
		//TODO more needs to be done for joins and merges
		//when you fork (or branch) keep a global variable of number of forks. 
		//as you hit a join or an end, decrement the variable. 
		throw new IllegalArgumentException("Shouldn't have reached here");
	}
	
	/*
	 * Flattens a Step if it has a refinement (i.e. subscenario) and returns the next 
	 * PathConnectionType in the chain
	 */
	private PathConnectionType flattenAStepAndAdvance( StepType step ) {
		//if a step doesn't have a refinement then find the step's successor and return 
		if( step.getRefinement() == null ) {
			return step.getSuccessor();
		}
		
		//The Step has a sub-scenario. Following is a sample path. The middle step is the step in question here.
		//---------Fork-------|Step|-----Sequence-----|Step|
		//--------Branch------|Step|-----Sequence-----|Step|
		//----PathConnection--|Step|--PathConnection--
		RefinementType refinement = step.getRefinement(); 
		ScenarioType subScenario = refinement.getSubScenario(); 
		InBindingType inbinding = refinement.getInBinding();
		OutBindingType outbinding = refinement.getOutBinding(); 
		
		//The predecessor could have multiple targets (i.e. the predecessor could be a Fork or a Branch)
		//We need to change the predecessor's target that's pointing to this step. 
		PathConnectionType predecessor = step.getPredecessor(); //predecessor refers to the fork in the sample above
		EList<StepType> predecessorOldTargets = predecessor.getTarget(); //predecessor's old targets
		PathConnectionType successor = step.getSuccessor(); //successor refers to the fork in the sample above
		EList<StepType> successorOldSources = successor.getSource(); //successor's old sources
		
		//We can't easily change only the specific target that was pointing to this step. 
		//Hence, create a new collection and assign the whole collection.
		EList<StepType> predecessorNewTargets = new BasicEList<>(); 
		EList<StepType> successorNewSources = new BasicEList<>();
		
		StartType subStart = null;
		StepType subFirstStep = null;
		EndType subEnd = null; 
		StepType subLastStep = null;

		System.out.println( "Flattening step "+ step.getId() + " \"" + step.getName() + "\"..." );
		
		if( inbinding != null && outbinding != null ) {
			//inbinding and outbinding are defined so follow the path specified in them.
			subStart = inbinding.getStart(); //The inbinding gives the sub-scenario's start
			subFirstStep = subStart.getTarget().get(0); //first step in the sub-scenario. Remember a start only has a single target.
			subEnd = outbinding.getEnd(); //The outbinding gives the sub-scenario's end.  
			subLastStep = subEnd.getSource().get(0);
		}
		else {
			//indbinding and outbinding are not defined so the sub-scenario only has a single start and a single end
			subStart = subScenario.getStartList().get(0);  
			subFirstStep = subStart.getTarget().get(0); //first step in the sub-scenario. Remember a start only has a single target.
			subEnd = subScenario.getEndList().get(0); 
			subLastStep = subEnd.getSource().get(0);
		}
		
		System.out.println( "    predecessor: " + predecessor.getId() );
		for( StepType predecessorTarget : predecessorOldTargets ) {
			if( predecessorTarget.getId().equals( step.getId() ) ) {
				//point the predecessor's target for this step to the first step in the sub-scenario instead
				predecessorNewTargets.add( subFirstStep );
				System.out.println( "        replaced old target " + predecessorTarget.getId() + " with new target " + subFirstStep.getId() );
			}
			else {
				predecessorNewTargets.add( predecessorTarget );
			}
		}
		//update the predecessor's target
		//IMPORTANT - This is an added (not-autogenerated) method in PathConnectionType!
		predecessor.setTarget( predecessorNewTargets ); 
		
		System.out.println( "    successor: " + successor.getId() );
		for( StepType successorSource : successorOldSources ) {
			if( successorSource.getId().equals( step.getId() ) ) {
				//point the successor's source for this step to the last step in the sub-scenario instead 
				successorNewSources.add( subLastStep );
				System.out.println( "        replaced old source " + successorSource.getId() + " with new source " + subLastStep.getId() );
			}
			else {
				successorNewSources.add( successorSource );
			}
		}
		//update the successor's source
		//IMPORTANT - This is an added (not-autogenerated) method in PathConnectionType!
		successor.setSource( successorNewSources ); 
		
		//get rid of the sub-scenario's end and point to the step's successor
		subFirstStep.setPredecessor( step.getPredecessor() );
		subStart.setTarget( null );
		//get rid of the sub-scenario's end and point to the step's successor
		subLastStep.setSuccessor( step.getSuccessor() );
		subEnd.setSource( null );
		//set predecessor and successor to null in the flattened step b/c it's no longer connected.
		step.setPredecessor( null );
		step.setSuccessor( null );
		
		System.out.println( "...done!" ); 
		System.out.println( "Step " + step.getId() + " \"" + step.getName() + "\" flattened and removed from scenario path" ); 

		//Move to the first step in the sub-scenario and flatten it. It is a recursion!
		return flattenAStepAndAdvance( subFirstStep );
	}	
}

/*
EList<StepType> stepList = stw.getAllStepTypes(); 
			for (StepType aStep : stepList)
			{
				EList<RefinementType> refinementList = aStep.getRefinement();
				if (refinementList.size() > 0)
				{
					PathConnectionType predecessor = (PathConnectionType)aStep.getPredecessor(); 
					
					RefinementType refinementType = refinementList.get(0);
					
					ScenarioType subScenario = refinementType.getSub(); //returns a ScenarioType, the sub-scenario!
					ScenarioType newSubScenario = (ScenarioType)EcoreUtil.copy(subScenario); 
					refinementType.setSub(newSubScenario); 
				}
			}
*/