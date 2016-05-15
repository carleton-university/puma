/**
 */
package ca.carleton.sce.puma.CSM.util;

import ca.carleton.sce.puma.CSM.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ca.carleton.sce.puma.CSM.CSMPackage
 * @generated
 */
public class CSMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CSMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CSMPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSMSwitch<Adapter> modelSwitch =
		new CSMSwitch<Adapter>() {
			@Override
			public Adapter caseActiveResourceType(ActiveResourceType object) {
				return createActiveResourceTypeAdapter();
			}
			@Override
			public Adapter caseAspectStepType(AspectStepType object) {
				return createAspectStepTypeAdapter();
			}
			@Override
			public Adapter caseBranchType(BranchType object) {
				return createBranchTypeAdapter();
			}
			@Override
			public Adapter caseClosedWorkloadType(ClosedWorkloadType object) {
				return createClosedWorkloadTypeAdapter();
			}
			@Override
			public Adapter caseCommLinkType(CommLinkType object) {
				return createCommLinkTypeAdapter();
			}
			@Override
			public Adapter caseCommStepType(CommStepType object) {
				return createCommStepTypeAdapter();
			}
			@Override
			public Adapter caseComponentType(ComponentType object) {
				return createComponentTypeAdapter();
			}
			@Override
			public Adapter caseCSMElementType(CSMElementType object) {
				return createCSMElementTypeAdapter();
			}
			@Override
			public Adapter caseCSMType(CSMType object) {
				return createCSMTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEndType(EndType object) {
				return createEndTypeAdapter();
			}
			@Override
			public Adapter caseExternalDemandType(ExternalDemandType object) {
				return createExternalDemandTypeAdapter();
			}
			@Override
			public Adapter caseForkType(ForkType object) {
				return createForkTypeAdapter();
			}
			@Override
			public Adapter caseGeneralResourceType(GeneralResourceType object) {
				return createGeneralResourceTypeAdapter();
			}
			@Override
			public Adapter caseInBindingType(InBindingType object) {
				return createInBindingTypeAdapter();
			}
			@Override
			public Adapter caseJoinType(JoinType object) {
				return createJoinTypeAdapter();
			}
			@Override
			public Adapter caseLogicalResourceType(LogicalResourceType object) {
				return createLogicalResourceTypeAdapter();
			}
			@Override
			public Adapter caseMergeType(MergeType object) {
				return createMergeTypeAdapter();
			}
			@Override
			public Adapter caseOpenWorkloadType(OpenWorkloadType object) {
				return createOpenWorkloadTypeAdapter();
			}
			@Override
			public Adapter caseOutBindingType(OutBindingType object) {
				return createOutBindingTypeAdapter();
			}
			@Override
			public Adapter casePathConnectionType(PathConnectionType object) {
				return createPathConnectionTypeAdapter();
			}
			@Override
			public Adapter casePerfMeasureType(PerfMeasureType object) {
				return createPerfMeasureTypeAdapter();
			}
			@Override
			public Adapter casePerfValueType(PerfValueType object) {
				return createPerfValueTypeAdapter();
			}
			@Override
			public Adapter caseProcessingResourceType(ProcessingResourceType object) {
				return createProcessingResourceTypeAdapter();
			}
			@Override
			public Adapter caseRefinementType(RefinementType object) {
				return createRefinementTypeAdapter();
			}
			@Override
			public Adapter caseResourceAcquireType(ResourceAcquireType object) {
				return createResourceAcquireTypeAdapter();
			}
			@Override
			public Adapter caseResourcePassType(ResourcePassType object) {
				return createResourcePassTypeAdapter();
			}
			@Override
			public Adapter caseResourceReleaseType(ResourceReleaseType object) {
				return createResourceReleaseTypeAdapter();
			}
			@Override
			public Adapter caseRoleBindingType(RoleBindingType object) {
				return createRoleBindingTypeAdapter();
			}
			@Override
			public Adapter caseScenarioElementType(ScenarioElementType object) {
				return createScenarioElementTypeAdapter();
			}
			@Override
			public Adapter caseScenarioType(ScenarioType object) {
				return createScenarioTypeAdapter();
			}
			@Override
			public Adapter caseSequenceType(SequenceType object) {
				return createSequenceTypeAdapter();
			}
			@Override
			public Adapter caseStartType(StartType object) {
				return createStartTypeAdapter();
			}
			@Override
			public Adapter caseStepType(StepType object) {
				return createStepTypeAdapter();
			}
			@Override
			public Adapter caseVariableType(VariableType object) {
				return createVariableTypeAdapter();
			}
			@Override
			public Adapter caseWorkloadType(WorkloadType object) {
				return createWorkloadTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ca.carleton.sce.puma.CSM.ActiveResourceType <em>Active Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.carleton.sce.puma.CSM.ActiveResourceType
	 * @generated
	 */
	public Adapter createActiveResourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.carleton.sce.puma.CSM.AspectStepType <em>Aspect Step Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.carleton.sce.puma.CSM.AspectStepType
	 * @generated
	 */
	public Adapter createAspectStepTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.carleton.sce.puma.CSM.BranchType <em>Branch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.carleton.sce.puma.CSM.BranchType
	 * @generated
	 */
	public Adapter createBranchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.carleton.sce.puma.CSM.ClosedWorkloadType <em>Closed Workload Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.carleton.sce.puma.CSM.ClosedWorkloadType
	 * @generated
	 */
	public Adapter createClosedWorkloadTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.carleton.sce.puma.CSM.CommLinkType <em>Comm Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.carleton.sce.puma.CSM.CommLinkType
	 * @generated
	 */
	public Adapter createCommLinkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.carleton.sce.puma.CSM.CommStepType <em>Comm Step Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.carleton.sce.puma.CSM.CommStepType
	 * @generated
	 */
	public Adapter createCommStepTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.carleton.sce.puma.CSM.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.carleton.sce.puma.CSM.ComponentType
	 * @generated
	 */
	public Adapter createComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.carleton.sce.puma.CSM.CSMElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.carleton.sce.puma.CSM.CSMElementType
	 * @generated
	 */
	public Adapter createCSMElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.carleton.sce.puma.CSM.CSMType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.carleton.sce.puma.CSM.CSMType
	 * @generated
	 */
	public Adapter createCSMTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.carleton.sce.puma.CSM.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.carleton.sce.puma.CSM.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.carleton.sce.puma.CSM.EndType <em>End Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.carleton.sce.puma.CSM.EndType
	 * @generated
	 */
	public Adapter createEndTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.carleton.sce.puma.CSM.ExternalDemandType <em>External Demand Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.carleton.sce.puma.CSM.ExternalDemandType
	 * @generated
	 */
	public Adapter createExternalDemandTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.carleton.sce.puma.CSM.ForkType <em>Fork Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.carleton.sce.puma.CSM.ForkType
	 * @generated
	 */
	public Adapter createForkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.carleton.sce.puma.CSM.GeneralResourceType <em>General Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.carleton.sce.puma.CSM.GeneralResourceType
	 * @generated
	 */
	public Adapter createGeneralResourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.carleton.sce.puma.CSM.InBindingType <em>In Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.carleton.sce.puma.CSM.InBindingType
	 * @generated
	 */
	public Adapter createInBindingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.carleton.sce.puma.CSM.JoinType <em>Join Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.carleton.sce.puma.CSM.JoinType
	 * @generated
	 */
	public Adapter createJoinTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.carleton.sce.puma.CSM.LogicalResourceType <em>Logical Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.carleton.sce.puma.CSM.LogicalResourceType
	 * @generated
	 */
	public Adapter createLogicalResourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.carleton.sce.puma.CSM.MergeType <em>Merge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.carleton.sce.puma.CSM.MergeType
	 * @generated
	 */
	public Adapter createMergeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.carleton.sce.puma.CSM.OpenWorkloadType <em>Open Workload Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.carleton.sce.puma.CSM.OpenWorkloadType
	 * @generated
	 */
	public Adapter createOpenWorkloadTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.carleton.sce.puma.CSM.OutBindingType <em>Out Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.carleton.sce.puma.CSM.OutBindingType
	 * @generated
	 */
	public Adapter createOutBindingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.carleton.sce.puma.CSM.PathConnectionType <em>Path Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.carleton.sce.puma.CSM.PathConnectionType
	 * @generated
	 */
	public Adapter createPathConnectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.carleton.sce.puma.CSM.PerfMeasureType <em>Perf Measure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.carleton.sce.puma.CSM.PerfMeasureType
	 * @generated
	 */
	public Adapter createPerfMeasureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.carleton.sce.puma.CSM.PerfValueType <em>Perf Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.carleton.sce.puma.CSM.PerfValueType
	 * @generated
	 */
	public Adapter createPerfValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.carleton.sce.puma.CSM.ProcessingResourceType <em>Processing Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.carleton.sce.puma.CSM.ProcessingResourceType
	 * @generated
	 */
	public Adapter createProcessingResourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.carleton.sce.puma.CSM.RefinementType <em>Refinement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.carleton.sce.puma.CSM.RefinementType
	 * @generated
	 */
	public Adapter createRefinementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.carleton.sce.puma.CSM.ResourceAcquireType <em>Resource Acquire Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.carleton.sce.puma.CSM.ResourceAcquireType
	 * @generated
	 */
	public Adapter createResourceAcquireTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.carleton.sce.puma.CSM.ResourcePassType <em>Resource Pass Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.carleton.sce.puma.CSM.ResourcePassType
	 * @generated
	 */
	public Adapter createResourcePassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.carleton.sce.puma.CSM.ResourceReleaseType <em>Resource Release Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.carleton.sce.puma.CSM.ResourceReleaseType
	 * @generated
	 */
	public Adapter createResourceReleaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.carleton.sce.puma.CSM.RoleBindingType <em>Role Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.carleton.sce.puma.CSM.RoleBindingType
	 * @generated
	 */
	public Adapter createRoleBindingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.carleton.sce.puma.CSM.ScenarioElementType <em>Scenario Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.carleton.sce.puma.CSM.ScenarioElementType
	 * @generated
	 */
	public Adapter createScenarioElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.carleton.sce.puma.CSM.ScenarioType <em>Scenario Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.carleton.sce.puma.CSM.ScenarioType
	 * @generated
	 */
	public Adapter createScenarioTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.carleton.sce.puma.CSM.SequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.carleton.sce.puma.CSM.SequenceType
	 * @generated
	 */
	public Adapter createSequenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.carleton.sce.puma.CSM.StartType <em>Start Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.carleton.sce.puma.CSM.StartType
	 * @generated
	 */
	public Adapter createStartTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.carleton.sce.puma.CSM.StepType <em>Step Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.carleton.sce.puma.CSM.StepType
	 * @generated
	 */
	public Adapter createStepTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.carleton.sce.puma.CSM.VariableType <em>Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.carleton.sce.puma.CSM.VariableType
	 * @generated
	 */
	public Adapter createVariableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.carleton.sce.puma.CSM.WorkloadType <em>Workload Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.carleton.sce.puma.CSM.WorkloadType
	 * @generated
	 */
	public Adapter createWorkloadTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CSMAdapterFactory
