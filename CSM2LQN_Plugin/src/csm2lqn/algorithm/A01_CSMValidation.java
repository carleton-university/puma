package csm2lqn.algorithm;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import ca.carleton.sce.puma.CSM.BranchType;
import ca.carleton.sce.puma.CSM.EndType;
import ca.carleton.sce.puma.CSM.ForkType;
import ca.carleton.sce.puma.CSM.JoinType;
import ca.carleton.sce.puma.CSM.PathConnectionType;
import ca.carleton.sce.puma.CSM.ResourceAcquireType;
import ca.carleton.sce.puma.CSM.SequenceType;
import ca.carleton.sce.puma.CSM.StartType;
import ca.carleton.sce.puma.CSM.StepType;
import csm2lqn.utility.Csm2LqnLogger;
import csm2lqn.utility.Utilities;
import csm2lqn.wrapper.ScenarioTypeWrapper;

/**
 * 
 * @author Jeevithan Muttulingam
 * @date Nov 24, 2012
 * 
 * Checks CSM validity
 *
 */
public class A01_CSMValidation {

	ArrayList<ScenarioTypeWrapper> scenarioTypeWrapperList;
	boolean enablestandardLogging = true; //this turns on/off normal logger. All error logging are made regardless of this flag
	
	public A01_CSMValidation(ArrayList<ScenarioTypeWrapper> scenarioTypeWrapperList, boolean enableLogging) {
		this.scenarioTypeWrapperList = scenarioTypeWrapperList; 
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
	
	public boolean validateCSM(){
		boolean isCSMValid = true;  
		boolean areStartTypesValid = true; 
		boolean areEndTypesValid = true; 
		boolean areSequenceTypesValid = true;
		boolean areForkTypesValid = true;
		boolean areJoinTypesValid = true;
		boolean areBranchTypesValid = true;
		boolean areMergeTypesValid = true;
		boolean areStepTypesValid = true;
		boolean areResourceAcquireTypesValid = true;
		boolean areResourceReleaseTypesValid = true;
		boolean areResourcePasseTypesValid = true;
		
		log("\n..........Validating Starts........");
		for (ScenarioTypeWrapper scenarioType: scenarioTypeWrapperList)
		{
			areStartTypesValid = areAllStartTypesValid(scenarioType.getAllStartTypes(), scenarioType);
			if (areStartTypesValid){
				log("No errors found with Starts of Scenario ("+scenarioType.getName()+")");
			}
		}
		
		log("\n..........Validating Ends........");
		for (ScenarioTypeWrapper scenarioType: scenarioTypeWrapperList)
		{
			areEndTypesValid = areAllEndTypesValid(scenarioType.getAllEndTypes(), scenarioType); 
			if (areEndTypesValid){
				log("No errors found with Ends of Scenario ("+scenarioType.getName()+")");
			}
		}
		
		log("\n..........Validating Sequences........");
		for (ScenarioTypeWrapper scenarioType: scenarioTypeWrapperList)
		{
			areSequenceTypesValid = areAllSequenceTypesValid(scenarioType.getAllSequenceTypes(), scenarioType); 
			if (areSequenceTypesValid){
				log("No errors found with Sequences of Scenario ("+scenarioType.getName()+")");
			}
		}
		
		log("\n..........Validating Forks........");
		for (ScenarioTypeWrapper scenarioType: scenarioTypeWrapperList)
		{
			areForkTypesValid = areAllForkTypesValid(scenarioType.getAllForkTypes(), scenarioType); 
			
		}
		
		log("\n..........Validating Joins........");
		for (ScenarioTypeWrapper scenarioType: scenarioTypeWrapperList)
		{
			areJoinTypesValid = areAllJoinTypesValid(scenarioType.getAllJoinTypes(), scenarioType); 
			
		}
	
		log("\n..........Validating Branches........");
		for (ScenarioTypeWrapper scenarioType: scenarioTypeWrapperList)
		{
			areBranchTypesValid = areAllBranchTypesValid(scenarioType.getAllBranchTypes(), scenarioType); 
			
		}
		
		log("\n..........Validating Merges........");
		for (ScenarioTypeWrapper scenarioType: scenarioTypeWrapperList)
		{
			areMergeTypesValid = areAllMergeTypesValid(scenarioType.getAllMergeTypes(), scenarioType); 
			
		}
			
		log("\n..........Validating Steps........");
		for (ScenarioTypeWrapper scenarioType: scenarioTypeWrapperList)
		{
			areStepTypesValid = areAllStepTypesValid(scenarioType.getAllStepTypes(), scenarioType); 
		}
		
		log("\n..........Validating ResoureAcquires........");
		for (ScenarioTypeWrapper scenarioType: scenarioTypeWrapperList)
		{
			areResourceAcquireTypesValid = areAllResourceAcquireTypesValid(scenarioType.getAllResourceAcquireTypes(), scenarioType); 
		}
		
		log("\n..........Validating ResoureReleases........");
		for (ScenarioTypeWrapper scenarioType: scenarioTypeWrapperList)
		{
			areResourceReleaseTypesValid = areAllResourceReleaseTypesValid(scenarioType.getAllResourceReleaseTypes(), scenarioType); 
		}		

		log("\n..........Validating ResourePasses........");
		for (ScenarioTypeWrapper scenarioType: scenarioTypeWrapperList)
		{
			areResourcePasseTypesValid = areAllResourcePassTypesValid(scenarioType.getAllResourcePassTypes(), scenarioType); 
		}
		
		return isCSMValid; 		
	}
	
	//Validation for ResourceAcquire, ResourceRelease, and ResourcePass is the same as that of the Step 
	private boolean areAllResourcePassTypesValid(EList<? extends StepType> resourcePassList, ScenarioTypeWrapper scenarioType)
	{
		return areAllStepTypesValid(resourcePassList, scenarioType, "ResourcePass"); 
	}
	
	//Validation for ResourceAcquire, ResourceRelease, and ResourcePass is the same as that of the Step 
	private boolean areAllResourceReleaseTypesValid(EList<? extends StepType> resourceReleaseList, ScenarioTypeWrapper scenarioType)
	{
		return areAllStepTypesValid(resourceReleaseList, scenarioType, "ResourceRelease"); 
	}
	
	//Validation for ResourceAcquire, ResourceRelease, and ResourcePass is the same as that of the Step 
	private boolean areAllResourceAcquireTypesValid(EList<? extends StepType> resourceAcquireList, ScenarioTypeWrapper scenarioType)
	{
		return areAllStepTypesValid(resourceAcquireList, scenarioType, "ResourceAcquire"); 
	}
	
	//Validation for ResourceAcquire, ResourceRelease, and ResourcePass is the same as that of the Step 
	private boolean areAllStepTypesValid(EList<StepType> stepList, ScenarioTypeWrapper scenarioType)
	{
		return areAllStepTypesValid(stepList, scenarioType, "Step"); 
	}
	
	private boolean areAllStepTypesValid(EList<? extends StepType> stepList, ScenarioTypeWrapper scenarioType, String elementName)
	{
		StringBuilder error = new StringBuilder(); 
		boolean hasError = false; 
		
		for (StepType stepType : stepList)
		{
			
			//Step has a single predecessor
			String predecessor = Utilities.getSinglePredecessor(stepType, elementName);
			if (predecessor == null){
				hasError = true;
				continue; 
			}
		
			//Step's Predecessor must match the ID of Start|Sequence|Fork|Join|Branch|Merge
			ArrayList<String> collection = new ArrayList<>(); 
			collection = new ArrayList<>(); 
			collection.addAll(scenarioType.getAllStartTypeIDs());
			collection.addAll(scenarioType.getAllSequenceTypeIDs());
			collection.addAll(scenarioType.getAllForkTypeIDs());
			collection.addAll(scenarioType.getAllJoinTypeIDs());
			collection.addAll(scenarioType.getAllBranchTypeIDs());
			collection.addAll(scenarioType.getAllMergeTypeIDs());
			
			if (!isFoundInCollection(predecessor, "Predecessor", collection, "a Start or a Sequence or a Fork or a Join or a Branch or a Merge", elementName, stepType.getId()))
			{
				hasError = true;
				continue;
			}
			
			//Step has a single successor
			String successor = Utilities.getSingleSuccessor(stepType, elementName);
			if (successor == null){
				hasError = true;
				continue; 
			}
		
			//Step's successor must match the ID of End|Sequence|Fork|Join|Branch|Merge
			collection = new ArrayList<>(); 
			collection = new ArrayList<>(); 
			collection.addAll(scenarioType.getAllEndTypeIDs());
			collection.addAll(scenarioType.getAllSequenceTypeIDs());
			collection.addAll(scenarioType.getAllForkTypeIDs());
			collection.addAll(scenarioType.getAllJoinTypeIDs());
			collection.addAll(scenarioType.getAllBranchTypeIDs());
			collection.addAll(scenarioType.getAllMergeTypeIDs());
			
			if (!isFoundInCollection(successor, "Successor", collection, "a End or a Sequence or a Fork or a Join or a Branch or a Merge", elementName, stepType.getId()))
			{
				hasError = true;
				continue;
			}
			
		}
		
		if (hasError){
			log(error.toString(), true); 
			return false;
		}
		log("No errors found with "+elementName+"s of Scenario ("+scenarioType.getName()+")");
		return true;
	}
	
	//Merge & Join validations are similar
	private boolean areAllMergeTypesValid (EList<? extends PathConnectionType> mergeList, ScenarioTypeWrapper scenarioType)
	{
		return areAllJoinAndMergeTypesValid(mergeList, scenarioType, "Merge"); 
	}
	//Join & Merge validations are similar
	private boolean areAllJoinTypesValid(EList<? extends PathConnectionType> joinList, ScenarioTypeWrapper scenarioType)
	{
		return areAllJoinAndMergeTypesValid(joinList, scenarioType, "Join"); 
	}
	
	//Branch & Fork validations are similar
	private boolean areAllBranchTypesValid(EList<? extends PathConnectionType> branchList, ScenarioTypeWrapper scenarioType)
	{
		return areAllForkAndBranchTypesValid(branchList, scenarioType, "Branch"); 
	}
	
	//Fork & Branch validations are similar
	private boolean areAllForkTypesValid(EList<? extends PathConnectionType> forkList, ScenarioTypeWrapper scenarioType)
	{
		return areAllForkAndBranchTypesValid(forkList, scenarioType, "Fork"); 
	}
	
	private boolean areAllJoinAndMergeTypesValid(EList<? extends PathConnectionType> joinList, ScenarioTypeWrapper scenarioType, String elementName)
	{
		StringBuilder error = new StringBuilder(); 
		boolean hasError = false; 
		
		for (PathConnectionType joinType : joinList)
		{
			//Join has minimum two Sources
			ArrayList<String> sources = Utilities.getMultipleSources(joinType, elementName);
			if (sources == null){
				hasError = true;
				continue; 
			}
			
			//Join's Sources must match the ID of Step|CommStep|ResourceAcquire|ResourceRelease|ResourcePass
			ArrayList<String> collection = new ArrayList<>(); 
			collection = new ArrayList<>(); 
			collection.addAll(scenarioType.getAllStepTypeIDs());
			collection.addAll(scenarioType.getAllCommStepTypeIDs());
			collection.addAll(scenarioType.getAllResourceAcquireTypeIDs());
			collection.addAll(scenarioType.getAllResourceReleaseTypeIDs());
			collection.addAll(scenarioType.getAllResourcePassTypeIDs());
			
			for (String source : sources)
			{
				if (!isFoundInCollection(source, "source", collection, "a Step|CommStep|ResourceAcquire|ResourceRelease|ResourcePass", elementName, joinType.getId()))
				{
					hasError = true;
					continue;
				}
			}
			
			//Join only has a single target
			String target = Utilities.getSingleTarget(joinType, elementName);
			if (target == null){
				hasError = true;
				continue; 
			}
		
			//Join's Target must match the ID of Step|CommStep|ResourceAcquire|ResourceRelease|ResourcePass
			collection = new ArrayList<>(); 
			collection.addAll(scenarioType.getAllStepTypeIDs());
			collection.addAll(scenarioType.getAllCommStepTypeIDs());
			collection.addAll(scenarioType.getAllResourceAcquireTypeIDs());
			collection.addAll(scenarioType.getAllResourceReleaseTypeIDs());
			collection.addAll(scenarioType.getAllResourcePassTypeIDs());
			
			if (!isFoundInCollection(target, "target", collection, "a Step|CommStep|ResourceAcquire|ResourceRelease|ResourcePass", elementName, joinType.getId())) {
				hasError = true;
				continue;
			}
		}
		
		if (hasError){
			log(error.toString(), true); 
			return false;
		}
		log("No errors found with "+elementName+"s of Scenario ("+scenarioType.getName()+")");
		return true;
	}
	
	private boolean areAllForkAndBranchTypesValid(EList<? extends PathConnectionType> forkList, ScenarioTypeWrapper scenarioType, String elementName)
	{
		StringBuilder error = new StringBuilder(); 
		boolean hasError = false; 
		
		for (PathConnectionType forkType : forkList) {
			//Fork only has a single source
			String source = Utilities.getSingleSource(forkType, elementName);
			if (source == null) {
				hasError = true;
				continue; 
			}
		
			//Fork's source must match the ID of Step|CommStep|ResourceAcquire|ResourceRelease|ResourcePass
			ArrayList<String> collection = new ArrayList<>(); 
			collection.addAll(scenarioType.getAllStepTypeIDs());
			collection.addAll(scenarioType.getAllCommStepTypeIDs());
			collection.addAll(scenarioType.getAllResourceAcquireTypeIDs());
			collection.addAll(scenarioType.getAllResourceReleaseTypeIDs());
			collection.addAll(scenarioType.getAllResourcePassTypeIDs());
			
			if (!isFoundInCollection(source, "source", collection, "a Step|CommStep|ResourceAcquire|ResourceRelease|ResourcePass", elementName, forkType.getId())) {
				hasError = true;
				continue;
			}
			
			//Fork has minimum two Targets
			ArrayList<String> targets = Utilities.getMultipleTargets(forkType, elementName);
			if (targets == null) {
				hasError = true;
				continue; 
			}
			
			//Fork's Targets must match the ID of Step|CommStep|ResourceAcquire|ResourceRelease|ResourcePass
			collection = new ArrayList<>(); 
			collection.addAll(scenarioType.getAllStepTypeIDs());
			collection.addAll(scenarioType.getAllCommStepTypeIDs());
			collection.addAll(scenarioType.getAllResourceAcquireTypeIDs());
			collection.addAll(scenarioType.getAllResourceReleaseTypeIDs());
			collection.addAll(scenarioType.getAllResourcePassTypeIDs());
			
			for (String target : targets) {
				if (!isFoundInCollection(target, "target", collection, "a Step|CommStep|ResourceAcquire|ResourceRelease|ResourcePass", "Fork", forkType.getId())) {
					hasError = true;
					continue;
				}
			}
		}
		
		if( hasError ) {
			log(error.toString(), true); 
			return false;
		}

		log("No errors found with "+elementName+"s of Scenario ("+scenarioType.getName()+")");
		return true;
	}
	
	private boolean areAllSequenceTypesValid(EList<SequenceType> sequenceList, ScenarioTypeWrapper scenarioType) {
		StringBuilder error = new StringBuilder(); 
		boolean hasError = false; 
		
		for (SequenceType sequenceType : sequenceList) {
			//Sequence only has a single source
			String source = Utilities.getSingleSource(sequenceType, "Sequence");
			if (source == null){
				hasError = true;
				continue; 
			}
		
			//Sequence's Source must match the ID of Step|CommStep|ResourceAcquire|ResourceRelease|ResourcePass
			ArrayList<String> collection = new ArrayList<>(); 
			collection.addAll(scenarioType.getAllStepTypeIDs());
			collection.addAll(scenarioType.getAllCommStepTypeIDs());
			collection.addAll(scenarioType.getAllResourceAcquireTypeIDs());
			collection.addAll(scenarioType.getAllResourceReleaseTypeIDs());
			collection.addAll(scenarioType.getAllResourcePassTypeIDs());
			
			if (!isFoundInCollection(source, "source", collection, "a Step|CommStep|ResourceAcquire|ResourceRelease|ResourcePass", "Sequence", sequenceType.getId())) {
				hasError = true;
				continue;
			}
			
			//Sequence only has a single Target
			String target = Utilities.getSingleTarget(sequenceType, "Sequence");
			if (target == null){
				hasError = true;
				continue; 
			}
			
			//Sequence's Target must match the ID of Step|CommStep|ResourceAcquire|ResourceRelease|ResourcePass
			collection = new ArrayList<>(); 
			collection.addAll(scenarioType.getAllStepTypeIDs());
			collection.addAll(scenarioType.getAllCommStepTypeIDs());
			collection.addAll(scenarioType.getAllResourceAcquireTypeIDs());
			collection.addAll(scenarioType.getAllResourceReleaseTypeIDs());
			collection.addAll(scenarioType.getAllResourcePassTypeIDs());
			
			if (!isFoundInCollection(target, "target", collection, "a Step|CommStep|ResourceAcquire|ResourceRelease|ResourcePass", "Sequence", sequenceType.getId())) {
				hasError = true;
				continue;
			}
			
			//Sequence's Source cannot equal its Target
			if (source.equals(target)) {
				error.append("Sequence (" + sequenceType.getId() + ") has same source and target ID").append("\n"); 
				hasError = true;
				continue;
			}
		}
		
		if( hasError ) {
			log(error.toString(), true); 
			return false;
		}
		
		return true;
	}
	
	
	private boolean areAllEndTypesValid(EList<EndType> endList, ScenarioTypeWrapper scenarioType)
	{
		StringBuilder error = new StringBuilder(); 
		boolean hasError = false; 
		
		for (EndType endType : endList)
		{
			//End can't have any target
			if (!Utilities.hasNoTarget(endType, "End"))
			{
				hasError = true;
				continue;
			}
			
			//End only has a single source
			String source = Utilities.getSingleSource(endType, "End");
			if (source == null){
				hasError = true;
				continue; 
			}
			
			//End's Source must match the ID of Step|CommStep|ResourceAcquire|ResourceRelease|ResourcePass
			ArrayList<String> collection = new ArrayList<>(); 
			collection.addAll(scenarioType.getAllStepTypeIDs());
			collection.addAll(scenarioType.getAllCommStepTypeIDs());
			collection.addAll(scenarioType.getAllResourceAcquireTypeIDs());
			collection.addAll(scenarioType.getAllResourceReleaseTypeIDs());
			collection.addAll(scenarioType.getAllResourcePassTypeIDs());
			
			if (!isFoundInCollection(source, "source", collection, "a Step|CommStep|ResourceAcquire|ResourceRelease|ResourcePass", "End", endType.getId()))
			{
				hasError = true;
				continue;
			}
		}
		
		if (hasError){
			log(error.toString(), true); 
			return false;
		}
		
		return true;
	}
	
	public boolean areAllStartTypesValid(EList<StartType> startList, ScenarioTypeWrapper scenarioType)
	{
		StringBuilder error = new StringBuilder(); 
		boolean hasError = false; 
		
		for (StartType startType : startList)
		{
			//Start can't have any Source
			if (!Utilities.hasNoSource(startType, "Start"))
			{
				hasError = true;
				continue;
			}
			
			//Start only has a single Target
			String target = Utilities.getSingleTarget(startType, "Start");
			if (target == null){
				hasError = true;
				continue; 
			}
			
			//Start's Target must match the ID of Step|CommStep|ResourceAcquire|ResourceRelease|ResourcePass
			ArrayList<String> collection = new ArrayList<>(); 
			collection.addAll(scenarioType.getAllStepTypeIDs());
			collection.addAll(scenarioType.getAllCommStepTypeIDs());
			collection.addAll(scenarioType.getAllResourceAcquireTypeIDs());
			collection.addAll(scenarioType.getAllResourceReleaseTypeIDs());
			collection.addAll(scenarioType.getAllResourcePassTypeIDs());
			
			if (!isFoundInCollection(target, "target", collection, "a Step|CommStep|ResourceAcquire|ResourceRelease|ResourcePass", "Start", startType.getId())) {
				hasError = true;
				continue;
			}
		}
		
		if (hasError){
			log(error.toString(), true); 
			return false;
		}
				
		return true; 
	}

	
	private boolean isFoundInCollection(String value, String valueName, ArrayList<String> collection, String collectionName, String elementName, String id)
	{
		StringBuilder error = new StringBuilder(); 
		boolean hasError = false;
		
		if( !collection.contains(value) ) {
			error.append(elementName +" ("+ id + ") "+ valueName + " " + value + " is not matched with "+collectionName).append("\n");
			hasError = true; 
		}
		
		if( hasError ) {
			log(error.toString(), true); 
			return false;
		}
		return true; 
	}
}