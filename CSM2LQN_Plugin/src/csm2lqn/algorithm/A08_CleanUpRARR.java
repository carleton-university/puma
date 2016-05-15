package csm2lqn.algorithm;

import org.eclipse.emf.common.util.EList;

import ca.carleton.sce.puma.CSM.CSMType;
import ca.carleton.sce.puma.CSM.CommStepType;
import ca.carleton.sce.puma.CSM.ComponentType;
import ca.carleton.sce.puma.CSM.MsgKind;
import ca.carleton.sce.puma.CSM.ResourceAcquireType;
import ca.carleton.sce.puma.CSM.ResourceReleaseType;
import ca.carleton.sce.puma.CSM.impl.ComponentTypeImpl;
import csm2lqn.utility.Csm2LqnLogger;
import csm2lqn.utility.Utilities;
import csm2lqn.utility.Constants;
import csm2lqn.wrapper.ScenarioTypeWrapper;

/**
 * Step Seven: clean up of resource acquires and resource releases
 * 
 if CommStep.msgType == sync then
  //do NOT release caller component
  if CommStep is preceded by ResourceRelease then
    if CommStep.txComp == ResourceRelease.release then
      remove ResourceRelease preceding CommStep


 if CommStep.type == reply then
  //do NOT acquire receiver component
  if CommStep is followed by ResourceAcquire then
    if CommStep.rcvComp == ResourceAcquire.acquire then
      remove ResourceAcquire following CommStep
      
 */

public class A08_CleanUpRARR {

	ScenarioTypeWrapper scenario;
	CSMType csm; 
	boolean enablestandardLogging = true; //this turns on/off normal logger. All error logging are made regardless of this flag
	
	public A08_CleanUpRARR( ScenarioTypeWrapper scenarioTypeWrapper, CSMType csm, boolean enableLogging ) {
		this.scenario = scenarioTypeWrapper; 
		this.csm = csm;
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
	
	public void cleanupRAsAndRRs( boolean reRun ) {
		
		cleanUpTxAndRcvComponents(reRun); 
		
		EList <CommStepType> commSteps = scenario.getAllCommStepTypes(); 
		
		for (CommStepType commStep: commSteps){
			
			if (commStep.getMsgKind() == MsgKind.SYNC){ 
				//do NOT release caller component
					
				
				if (commStep.getPredecessor().getSource() != null && commStep.getPredecessor().getSource().size() > 0 && commStep.getPredecessor().getSource().get(0) instanceof ResourceReleaseType){
					ResourceReleaseType resourceRelease = (ResourceReleaseType)commStep.getPredecessor().getSource().get(0); 
					ComponentType releasedComponent = (ComponentType)resourceRelease.getRelease(); 
					
					if (releasedComponent.equals(commStep.getTxComp())){
						//remove the ResourceRelease preceding the CommStep
						System.out.println("Removing ResourceRelease ("+ resourceRelease.getId() +") preceding the CommStep");
						Utilities.removeTheGivenStep(resourceRelease); 
					}
				}
			}
			else if (commStep.getMsgKind() == MsgKind.REPLY){
				//do NOT acquire receiver component
				
				if (commStep.getSuccessor().getTarget() != null && commStep.getSuccessor().getTarget().size() > 0 && commStep.getSuccessor().getTarget().get(0) instanceof ResourceAcquireType){
					ResourceAcquireType resourceAcquire = (ResourceAcquireType)commStep.getSuccessor().getTarget().get(0);
					ComponentType acquiredComponent = (ComponentType) resourceAcquire.getAcquire();
					
					if (acquiredComponent.equals(commStep.getRcvComp())){
						//remove ResourceAcquire following CommStep
						System.out.println("Removing ResourceAcquire ("+ resourceAcquire.getId() +") following reply CommStep (" + commStep.getId() + ")");
						Utilities.removeTheGivenStep(resourceAcquire); 
					}
				}
			}
		}
	}

	private void cleanUpTxAndRcvComponents(boolean reRun) {
		
		if (reRun){
			return;
		}
		
		EList <CommStepType> commSteps = scenario.getAllCommStepTypes(); 
		
		ComponentType environmentComponent = new ComponentTypeImpl();
		environmentComponent.setId(Constants.ENVIRONMENT_COMPONENT_ID);
		environmentComponent.setName("Environment"); 
		csm.getComponentList().add(environmentComponent); 
		
		
		for (CommStepType commStep: commSteps){
			if (commStep.getRcvComp() == null){
				commStep.setRcvComp(environmentComponent);
			}
			if (commStep.getTxComp() == null){
				commStep.setTxComp(environmentComponent);
			}
		}
		
	}
}
