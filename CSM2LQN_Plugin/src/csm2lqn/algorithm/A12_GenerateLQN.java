package csm2lqn.algorithm;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Stack;
import java.util.Vector;

import lqnModel.Activity;
import lqnModel.ActivitySequenceException;
import lqnModel.Entry;
import lqnModel.GenericCall;
import lqnModel.Model;
import lqnModel.Processor;
import lqnModel.Task;
import lqnXML.XmlParser;

import org.eclipse.emf.common.util.EList;

import com.sun.org.apache.xerces.internal.parsers.XMLParser;

import ca.carleton.sce.puma.CSM.BranchType;
import ca.carleton.sce.puma.CSM.CSMType;
import ca.carleton.sce.puma.CSM.CommStepType;
import ca.carleton.sce.puma.CSM.ComponentType;
import ca.carleton.sce.puma.CSM.EndType;
import ca.carleton.sce.puma.CSM.ForkType;
import ca.carleton.sce.puma.CSM.JoinType;
import ca.carleton.sce.puma.CSM.MergeType;
import ca.carleton.sce.puma.CSM.MessageType;
import ca.carleton.sce.puma.CSM.MsgKind;
import ca.carleton.sce.puma.CSM.PathConnectionType;
import ca.carleton.sce.puma.CSM.ProcessingResourceType;
import ca.carleton.sce.puma.CSM.ResourceAcquireType;
import ca.carleton.sce.puma.CSM.ResourcePassType;
import ca.carleton.sce.puma.CSM.ResourceReleaseType;
import ca.carleton.sce.puma.CSM.SequenceType;
import ca.carleton.sce.puma.CSM.StartType;
import ca.carleton.sce.puma.CSM.StepType;
import csm2lqn.utility.Constants;
import csm2lqn.utility.Csm2LqnLogger;
import csm2lqn.wrapper.ScenarioTypeWrapper;

/**
 * This step generates the LQN
 *
 *  1. Create LQN Model
 *  2. Create LQN Processors one for each CSM Processing Resource
 *  3. Create LQN Tasks one for each CSM Component
 *  4. Create LQN Entries one for each CSM CompStep that makes a call (SYNC, ASYNC, and FWD. NOT for REPLY)
 *  5. Create LQN Activities one for each CSM 'regular' Step.
 *  6. Traverse CSM and connect Activities
 */
public class A12_GenerateLQN {
	
	HashMap<Task, TaskTracker> taskTrackerMap;  
	HashMap<String, Processor> processorMap; //<ProcessingResourceId, Processor>
	HashMap<String, Task> taskMap; //<ComponentId, Task>
	
	EList<ProcessingResourceType> processingResourceList;
	EList<ComponentType> componentList;
	EList<CommStepType> commStepsList; 
	EList<StepType> stepsList; 
	EList<ForkType> forksList;
	EList<JoinType> joinsList;
	EList<BranchType> branchList;
	EList<MergeType> mergeList;
	ScenarioTypeWrapper scenario;
	boolean enablestandardLogging = true; //this turns on/off normal logger. All error logging are made regardless of this flag
	
	//some more global variables
	private Model lqn;
	private Processor lqnInfiniteProcessor;
	
	//lqn output file
	File outputFile;
	File outputFileX;
	
	public A12_GenerateLQN(ScenarioTypeWrapper scenarioTypeWrapper, CSMType csmType, boolean enableLogging, String csmFile) 
	{
		this.processingResourceList = csmType.getProcessingResourceList(); 
		this.componentList = csmType.getComponentList();
		this.commStepsList = scenarioTypeWrapper.getAllCommStepTypes(); 
		this.stepsList = scenarioTypeWrapper.getAllStepTypes(); 
		this.forksList = scenarioTypeWrapper.getAllForkTypes();
		this.joinsList = scenarioTypeWrapper.getAllJoinTypes();
		this.branchList = scenarioTypeWrapper.getAllBranchTypes(); 
		this.mergeList = scenarioTypeWrapper.getAllMergeTypes(); 
		this.scenario = scenarioTypeWrapper; 
		enablestandardLogging = enableLogging;
		
		taskTrackerMap = new HashMap<>(); 
		processorMap = new HashMap<>(); 
		taskMap = new HashMap<>();
		
		File inputFile = new File(csmFile);
		//System.out.println("Directory: " + inputFile.getParent());
		//System.out.println("Input file: " + inputFile);
		
		String inputFileString = inputFile.getName();
		String[] array = inputFileString.split("\\.");
		inputFileString = array[0];
		String outputFileString = inputFileString + ".lqn";
		String outputFileStringX = inputFileString + ".lqnx";
		
		outputFile = new File( inputFile.getParent(), outputFileString );
		outputFileX = new File( inputFile.getParent(), outputFileStringX );		
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
	 * 2. Create LQN Processors one for each CSM Processing Resource
	 */
	private void generateLQNProcessors() {
		// identify the ProcessingResources in the CSM and create corresponding processors in the LQN

		// the infinite processor is used as a host for components that do not have a host processor specified and for reference tasks
		lqnInfiniteProcessor = lqn.addProcessor( "InfiniteProc" );

		for( ProcessingResourceType processingResource : processingResourceList ) {
			if( processingResource == null ) {
				continue;
			}
			Processor lqnProcessor = lqn.addProcessor( processingResource.getName() + "_" + processingResource.getId() );
			lqnProcessor.setCpuRate( processingResource.getSpeedFactor() );
			processorMap.put( processingResource.getId(), lqnProcessor );
		}
	}
	
	/**
	 * 3. Create LQN Tasks one for each CSM Component
	 */
	private void generateLQNTasks() {
		// identify the Components in the CSM and create corresponding tasks in the LQN
		for( ComponentType component : componentList ) {
			Task lqnTask = lqn.addTask(component.getName());
			if ( component.getMultiplicity() == null ) {
				component.setMultiplicity( "1" );
			}
			lqnTask.setMultiServer( component.getMultiplicity() );

			if( component.getHost() != null ) {
				ProcessingResourceType csmProcessor = component.getHost();
				Processor lqnProcessor = lqn.getProcessor( csmProcessor.getName() + "_" + csmProcessor.getId() );
				// TODO lqnProcessor could be null
				lqnProcessor.addTask( lqnTask );
			}
			else {
				lqnInfiniteProcessor.addTask( lqnTask );
			}

			taskMap.put( component.getId(), lqnTask );
			TaskTracker lqnTaskTracker = new TaskTracker();
			taskTrackerMap.put( lqnTask, lqnTaskTracker );
		}
	}
	
	/**
	 * 4. Create LQN Entries one for each CSM CompStep that makes a call (SYNC, ASYNC, and FWD. NOT for REPLY)
	 * 
	 * Also create the first Activity for the entries
	 */
	private void generateLQNEntries() {
		// identify the CommSteps in the CSM and create corresponding entries in the LQN
		for( CommStepType commStep : commStepsList ) {
			// only create entries for sync calls and async calls
			// there are no entries for replies
			if( commStep.getMsgKind() == MsgKind.ASYNC || commStep.getMsgKind() == MsgKind.SYNC ) {
				ComponentType receiverComponent = commStep.getRcvComp();
				if( commStep.getRcvComp() != null ) {
					Task rcvTask = taskMap.get( receiverComponent.getId() );
					if( rcvTask == null ) {
						// it shouldn't be null.
						log( "rcvTask not found in taskMap for receiver component " + receiverComponent.getId(), true );
					}

					TaskTracker rcvTaskTracker = taskTrackerMap.get( rcvTask );

					Entry rcvEntry = lqn.addEntry( "E_" + commStep.getId() );
					rcvEntry.setTask( rcvTask );
					rcvTask.addEntry( rcvEntry );
					rcvTaskTracker.addEntry( commStep.getId(), rcvEntry );
					rcvTaskTracker.setCurrentEntry( rcvEntry );
					
					//add first activity
					Activity firstActivity = new Activity( "Rcv_" + commStep.getMsgKind() + "_" + commStep.getId(), rcvTask );
					addStepActivityToTask( rcvTask, commStep, firstActivity );
					rcvEntry.setStartActivity( firstActivity ); //set first activity as start activity for the entry
					rcvTaskTracker.setCurrentActivity( firstActivity );
					System.out.println("Add Entry \"" + rcvEntry.getName() + "\" with first Activity \"" + firstActivity.getName() + "\" to Task \"" + rcvTask.getName() + "\"" );
				}
			}
		}
	}
	
	/**
	 * 5. Create LQN Activities one for each CSM 'regular' Step.
	 */
	private void generateLQNActivities() {
		System.out.println( "Generating Activities for Steps..." );
		
		String demand = null;
		String repetition = null;
		
		for( StepType step : stepsList ) {
			System.out.println( "    " + step.getId() + " \"" + step.getName() + "\"" );
			if( step instanceof CommStepType || step instanceof ResourceAcquireType || step instanceof ResourceReleaseType || step instanceof ResourcePassType ) {
				// there are no activities for CommSteps, ResourceAcquire, ResourceRelease, or ResourcePass
				System.out.println( "      - skipping non-regular Step" );
			}
			else if( step.getPredecessor() == null && step.getSuccessor() == null ) {
				//this is a step that was removed. No longer in the scenario path. 
				System.out.println( "      - skipping previously removed Step" );
			}
			else {
				// only create activities for regular steps
				ComponentType stepComponent = step.getComponent();

				Task activityTask = taskMap.get( stepComponent.getId() );
				Activity activity = new Activity( step.getName(), activityTask );

				demand = step.getHostDemand();
				if( (demand == null) || (demand.isEmpty()) ) {
					activity.setServiceTime( new Float("0.000001") );
				}
				else {
					activity.setServiceTime( new Float(demand) );
				}
				
				repetition = step.getRepetitionCount();
				if( (repetition == null) || (repetition.isEmpty()) ) {
					activity.setRepeat( Double.parseDouble("1.0") ); // set the repetition count to 1
				}
				else {
					activity.setRepeat( Double.parseDouble(repetition) ); // set the repetition count
				}

				activityTask.addActivity( activity );
				TaskTracker activityTaskTracker = taskTrackerMap.get( activityTask );
				activityTaskTracker.addActivityForStep( step.getId(), activity );

				System.out.println( "      + added Activity \"" + activity.getName() + "\" to Task \"" + activityTask.getName() + "\"" ); 
			}
		}
		System.out.println( "...done" );
	}
	
	/**
	 * 6. Create LQN Activity Connections for Forks
	 */
	private void generateLQNForks() {
		for( ForkType fork: forksList ) {
			ComponentType sourceComponent = fork.getSource().get(0).getComponent(); 
			Task forkTask = taskMap.get(sourceComponent.getId());
			TaskTracker activityTaskTracker = taskTrackerMap.get(forkTask);
			Activity sourceActivity = activityTaskTracker.getActivityForStep(fork.getSource().get(0).getId());
			
			Activity targetActivity = activityTaskTracker.getActivityForStep(fork.getTarget().get(0).getId());
			
			String forkConnection = new String(); 
			for(int i=0; i<fork.getTarget().size(); i++){
				StepType target = fork.getTarget().get(i);
				ComponentType targetComponent = target.getComponent();
				
				if( !targetComponent.equals(sourceComponent) ) {
					throw new IllegalStateException( "The source component and target component does not match for Fork "+ fork.getId() );
				}
				targetActivity = activityTaskTracker.getActivityForStep(target.getId());
				
				try {
					sourceActivity.addANDForkActivity(targetActivity);
				}
				catch (ActivitySequenceException e) {
					e.printStackTrace();
				}
				
				if (i == 0){ 
					forkConnection = sourceActivity.getName() + " -> " + targetActivity.getName();
				}
				else{
					forkConnection += " & "+ targetActivity.getName();
				}
			}
			
			String tmpActivityConnections = forkTask.getActivityConnections();
			if(tmpActivityConnections.isEmpty()){
				forkTask.setActivityConnections(forkConnection);
			}
			else{
				forkTask.setActivityConnections(tmpActivityConnections+";\n"+forkConnection); 
			}
			log(sourceActivity.getName() + " finish setting FORK connection");
		}
	}
	
	/**
	 * 7. Create LQN Activity Connections for Joins
	 */
	private void generateLQNJoins(){
		
		for (JoinType join: joinsList){
			ComponentType targetComponent = join.getTarget().get(0).getComponent(); 
			Task joinTask = taskMap.get(targetComponent.getId());
			TaskTracker activityTaskTracker = taskTrackerMap.get(joinTask);
			
			Activity sourceActivity = activityTaskTracker.getActivityForStep(join.getSource().get(0).getId());
			Activity targetActivity = activityTaskTracker.getActivityForStep(join.getTarget().get(0).getId());
			
			String joinConnection = new String(); 
			for(int i=0; i<join.getSource().size(); i++){
				StepType source = join.getSource().get(i);
				ComponentType sourceComponent = source.getComponent();
				
				if (!sourceComponent.equals(targetComponent)){
					throw new IllegalStateException("The source component and target component does not match for join "+ join.getId());
				}
				sourceActivity = activityTaskTracker.getActivityForStep(source.getId());
				
				try {
					sourceActivity.addANDJoinConnection(targetActivity);
				}
				catch (ActivitySequenceException e) {
					e.printStackTrace();
				}
				
				if (i == 0){ 
					joinConnection = sourceActivity.getName();
				}
				else{
					joinConnection += " & "+ sourceActivity.getName();
				}
			}
			
			joinConnection += " -> " + targetActivity.getName();
			
			String tmpActivityConnections = joinTask.getActivityConnections();
			if(tmpActivityConnections.isEmpty()){
				joinTask.setActivityConnections(joinConnection);
			}
			else{
				joinTask.setActivityConnections(tmpActivityConnections+";\n"+joinConnection); 
			}
			log(sourceActivity.getName() + " finish setting JOIN connection");
		}
	}

	/**
	 * 8. Create LQN Activity Connections for Branches
	 */
	private void generateLQNBranches() {
		for( BranchType branch: branchList ) {
			StepType sourceStep = branch.getSource().get(0);
			StepType targetStep = null;

			ComponentType sourceComponent = sourceStep.getComponent(); 
			ComponentType targetComponent = null;

			Task branchTask = taskMap.get( sourceComponent.getId() );
			TaskTracker activityTaskTracker = taskTrackerMap.get( branchTask );

			Activity sourceActivity = activityTaskTracker.getActivityForStep( sourceStep.getId() );
			Activity targetActivity = null;

			String branchConnection = new String(); 
			
			System.out.println( "Processing Branch " + branch.getId() );
			System.out.println("    source: " + sourceStep.getId() + " \"" + sourceStep.getName() + "\"" );

			for( int i = 0; i < branch.getTarget().size(); i++ ) {
				targetStep = branch.getTarget().get(i);
				System.out.println("    target " + i + ": " + targetStep.getId() + " \"" + targetStep.getName() + "\"" );

				targetComponent = targetStep.getComponent();
				if( !targetComponent.equals( sourceComponent ) ) {
					throw new IllegalStateException("The source component and target component do not match for Branch "+ branch.getId());
				}

				targetActivity = activityTaskTracker.getActivityForStep( targetStep.getId() );
				
				Double probability = 1.0; //assume default probability weight of 1.0 
				try {
					if(targetStep.getProbability() != null && !targetStep.getProbability().isEmpty()){
						probability = Double.parseDouble(targetStep.getProbability());
					}
					sourceActivity.addORForkActivity( targetActivity, probability );
				}
				catch (ActivitySequenceException e) {
					e.printStackTrace();
				}
				
				if( i == 0 ) { 
					branchConnection = sourceActivity.getName() + " -> ("+probability+") " + targetActivity.getName();
				}
				else {
					branchConnection += " + ("+probability+") "+ targetActivity.getName();
				}
			}
			
			String tmpActivityConnections = branchTask.getActivityConnections();
			if( tmpActivityConnections.isEmpty() ) {
				branchTask.setActivityConnections(branchConnection);
			}
			else {
				branchTask.setActivityConnections(tmpActivityConnections+";\n"+branchConnection); 
			}
			log( sourceActivity.getName() + " finish setting BRANCH connection" );
		}
	}
	
	/**
	 * 9. Create LQN Activity Connections for Merges
	 */
	private void generateLQNMerges(){
		
		for (MergeType merge: mergeList){
			ComponentType targetComponent = merge.getTarget().get(0).getComponent(); 
			Task mergeTask = taskMap.get(targetComponent.getId());
			TaskTracker activityTaskTracker = taskTrackerMap.get(mergeTask);
			
			Activity sourceActivity = activityTaskTracker.getActivityForStep(merge.getSource().get(0).getId());
			Activity targetActivity = activityTaskTracker.getActivityForStep(merge.getTarget().get(0).getId());
			
			String mergeConnection = new String(); 
			for(int i=0; i<merge.getSource().size(); i++){
				StepType source = merge.getSource().get(i);
				ComponentType sourceComponent = source.getComponent();
				
				if (!sourceComponent.equals(targetComponent)){
					throw new IllegalStateException("The source component and target component does not match for merge "+ merge.getId());
				}
				sourceActivity = activityTaskTracker.getActivityForStep(source.getId());
				
				try {
					sourceActivity.addORJoinConnection(targetActivity);
				}
				catch (ActivitySequenceException e) {
					e.printStackTrace();
				}
				
				if (i == 0){ 
					mergeConnection = sourceActivity.getName();
				}
				else{
					mergeConnection += " + "+ sourceActivity.getName();
				}
			}
			
			mergeConnection += " -> " + targetActivity.getName();
			
			String tmpActivityConnections = mergeTask.getActivityConnections();
			if(tmpActivityConnections.isEmpty()){
				mergeTask.setActivityConnections(mergeConnection);
			}
			else{
				mergeTask.setActivityConnections(tmpActivityConnections+";\n"+mergeConnection); 
			}
			log(sourceActivity.getName() + " finish setting MERGE connection");
		}
	}
	
	/**
	 * 10.Traverse CSM and connect Activities
	 */
	private void traverseCSMAndConnectActivities() {
		//traverse CSM Scenarios and connect LQN Entries and LQN Activities
		//6.A: Traverse CSM from start point
		StartType start = scenario.getScenarioType().getStartList().get(0);

		if (start.getClosedWorkload() != null || start.getOpenWorkload() != null) {
			// the current scenarios is a top-level scenario
			// set the CSM environment task as the LQN reference task
			Task lqnRefTask = taskMap.get(Constants.ENVIRONMENT_COMPONENT_ID);

			// create a LQN reference entry with the name of the start point
			Entry lqnRefEntry = lqn.addEntry("RefE_" + start.getId());
			lqnRefEntry.setTask(lqnRefTask);
			lqnRefTask.addEntry(lqnRefEntry);
			
			//create the first activity for the LQN Reference Entry
			Activity lqnRefActivity = new Activity("RefA_" + start.getId(), lqnRefTask);
			lqnRefTask.addActivity(lqnRefActivity);
			lqnRefEntry.setStartActivity(lqnRefActivity);
			lqnRefActivity.setBoundToEntry(lqnRefEntry.getId());

			//update TaskTracker for reference task:
			TaskTracker txTaskTracker = taskTrackerMap.get(lqnRefTask); //this corresponds to the CSM Environment Component 
			txTaskTracker.addEntry(Constants.REF_ENTRY_ID, lqnRefEntry); //using the REF_ENTRY_ID since there is no CommStep for the reference entry.
			txTaskTracker.setCurrentEntry(lqnRefEntry);
			txTaskTracker.setLastTxActivity(lqnRefActivity);
			txTaskTracker.setCurrentActivity(lqnRefActivity);
			log("Added Entry " + lqnRefEntry.getName() + " with first Activity "+ lqnRefActivity.getName() +" to task " + lqnRefTask.getName());

			//Create an Entry to receive the call from the ReferenceTask
			Entry rcvEntry = null;
			Task rcvTask = null;
			TaskTracker rcvTaskTracker = null;
			
			//get the step following the Start point. Step following the start point could be one of CommStep, or a regular Step. 
			StepType step = start.getTarget().get(0);
				
			if (step instanceof CommStepType) { 
				CommStepType commStep = (CommStepType) step;
				//Start point is followed by a CommStep making a call
				if (commStep.getMsgKind() == MsgKind.ASYNC || commStep.getMsgKind() == MsgKind.SYNC) {
					rcvTask = taskMap.get(commStep.getRcvComp().getId());
					rcvTaskTracker = taskTrackerMap.get(rcvTask);

					//The rcvEntry for the CommStep is the rcvEntry for the call from the LQN Reference task.
					rcvEntry = rcvTaskTracker.getEntry(commStep.getId());

					if (commStep.getMsgKind() == MsgKind.SYNC) {
						lqnRefActivity.addCall(rcvEntry, true, "1.0");
					}
					else if (commStep.getMsgKind() == MsgKind.ASYNC) {
						lqnRefActivity.addCall(rcvEntry, false, "1.0");
					}
					else {
						throw new IllegalStateException("First commStep " + commStep.getId() + " following start point " + start.getId() + " should be SYNC or ASYNC");
					}

					//set rcvEntry as the current entry for the rcvTask
					rcvTaskTracker.setCurrentEntry(rcvEntry);
					rcvTaskTracker.setCurrentActivity(rcvEntry.getStartActivity());
				}
			}//end if for CommStep 
			else { 
				//the start point is followed by a regular step
				if (step.getComponent().getId().equals(Constants.ENVIRONMENT_COMPONENT_ID)) {
					System.out.println("Getting here -----------");
					//this is a rare case where the start point is followed by a Step in the environment. 
					//We need to connect the Activity for this step to the LQN Reference Activity above.
				}
				else {
					rcvTask = taskMap.get(step.getComponent().getId());
					rcvTaskTracker = taskTrackerMap.get(rcvTask);

					rcvEntry = lqn.addEntry("RefRcvE_" + step.getId());
					rcvEntry.setTask(rcvTask);
					rcvTask.addEntry(rcvEntry);
					rcvTaskTracker.addEntry(step.getId(), rcvEntry);
					rcvTaskTracker.setCurrentEntry(rcvEntry);
					
					//connect the activity corresponding the step as the first activity for the entry
					Activity firstActivity = rcvTaskTracker.getActivityForStep(step.getId());
					rcvEntry.setStartActivity(firstActivity);
					firstActivity.setBoundToEntry(rcvEntry.getId()); 
					log("Added Entry " + rcvEntry.getName() + " with first Activity "+ firstActivity.getName() +" to task " + rcvTask.getName());

					// First step after start point is a regular step. Therefore, environment makes an ASYNC call.
					lqnRefActivity.addCall(rcvEntry, false, "1.0"); // call set as ASYNC
					rcvTaskTracker.setCurrentActivity(rcvEntry.getStartActivity());
				}
			}

			// print all the rcv entries:
			System.out.println("Print all entries");
			for (Task task : taskTrackerMap.keySet()) {
				System.out.println("Task: " + task.getName());
				for (Entry entry : taskTrackerMap.get(task).entryMap.values()) {
					System.out.println("  " + entry.getId());
				}
			}

			//continue traversing the scenario after the first step	
			PathConnectionType successor = step.getSuccessor();
			traverseAPathConnectionType(successor);
		}
	}
	
	public void generateLQN(){
		
		//1. Create LQN Model
		lqn = new Model(); 
		System.out.println("A12-1: created LQN Model");
		
		//2. Create LQN Processors one for each CSM Processing Resource
		generateLQNProcessors();
		System.out.println("A12-2: created LQN Processors");
		
		//3. Create LQN Tasks one for each CSM Component
		generateLQNTasks();
		System.out.println("A12-3: created LQN Tasks");
		
		//4. Create LQN Entries one for each CSM CompStep that makes a call (SYNC, ASYNC, and FWD. NOT for REPLY)
		generateLQNEntries();
		System.out.println("A12-4: created LQN Entries for CommSteps");
		
		//5. Create LQN Activities one for each CSM 'regular' Step.
		generateLQNActivities();
		System.out.println("A12-5: created LQN Activities for Step");
		
		//6. Create LQN Activity Connections for Forks
		generateLQNForks();
		System.out.println("A12-6: created LQN activitiy connections for Forks");
		
		//7. Create LQN Activity Connections for Joins
		generateLQNJoins();
		System.out.println("A12-7: created LQN activitiy connections for Joins");
		
		//8. Create LQN Activity Connections for Branches
		generateLQNBranches();
		System.out.println("A12-8: created LQN activitiy connections for Branches");
		
		//9. Create LQN Activity Connections for Merges
		generateLQNMerges();
		System.out.println("A12-9: created LQN activitiy connections for Merges");
		
		//10.Traverse CSM and connect Activities
		traverseCSMAndConnectActivities();
		System.out.println("A12-10: created LQN Model");
		
		
		//NOW Print the LQN Model
		log("============================================\nGENERATED LQN", true);
		System.out.println("LQN Processors:");
		for (Object p:lqn.getProcessors().values()){
			System.out.println(((Processor)p).getName());
		}
		
		
		System.out.println("\nLQN Tasks:");
		for (Object task:lqn.getTasks().values()){
			System.out.println(((Task)task).getName());
			
			for (Object activity: ((Task)task).getActivities().values()){
				Activity a = (Activity)activity;
				System.out.println("  "+ a.getName());
				System.out.println("      Prev:");
				if (a.getPrevious() != null){
					for (Object obj: a.getPrevious()){
						Activity aa = (Activity)obj;
						System.out.println("           "+aa.getName() + " (connection type = "+a.getPrevConnection()+")");
					}
				}
				System.out.println("      Next:");
				if (a.getNext() != null){
					for (Object obj: a.getNext()){
						Activity aa = (Activity)obj;
						System.out.println("           "+aa.getName()+ " (connection type = "+a.getNextConnection()+")");
					}
				}
				System.out.println(); 
			}
		}
		
		System.out.println("\nEntries:");
		for (Object entry:lqn.getEntries().values()){
			System.out.println("Task: "+ ((Entry)entry).getTask().getName() + ". Entry: "+((Entry)entry).getName());
		}
		
		XmlParser xmlParser = new XmlParser(lqn);
		xmlParser.jLQNtoXMLmodel(outputFileX);
				
		log( lqn.toString() );
		try {
			BufferedWriter fileOut = new BufferedWriter( new FileWriter( outputFile ) );
			fileOut.write( lqn.toString() );
			fileOut.close();
		}
		catch( IOException e ) {
			e.printStackTrace();
		}
	}
	
	private PathConnectionType traverseAStepType(StepType step) {
		
		log("traversing step name "+ step.getName() + " with ID "+ step.getId());
		if (step instanceof ResourceAcquireType){
			//we don't do anything
		}
		else if (step instanceof ResourceReleaseType){
			
		}
		else if (step instanceof CommStepType){
			
			processCommStepInTheTraversal((CommStepType)step);
					
		}
		else if(step instanceof ResourcePassType){
			
		}
		else{ //just the regular step
			processRegularStepInTheTraversal(step);
		}
		
		
		PathConnectionType successor = step.getSuccessor();

		return traverseAPathConnectionType(successor);
	}

	private PathConnectionType traverseAPathConnectionType(PathConnectionType aPathConnection) {
		log("traversing pathconnection "+ aPathConnection.getId());
		
		if (aPathConnection instanceof StartType) {
			throw new IllegalArgumentException("Start type shouldn't be here");
		}
		else if (aPathConnection instanceof EndType) {
			
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
			
			//just return itself, the branch or fork that started the segment will take care of continuing to the next step.
			return aPathConnection;
		}

		throw new IllegalArgumentException("Shouldn't have reached here");
	}
	
	private StepType findImmediateNextStep(StepType step){
		StepType nextStep = null; //here we want to find the next steptype. it could be a RA
		
		if (step.getSuccessor() != null){
			nextStep = step.getSuccessor().getTarget().get(0); 
		}
		
		return nextStep; 
	}
	
	private StepType findPreviousRegularStep(StepType originalStep){
		StepType step = originalStep; 
		StepType previousStep = null;
		
		boolean flag = true; 
		while (flag){
			previousStep = (step.getPredecessor().getSource().size() > 0) ? step.getPredecessor().getSource().get(0): null;

			//if the previousStep is not a regular step, continue looking back. Reset previousStep to null for the next round.
			if (previousStep instanceof CommStepType  || previousStep instanceof ResourceAcquireType  || previousStep instanceof ResourceReleaseType  || previousStep instanceof ResourcePassType ){
				step = previousStep;
				previousStep = null;
			}
			else{
				flag = false;
				break;
			}
		}
		
		if (previousStep == null){
			log("No previous regular step found for step "+ originalStep.getName() + " with ID: "+ originalStep.getId());
		}
		return previousStep;
	}
	
	/**
	 * This utility method add the given activity to the given task
	 */
	private void addStepActivityToTask(Task task, StepType step, Activity activity) {
		TaskTracker taskTracker = taskTrackerMap.get(task);
		Entry entry = taskTracker.getCurrentEntry();
		
		task.addActivity(activity);
		taskTracker.addActivityForStep(step.getId(), activity);
		taskTracker.setLastAddedActivity(activity);
		activity.setBoundToEntry(entry.getId());
	}
	
	private void addTxStepActivityToTask(Task task, StepType step, Activity activity) {
		addStepActivityToTask(task, step, activity);		
		TaskTracker taskTracker = taskTrackerMap.get(task);
		taskTracker.setLastTxActivity(activity);
	}
	
	private void processCommStepInTheTraversal(CommStepType commStep) {
		
		boolean setCallActivityConnections = false;
		boolean setReplyActivityConnections = false;
		Activity txActivity = null;
		Activity rcvActivity = null;

		//get LQN elements for the transmitting (tx) end of the commStep. 
		ComponentType txComp = commStep.getTxComp();
		Task txTask = taskMap.get(txComp.getId());
		TaskTracker txTaskTracker = taskTrackerMap.get(txTask);
		Entry txEntry = txTaskTracker.getCurrentEntry();
		txActivity = txTaskTracker.getCurrentActivity(); 

		//get LQN elements for the receiving (rcv) end of the commStep. 
		ComponentType rcvComp = commStep.getRcvComp();
		Task rcvTask = taskMap.get(rcvComp.getId());
		TaskTracker rcvTaskTracker = taskTrackerMap.get(rcvTask);
		Entry rcvEntry = rcvTaskTracker.entryMap.get(commStep.getId());

		if (commStep.getMsgKind() == MsgKind.ASYNC) {
			// make async call from txTask to entry of rcvTask
			// add activity to txTask to send message
			txActivity = new Activity("SendAsync_" + commStep.getId(), txTask); // callActivity
			addTxStepActivityToTask(txTask, commStep, txActivity); 

			// make call to rcvEntry
			txActivity.addCall(rcvEntry, false, "1.0");

			//set the current entry and current activity for the traversal of the receive task
			rcvTaskTracker.setCurrentEntry(rcvEntry);
			rcvTaskTracker.setCurrentActivity(rcvEntry.getStartActivity());
			
			setCallActivityConnections = true;
		}
		else if (commStep.getMsgKind() == MsgKind.SYNC) {
			// make sync call from txTask to entry of rcvTask
			// add activity to txTask to send message
			txActivity = new Activity("SendSync_" + commStep.getId(), txTask);
			addTxStepActivityToTask(txTask, commStep, txActivity);

			// make call to rcvEntry
			txActivity.addCall(rcvEntry, true, "1.0");
			
			//set the current entry and current activity for the traversal of the receive task
			rcvTaskTracker.setCurrentEntry(rcvEntry);
			rcvTaskTracker.setCurrentActivity(rcvEntry.getStartActivity());
			
			setCallActivityConnections = true;
		}
		else if (commStep.getMsgKind() == MsgKind.FWD) {
			// make fwd call from lastActivity of txTask to new entry of rcvTask
			// add activity to txTask to send message
			txActivity = new Activity("SendFwd_" + commStep.getId(), txTask);
			addTxStepActivityToTask(txTask, commStep, txActivity);

			// make call to rcvEntry
			txActivity.addCall(rcvEntry, true, "1.0");
			Vector callsOut = txActivity.getCallsOut();
			((GenericCall) (callsOut.get(0))).setProbForwarding(1.0f);

			//set the current entry and current activity for the traversal of the receive task
			rcvTaskTracker.setCurrentEntry(rcvEntry);
			rcvTaskTracker.setCurrentActivity(rcvEntry.getStartActivity());
			setCallActivityConnections = true;
		}
		else if (commStep.getMsgKind() == MsgKind.REPLY) {
			// reply from lastActivity of txTask to its entry
			// add activity to txTask to send the reply message
			txActivity = new Activity("SendReply_" + commStep.getId(), txTask);
			addTxStepActivityToTask(txTask, commStep, txActivity);

			// set reply to entry
			Vector<String> replyEntries = new Vector<>();
			replyEntries.add(txActivity.getBoundToEntry());
			txActivity.setReplyEntries(replyEntries);
			
			//connect SendReply activity 
			Activity currentActivity = txTaskTracker.getCurrentActivity(); 
			try {
				addSequenceConnectionUtil(currentActivity, txActivity, txTask);
			}
			catch (ActivitySequenceException e1) {
				e1.printStackTrace();
			}
			
			//txActivity is now the current activity for txTaskTracker
			txTaskTracker.setCurrentActivity(txActivity);
			
			// add activity to rcvTask to receive/accept the message
			rcvActivity = new Activity("RcvReply_" + commStep.getId(), rcvTask);
			addStepActivityToTask(rcvTask, commStep, rcvActivity);
			
			Activity lastTxActivityOnTheReceiver = rcvTaskTracker.getLastTxActivity();
			
			//this was a sanity check!
//			if (rcvTaskTracker.getCurrentActivity().equals(rcvTaskTracker.getLastTxActivity())){
//				System.out.println("888888888888888888888888888 rcvTaskTracker.getCurrentActivity() equals rcvTaskTracker.getLastTxActivity()");
//			}
			
			try {
				addSequenceConnectionUtil(lastTxActivityOnTheReceiver, rcvActivity, rcvTask);
			}
			catch (ActivitySequenceException e) {
				e.printStackTrace();
			}
			
			//rcvActivity is now the current activity for rcvTaskTracker
			rcvTaskTracker.setCurrentActivity(rcvActivity);
			
		}
		

		if (setCallActivityConnections) {
			log("+++++++++ set connections for commStep " + commStep.getId());
			StepType lastTxStep = findPreviousRegularStep(commStep);
			Activity lastTxActivity = txTaskTracker.getActivityForStep(lastTxStep.getId());

			// sanity check
//			if (!txTaskTracker.getCurrentEntry().getId().equals(lastTxActivity.getBoundToEntry())) {
//				log("SEVERE: txTaskTracker.currentEntry is not the same as lastTxActivity.getBoundToEntry", true);
//				throw new IllegalStateException();
//			}

			try {
				if (lastTxStep != null) {
					// set the sequence connection for the activity
					if (lastTxStep.getSuccessor() instanceof SequenceType) {
						addSequenceConnectionUtil(lastTxActivity, txActivity, txTask);
					}
				}
				else {
					// if there is no previous txStep, then connect in sequence
					addSequenceConnectionUtil(lastTxActivity, txActivity, txTask);
					// lastTxActivity.addBasicConnection(txActivity);
					// log(lastTxActivity.getName() + " set NEXT connection to " + txActivity.getName());
				}
			}
			catch (ActivitySequenceException e) {
				e.printStackTrace();
			}

			// Set the current txActivity as the lastTxActivity for the txTask after all the connections have been made
			txTaskTracker.setLastTxActivity(txActivity);
		}
	}
	
	private void addSequenceConnectionUtil(Activity sourceActivity, Activity targetActivity, Task task) throws ActivitySequenceException {
		sourceActivity.addBasicConnection(targetActivity);
		String tmpActivityConnections = task.getActivityConnections();
		String thisActivityConnection = sourceActivity.getName() + " -> " + targetActivity.getName();
		if(tmpActivityConnections.isEmpty()){
			task.setActivityConnections(thisActivityConnection);
		}
		else{
			task.setActivityConnections(tmpActivityConnections+";\n"+thisActivityConnection); 
		}
		log(sourceActivity.getName() + " set NEXT connection to " + targetActivity.getName());
		
	}

	
	private void processRegularStepInTheTraversal(StepType step) {

		// StepType lastStep = findPreviousRegularStep(step);

		ComponentType stepComponent = step.getComponent();
		Task stepTask = taskMap.get(stepComponent.getId());

		System.out.println("Printing all Entries for stepTask: " + stepTask.getName());
		taskTrackerMap.get(stepTask).printTaskTrackerEntries();

		System.out.println("Printing all Activities for stepTask: " + stepTask.getName());
		taskTrackerMap.get(stepTask).printTaskTrackerActivities();

		TaskTracker taskTracker = taskTrackerMap.get(stepTask); 
		Entry currentEntry = taskTracker.getCurrentEntry();
		Activity currentActivity = taskTracker.getCurrentActivity();
		Activity stepActivity = taskTracker.getActivityForStep(step.getId());
		stepActivity.setBoundToEntry(currentEntry.getId());

		log("+++++++++ set connections for Step " + step.getId());

		try {
			// set the sequence connection for the activity
			if (step.getPredecessor() instanceof SequenceType) {
				addSequenceConnectionUtil(currentActivity, stepActivity, stepTask);
			}
			
		}
		catch (ActivitySequenceException e) {
			e.printStackTrace();
		}

		//set the stepActivity as the currentActivity
		taskTracker.setCurrentActivity(stepActivity);
	}
	

	private class TaskTracker{
		
		//should know all the steps that are part of this task
		//should also know the corresponding activities and entries
		private HashMap<String, Activity> activityMap; //<StepId, Activity>  
		private HashMap<String, Entry> entryMap;  //<CommStepId, Entry>  
		
		//The following variables are for traversal purposes only
		private Entry currentEntry; //keeps track of the current entry for traversal purposes
		private Activity currentActivity; //keeps track of the current activity for traversal purposes
		private Activity lastTxActivity; //tracks the last Activity added to the task when a message is sent
		private Activity lastAddedActivity; //the last activity added to the task. 
		
		public TaskTracker(){
			activityMap = new HashMap<>();
			entryMap = new HashMap<>(); 
		}
		
		public Activity getLastTxActivity(){
			return lastTxActivity; 
		}
		
		public void setLastTxActivity(Activity activity){
			lastTxActivity = activity; 
		}
		
		public void setLastAddedActivity(Activity activity){
			lastAddedActivity = activity; 
		}
		
		public Activity getLastAddedActivity(){
			return lastAddedActivity; 
		}
		
		public Activity getActivityForStep(String stepId) {
			return activityMap.get(stepId);
		}

		public void addActivityForStep(String stepId, Activity lqnActivity){
			activityMap.put(stepId, lqnActivity);
			
		}
		
		//get current Activity for traversal purposes
		public Activity getCurrentActivity() {
			return currentActivity; 
		}
		
		//set current Activity for traversal purposes
		public void setCurrentActivity(Activity activity){
			this.currentActivity = activity;
		}
				
		//get current entry for traversal purposes
		public Entry getCurrentEntry() {
			return currentEntry; 
		}
		
		//set current entry for traversal purposes
		public void setCurrentEntry(Entry entry){
			this.currentEntry = entry;
		}

		public Entry getEntry(String commStepId){
			return entryMap.get(commStepId); 
		}
		
		public void addEntry(String commStepId, Entry receiverEntry){
			entryMap.put(commStepId, receiverEntry);
		}
		
		public void printTaskTrackerActivities(){
			System.out.println("TaskTracker Activities ");
			for (Object activity: activityMap.values()){
				Activity a = (Activity)activity;
				System.out.println("  "+ a.getName());
				System.out.println("      Prev:"+ a.getPrevConnection());
				if (a.getPrevious() != null){
					for (Object obj: a.getPrevious()){
						Activity aa = (Activity)obj;
						System.out.println("        "+aa.getName());
					}
				}
				System.out.println("      Next:"+ a.getNextConnection());
				if (a.getNext() != null){
					for (Object obj: a.getNext()){
						Activity aa = (Activity)obj;
						System.out.println("        "+aa.getName());
					}
				}
			}
		}
		
		public void printTaskTrackerEntries(){
			System.out.println("TaskTracker Entries:");
			for (Object entry:entryMap.values()){
				Entry e = (Entry)entry;
				String startActivityName = e.hasStartActivity() ? e.getStartActivity().getName() : "Null (No start Activity)";  
				System.out.println("Task: "+ e.getTask().getName() + ". Entry: "+e.getName() + " with start Activity: "+ startActivityName);
			}
		}
	}
}
