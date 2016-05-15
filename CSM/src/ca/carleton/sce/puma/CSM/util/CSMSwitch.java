/**
 */
package ca.carleton.sce.puma.CSM.util;

import ca.carleton.sce.puma.CSM.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ca.carleton.sce.puma.CSM.CSMPackage
 * @generated
 */
public class CSMSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CSMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMSwitch() {
		if (modelPackage == null) {
			modelPackage = CSMPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CSMPackage.ACTIVE_RESOURCE_TYPE: {
				ActiveResourceType activeResourceType = (ActiveResourceType)theEObject;
				T result = caseActiveResourceType(activeResourceType);
				if (result == null) result = caseGeneralResourceType(activeResourceType);
				if (result == null) result = caseCSMElementType(activeResourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSMPackage.ASPECT_STEP_TYPE: {
				AspectStepType aspectStepType = (AspectStepType)theEObject;
				T result = caseAspectStepType(aspectStepType);
				if (result == null) result = caseStepType(aspectStepType);
				if (result == null) result = caseScenarioElementType(aspectStepType);
				if (result == null) result = caseCSMElementType(aspectStepType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSMPackage.BRANCH_TYPE: {
				BranchType branchType = (BranchType)theEObject;
				T result = caseBranchType(branchType);
				if (result == null) result = casePathConnectionType(branchType);
				if (result == null) result = caseScenarioElementType(branchType);
				if (result == null) result = caseCSMElementType(branchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSMPackage.CLOSED_WORKLOAD_TYPE: {
				ClosedWorkloadType closedWorkloadType = (ClosedWorkloadType)theEObject;
				T result = caseClosedWorkloadType(closedWorkloadType);
				if (result == null) result = caseWorkloadType(closedWorkloadType);
				if (result == null) result = caseScenarioElementType(closedWorkloadType);
				if (result == null) result = caseCSMElementType(closedWorkloadType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSMPackage.COMM_LINK_TYPE: {
				CommLinkType commLinkType = (CommLinkType)theEObject;
				T result = caseCommLinkType(commLinkType);
				if (result == null) result = caseComponentType(commLinkType);
				if (result == null) result = caseLogicalResourceType(commLinkType);
				if (result == null) result = caseGeneralResourceType(commLinkType);
				if (result == null) result = caseCSMElementType(commLinkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSMPackage.COMM_STEP_TYPE: {
				CommStepType commStepType = (CommStepType)theEObject;
				T result = caseCommStepType(commStepType);
				if (result == null) result = caseStepType(commStepType);
				if (result == null) result = caseScenarioElementType(commStepType);
				if (result == null) result = caseCSMElementType(commStepType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSMPackage.COMPONENT_TYPE: {
				ComponentType componentType = (ComponentType)theEObject;
				T result = caseComponentType(componentType);
				if (result == null) result = caseLogicalResourceType(componentType);
				if (result == null) result = caseGeneralResourceType(componentType);
				if (result == null) result = caseCSMElementType(componentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSMPackage.CSM_ELEMENT_TYPE: {
				CSMElementType csmElementType = (CSMElementType)theEObject;
				T result = caseCSMElementType(csmElementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSMPackage.CSM_TYPE: {
				CSMType csmType = (CSMType)theEObject;
				T result = caseCSMType(csmType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSMPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSMPackage.END_TYPE: {
				EndType endType = (EndType)theEObject;
				T result = caseEndType(endType);
				if (result == null) result = casePathConnectionType(endType);
				if (result == null) result = caseScenarioElementType(endType);
				if (result == null) result = caseCSMElementType(endType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSMPackage.EXTERNAL_DEMAND_TYPE: {
				ExternalDemandType externalDemandType = (ExternalDemandType)theEObject;
				T result = caseExternalDemandType(externalDemandType);
				if (result == null) result = caseScenarioElementType(externalDemandType);
				if (result == null) result = caseCSMElementType(externalDemandType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSMPackage.FORK_TYPE: {
				ForkType forkType = (ForkType)theEObject;
				T result = caseForkType(forkType);
				if (result == null) result = casePathConnectionType(forkType);
				if (result == null) result = caseScenarioElementType(forkType);
				if (result == null) result = caseCSMElementType(forkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSMPackage.GENERAL_RESOURCE_TYPE: {
				GeneralResourceType generalResourceType = (GeneralResourceType)theEObject;
				T result = caseGeneralResourceType(generalResourceType);
				if (result == null) result = caseCSMElementType(generalResourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSMPackage.IN_BINDING_TYPE: {
				InBindingType inBindingType = (InBindingType)theEObject;
				T result = caseInBindingType(inBindingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSMPackage.JOIN_TYPE: {
				JoinType joinType = (JoinType)theEObject;
				T result = caseJoinType(joinType);
				if (result == null) result = casePathConnectionType(joinType);
				if (result == null) result = caseScenarioElementType(joinType);
				if (result == null) result = caseCSMElementType(joinType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSMPackage.LOGICAL_RESOURCE_TYPE: {
				LogicalResourceType logicalResourceType = (LogicalResourceType)theEObject;
				T result = caseLogicalResourceType(logicalResourceType);
				if (result == null) result = caseGeneralResourceType(logicalResourceType);
				if (result == null) result = caseCSMElementType(logicalResourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSMPackage.MERGE_TYPE: {
				MergeType mergeType = (MergeType)theEObject;
				T result = caseMergeType(mergeType);
				if (result == null) result = casePathConnectionType(mergeType);
				if (result == null) result = caseScenarioElementType(mergeType);
				if (result == null) result = caseCSMElementType(mergeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSMPackage.OPEN_WORKLOAD_TYPE: {
				OpenWorkloadType openWorkloadType = (OpenWorkloadType)theEObject;
				T result = caseOpenWorkloadType(openWorkloadType);
				if (result == null) result = caseWorkloadType(openWorkloadType);
				if (result == null) result = caseScenarioElementType(openWorkloadType);
				if (result == null) result = caseCSMElementType(openWorkloadType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSMPackage.OUT_BINDING_TYPE: {
				OutBindingType outBindingType = (OutBindingType)theEObject;
				T result = caseOutBindingType(outBindingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSMPackage.PATH_CONNECTION_TYPE: {
				PathConnectionType pathConnectionType = (PathConnectionType)theEObject;
				T result = casePathConnectionType(pathConnectionType);
				if (result == null) result = caseScenarioElementType(pathConnectionType);
				if (result == null) result = caseCSMElementType(pathConnectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSMPackage.PERF_MEASURE_TYPE: {
				PerfMeasureType perfMeasureType = (PerfMeasureType)theEObject;
				T result = casePerfMeasureType(perfMeasureType);
				if (result == null) result = caseCSMElementType(perfMeasureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSMPackage.PERF_VALUE_TYPE: {
				PerfValueType perfValueType = (PerfValueType)theEObject;
				T result = casePerfValueType(perfValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSMPackage.PROCESSING_RESOURCE_TYPE: {
				ProcessingResourceType processingResourceType = (ProcessingResourceType)theEObject;
				T result = caseProcessingResourceType(processingResourceType);
				if (result == null) result = caseActiveResourceType(processingResourceType);
				if (result == null) result = caseGeneralResourceType(processingResourceType);
				if (result == null) result = caseCSMElementType(processingResourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSMPackage.REFINEMENT_TYPE: {
				RefinementType refinementType = (RefinementType)theEObject;
				T result = caseRefinementType(refinementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSMPackage.RESOURCE_ACQUIRE_TYPE: {
				ResourceAcquireType resourceAcquireType = (ResourceAcquireType)theEObject;
				T result = caseResourceAcquireType(resourceAcquireType);
				if (result == null) result = caseStepType(resourceAcquireType);
				if (result == null) result = caseScenarioElementType(resourceAcquireType);
				if (result == null) result = caseCSMElementType(resourceAcquireType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSMPackage.RESOURCE_PASS_TYPE: {
				ResourcePassType resourcePassType = (ResourcePassType)theEObject;
				T result = caseResourcePassType(resourcePassType);
				if (result == null) result = caseStepType(resourcePassType);
				if (result == null) result = caseScenarioElementType(resourcePassType);
				if (result == null) result = caseCSMElementType(resourcePassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSMPackage.RESOURCE_RELEASE_TYPE: {
				ResourceReleaseType resourceReleaseType = (ResourceReleaseType)theEObject;
				T result = caseResourceReleaseType(resourceReleaseType);
				if (result == null) result = caseStepType(resourceReleaseType);
				if (result == null) result = caseScenarioElementType(resourceReleaseType);
				if (result == null) result = caseCSMElementType(resourceReleaseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSMPackage.ROLE_BINDING_TYPE: {
				RoleBindingType roleBindingType = (RoleBindingType)theEObject;
				T result = caseRoleBindingType(roleBindingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSMPackage.SCENARIO_ELEMENT_TYPE: {
				ScenarioElementType scenarioElementType = (ScenarioElementType)theEObject;
				T result = caseScenarioElementType(scenarioElementType);
				if (result == null) result = caseCSMElementType(scenarioElementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSMPackage.SCENARIO_TYPE: {
				ScenarioType scenarioType = (ScenarioType)theEObject;
				T result = caseScenarioType(scenarioType);
				if (result == null) result = caseCSMElementType(scenarioType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSMPackage.SEQUENCE_TYPE: {
				SequenceType sequenceType = (SequenceType)theEObject;
				T result = caseSequenceType(sequenceType);
				if (result == null) result = casePathConnectionType(sequenceType);
				if (result == null) result = caseScenarioElementType(sequenceType);
				if (result == null) result = caseCSMElementType(sequenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSMPackage.START_TYPE: {
				StartType startType = (StartType)theEObject;
				T result = caseStartType(startType);
				if (result == null) result = casePathConnectionType(startType);
				if (result == null) result = caseScenarioElementType(startType);
				if (result == null) result = caseCSMElementType(startType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSMPackage.STEP_TYPE: {
				StepType stepType = (StepType)theEObject;
				T result = caseStepType(stepType);
				if (result == null) result = caseScenarioElementType(stepType);
				if (result == null) result = caseCSMElementType(stepType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSMPackage.VARIABLE_TYPE: {
				VariableType variableType = (VariableType)theEObject;
				T result = caseVariableType(variableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CSMPackage.WORKLOAD_TYPE: {
				WorkloadType workloadType = (WorkloadType)theEObject;
				T result = caseWorkloadType(workloadType);
				if (result == null) result = caseScenarioElementType(workloadType);
				if (result == null) result = caseCSMElementType(workloadType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Active Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Active Resource Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActiveResourceType(ActiveResourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aspect Step Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aspect Step Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAspectStepType(AspectStepType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Branch Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Branch Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBranchType(BranchType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Closed Workload Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Closed Workload Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClosedWorkloadType(ClosedWorkloadType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comm Link Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comm Link Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommLinkType(CommLinkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comm Step Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comm Step Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommStepType(CommStepType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentType(ComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSMElementType(CSMElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSMType(CSMType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndType(EndType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Demand Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Demand Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalDemandType(ExternalDemandType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fork Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fork Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForkType(ForkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Resource Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralResourceType(GeneralResourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Binding Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Binding Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInBindingType(InBindingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoinType(JoinType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Resource Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalResourceType(LogicalResourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merge Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merge Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergeType(MergeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Workload Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Workload Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenWorkloadType(OpenWorkloadType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Out Binding Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Out Binding Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutBindingType(OutBindingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Connection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Connection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathConnectionType(PathConnectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Perf Measure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Perf Measure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerfMeasureType(PerfMeasureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Perf Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Perf Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerfValueType(PerfValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Processing Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Processing Resource Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessingResourceType(ProcessingResourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refinement Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refinement Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefinementType(RefinementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Acquire Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Acquire Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceAcquireType(ResourceAcquireType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Pass Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Pass Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourcePassType(ResourcePassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Release Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Release Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceReleaseType(ResourceReleaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Binding Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Binding Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleBindingType(RoleBindingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scenario Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scenario Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScenarioElementType(ScenarioElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scenario Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scenario Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScenarioType(ScenarioType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceType(SequenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartType(StartType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStepType(StepType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableType(VariableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workload Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workload Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkloadType(WorkloadType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CSMSwitch
