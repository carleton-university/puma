package csm2lqn.utility;

import java.util.ArrayList;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import ca.carleton.sce.puma.CSM.CommStepType;
import ca.carleton.sce.puma.CSM.PathConnectionType;
import ca.carleton.sce.puma.CSM.ScenarioElementType;
import ca.carleton.sce.puma.CSM.SequenceType;
import ca.carleton.sce.puma.CSM.StartType;
import ca.carleton.sce.puma.CSM.StepType;
import ca.carleton.sce.puma.CSM.impl.CommStepTypeImpl;
import ca.carleton.sce.puma.CSM.impl.SequenceTypeImpl;

public class Utilities {

	
	/**
	 * Validates that the given element has no Target
	 * @param element
	 * @param elementName
	 * @return
	 */
	public static boolean hasNoTarget(PathConnectionType element, String elementName)
	{
		StringBuilder error = new StringBuilder(); 
		boolean hasError = false;
		
		if (element.getTarget() != null && element.getTarget().size() > 0)
		{
			error.append(elementName + " ("+ element.getId() + ") is not allowed to have a target attribute").append("\n");  
			hasError = true; 
		}
		
		if (hasError){
			System.out.println(error.toString()); 
			return false;
		}
		return true; 
	}
	
	/**
	 * Validates that the given element has no Source
	 * @param element
	 * @param elementName
	 * @return
	 */
	public static boolean hasNoSource(PathConnectionType element, String elementName)
	{
		StringBuilder error = new StringBuilder(); 
		boolean hasError = false;
		
		if (element.getSource() != null && element.getSource().size() > 0)
		{
			error.append(elementName + " ("+ element.getId() + ") is not allowed to have a source attribute").append("\n");  
			hasError = true; 
		}
		
		if (hasError){
			System.out.println(error.toString()); 
			return false;
		}
		return true; 
	}
	
	/**
	 * Validates that the given element has only a single Predecessor
	 * Returns null if there are no Predecessors or more than one Predecessors
	 * @param element
	 * @param elementName
	 * @return
	 */
	public static String getSinglePredecessor(StepType element, String elementName)
	{
		StringBuilder error = new StringBuilder(); 
		boolean hasError = false;
		String predecessor = null; 
		
		if (element.getPredecessor() == null){
			error.append(elementName + " ("+ element.getId() + ") must have a Predecessor attribute").append("\n"); 
			hasError = true; 
		}
//		else if (element.getPredecessor().size() != 1)
//		{
//			error.append(elementName + " ("+ element.getId() + ") could only have a single Predecessor").append("\n"); 
//			hasError = true; 
//			 
//		}
		else
		{	
			predecessor = ((ScenarioElementType) element.getPredecessor()).getId();
			if (checkForMultipleIDs(predecessor) == false)
			{
				error.append(elementName + " ("+ element.getId() + ") has multiple Predecessors " + predecessor).append("\n"); 
				hasError = true; 
			}
		}
		
		if (hasError){
			System.out.println(error.toString()); 
			return null;
		}
		else
		{
			return predecessor; 
		}
	}
	
	/**
	 * Validates that the given element has only a single Successor
	 * Returns null if there are no Successors or more than one Successors
	 * @param element
	 * @param elementName
	 * @return
	 */
	public static String getSingleSuccessor(StepType element, String elementName)
	{
		StringBuilder error = new StringBuilder(); 
		boolean hasError = false;
		String successor = null; 
		
		if (element.getSuccessor() == null){
			error.append(elementName + " ("+ element.getId() + ") must have a Successor attribute").append("\n"); 
			hasError = true; 
		}
//		else if (element.getSuccessor().size() != 1)
//		{
//			error.append(elementName + " ("+ element.getId() + ") could only have a single Successor").append("\n"); 
//			hasError = true; 
//			 
//		}
		else
		{	
			successor = ((ScenarioElementType) element.getSuccessor()).getId();
			if (checkForMultipleIDs(successor) == false)
			{
				error.append(elementName + " ("+ element.getId() + ") has multiple Successor " + successor).append("\n"); 
				hasError = true; 
			}
		}
		
		if (hasError){
			System.out.println(error.toString()); 
			return null;
		}
		else
		{
			return successor; 
		}
	}
	
	/**
	 * Validates that the given element has only a single Target
	 * Returns null if there are no targets or more than one targets
	 * @param element
	 * @param elementName
	 * @return
	 */
	public static String getSingleTarget(PathConnectionType element, String elementName)
	{
		StringBuilder error = new StringBuilder(); 
		boolean hasError = false;
		String target = null; 
		
		if (element.getTarget() == null){
			error.append(elementName + " ("+ element.getId() + ") must have a Target attribute").append("\n"); 
			hasError = true; 
		}
		else if (element.getTarget().size() < 1)
		{
			error.append(elementName + " ("+ element.getId() + ") must have a single target").append("\n"); 
			hasError = true; 
			 
		}
		else if (element.getTarget().size() > 1)
		{
			error.append(elementName + " ("+ element.getId() + ") cannot have more than one target").append("\n"); 
			hasError = true; 
			 
		}
		else
		{	
			target = ((ScenarioElementType) element.getTarget().get(0)).getId();
			if (checkForMultipleIDs(target) == false)
			{
				error.append(elementName + " ("+ element.getId() + ") has multiple targets " + target).append("\n"); 
				hasError = true; 
			}
		}
		
		if (hasError){
			System.out.println(error.toString()); 
			return null;
		}
		else
		{
			return target; 
		}
	}
	
	/**
	 * Validates that the given element has only a single Source
	 * @param element
	 * @param elementName
	 * @return
	 */
	public static String getSingleSource(PathConnectionType element, String elementName)
	{
		StringBuilder error = new StringBuilder(); 
		boolean hasError = false;
		String source = null; 
		
		if (element.getSource() == null) {
			error.append(elementName + " ("+ element.getId() + ") must have a Source attribute").append("\n"); 
			hasError = true; 
		}
		else if (element.getSource().size() != 1) {
			error.append(elementName + " ("+ element.getId() + ") could only have a single Source").append("\n"); 
			hasError = true; 
			 
		}
		else {	
			source = ((ScenarioElementType) element.getSource().get(0)).getId();
			if (checkForMultipleIDs(source) == false)
			{
				error.append(elementName + " ("+ element.getId() + ") has multiple Sources " + source).append("\n"); 
				hasError = true; 
			}
		}
		
		if (hasError) {
			System.out.println(error.toString()); 
			return null;
		}
		else {
			return source; 
		}
	}
	
	/**
	 * Validates that the given element has more than one target and returns the Target IDs
	 * Returns null otherwise
	 * @param element
	 * @param elementName
	 * @return
	 */
	public static ArrayList<String> getMultipleTargets(PathConnectionType element, String elementName)
	{
		StringBuilder error = new StringBuilder(); 
		boolean hasError = false;
		ArrayList<String> targets = new ArrayList<>(); 
		
		if (element.getTarget() == null){
			error.append(elementName + " ("+ element.getId() + ") must have a Target attribute").append("\n"); 
			hasError = true; 
		}
		else if (element.getTarget().size() <= 1)
		{
			error.append(elementName + " ("+ element.getId() + ") must have more than one target").append("\n"); 
			hasError = true; 
			 
		}
		else
		{	
			EList<StepType> targetList = element.getTarget(); 
			for (ScenarioElementType targetType: targetList)
			{
				targets.add(targetType.getId());
				if (checkForMultipleIDs(targetType.getId()) == false)
				{
					error.append(elementName + " ("+ element.getId() + ") has multiple same line Targets " + targets).append("\n"); 
					hasError = true; 
				}
			}
			
			
		}
		
		if (hasError){
			System.out.println(error.toString()); 
			return null;
		}
		else
		{
			return targets; 
		}
	}
	
	/**
	 * Validates that the given element has multiple Sources
	 * @param element
	 * @param elementName
	 * @return
	 */
	public static ArrayList<String> getMultipleSources(PathConnectionType element, String elementName)
	{
		StringBuilder error = new StringBuilder(); 
		boolean hasError = false;
		ArrayList<String> sources = new ArrayList<>(); 
		
		if (element.getSource() == null){
			error.append(elementName + " ("+ element.getId() + ") must have a Source attribute").append("\n"); 
			hasError = true; 
		}
		else if (element.getSource().size() <= 1)
		{
			error.append(elementName + " ("+ element.getId() + ") cannot have "+ element.getSource().size() +" Source(s)").append("\n"); 
			hasError = true; 
			 
		}
		else
		{	
			EList<StepType> sourceList = element.getSource(); 
			for (ScenarioElementType sourceType: sourceList)
			{
				sources.add(sourceType.getId());
				if (checkForMultipleIDs(sourceType.getId()) == false)
				{
					error.append(elementName + " ("+ element.getId() + ") has multiple same line Sources " + sources).append("\n"); 
					hasError = true; 
				}
			}
		}
		
		if (hasError){
			System.out.println(error.toString()); 
			return null;
		}
		else
		{
			return sources; 
		}
	}
	
	/**
	 * Checks for multiple IDs in the form of "ID00049, ID00050"
	 * @param id
	 * @return
	 */
	private static boolean checkForMultipleIDs(String id)
	{
		if (id.indexOf(',') >= 0)
		{
			return false; 
		}
		
		return true; 
	}
	
	
	public static void printTargets(PathConnectionType predecessor){
		EList<StepType> predecessorsTargets = predecessor.getTarget();
		for (StepType aTarget : predecessorsTargets){
			System.out.println("Target: " + aTarget.getId()); 
		}
	}
	
	//this utility method removes the passed in step from the chain. It assumes that what precedes and follows the given step  
	//is a sequence, or a start, or an end
	public static void removeTheGivenStep(StepType step){
		
		PathConnectionType predecessor = step.getPredecessor(); 
		if (predecessor instanceof StartType){
			//We want to get rid of this step and the next sequence
			
			PathConnectionType successor = step.getSuccessor(); 
			StepType stepAfter = successor.getTarget().get(0);
			
			EList<StepType> predecessorNewTargets = new BasicEList<>(); 
			predecessorNewTargets.add(stepAfter);
			predecessor.setTarget(predecessorNewTargets);
			
			stepAfter.setPredecessor(predecessor);
		}
		else{
			
			//The predecessor is assumed to be a sequence
			//We want to get rid of the previous sequence and this step.
			StepType stepBefore = predecessor.getSource().get(0); 
			
			PathConnectionType successor = step.getSuccessor(); 
			
			stepBefore.setSuccessor(successor); 
			
			EList<StepType> sucessorNewSources = new BasicEList<>(); 
			sucessorNewSources.add(stepBefore);
			successor.setSource(sucessorNewSources);
		}
		
		//set predecessor and successor to null of the original step b/c it's no longer connected.
		System.out.println("Removing step id "+ step.getId() + " from scenario path"); 
		step.setPredecessor(null);
		step.setSuccessor(null);
		
	}
}
