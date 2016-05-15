/**
 */
package ca.carleton.sce.puma.CSM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.carleton.sce.puma.CSM.CSMPackage
 * @generated
 */
public interface CSMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CSMFactory eINSTANCE = ca.carleton.sce.puma.CSM.impl.CSMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Active Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Active Resource Type</em>'.
	 * @generated
	 */
	ActiveResourceType createActiveResourceType();

	/**
	 * Returns a new object of class '<em>Aspect Step Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aspect Step Type</em>'.
	 * @generated
	 */
	AspectStepType createAspectStepType();

	/**
	 * Returns a new object of class '<em>Branch Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Branch Type</em>'.
	 * @generated
	 */
	BranchType createBranchType();

	/**
	 * Returns a new object of class '<em>Closed Workload Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Closed Workload Type</em>'.
	 * @generated
	 */
	ClosedWorkloadType createClosedWorkloadType();

	/**
	 * Returns a new object of class '<em>Comm Link Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comm Link Type</em>'.
	 * @generated
	 */
	CommLinkType createCommLinkType();

	/**
	 * Returns a new object of class '<em>Comm Step Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comm Step Type</em>'.
	 * @generated
	 */
	CommStepType createCommStepType();

	/**
	 * Returns a new object of class '<em>Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Type</em>'.
	 * @generated
	 */
	ComponentType createComponentType();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	CSMType createCSMType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>End Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Type</em>'.
	 * @generated
	 */
	EndType createEndType();

	/**
	 * Returns a new object of class '<em>External Demand Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Demand Type</em>'.
	 * @generated
	 */
	ExternalDemandType createExternalDemandType();

	/**
	 * Returns a new object of class '<em>Fork Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fork Type</em>'.
	 * @generated
	 */
	ForkType createForkType();

	/**
	 * Returns a new object of class '<em>In Binding Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>In Binding Type</em>'.
	 * @generated
	 */
	InBindingType createInBindingType();

	/**
	 * Returns a new object of class '<em>Join Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Join Type</em>'.
	 * @generated
	 */
	JoinType createJoinType();

	/**
	 * Returns a new object of class '<em>Logical Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Resource Type</em>'.
	 * @generated
	 */
	LogicalResourceType createLogicalResourceType();

	/**
	 * Returns a new object of class '<em>Merge Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merge Type</em>'.
	 * @generated
	 */
	MergeType createMergeType();

	/**
	 * Returns a new object of class '<em>Open Workload Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Open Workload Type</em>'.
	 * @generated
	 */
	OpenWorkloadType createOpenWorkloadType();

	/**
	 * Returns a new object of class '<em>Out Binding Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Out Binding Type</em>'.
	 * @generated
	 */
	OutBindingType createOutBindingType();

	/**
	 * Returns a new object of class '<em>Perf Measure Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Perf Measure Type</em>'.
	 * @generated
	 */
	PerfMeasureType createPerfMeasureType();

	/**
	 * Returns a new object of class '<em>Perf Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Perf Value Type</em>'.
	 * @generated
	 */
	PerfValueType createPerfValueType();

	/**
	 * Returns a new object of class '<em>Processing Resource Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processing Resource Type</em>'.
	 * @generated
	 */
	ProcessingResourceType createProcessingResourceType();

	/**
	 * Returns a new object of class '<em>Refinement Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Refinement Type</em>'.
	 * @generated
	 */
	RefinementType createRefinementType();

	/**
	 * Returns a new object of class '<em>Resource Acquire Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Acquire Type</em>'.
	 * @generated
	 */
	ResourceAcquireType createResourceAcquireType();

	/**
	 * Returns a new object of class '<em>Resource Pass Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Pass Type</em>'.
	 * @generated
	 */
	ResourcePassType createResourcePassType();

	/**
	 * Returns a new object of class '<em>Resource Release Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Release Type</em>'.
	 * @generated
	 */
	ResourceReleaseType createResourceReleaseType();

	/**
	 * Returns a new object of class '<em>Role Binding Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role Binding Type</em>'.
	 * @generated
	 */
	RoleBindingType createRoleBindingType();

	/**
	 * Returns a new object of class '<em>Scenario Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scenario Type</em>'.
	 * @generated
	 */
	ScenarioType createScenarioType();

	/**
	 * Returns a new object of class '<em>Sequence Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Type</em>'.
	 * @generated
	 */
	SequenceType createSequenceType();

	/**
	 * Returns a new object of class '<em>Start Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Type</em>'.
	 * @generated
	 */
	StartType createStartType();

	/**
	 * Returns a new object of class '<em>Step Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step Type</em>'.
	 * @generated
	 */
	StepType createStepType();

	/**
	 * Returns a new object of class '<em>Variable Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Type</em>'.
	 * @generated
	 */
	VariableType createVariableType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CSMPackage getCSMPackage();

} //CSMFactory
