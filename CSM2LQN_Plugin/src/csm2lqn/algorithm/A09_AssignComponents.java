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
import ca.carleton.sce.puma.CSM.SequenceType;
import ca.carleton.sce.puma.CSM.StartType;
import ca.carleton.sce.puma.CSM.StepType;
import csm2lqn.utility.Constants;
import csm2lqn.utility.Csm2LqnLogger;
import csm2lqn.wrapper.ScenarioTypeWrapper;

/*
 * This algorithm step assigns components to Steps, ResourceAcquires, and ResourceReleases. 
 * 
 * It checks for nested components and throws an exception if nested components are found. 
 * Nested Ex: Component A is acquired, then component B is acquired, component A is released before component A. 
 * 
 * This step checks to see if all joins' sources have the same component. Throws an exception otherwise.
 * 
 * This step checks to see if all merges' sources have the same component, if not, ignores the merge and continues to 
 * treat the paths as if there is no merge.  
 * 
 */
public class A09_AssignComponents 
{

	ScenarioTypeWrapper scenario;
	
	//set global traversal variables
	Stack<ComponentType> componentStack = null;
	ComponentType acquiredComponent = null;
	ComponentType releasedComponent = null;
//	ComponentType currentComponent = null;
//	StepType currentStep = null;
//	ForkType currentFork = null;
//	JoinType currentJoin = null;
//	BranchType currentBranch = null;
//	MergeType currentMerge = null;
//	SequenceType currentSequence = null;
	boolean flagNonNestedComponent = false;
	
//	boolean flagNonMergeComponent = false;
//	boolean flagRedoTraversal = false;
//	ScenarioElementType nextElement = null;
	
	boolean enablestandardLogging = true; //this turns on/off normal logger. All error logging are made regardless of this flag
	EList<ComponentType> componentList;
	
	public A09_AssignComponents( ScenarioTypeWrapper scenarioTypeWrapper, CSMType csmType, boolean enableLogging ) {
		this.componentList = csmType.getComponentList();
		this.scenario = scenarioTypeWrapper; 
		componentStack = new Stack<>(); 
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
	
	//Set the components for steps and check for non-nested components
	public void setComponentsForSteps()
	{
		StartType start = scenario.getScenarioType().getStartList().get(0); 
		//start.setPathSegmentID(pathSegmentId); //Start doesn't have a segment id
		
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
				releasedComponent = (ComponentType)((ResourceReleaseType)step).getRelease(); 
				if (!releasedComponent.equals(currentComponent)){
					throw new IllegalStateException("ERROR: ResourceRelease ("+step.getId()+") of component ("+releasedComponent.getId()+") is not the same as the current component ("+currentComponent.getId()+")"); 
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
		
		else //StepType
		{
			if (currentComponent == null){
				log("Step " + step.getName() + " with ID "+step.getId() +" is in the environment component");
				
				step.setComponent(getEnvironmentComponent());
			}
			else{
				step.setComponent(currentComponent);
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
				
				//Check if all the component of the source's are same.
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
			//Traverse across each segment
			for(StepType aStep : aPathConnection.getTarget()){
				 
				MergeType tmp = (MergeType)traverseAStepType(aStep, currentComponent); 
				if (tmp != null){
					merge = tmp;
				}
			}
			
			if (merge != null){
				//at least one of the segment reached a merge (i.e. not all the segments ended with an EndType)
				
				StepType firstSource = merge.getSource().get(0);
				ComponentType firstComponent = firstSource.getComponent(); 
				for (StepType aSource : merge.getSource())
				{
					if (!firstComponent.equals(aSource.getComponent())){
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
	 * 
	 * @return the environment component. See Step 7 where this is set.
	 */
	private ComponentType getEnvironmentComponent(){
		
		for(ComponentType component: componentList) {
			if (component.getId().equals(Constants.ENVIRONMENT_COMPONENT_ID)){
				return component;
			}
		}
		
		throw new IllegalStateException("Environment component not found");
	}
	/**
	 * Duplicates the segment that follows the merge and joins it with all of the
	 * merge's sources 
	 */
	private void ignoreMergeAndDuplicatePaths(MergeType merge) {
		
		for (StepType aSource : merge.getSource())
		{
			MergeType newMerge = copyMergeAndRest(merge); 
			aSource.setSuccessor(newMerge); 
		}
		
	}
	
	private MergeType copyMergeAndRest(MergeType merge){
		MergeType newMerge = EcoreUtil.copy(merge);
		
		return newMerge;
	}
}
