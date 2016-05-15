package csm2lqn.algorithm;

import java.util.Stack;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import ca.carleton.sce.puma.CSM.BranchType;
import ca.carleton.sce.puma.CSM.CSMType;
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
import csm2lqn.utility.Constants;
import csm2lqn.utility.Csm2LqnLogger;
import csm2lqn.wrapper.ScenarioTypeWrapper;

/**
 * 
 * @author Jeevithan Muttulingam
 * 
 * This algorithm assigns components to all steps. 
 * Traverse through all scenarios element by element and assign a component to every
 * Step|CommStep|ResourceAquire|ResourceRelease|ResourcePass. 
 *
 */

public class A03_AssignComponents {

	ScenarioTypeWrapper scenarioTypeWrapper;
	boolean enablestandardLogging = true; 
	Stack<ComponentType> componentStack = null;
	ComponentType acquiredComponent = null;
	ComponentType releasedComponent = null;
	boolean flagNonNestedComponent = false;
	EList<ComponentType> componentList;

	public A03_AssignComponents(ScenarioTypeWrapper scenarioTypeWrapper, CSMType csmType, boolean enableLogging) {
		this.scenarioTypeWrapper = scenarioTypeWrapper; 
		enablestandardLogging = enableLogging; 
		componentStack = new Stack<>();
		this.componentList = csmType.getComponentList();
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
	
	public void assignComponents() 
	{
		//Start
		StartType start = scenarioTypeWrapper.getScenarioType().getStartList().get(0); 
		StepType step = start.getTarget().get(0); 
		
		traverseAStepType(step, null);
	}
	
	private PathConnectionType traverseAStepType(StepType step, ComponentType currentComponent)
	{
		if (step instanceof ResourceAcquireType)
		{
			if (((ResourceAcquireType) step).getAcquire() instanceof ComponentType){
				acquiredComponent = (ComponentType)((ResourceAcquireType) step).getAcquire(); 
				componentStack.push(acquiredComponent); 
				currentComponent = acquiredComponent; 
				step.setComponent(currentComponent); 
				
			}
		}
		else if (step instanceof ResourceReleaseType)
		{
			if (((ResourceReleaseType) step).getRelease() instanceof ComponentType){
				releasedComponent = (ComponentType)((ResourceReleaseType) step).getRelease(); 
				if (!releasedComponent.equals(currentComponent)){
					throw new IllegalStateException("ERROR: Resource Release ("+step.getId()+") of component ("+releasedComponent.getId()+") is not the same as the current component ("+currentComponent.getId()+")"); 
				}
				
				if (componentStack.isEmpty()){
					throw new IllegalStateException("ERROR: Empty stack: Resource Release ("+step.getId()+") of component ("+releasedComponent.getId()+") ");  
				}
				else if (releasedComponent.equals(componentStack.peek())) //If the stack is empty, componentStack.peek() would through a null pointer exception
				{
					step.setComponent(releasedComponent);
					componentStack.pop(); 
					
					if (!componentStack.isEmpty())
					{
						currentComponent = componentStack.peek();
					}
					else 
					{
						currentComponent = null; 
					}
				}
				else
				{
					flagNonNestedComponent = true;
				
					throw new IllegalStateException("ERROR: Resource Release ("+step.getId()+") of component ("+releasedComponent.getId()+") is not the same as the component on the top of te stack ("+currentComponent.getId()+")"); 
				}
				
			}
		}
		else if (step instanceof ResourcePassType)
		{
			//step.setComponent(currentComponent);
			
		}
		//it would be a good warning to add if it's a commStep and if the currentComponent is not null.
		else // StepType
		{
			
			step.setComponent(currentComponent);
			
			//if this step has a sub-scenario, go in there and assign components there as well
			if (step.getRefinement() != null){
				ScenarioType subScenario = step.getRefinement().getSubScenario();
				StartType start = subScenario.getStartList().get(0); 
				StepType stepNew = start.getTarget().get(0); 
				
				traverseAStepType(stepNew, currentComponent);
			}
		}

		 
		PathConnectionType successor = step.getSuccessor();  

		return traverseAPathConnectionType(successor, currentComponent);
	}

	private PathConnectionType traverseAPathConnectionType(PathConnectionType aPathConnection, ComponentType currentComponent)
	{
		if (aPathConnection instanceof StartType){
			throw new IllegalArgumentException("Start type shouldn't be here"); 
		}
		else if (aPathConnection instanceof EndType){
			
			return null; 
		}
		else if (aPathConnection instanceof ForkType){

			// With a Fork and Join, all join sources must have the same Component  
			boolean flagNonJoinComponent = false;
			PathConnectionType join = null; 
			StepType nextStep = null; 
			
			//Traverse across each segment
			for(StepType aStep : aPathConnection.getTarget()){
				 
				PathConnectionType tmp = traverseAStepType(aStep, currentComponent); 
				if (tmp != null){ //check for end type's (no-sync)
					join = tmp;
				}
			}
			
			if (join != null){
				//at least one of the segment reached a join (i.e. not all the segments ended with an EndType)
				
				//Check if all the component of the source are same.
				StepType firstSource = join.getSource().get(0);
				ComponentType firstComponent = firstSource.getComponent(); 
				for (StepType aSource : join.getSource())
				{
					if (!firstComponent.equals(aSource.getComponent())){
						flagNonJoinComponent = true; 
						throw new IllegalStateException("ERROR: With a Fork and Join, all join sources must have the same Component");
					}
				}
				
				nextStep = join.getTarget().get(0);
				
				return traverseAStepType(nextStep, currentComponent);
			}
			return null;
			
		}
		else if (aPathConnection instanceof BranchType){

			MergeType merge = null; 
			StepType nextStep = null; 
			boolean flagNonMergeComponent = false;
			boolean foundMerge= false;
			//Traverse across each segment
			for(StepType aStep : aPathConnection.getTarget()) {
				 
				MergeType tmp = (MergeType)traverseAStepType(aStep, currentComponent); 
				if (tmp != null){
					merge = tmp;
					foundMerge = true;					
				}
			}
			
			if( foundMerge ) {
				//at least one of the segment reached a merge (i.e. not all the segments ended with an EndType)
				
				StepType firstSource = merge.getSource().get(0);
				ComponentType firstComponent = firstSource.getComponent(); 
				for (StepType aSource : merge.getSource()) 
				{
					if( !firstComponent.equals(aSource.getComponent()) ) {
						flagNonMergeComponent = true; 
						
						ignoreMergeAndDuplicatePaths(merge);
					}
				}
				
				if (flagNonMergeComponent)
				{
					for (StepType aSource : merge.getSource())
					{
						nextStep = aSource.getSuccessor().getTarget().get(0); //aSource.getSuccessor() returns the new merge
						traverseAStepType(nextStep, currentComponent);
					}
					return null;
				}
				else //simple case.
				{
					nextStep = merge.getTarget().get(0);
					return traverseAStepType(nextStep, currentComponent);
				}
			}
			return null;
			
		}
		else if (aPathConnection instanceof SequenceType){
			 
			//go to the next step
			return traverseAStepType(aPathConnection.getTarget().get(0), currentComponent); 
		}
		else if (aPathConnection instanceof MergeType || aPathConnection instanceof JoinType){
			//just return itself, the branch or fork that started the segment will take care of continuing to the next step.
			return aPathConnection; 
		}
		
		throw new IllegalArgumentException("Shouldn't have reached here"); 
		

	}

	/**
	 * Duplicates the segment that follows the merge and joins it with all of the
	 * merge's sources 
	 */
	private void ignoreMergeAndDuplicatePaths(MergeType merge) {
		
		for (StepType aSource : merge.getSource()) {
			MergeType newMerge = copyMergeAndRest(merge); 
			aSource.setSuccessor(newMerge); 
		}
		
	}
	
	private MergeType copyMergeAndRest(MergeType merge) {
		MergeType newMerge = EcoreUtil.copy(merge);
		
		return newMerge;
	}

}
