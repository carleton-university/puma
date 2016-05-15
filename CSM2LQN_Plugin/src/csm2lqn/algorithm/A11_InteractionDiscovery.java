package csm2lqn.algorithm;

import java.awt.Component;
import java.util.ArrayList;
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
import ca.carleton.sce.puma.CSM.MsgKind;
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
 * This algorithm step performs interaction discover. It checks for async CommSteps. If none, then it skips interaction discovery.
 * If there are async CommSteps, it tries to determine if any of them could by sync types.  
 */
public class A11_InteractionDiscovery {

	boolean enablestandardLogging = true; // this turns on/off normal logger. All error logging are made regardless of this flag
	ScenarioTypeWrapper scenario;
	boolean reRunStep7Cleanup = false; 

	public A11_InteractionDiscovery(ScenarioTypeWrapper scenarioTypeWrapper, boolean enableLogging) {
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
	 * checks if any of the asyn CommSteps can be of sync type
	 * @return flag: indicates if any async CommSteps were changed to sync. This requires a re-run of Step 7 cleanup of RA's and RR's
	 */
	public boolean resolveInteraction() {
		StartType start = scenario.getScenarioType().getStartList().get(0);
		// start.setPathSegmentID(pathSegmentId); //Start doesn't have a segment
		// id

		Stack<Message> interactionStack = new Stack<>(); 
		StepType step = start.getTarget().get(0);
		traverseAStepType(step, interactionStack);
		
		return reRunStep7Cleanup; 
	}

	private PathConnectionType traverseAStepType(StepType step, Stack<Message> interactionStack ) {
		if (step instanceof CommStepType){
			
			CommStepType commStep = (CommStepType)step;
//			if (commStep.getMsgKind() == MsgKind.ASYNC){
//				log("Found Async msg kind"); 
				
			if (! (step.getPredecessor() instanceof StartType) && !(step.getSuccessor() instanceof EndType) ){
			
				StepType previousStep = step.getPredecessor().getSource().get(0);
				StepType nextStep = step.getSuccessor().getTarget().get(0);
				
				ComponentType receiver = nextStep.getComponent(); 
				ComponentType sender = previousStep.getComponent(); 
				
				//if previous step's component is not the same as next step's component, then this CommStep is a msg between TaskA and TaskB
				if (!receiver.equals(sender)){
					//'previous step is this CommStep's sender and the next step is this CommStep's receiver'
	
					Message currentMsg = new Message(sender, receiver, commStep);
					
					if (interactionStack.isEmpty()){
						interactionStack.push(currentMsg);
					}
					else{
						//verify if the receiver component is on the top of InteractionStack as a sender component. 
						Message firstItem = interactionStack.peek(); 
						if (firstItem.sender.equals(receiver)){ //found a sync interaction
							setMsgKind(commStep, MsgKind.REPLY);
							
							firstItem = interactionStack.pop(); 
							CommStepType firstCommStep = firstItem.commStep; 
							setMsgKind(firstCommStep, MsgKind.SYNC); 
							
							firstCommStep.setSuccCommStep(commStep);
							commStep.setPredCommStep(firstCommStep);
						}
						else{
							//verify if the receiver component is anywhere further down on the InteractionStack as a sender component. 
							if (checkIfTheReceiverWasEverASender(receiver, interactionStack)){
								setMsgKind(commStep, MsgKind.REPLY);
								
								CommStepType lastCommStep = commStep; 
								while(!interactionStack.isEmpty()){
									
									Message msg = interactionStack.pop();
									if (msg.sender.equals(receiver)){
										//this is the original call
										CommStepType originalCommStep = msg.commStep; 
										setMsgKind(originalCommStep, MsgKind.SYNC);
										originalCommStep.setSuccCommStep(lastCommStep);
										lastCommStep.setPredCommStep(originalCommStep);
										break;
										
									}
									else{ //then there is a forwarding chain
										CommStepType fwdCommStep = msg.commStep;
										setMsgKind(fwdCommStep, MsgKind.FWD);
										fwdCommStep.setSuccCommStep(lastCommStep);
										lastCommStep.setPredCommStep(fwdCommStep);
										
										lastCommStep = fwdCommStep; 
									}
									
								}
							}
							else{
								interactionStack.push(currentMsg);
							}
						}
					}
					
				}
			}
		}
		else if (step instanceof ResourceAcquireType) {
			
		}
		else if (step instanceof ResourceReleaseType) {

		}
		else if (step instanceof ResourcePassType) {

		}
		else // StepType
		{

		}

		PathConnectionType successor = step.getSuccessor();

		return traverseAPathConnectionType(successor, interactionStack);
	}

	private PathConnectionType traverseAPathConnectionType(PathConnectionType aPathConnection, Stack<Message> interactionStack ) {
		if (aPathConnection instanceof StartType) {
			throw new IllegalArgumentException("Start type shouldn't be here");
		}
		else if (aPathConnection instanceof EndType) {
			
			//IF THE CURRENT INTERACTION STACK IS NOT EMPTY, MAKE ALL MSGS ASYNC!
			if (!interactionStack.isEmpty()){
				log("Reached an End and the interaction stack is not empty. Setting all the messages to ASYNC", true); 
			}
			
			while(!interactionStack.isEmpty()){
				
				Message msg = interactionStack.pop();
				CommStepType originalCommStep = msg.commStep; 
				log("Setting commStep ("+originalCommStep.getId()+") type to ASYNC" , true);
				setMsgKind(originalCommStep, MsgKind.ASYNC);
			}
			
			return null;
		}
		else if (aPathConnection instanceof BranchType || aPathConnection instanceof ForkType) {
			PathConnectionType aJoinOrMerge = null;
			StepType nextStep = null;
			
			// Traverse across each segment
			for (StepType aStep : aPathConnection.getTarget()) {
				
				//Create a new interaction stack and pass it.
				Stack<Message> newInteractionStack = new Stack<>(); 
				
				PathConnectionType tmp = traverseAStepType(aStep, newInteractionStack);
				if (tmp != null) {
					aJoinOrMerge = tmp;
				}
			}

			if (aJoinOrMerge != null) {
				// at least one of the segment hit a merge (i.e. not all the
				// segments ended with an EndType)
				nextStep = aJoinOrMerge.getTarget().get(0);

				return traverseAStepType(nextStep, interactionStack);//HERE WE FALL BACK USING THE OLD INTERACTION STACK. 
			}
			return null;

		}
		else if (aPathConnection instanceof SequenceType) {
			// go to the next step
			return traverseAStepType(aPathConnection.getTarget().get(0), interactionStack);
		}
		else if (aPathConnection instanceof MergeType || aPathConnection instanceof JoinType) {
			
			//IF THE CURRENT INTERACTION STACK IS NOT EMPTY, MAKE ALL MSGS ASYNC!
			
			if (!interactionStack.isEmpty()){
				log("Reached a Join/Merge and the interaction stack is not empty. Setting all the messages to ASYNC", true); 
			}
			while(!interactionStack.isEmpty()){
				
				Message msg = interactionStack.pop();
				CommStepType originalCommStep = msg.commStep; 
				log("Setting commStep ("+originalCommStep.getId()+") type to ASYNC" , true);
				setMsgKind(originalCommStep, MsgKind.ASYNC);
			}
			
			// just return itself, the branch or fork that started the segment
			// will take care of continuing to the next step.
			return aPathConnection;
		}

		throw new IllegalArgumentException("Shouldn't have reached here");
	}

	public void setMsgKind(CommStepType commStep, MsgKind msgKind){
		
		if (commStep.getMsgKind() == msgKind){
			log("Confirmed interaction. commStep ("+commStep.getId()+") type confirmed as "+ msgKind);
			return;
		}
		
		if (commStep.getMsgKind() == null){
			log("Found interaction. commStep ("+commStep.getId()+") type changed from null to "+ msgKind);
			commStep.setMsgKind(msgKind);
			reRunStep7Cleanup = true; 
		}
		else if (commStep.getMsgKind() == MsgKind.ASYNC){
			if (msgKind == MsgKind.SYNC || msgKind == MsgKind.REPLY || msgKind == MsgKind.FWD){
				log("Found interaction. commStep ("+commStep.getId()+") type changed from "+commStep.getMsgKind()+" to "+msgKind);
				commStep.setMsgKind(msgKind);
				reRunStep7Cleanup = true; 
			}
			
		}
		else if (commStep.getMsgKind() == MsgKind.SYNC){
			if (msgKind == MsgKind.ASYNC || msgKind == MsgKind.REPLY || msgKind == MsgKind.FWD){
				log("Interaction Error.  commStep ("+commStep.getId()+") msgKind is "+ commStep.getMsgKind()+" but detected to be "+ msgKind);
			}
			
		}
		else if (commStep.getMsgKind() == MsgKind.REPLY){
			if (msgKind == MsgKind.ASYNC || msgKind == MsgKind.SYNC || msgKind == MsgKind.FWD){
				log("Interaction Error.  commStep ("+commStep.getId()+") msgKind is "+ commStep.getMsgKind()+" but detected to be "+ msgKind);
			}
			
		}
		else if (commStep.getMsgKind() == MsgKind.FWD){
			if (msgKind == MsgKind.ASYNC || msgKind == MsgKind.REPLY || msgKind == MsgKind.SYNC){
				log("Interaction Error.  commStep ("+commStep.getId()+") msgKind is "+ commStep.getMsgKind()+" but detected to be "+ msgKind);
			}
			
		}
		
	}
	
	public boolean checkIfTheReceiverWasEverASender(ComponentType receiver, Stack<Message> interactionStack){
		ArrayList<Message> list = new ArrayList<>(interactionStack);
		
		for (Message msg: list){
			if (msg.sender.equals(receiver)){
				return true;
			}
		}
		
		return false;
	}
	
//	public ArrayList<Message> getArrayList(){
//		ArrayList<Message> list = new ArrayList<>(interactionStack);
//		
//		return list;
//	}
	
	private class Message{
		private ComponentType sender;
		private ComponentType receiver;
		private CommStepType commStep; 
		
		public Message(ComponentType sender, ComponentType receiver, CommStepType commStep){
			this.sender = sender;
			this.receiver = receiver;
			this.commStep = commStep; 
		}

		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((commStep == null) ? 0 : commStep.hashCode());
			result = prime * result + ((receiver == null) ? 0 : receiver.hashCode());
			result = prime * result + ((sender == null) ? 0 : sender.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Message other = (Message) obj;
			if (commStep == null) {
				if (other.commStep != null)
					return false;
			}
			else if (!commStep.equals(other.commStep))
				return false;
			if (receiver == null) {
				if (other.receiver != null)
					return false;
			}
			else if (!receiver.equals(other.receiver))
				return false;
			if (sender == null) {
				if (other.sender != null)
					return false;
			}
			else if (!sender.equals(other.sender))
				return false;
			return true;
		}

	}
	
}
