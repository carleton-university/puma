/**
 */
package ca.carleton.sce.puma.CSM.impl;

import ca.carleton.sce.puma.CSM.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CSMFactoryImpl extends EFactoryImpl implements CSMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CSMFactory init() {
		try {
			CSMFactory theCSMFactory = (CSMFactory)EPackage.Registry.INSTANCE.getEFactory("platform:/plugin/ca.carleton.sce.puma.csm/model/CSM.xsd"); 
			if (theCSMFactory != null) {
				return theCSMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CSMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CSMPackage.ACTIVE_RESOURCE_TYPE: return createActiveResourceType();
			case CSMPackage.ASPECT_STEP_TYPE: return createAspectStepType();
			case CSMPackage.BRANCH_TYPE: return createBranchType();
			case CSMPackage.CLOSED_WORKLOAD_TYPE: return createClosedWorkloadType();
			case CSMPackage.COMM_LINK_TYPE: return createCommLinkType();
			case CSMPackage.COMM_STEP_TYPE: return createCommStepType();
			case CSMPackage.COMPONENT_TYPE: return createComponentType();
			case CSMPackage.CSM_TYPE: return createCSMType();
			case CSMPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case CSMPackage.END_TYPE: return createEndType();
			case CSMPackage.EXTERNAL_DEMAND_TYPE: return createExternalDemandType();
			case CSMPackage.FORK_TYPE: return createForkType();
			case CSMPackage.IN_BINDING_TYPE: return createInBindingType();
			case CSMPackage.JOIN_TYPE: return createJoinType();
			case CSMPackage.LOGICAL_RESOURCE_TYPE: return createLogicalResourceType();
			case CSMPackage.MERGE_TYPE: return createMergeType();
			case CSMPackage.OPEN_WORKLOAD_TYPE: return createOpenWorkloadType();
			case CSMPackage.OUT_BINDING_TYPE: return createOutBindingType();
			case CSMPackage.PERF_MEASURE_TYPE: return createPerfMeasureType();
			case CSMPackage.PERF_VALUE_TYPE: return createPerfValueType();
			case CSMPackage.PROCESSING_RESOURCE_TYPE: return createProcessingResourceType();
			case CSMPackage.REFINEMENT_TYPE: return createRefinementType();
			case CSMPackage.RESOURCE_ACQUIRE_TYPE: return createResourceAcquireType();
			case CSMPackage.RESOURCE_PASS_TYPE: return createResourcePassType();
			case CSMPackage.RESOURCE_RELEASE_TYPE: return createResourceReleaseType();
			case CSMPackage.ROLE_BINDING_TYPE: return createRoleBindingType();
			case CSMPackage.SCENARIO_TYPE: return createScenarioType();
			case CSMPackage.SEQUENCE_TYPE: return createSequenceType();
			case CSMPackage.START_TYPE: return createStartType();
			case CSMPackage.STEP_TYPE: return createStepType();
			case CSMPackage.VARIABLE_TYPE: return createVariableType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CSMPackage.ARRIVAL_PROCESS:
				return createArrivalProcessFromString(eDataType, initialValue);
			case CSMPackage.MSG_KIND:
				return createMsgKindFromString(eDataType, initialValue);
			case CSMPackage.PERF_MEASURE_KIND:
				return createPerfMeasureKindFromString(eDataType, initialValue);
			case CSMPackage.PERF_VALUE_KIND:
				return createPerfValueKindFromString(eDataType, initialValue);
			case CSMPackage.PERF_VALUE_SOURCE:
				return createPerfValueSourceFromString(eDataType, initialValue);
			case CSMPackage.STEP_KIND:
				return createStepKindFromString(eDataType, initialValue);
			case CSMPackage.SYNCHRONIZATION_KIND:
				return createSynchronizationKindFromString(eDataType, initialValue);
			case CSMPackage.ARRIVAL_PROCESS_OBJECT:
				return createArrivalProcessObjectFromString(eDataType, initialValue);
			case CSMPackage.MSG_KIND_OBJECT:
				return createMsgKindObjectFromString(eDataType, initialValue);
			case CSMPackage.PERF_MEASURE_KIND_OBJECT:
				return createPerfMeasureKindObjectFromString(eDataType, initialValue);
			case CSMPackage.PERF_VALUE_KIND_OBJECT:
				return createPerfValueKindObjectFromString(eDataType, initialValue);
			case CSMPackage.PERF_VALUE_SOURCE_OBJECT:
				return createPerfValueSourceObjectFromString(eDataType, initialValue);
			case CSMPackage.STEP_KIND_OBJECT:
				return createStepKindObjectFromString(eDataType, initialValue);
			case CSMPackage.SYNCHRONIZATION_KIND_OBJECT:
				return createSynchronizationKindObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CSMPackage.ARRIVAL_PROCESS:
				return convertArrivalProcessToString(eDataType, instanceValue);
			case CSMPackage.MSG_KIND:
				return convertMsgKindToString(eDataType, instanceValue);
			case CSMPackage.PERF_MEASURE_KIND:
				return convertPerfMeasureKindToString(eDataType, instanceValue);
			case CSMPackage.PERF_VALUE_KIND:
				return convertPerfValueKindToString(eDataType, instanceValue);
			case CSMPackage.PERF_VALUE_SOURCE:
				return convertPerfValueSourceToString(eDataType, instanceValue);
			case CSMPackage.STEP_KIND:
				return convertStepKindToString(eDataType, instanceValue);
			case CSMPackage.SYNCHRONIZATION_KIND:
				return convertSynchronizationKindToString(eDataType, instanceValue);
			case CSMPackage.ARRIVAL_PROCESS_OBJECT:
				return convertArrivalProcessObjectToString(eDataType, instanceValue);
			case CSMPackage.MSG_KIND_OBJECT:
				return convertMsgKindObjectToString(eDataType, instanceValue);
			case CSMPackage.PERF_MEASURE_KIND_OBJECT:
				return convertPerfMeasureKindObjectToString(eDataType, instanceValue);
			case CSMPackage.PERF_VALUE_KIND_OBJECT:
				return convertPerfValueKindObjectToString(eDataType, instanceValue);
			case CSMPackage.PERF_VALUE_SOURCE_OBJECT:
				return convertPerfValueSourceObjectToString(eDataType, instanceValue);
			case CSMPackage.STEP_KIND_OBJECT:
				return convertStepKindObjectToString(eDataType, instanceValue);
			case CSMPackage.SYNCHRONIZATION_KIND_OBJECT:
				return convertSynchronizationKindObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActiveResourceType createActiveResourceType() {
		ActiveResourceTypeImpl activeResourceType = new ActiveResourceTypeImpl();
		return activeResourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AspectStepType createAspectStepType() {
		AspectStepTypeImpl aspectStepType = new AspectStepTypeImpl();
		return aspectStepType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BranchType createBranchType() {
		BranchTypeImpl branchType = new BranchTypeImpl();
		return branchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClosedWorkloadType createClosedWorkloadType() {
		ClosedWorkloadTypeImpl closedWorkloadType = new ClosedWorkloadTypeImpl();
		return closedWorkloadType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommLinkType createCommLinkType() {
		CommLinkTypeImpl commLinkType = new CommLinkTypeImpl();
		return commLinkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommStepType createCommStepType() {
		CommStepTypeImpl commStepType = new CommStepTypeImpl();
		return commStepType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType createComponentType() {
		ComponentTypeImpl componentType = new ComponentTypeImpl();
		return componentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMType createCSMType() {
		CSMTypeImpl csmType = new CSMTypeImpl();
		return csmType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndType createEndType() {
		EndTypeImpl endType = new EndTypeImpl();
		return endType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalDemandType createExternalDemandType() {
		ExternalDemandTypeImpl externalDemandType = new ExternalDemandTypeImpl();
		return externalDemandType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkType createForkType() {
		ForkTypeImpl forkType = new ForkTypeImpl();
		return forkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InBindingType createInBindingType() {
		InBindingTypeImpl inBindingType = new InBindingTypeImpl();
		return inBindingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinType createJoinType() {
		JoinTypeImpl joinType = new JoinTypeImpl();
		return joinType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalResourceType createLogicalResourceType() {
		LogicalResourceTypeImpl logicalResourceType = new LogicalResourceTypeImpl();
		return logicalResourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeType createMergeType() {
		MergeTypeImpl mergeType = new MergeTypeImpl();
		return mergeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenWorkloadType createOpenWorkloadType() {
		OpenWorkloadTypeImpl openWorkloadType = new OpenWorkloadTypeImpl();
		return openWorkloadType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutBindingType createOutBindingType() {
		OutBindingTypeImpl outBindingType = new OutBindingTypeImpl();
		return outBindingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerfMeasureType createPerfMeasureType() {
		PerfMeasureTypeImpl perfMeasureType = new PerfMeasureTypeImpl();
		return perfMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerfValueType createPerfValueType() {
		PerfValueTypeImpl perfValueType = new PerfValueTypeImpl();
		return perfValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingResourceType createProcessingResourceType() {
		ProcessingResourceTypeImpl processingResourceType = new ProcessingResourceTypeImpl();
		return processingResourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefinementType createRefinementType() {
		RefinementTypeImpl refinementType = new RefinementTypeImpl();
		return refinementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceAcquireType createResourceAcquireType() {
		ResourceAcquireTypeImpl resourceAcquireType = new ResourceAcquireTypeImpl();
		return resourceAcquireType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcePassType createResourcePassType() {
		ResourcePassTypeImpl resourcePassType = new ResourcePassTypeImpl();
		return resourcePassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceReleaseType createResourceReleaseType() {
		ResourceReleaseTypeImpl resourceReleaseType = new ResourceReleaseTypeImpl();
		return resourceReleaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleBindingType createRoleBindingType() {
		RoleBindingTypeImpl roleBindingType = new RoleBindingTypeImpl();
		return roleBindingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioType createScenarioType() {
		ScenarioTypeImpl scenarioType = new ScenarioTypeImpl();
		return scenarioType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceType createSequenceType() {
		SequenceTypeImpl sequenceType = new SequenceTypeImpl();
		return sequenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartType createStartType() {
		StartTypeImpl startType = new StartTypeImpl();
		return startType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepType createStepType() {
		StepTypeImpl stepType = new StepTypeImpl();
		return stepType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableType createVariableType() {
		VariableTypeImpl variableType = new VariableTypeImpl();
		return variableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrivalProcess createArrivalProcessFromString(EDataType eDataType, String initialValue) {
		ArrivalProcess result = ArrivalProcess.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArrivalProcessToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MsgKind createMsgKindFromString(EDataType eDataType, String initialValue) {
		MsgKind result = MsgKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMsgKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerfMeasureKind createPerfMeasureKindFromString(EDataType eDataType, String initialValue) {
		PerfMeasureKind result = PerfMeasureKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPerfMeasureKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerfValueKind createPerfValueKindFromString(EDataType eDataType, String initialValue) {
		PerfValueKind result = PerfValueKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPerfValueKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerfValueSource createPerfValueSourceFromString(EDataType eDataType, String initialValue) {
		PerfValueSource result = PerfValueSource.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPerfValueSourceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepKind createStepKindFromString(EDataType eDataType, String initialValue) {
		StepKind result = StepKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStepKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizationKind createSynchronizationKindFromString(EDataType eDataType, String initialValue) {
		SynchronizationKind result = SynchronizationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSynchronizationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrivalProcess createArrivalProcessObjectFromString(EDataType eDataType, String initialValue) {
		return createArrivalProcessFromString(CSMPackage.Literals.ARRIVAL_PROCESS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArrivalProcessObjectToString(EDataType eDataType, Object instanceValue) {
		return convertArrivalProcessToString(CSMPackage.Literals.ARRIVAL_PROCESS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MsgKind createMsgKindObjectFromString(EDataType eDataType, String initialValue) {
		return createMsgKindFromString(CSMPackage.Literals.MSG_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMsgKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMsgKindToString(CSMPackage.Literals.MSG_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerfMeasureKind createPerfMeasureKindObjectFromString(EDataType eDataType, String initialValue) {
		return createPerfMeasureKindFromString(CSMPackage.Literals.PERF_MEASURE_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPerfMeasureKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPerfMeasureKindToString(CSMPackage.Literals.PERF_MEASURE_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerfValueKind createPerfValueKindObjectFromString(EDataType eDataType, String initialValue) {
		return createPerfValueKindFromString(CSMPackage.Literals.PERF_VALUE_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPerfValueKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPerfValueKindToString(CSMPackage.Literals.PERF_VALUE_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerfValueSource createPerfValueSourceObjectFromString(EDataType eDataType, String initialValue) {
		return createPerfValueSourceFromString(CSMPackage.Literals.PERF_VALUE_SOURCE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPerfValueSourceObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPerfValueSourceToString(CSMPackage.Literals.PERF_VALUE_SOURCE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepKind createStepKindObjectFromString(EDataType eDataType, String initialValue) {
		return createStepKindFromString(CSMPackage.Literals.STEP_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStepKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStepKindToString(CSMPackage.Literals.STEP_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizationKind createSynchronizationKindObjectFromString(EDataType eDataType, String initialValue) {
		return createSynchronizationKindFromString(CSMPackage.Literals.SYNCHRONIZATION_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSynchronizationKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSynchronizationKindToString(CSMPackage.Literals.SYNCHRONIZATION_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMPackage getCSMPackage() {
		return (CSMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CSMPackage getPackage() {
		return CSMPackage.eINSTANCE;
	}

} //CSMFactoryImpl
