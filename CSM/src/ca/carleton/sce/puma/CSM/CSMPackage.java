/**
 */
package ca.carleton.sce.puma.CSM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ca.carleton.sce.puma.CSM.CSMFactory
 * @model kind="package"
 * @generated
 */
public interface CSMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CSM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/ca.carleton.sce.puma.csm/model/CSM.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CSM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CSMPackage eINSTANCE = ca.carleton.sce.puma.CSM.impl.CSMPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.carleton.sce.puma.CSM.impl.CSMElementTypeImpl <em>Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.impl.CSMElementTypeImpl
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getCSMElementType()
	 * @generated
	 */
	int CSM_ELEMENT_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_ELEMENT_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_ELEMENT_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_ELEMENT_TYPE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Traceability Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_ELEMENT_TYPE__TRACEABILITY_LINK = 3;

	/**
	 * The number of structural features of the '<em>Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_ELEMENT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link ca.carleton.sce.puma.CSM.impl.GeneralResourceTypeImpl <em>General Resource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.impl.GeneralResourceTypeImpl
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getGeneralResourceType()
	 * @generated
	 */
	int GENERAL_RESOURCE_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_RESOURCE_TYPE__DESCRIPTION = CSM_ELEMENT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_RESOURCE_TYPE__ID = CSM_ELEMENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_RESOURCE_TYPE__NAME = CSM_ELEMENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Traceability Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_RESOURCE_TYPE__TRACEABILITY_LINK = CSM_ELEMENT_TYPE__TRACEABILITY_LINK;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_RESOURCE_TYPE__MULTIPLICITY = CSM_ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_RESOURCE_TYPE__PERF_MEASURE_LIST = CSM_ELEMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sched Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_RESOURCE_TYPE__SCHED_POLICY = CSM_ELEMENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>General Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_RESOURCE_TYPE_FEATURE_COUNT = CSM_ELEMENT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ca.carleton.sce.puma.CSM.impl.ActiveResourceTypeImpl <em>Active Resource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.impl.ActiveResourceTypeImpl
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getActiveResourceType()
	 * @generated
	 */
	int ACTIVE_RESOURCE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_RESOURCE_TYPE__DESCRIPTION = GENERAL_RESOURCE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_RESOURCE_TYPE__ID = GENERAL_RESOURCE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_RESOURCE_TYPE__NAME = GENERAL_RESOURCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Traceability Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_RESOURCE_TYPE__TRACEABILITY_LINK = GENERAL_RESOURCE_TYPE__TRACEABILITY_LINK;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_RESOURCE_TYPE__MULTIPLICITY = GENERAL_RESOURCE_TYPE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_RESOURCE_TYPE__PERF_MEASURE_LIST = GENERAL_RESOURCE_TYPE__PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Sched Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_RESOURCE_TYPE__SCHED_POLICY = GENERAL_RESOURCE_TYPE__SCHED_POLICY;

	/**
	 * The feature id for the '<em><b>Op Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_RESOURCE_TYPE__OP_TIME = GENERAL_RESOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Active Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_RESOURCE_TYPE_FEATURE_COUNT = GENERAL_RESOURCE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ca.carleton.sce.puma.CSM.impl.ScenarioElementTypeImpl <em>Scenario Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.impl.ScenarioElementTypeImpl
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getScenarioElementType()
	 * @generated
	 */
	int SCENARIO_ELEMENT_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_ELEMENT_TYPE__DESCRIPTION = CSM_ELEMENT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_ELEMENT_TYPE__ID = CSM_ELEMENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_ELEMENT_TYPE__NAME = CSM_ELEMENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Traceability Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_ELEMENT_TYPE__TRACEABILITY_LINK = CSM_ELEMENT_TYPE__TRACEABILITY_LINK;

	/**
	 * The feature id for the '<em><b>Duration Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_ELEMENT_TYPE__DURATION_PERF_MEASURE_LIST = CSM_ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stop Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_ELEMENT_TYPE__STOP_PERF_MEASURE_LIST = CSM_ELEMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Trigger Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_ELEMENT_TYPE__TRIGGER_PERF_MEASURE_LIST = CSM_ELEMENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Scenario Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_ELEMENT_TYPE_FEATURE_COUNT = CSM_ELEMENT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ca.carleton.sce.puma.CSM.impl.StepTypeImpl <em>Step Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.impl.StepTypeImpl
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getStepType()
	 * @generated
	 */
	int STEP_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__DESCRIPTION = SCENARIO_ELEMENT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__ID = SCENARIO_ELEMENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__NAME = SCENARIO_ELEMENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Traceability Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__TRACEABILITY_LINK = SCENARIO_ELEMENT_TYPE__TRACEABILITY_LINK;

	/**
	 * The feature id for the '<em><b>Duration Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__DURATION_PERF_MEASURE_LIST = SCENARIO_ELEMENT_TYPE__DURATION_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Stop Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__STOP_PERF_MEASURE_LIST = SCENARIO_ELEMENT_TYPE__STOP_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Trigger Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__TRIGGER_PERF_MEASURE_LIST = SCENARIO_ELEMENT_TYPE__TRIGGER_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__REFINEMENT = SCENARIO_ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>External Demand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__EXTERNAL_DEMAND = SCENARIO_ELEMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Block T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__BLOCK_T = SCENARIO_ELEMENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__COMPONENT = SCENARIO_ELEMENT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Host Demand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__HOST_DEMAND = SCENARIO_ELEMENT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Nosync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__NOSYNC = SCENARIO_ELEMENT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__PREDECESSOR = SCENARIO_ELEMENT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__PROBABILITY = SCENARIO_ELEMENT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Repetition Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__REPETITION_COUNT = SCENARIO_ELEMENT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Resp T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__RESP_T = SCENARIO_ELEMENT_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Step Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__STEP_KIND = SCENARIO_ELEMENT_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE__SUCCESSOR = SCENARIO_ELEMENT_TYPE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Step Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TYPE_FEATURE_COUNT = SCENARIO_ELEMENT_TYPE_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link ca.carleton.sce.puma.CSM.impl.AspectStepTypeImpl <em>Aspect Step Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.impl.AspectStepTypeImpl
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getAspectStepType()
	 * @generated
	 */
	int ASPECT_STEP_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_STEP_TYPE__DESCRIPTION = STEP_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_STEP_TYPE__ID = STEP_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_STEP_TYPE__NAME = STEP_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Traceability Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_STEP_TYPE__TRACEABILITY_LINK = STEP_TYPE__TRACEABILITY_LINK;

	/**
	 * The feature id for the '<em><b>Duration Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_STEP_TYPE__DURATION_PERF_MEASURE_LIST = STEP_TYPE__DURATION_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Stop Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_STEP_TYPE__STOP_PERF_MEASURE_LIST = STEP_TYPE__STOP_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Trigger Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_STEP_TYPE__TRIGGER_PERF_MEASURE_LIST = STEP_TYPE__TRIGGER_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_STEP_TYPE__REFINEMENT = STEP_TYPE__REFINEMENT;

	/**
	 * The feature id for the '<em><b>External Demand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_STEP_TYPE__EXTERNAL_DEMAND = STEP_TYPE__EXTERNAL_DEMAND;

	/**
	 * The feature id for the '<em><b>Block T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_STEP_TYPE__BLOCK_T = STEP_TYPE__BLOCK_T;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_STEP_TYPE__COMPONENT = STEP_TYPE__COMPONENT;

	/**
	 * The feature id for the '<em><b>Host Demand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_STEP_TYPE__HOST_DEMAND = STEP_TYPE__HOST_DEMAND;

	/**
	 * The feature id for the '<em><b>Nosync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_STEP_TYPE__NOSYNC = STEP_TYPE__NOSYNC;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_STEP_TYPE__PREDECESSOR = STEP_TYPE__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_STEP_TYPE__PROBABILITY = STEP_TYPE__PROBABILITY;

	/**
	 * The feature id for the '<em><b>Repetition Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_STEP_TYPE__REPETITION_COUNT = STEP_TYPE__REPETITION_COUNT;

	/**
	 * The feature id for the '<em><b>Resp T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_STEP_TYPE__RESP_T = STEP_TYPE__RESP_T;

	/**
	 * The feature id for the '<em><b>Step Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_STEP_TYPE__STEP_KIND = STEP_TYPE__STEP_KIND;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_STEP_TYPE__SUCCESSOR = STEP_TYPE__SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Aspect Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_STEP_TYPE__ASPECT_DEFINITION = STEP_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Aspect Step Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_STEP_TYPE_FEATURE_COUNT = STEP_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ca.carleton.sce.puma.CSM.impl.PathConnectionTypeImpl <em>Path Connection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.impl.PathConnectionTypeImpl
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getPathConnectionType()
	 * @generated
	 */
	int PATH_CONNECTION_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_CONNECTION_TYPE__DESCRIPTION = SCENARIO_ELEMENT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_CONNECTION_TYPE__ID = SCENARIO_ELEMENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_CONNECTION_TYPE__NAME = SCENARIO_ELEMENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Traceability Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_CONNECTION_TYPE__TRACEABILITY_LINK = SCENARIO_ELEMENT_TYPE__TRACEABILITY_LINK;

	/**
	 * The feature id for the '<em><b>Duration Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_CONNECTION_TYPE__DURATION_PERF_MEASURE_LIST = SCENARIO_ELEMENT_TYPE__DURATION_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Stop Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_CONNECTION_TYPE__STOP_PERF_MEASURE_LIST = SCENARIO_ELEMENT_TYPE__STOP_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Trigger Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_CONNECTION_TYPE__TRIGGER_PERF_MEASURE_LIST = SCENARIO_ELEMENT_TYPE__TRIGGER_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_CONNECTION_TYPE__SOURCE = SCENARIO_ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_CONNECTION_TYPE__TARGET = SCENARIO_ELEMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Path Connection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_CONNECTION_TYPE_FEATURE_COUNT = SCENARIO_ELEMENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ca.carleton.sce.puma.CSM.impl.BranchTypeImpl <em>Branch Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.impl.BranchTypeImpl
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getBranchType()
	 * @generated
	 */
	int BRANCH_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_TYPE__DESCRIPTION = PATH_CONNECTION_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_TYPE__ID = PATH_CONNECTION_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_TYPE__NAME = PATH_CONNECTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Traceability Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_TYPE__TRACEABILITY_LINK = PATH_CONNECTION_TYPE__TRACEABILITY_LINK;

	/**
	 * The feature id for the '<em><b>Duration Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_TYPE__DURATION_PERF_MEASURE_LIST = PATH_CONNECTION_TYPE__DURATION_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Stop Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_TYPE__STOP_PERF_MEASURE_LIST = PATH_CONNECTION_TYPE__STOP_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Trigger Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_TYPE__TRIGGER_PERF_MEASURE_LIST = PATH_CONNECTION_TYPE__TRIGGER_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_TYPE__SOURCE = PATH_CONNECTION_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_TYPE__TARGET = PATH_CONNECTION_TYPE__TARGET;

	/**
	 * The number of structural features of the '<em>Branch Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_TYPE_FEATURE_COUNT = PATH_CONNECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.carleton.sce.puma.CSM.impl.WorkloadTypeImpl <em>Workload Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.impl.WorkloadTypeImpl
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getWorkloadType()
	 * @generated
	 */
	int WORKLOAD_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_TYPE__DESCRIPTION = SCENARIO_ELEMENT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_TYPE__ID = SCENARIO_ELEMENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_TYPE__NAME = SCENARIO_ELEMENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Traceability Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_TYPE__TRACEABILITY_LINK = SCENARIO_ELEMENT_TYPE__TRACEABILITY_LINK;

	/**
	 * The feature id for the '<em><b>Duration Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_TYPE__DURATION_PERF_MEASURE_LIST = SCENARIO_ELEMENT_TYPE__DURATION_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Stop Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_TYPE__STOP_PERF_MEASURE_LIST = SCENARIO_ELEMENT_TYPE__STOP_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Trigger Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_TYPE__TRIGGER_PERF_MEASURE_LIST = SCENARIO_ELEMENT_TYPE__TRIGGER_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Arrival Param1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_TYPE__ARRIVAL_PARAM1 = SCENARIO_ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arrival Param2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_TYPE__ARRIVAL_PARAM2 = SCENARIO_ELEMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arrival Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_TYPE__ARRIVAL_PROCESS = SCENARIO_ELEMENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>External Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_TYPE__EXTERNAL_DELAY = SCENARIO_ELEMENT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Response Time List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_TYPE__RESPONSE_TIME_LIST = SCENARIO_ELEMENT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Workload Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKLOAD_TYPE_FEATURE_COUNT = SCENARIO_ELEMENT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link ca.carleton.sce.puma.CSM.impl.ClosedWorkloadTypeImpl <em>Closed Workload Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.impl.ClosedWorkloadTypeImpl
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getClosedWorkloadType()
	 * @generated
	 */
	int CLOSED_WORKLOAD_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_WORKLOAD_TYPE__DESCRIPTION = WORKLOAD_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_WORKLOAD_TYPE__ID = WORKLOAD_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_WORKLOAD_TYPE__NAME = WORKLOAD_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Traceability Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_WORKLOAD_TYPE__TRACEABILITY_LINK = WORKLOAD_TYPE__TRACEABILITY_LINK;

	/**
	 * The feature id for the '<em><b>Duration Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_WORKLOAD_TYPE__DURATION_PERF_MEASURE_LIST = WORKLOAD_TYPE__DURATION_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Stop Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_WORKLOAD_TYPE__STOP_PERF_MEASURE_LIST = WORKLOAD_TYPE__STOP_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Trigger Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_WORKLOAD_TYPE__TRIGGER_PERF_MEASURE_LIST = WORKLOAD_TYPE__TRIGGER_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Arrival Param1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_WORKLOAD_TYPE__ARRIVAL_PARAM1 = WORKLOAD_TYPE__ARRIVAL_PARAM1;

	/**
	 * The feature id for the '<em><b>Arrival Param2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_WORKLOAD_TYPE__ARRIVAL_PARAM2 = WORKLOAD_TYPE__ARRIVAL_PARAM2;

	/**
	 * The feature id for the '<em><b>Arrival Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_WORKLOAD_TYPE__ARRIVAL_PROCESS = WORKLOAD_TYPE__ARRIVAL_PROCESS;

	/**
	 * The feature id for the '<em><b>External Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_WORKLOAD_TYPE__EXTERNAL_DELAY = WORKLOAD_TYPE__EXTERNAL_DELAY;

	/**
	 * The feature id for the '<em><b>Response Time List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_WORKLOAD_TYPE__RESPONSE_TIME_LIST = WORKLOAD_TYPE__RESPONSE_TIME_LIST;

	/**
	 * The feature id for the '<em><b>Population</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_WORKLOAD_TYPE__POPULATION = WORKLOAD_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Closed Workload Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSED_WORKLOAD_TYPE_FEATURE_COUNT = WORKLOAD_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link ca.carleton.sce.puma.CSM.impl.CommLinkTypeImpl <em>Comm Link Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.impl.CommLinkTypeImpl
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getCommLinkType()
	 * @generated
	 */
	int COMM_LINK_TYPE = 4;

	/**
	 * The meta object id for the '{@link ca.carleton.sce.puma.CSM.impl.CommStepTypeImpl <em>Comm Step Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.impl.CommStepTypeImpl
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getCommStepType()
	 * @generated
	 */
	int COMM_STEP_TYPE = 5;

	/**
	 * The meta object id for the '{@link ca.carleton.sce.puma.CSM.impl.ComponentTypeImpl <em>Component Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.impl.ComponentTypeImpl
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getComponentType()
	 * @generated
	 */
	int COMPONENT_TYPE = 6;

	/**
	 * The meta object id for the '{@link ca.carleton.sce.puma.CSM.impl.CSMTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.impl.CSMTypeImpl
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getCSMType()
	 * @generated
	 */
	int CSM_TYPE = 8;

	/**
	 * The meta object id for the '{@link ca.carleton.sce.puma.CSM.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.impl.DocumentRootImpl
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 9;

	/**
	 * The meta object id for the '{@link ca.carleton.sce.puma.CSM.impl.EndTypeImpl <em>End Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.impl.EndTypeImpl
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getEndType()
	 * @generated
	 */
	int END_TYPE = 10;

	/**
	 * The meta object id for the '{@link ca.carleton.sce.puma.CSM.impl.ExternalDemandTypeImpl <em>External Demand Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.impl.ExternalDemandTypeImpl
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getExternalDemandType()
	 * @generated
	 */
	int EXTERNAL_DEMAND_TYPE = 11;

	/**
	 * The meta object id for the '{@link ca.carleton.sce.puma.CSM.impl.ForkTypeImpl <em>Fork Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.impl.ForkTypeImpl
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getForkType()
	 * @generated
	 */
	int FORK_TYPE = 12;

	/**
	 * The meta object id for the '{@link ca.carleton.sce.puma.CSM.impl.InBindingTypeImpl <em>In Binding Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.impl.InBindingTypeImpl
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getInBindingType()
	 * @generated
	 */
	int IN_BINDING_TYPE = 14;

	/**
	 * The meta object id for the '{@link ca.carleton.sce.puma.CSM.impl.JoinTypeImpl <em>Join Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.impl.JoinTypeImpl
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getJoinType()
	 * @generated
	 */
	int JOIN_TYPE = 15;

	/**
	 * The meta object id for the '{@link ca.carleton.sce.puma.CSM.impl.LogicalResourceTypeImpl <em>Logical Resource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.impl.LogicalResourceTypeImpl
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getLogicalResourceType()
	 * @generated
	 */
	int LOGICAL_RESOURCE_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_RESOURCE_TYPE__DESCRIPTION = GENERAL_RESOURCE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_RESOURCE_TYPE__ID = GENERAL_RESOURCE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_RESOURCE_TYPE__NAME = GENERAL_RESOURCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Traceability Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_RESOURCE_TYPE__TRACEABILITY_LINK = GENERAL_RESOURCE_TYPE__TRACEABILITY_LINK;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_RESOURCE_TYPE__MULTIPLICITY = GENERAL_RESOURCE_TYPE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_RESOURCE_TYPE__PERF_MEASURE_LIST = GENERAL_RESOURCE_TYPE__PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Sched Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_RESOURCE_TYPE__SCHED_POLICY = GENERAL_RESOURCE_TYPE__SCHED_POLICY;

	/**
	 * The feature id for the '<em><b>Nested Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_RESOURCE_TYPE__NESTED_ONLY = GENERAL_RESOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Logical Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_RESOURCE_TYPE_FEATURE_COUNT = GENERAL_RESOURCE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__DESCRIPTION = LOGICAL_RESOURCE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__ID = LOGICAL_RESOURCE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__NAME = LOGICAL_RESOURCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Traceability Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__TRACEABILITY_LINK = LOGICAL_RESOURCE_TYPE__TRACEABILITY_LINK;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__MULTIPLICITY = LOGICAL_RESOURCE_TYPE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__PERF_MEASURE_LIST = LOGICAL_RESOURCE_TYPE__PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Sched Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__SCHED_POLICY = LOGICAL_RESOURCE_TYPE__SCHED_POLICY;

	/**
	 * The feature id for the '<em><b>Nested Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__NESTED_ONLY = LOGICAL_RESOURCE_TYPE__NESTED_ONLY;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__HOST = LOGICAL_RESOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Active Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__IS_ACTIVE_PROCESS = LOGICAL_RESOURCE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__PARENT_COMPONENT = LOGICAL_RESOURCE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sub Component List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE__SUB_COMPONENT_LIST = LOGICAL_RESOURCE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Component Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_FEATURE_COUNT = LOGICAL_RESOURCE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_LINK_TYPE__DESCRIPTION = COMPONENT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_LINK_TYPE__ID = COMPONENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_LINK_TYPE__NAME = COMPONENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Traceability Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_LINK_TYPE__TRACEABILITY_LINK = COMPONENT_TYPE__TRACEABILITY_LINK;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_LINK_TYPE__MULTIPLICITY = COMPONENT_TYPE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_LINK_TYPE__PERF_MEASURE_LIST = COMPONENT_TYPE__PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Sched Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_LINK_TYPE__SCHED_POLICY = COMPONENT_TYPE__SCHED_POLICY;

	/**
	 * The feature id for the '<em><b>Nested Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_LINK_TYPE__NESTED_ONLY = COMPONENT_TYPE__NESTED_ONLY;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_LINK_TYPE__HOST = COMPONENT_TYPE__HOST;

	/**
	 * The feature id for the '<em><b>Is Active Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_LINK_TYPE__IS_ACTIVE_PROCESS = COMPONENT_TYPE__IS_ACTIVE_PROCESS;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_LINK_TYPE__PARENT_COMPONENT = COMPONENT_TYPE__PARENT_COMPONENT;

	/**
	 * The feature id for the '<em><b>Sub Component List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_LINK_TYPE__SUB_COMPONENT_LIST = COMPONENT_TYPE__SUB_COMPONENT_LIST;

	/**
	 * The feature id for the '<em><b>Block T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_LINK_TYPE__BLOCK_T = COMPONENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_LINK_TYPE__CAPACITY = COMPONENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Processing Host List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_LINK_TYPE__PROCESSING_HOST_LIST = COMPONENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_LINK_TYPE__RES_MULT = COMPONENT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_LINK_TYPE__SPEED_FACTOR = COMPONENT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Comm Link Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_LINK_TYPE_FEATURE_COUNT = COMPONENT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_STEP_TYPE__DESCRIPTION = STEP_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_STEP_TYPE__ID = STEP_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_STEP_TYPE__NAME = STEP_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Traceability Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_STEP_TYPE__TRACEABILITY_LINK = STEP_TYPE__TRACEABILITY_LINK;

	/**
	 * The feature id for the '<em><b>Duration Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_STEP_TYPE__DURATION_PERF_MEASURE_LIST = STEP_TYPE__DURATION_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Stop Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_STEP_TYPE__STOP_PERF_MEASURE_LIST = STEP_TYPE__STOP_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Trigger Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_STEP_TYPE__TRIGGER_PERF_MEASURE_LIST = STEP_TYPE__TRIGGER_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_STEP_TYPE__REFINEMENT = STEP_TYPE__REFINEMENT;

	/**
	 * The feature id for the '<em><b>External Demand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_STEP_TYPE__EXTERNAL_DEMAND = STEP_TYPE__EXTERNAL_DEMAND;

	/**
	 * The feature id for the '<em><b>Block T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_STEP_TYPE__BLOCK_T = STEP_TYPE__BLOCK_T;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_STEP_TYPE__COMPONENT = STEP_TYPE__COMPONENT;

	/**
	 * The feature id for the '<em><b>Host Demand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_STEP_TYPE__HOST_DEMAND = STEP_TYPE__HOST_DEMAND;

	/**
	 * The feature id for the '<em><b>Nosync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_STEP_TYPE__NOSYNC = STEP_TYPE__NOSYNC;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_STEP_TYPE__PREDECESSOR = STEP_TYPE__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_STEP_TYPE__PROBABILITY = STEP_TYPE__PROBABILITY;

	/**
	 * The feature id for the '<em><b>Repetition Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_STEP_TYPE__REPETITION_COUNT = STEP_TYPE__REPETITION_COUNT;

	/**
	 * The feature id for the '<em><b>Resp T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_STEP_TYPE__RESP_T = STEP_TYPE__RESP_T;

	/**
	 * The feature id for the '<em><b>Step Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_STEP_TYPE__STEP_KIND = STEP_TYPE__STEP_KIND;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_STEP_TYPE__SUCCESSOR = STEP_TYPE__SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Comm Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_STEP_TYPE__COMM_LINK = STEP_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Msg Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_STEP_TYPE__MSG_KIND = STEP_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_STEP_TYPE__MSG_SIZE = STEP_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pred Comm Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_STEP_TYPE__PRED_COMM_STEP = STEP_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rcv Comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_STEP_TYPE__RCV_COMP = STEP_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Succ Comm Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_STEP_TYPE__SUCC_COMM_STEP = STEP_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Tx Comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_STEP_TYPE__TX_COMP = STEP_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Comm Step Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMM_STEP_TYPE_FEATURE_COUNT = STEP_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Scenario List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_TYPE__SCENARIO_LIST = 0;

	/**
	 * The feature id for the '<em><b>Component List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_TYPE__COMPONENT_LIST = 1;

	/**
	 * The feature id for the '<em><b>Comm Link List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_TYPE__COMM_LINK_LIST = 2;

	/**
	 * The feature id for the '<em><b>Processing Resource List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_TYPE__PROCESSING_RESOURCE_LIST = 3;

	/**
	 * The feature id for the '<em><b>Logical Resource List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_TYPE__LOGICAL_RESOURCE_LIST = 4;

	/**
	 * The feature id for the '<em><b>Variable List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_TYPE__VARIABLE_LIST = 5;

	/**
	 * The feature id for the '<em><b>Perf Measure List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_TYPE__PERF_MEASURE_LIST = 6;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_TYPE__AUTHOR = 7;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_TYPE__CREATED = 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_TYPE__DESCRIPTION = 9;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_TYPE__MODIFIED = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_TYPE__NAME = 11;

	/**
	 * The feature id for the '<em><b>Traceability Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_TYPE__TRACEABILITY_LINK = 12;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_TYPE__VERSION = 13;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSM_TYPE_FEATURE_COUNT = 14;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>CSM</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CSM = 1;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TYPE__DESCRIPTION = PATH_CONNECTION_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TYPE__ID = PATH_CONNECTION_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TYPE__NAME = PATH_CONNECTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Traceability Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TYPE__TRACEABILITY_LINK = PATH_CONNECTION_TYPE__TRACEABILITY_LINK;

	/**
	 * The feature id for the '<em><b>Duration Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TYPE__DURATION_PERF_MEASURE_LIST = PATH_CONNECTION_TYPE__DURATION_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Stop Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TYPE__STOP_PERF_MEASURE_LIST = PATH_CONNECTION_TYPE__STOP_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Trigger Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TYPE__TRIGGER_PERF_MEASURE_LIST = PATH_CONNECTION_TYPE__TRIGGER_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TYPE__SOURCE = PATH_CONNECTION_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TYPE__TARGET = PATH_CONNECTION_TYPE__TARGET;

	/**
	 * The feature id for the '<em><b>Out Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TYPE__OUT_BINDING = PATH_CONNECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>End Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TYPE_FEATURE_COUNT = PATH_CONNECTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DEMAND_TYPE__DESCRIPTION = SCENARIO_ELEMENT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DEMAND_TYPE__ID = SCENARIO_ELEMENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DEMAND_TYPE__NAME = SCENARIO_ELEMENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Traceability Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DEMAND_TYPE__TRACEABILITY_LINK = SCENARIO_ELEMENT_TYPE__TRACEABILITY_LINK;

	/**
	 * The feature id for the '<em><b>Duration Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DEMAND_TYPE__DURATION_PERF_MEASURE_LIST = SCENARIO_ELEMENT_TYPE__DURATION_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Stop Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DEMAND_TYPE__STOP_PERF_MEASURE_LIST = SCENARIO_ELEMENT_TYPE__STOP_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Trigger Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DEMAND_TYPE__TRIGGER_PERF_MEASURE_LIST = SCENARIO_ELEMENT_TYPE__TRIGGER_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DEMAND_TYPE__COUNT = SCENARIO_ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>External Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DEMAND_TYPE__EXTERNAL_OPERATION = SCENARIO_ELEMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>External Demand Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DEMAND_TYPE_FEATURE_COUNT = SCENARIO_ELEMENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_TYPE__DESCRIPTION = PATH_CONNECTION_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_TYPE__ID = PATH_CONNECTION_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_TYPE__NAME = PATH_CONNECTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Traceability Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_TYPE__TRACEABILITY_LINK = PATH_CONNECTION_TYPE__TRACEABILITY_LINK;

	/**
	 * The feature id for the '<em><b>Duration Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_TYPE__DURATION_PERF_MEASURE_LIST = PATH_CONNECTION_TYPE__DURATION_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Stop Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_TYPE__STOP_PERF_MEASURE_LIST = PATH_CONNECTION_TYPE__STOP_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Trigger Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_TYPE__TRIGGER_PERF_MEASURE_LIST = PATH_CONNECTION_TYPE__TRIGGER_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_TYPE__SOURCE = PATH_CONNECTION_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_TYPE__TARGET = PATH_CONNECTION_TYPE__TARGET;

	/**
	 * The number of structural features of the '<em>Fork Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORK_TYPE_FEATURE_COUNT = PATH_CONNECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_BINDING_TYPE__IN_STEP = 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_BINDING_TYPE__START = 1;

	/**
	 * The number of structural features of the '<em>In Binding Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_BINDING_TYPE_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TYPE__DESCRIPTION = PATH_CONNECTION_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TYPE__ID = PATH_CONNECTION_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TYPE__NAME = PATH_CONNECTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Traceability Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TYPE__TRACEABILITY_LINK = PATH_CONNECTION_TYPE__TRACEABILITY_LINK;

	/**
	 * The feature id for the '<em><b>Duration Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TYPE__DURATION_PERF_MEASURE_LIST = PATH_CONNECTION_TYPE__DURATION_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Stop Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TYPE__STOP_PERF_MEASURE_LIST = PATH_CONNECTION_TYPE__STOP_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Trigger Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TYPE__TRIGGER_PERF_MEASURE_LIST = PATH_CONNECTION_TYPE__TRIGGER_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TYPE__SOURCE = PATH_CONNECTION_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TYPE__TARGET = PATH_CONNECTION_TYPE__TARGET;

	/**
	 * The number of structural features of the '<em>Join Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOIN_TYPE_FEATURE_COUNT = PATH_CONNECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.carleton.sce.puma.CSM.impl.MergeTypeImpl <em>Merge Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.impl.MergeTypeImpl
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getMergeType()
	 * @generated
	 */
	int MERGE_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_TYPE__DESCRIPTION = PATH_CONNECTION_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_TYPE__ID = PATH_CONNECTION_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_TYPE__NAME = PATH_CONNECTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Traceability Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_TYPE__TRACEABILITY_LINK = PATH_CONNECTION_TYPE__TRACEABILITY_LINK;

	/**
	 * The feature id for the '<em><b>Duration Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_TYPE__DURATION_PERF_MEASURE_LIST = PATH_CONNECTION_TYPE__DURATION_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Stop Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_TYPE__STOP_PERF_MEASURE_LIST = PATH_CONNECTION_TYPE__STOP_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Trigger Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_TYPE__TRIGGER_PERF_MEASURE_LIST = PATH_CONNECTION_TYPE__TRIGGER_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_TYPE__SOURCE = PATH_CONNECTION_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_TYPE__TARGET = PATH_CONNECTION_TYPE__TARGET;

	/**
	 * The number of structural features of the '<em>Merge Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_TYPE_FEATURE_COUNT = PATH_CONNECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.carleton.sce.puma.CSM.impl.OpenWorkloadTypeImpl <em>Open Workload Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.impl.OpenWorkloadTypeImpl
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getOpenWorkloadType()
	 * @generated
	 */
	int OPEN_WORKLOAD_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_WORKLOAD_TYPE__DESCRIPTION = WORKLOAD_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_WORKLOAD_TYPE__ID = WORKLOAD_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_WORKLOAD_TYPE__NAME = WORKLOAD_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Traceability Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_WORKLOAD_TYPE__TRACEABILITY_LINK = WORKLOAD_TYPE__TRACEABILITY_LINK;

	/**
	 * The feature id for the '<em><b>Duration Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_WORKLOAD_TYPE__DURATION_PERF_MEASURE_LIST = WORKLOAD_TYPE__DURATION_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Stop Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_WORKLOAD_TYPE__STOP_PERF_MEASURE_LIST = WORKLOAD_TYPE__STOP_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Trigger Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_WORKLOAD_TYPE__TRIGGER_PERF_MEASURE_LIST = WORKLOAD_TYPE__TRIGGER_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Arrival Param1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_WORKLOAD_TYPE__ARRIVAL_PARAM1 = WORKLOAD_TYPE__ARRIVAL_PARAM1;

	/**
	 * The feature id for the '<em><b>Arrival Param2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_WORKLOAD_TYPE__ARRIVAL_PARAM2 = WORKLOAD_TYPE__ARRIVAL_PARAM2;

	/**
	 * The feature id for the '<em><b>Arrival Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_WORKLOAD_TYPE__ARRIVAL_PROCESS = WORKLOAD_TYPE__ARRIVAL_PROCESS;

	/**
	 * The feature id for the '<em><b>External Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_WORKLOAD_TYPE__EXTERNAL_DELAY = WORKLOAD_TYPE__EXTERNAL_DELAY;

	/**
	 * The feature id for the '<em><b>Response Time List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_WORKLOAD_TYPE__RESPONSE_TIME_LIST = WORKLOAD_TYPE__RESPONSE_TIME_LIST;

	/**
	 * The number of structural features of the '<em>Open Workload Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_WORKLOAD_TYPE_FEATURE_COUNT = WORKLOAD_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.carleton.sce.puma.CSM.impl.OutBindingTypeImpl <em>Out Binding Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.impl.OutBindingTypeImpl
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getOutBindingType()
	 * @generated
	 */
	int OUT_BINDING_TYPE = 19;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_BINDING_TYPE__END = 0;

	/**
	 * The feature id for the '<em><b>Out Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_BINDING_TYPE__OUT_STEP = 1;

	/**
	 * The number of structural features of the '<em>Out Binding Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_BINDING_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ca.carleton.sce.puma.CSM.impl.PerfMeasureTypeImpl <em>Perf Measure Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.impl.PerfMeasureTypeImpl
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getPerfMeasureType()
	 * @generated
	 */
	int PERF_MEASURE_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_MEASURE_TYPE__DESCRIPTION = CSM_ELEMENT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_MEASURE_TYPE__ID = CSM_ELEMENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_MEASURE_TYPE__NAME = CSM_ELEMENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Traceability Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_MEASURE_TYPE__TRACEABILITY_LINK = CSM_ELEMENT_TYPE__TRACEABILITY_LINK;

	/**
	 * The feature id for the '<em><b>Perf Value List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_MEASURE_TYPE__PERF_VALUE_LIST = CSM_ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Duration Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_MEASURE_TYPE__DURATION_OF = CSM_ELEMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Measure Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_MEASURE_TYPE__MEASURE_KIND = CSM_ELEMENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pred Perf Measure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_MEASURE_TYPE__PRED_PERF_MEASURE = CSM_ELEMENT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_MEASURE_TYPE__RESOURCE = CSM_ELEMENT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Stopped By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_MEASURE_TYPE__STOPPED_BY = CSM_ELEMENT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Succ Perf Measure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_MEASURE_TYPE__SUCC_PERF_MEASURE = CSM_ELEMENT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_MEASURE_TYPE__TRIGGERED_BY = CSM_ELEMENT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Perf Measure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_MEASURE_TYPE_FEATURE_COUNT = CSM_ELEMENT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link ca.carleton.sce.puma.CSM.impl.PerfValueTypeImpl <em>Perf Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.impl.PerfValueTypeImpl
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getPerfValueType()
	 * @generated
	 */
	int PERF_VALUE_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_VALUE_TYPE__KIND = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_VALUE_TYPE__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_VALUE_TYPE__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Perf Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERF_VALUE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ca.carleton.sce.puma.CSM.impl.ProcessingResourceTypeImpl <em>Processing Resource Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.impl.ProcessingResourceTypeImpl
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getProcessingResourceType()
	 * @generated
	 */
	int PROCESSING_RESOURCE_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_TYPE__DESCRIPTION = ACTIVE_RESOURCE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_TYPE__ID = ACTIVE_RESOURCE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_TYPE__NAME = ACTIVE_RESOURCE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Traceability Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_TYPE__TRACEABILITY_LINK = ACTIVE_RESOURCE_TYPE__TRACEABILITY_LINK;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_TYPE__MULTIPLICITY = ACTIVE_RESOURCE_TYPE__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_TYPE__PERF_MEASURE_LIST = ACTIVE_RESOURCE_TYPE__PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Sched Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_TYPE__SCHED_POLICY = ACTIVE_RESOURCE_TYPE__SCHED_POLICY;

	/**
	 * The feature id for the '<em><b>Op Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_TYPE__OP_TIME = ACTIVE_RESOURCE_TYPE__OP_TIME;

	/**
	 * The feature id for the '<em><b>Comm Link List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_TYPE__COMM_LINK_LIST = ACTIVE_RESOURCE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comm Rcv Ovh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_TYPE__COMM_RCV_OVH = ACTIVE_RESOURCE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comm Tx Ovh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_TYPE__COMM_TX_OVH = ACTIVE_RESOURCE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_TYPE__SPEED_FACTOR = ACTIVE_RESOURCE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Processing Resource Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_TYPE_FEATURE_COUNT = ACTIVE_RESOURCE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link ca.carleton.sce.puma.CSM.impl.RefinementTypeImpl <em>Refinement Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.impl.RefinementTypeImpl
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getRefinementType()
	 * @generated
	 */
	int REFINEMENT_TYPE = 24;

	/**
	 * The feature id for the '<em><b>In Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_TYPE__IN_BINDING = 0;

	/**
	 * The feature id for the '<em><b>Out Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_TYPE__OUT_BINDING = 1;

	/**
	 * The feature id for the '<em><b>Role Binding List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_TYPE__ROLE_BINDING_LIST = 2;

	/**
	 * The feature id for the '<em><b>Parent Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_TYPE__PARENT_STEP = 3;

	/**
	 * The feature id for the '<em><b>Sub Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_TYPE__SUB_SCENARIO = 4;

	/**
	 * The number of structural features of the '<em>Refinement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEMENT_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link ca.carleton.sce.puma.CSM.impl.ResourceAcquireTypeImpl <em>Resource Acquire Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.impl.ResourceAcquireTypeImpl
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getResourceAcquireType()
	 * @generated
	 */
	int RESOURCE_ACQUIRE_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACQUIRE_TYPE__DESCRIPTION = STEP_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACQUIRE_TYPE__ID = STEP_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACQUIRE_TYPE__NAME = STEP_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Traceability Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACQUIRE_TYPE__TRACEABILITY_LINK = STEP_TYPE__TRACEABILITY_LINK;

	/**
	 * The feature id for the '<em><b>Duration Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACQUIRE_TYPE__DURATION_PERF_MEASURE_LIST = STEP_TYPE__DURATION_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Stop Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACQUIRE_TYPE__STOP_PERF_MEASURE_LIST = STEP_TYPE__STOP_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Trigger Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACQUIRE_TYPE__TRIGGER_PERF_MEASURE_LIST = STEP_TYPE__TRIGGER_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACQUIRE_TYPE__REFINEMENT = STEP_TYPE__REFINEMENT;

	/**
	 * The feature id for the '<em><b>External Demand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACQUIRE_TYPE__EXTERNAL_DEMAND = STEP_TYPE__EXTERNAL_DEMAND;

	/**
	 * The feature id for the '<em><b>Block T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACQUIRE_TYPE__BLOCK_T = STEP_TYPE__BLOCK_T;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACQUIRE_TYPE__COMPONENT = STEP_TYPE__COMPONENT;

	/**
	 * The feature id for the '<em><b>Host Demand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACQUIRE_TYPE__HOST_DEMAND = STEP_TYPE__HOST_DEMAND;

	/**
	 * The feature id for the '<em><b>Nosync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACQUIRE_TYPE__NOSYNC = STEP_TYPE__NOSYNC;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACQUIRE_TYPE__PREDECESSOR = STEP_TYPE__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACQUIRE_TYPE__PROBABILITY = STEP_TYPE__PROBABILITY;

	/**
	 * The feature id for the '<em><b>Repetition Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACQUIRE_TYPE__REPETITION_COUNT = STEP_TYPE__REPETITION_COUNT;

	/**
	 * The feature id for the '<em><b>Resp T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACQUIRE_TYPE__RESP_T = STEP_TYPE__RESP_T;

	/**
	 * The feature id for the '<em><b>Step Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACQUIRE_TYPE__STEP_KIND = STEP_TYPE__STEP_KIND;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACQUIRE_TYPE__SUCCESSOR = STEP_TYPE__SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Acquire</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACQUIRE_TYPE__ACQUIRE = STEP_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACQUIRE_TYPE__PRIORITY = STEP_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>RUnits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACQUIRE_TYPE__RUNITS = STEP_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Resource Acquire Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACQUIRE_TYPE_FEATURE_COUNT = STEP_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ca.carleton.sce.puma.CSM.impl.ResourcePassTypeImpl <em>Resource Pass Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.impl.ResourcePassTypeImpl
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getResourcePassType()
	 * @generated
	 */
	int RESOURCE_PASS_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PASS_TYPE__DESCRIPTION = STEP_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PASS_TYPE__ID = STEP_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PASS_TYPE__NAME = STEP_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Traceability Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PASS_TYPE__TRACEABILITY_LINK = STEP_TYPE__TRACEABILITY_LINK;

	/**
	 * The feature id for the '<em><b>Duration Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PASS_TYPE__DURATION_PERF_MEASURE_LIST = STEP_TYPE__DURATION_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Stop Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PASS_TYPE__STOP_PERF_MEASURE_LIST = STEP_TYPE__STOP_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Trigger Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PASS_TYPE__TRIGGER_PERF_MEASURE_LIST = STEP_TYPE__TRIGGER_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PASS_TYPE__REFINEMENT = STEP_TYPE__REFINEMENT;

	/**
	 * The feature id for the '<em><b>External Demand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PASS_TYPE__EXTERNAL_DEMAND = STEP_TYPE__EXTERNAL_DEMAND;

	/**
	 * The feature id for the '<em><b>Block T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PASS_TYPE__BLOCK_T = STEP_TYPE__BLOCK_T;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PASS_TYPE__COMPONENT = STEP_TYPE__COMPONENT;

	/**
	 * The feature id for the '<em><b>Host Demand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PASS_TYPE__HOST_DEMAND = STEP_TYPE__HOST_DEMAND;

	/**
	 * The feature id for the '<em><b>Nosync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PASS_TYPE__NOSYNC = STEP_TYPE__NOSYNC;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PASS_TYPE__PREDECESSOR = STEP_TYPE__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PASS_TYPE__PROBABILITY = STEP_TYPE__PROBABILITY;

	/**
	 * The feature id for the '<em><b>Repetition Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PASS_TYPE__REPETITION_COUNT = STEP_TYPE__REPETITION_COUNT;

	/**
	 * The feature id for the '<em><b>Resp T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PASS_TYPE__RESP_T = STEP_TYPE__RESP_T;

	/**
	 * The feature id for the '<em><b>Step Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PASS_TYPE__STEP_KIND = STEP_TYPE__STEP_KIND;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PASS_TYPE__SUCCESSOR = STEP_TYPE__SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Pass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PASS_TYPE__PASS = STEP_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>RUnits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PASS_TYPE__RUNITS = STEP_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resource Pass Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PASS_TYPE_FEATURE_COUNT = STEP_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ca.carleton.sce.puma.CSM.impl.ResourceReleaseTypeImpl <em>Resource Release Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.impl.ResourceReleaseTypeImpl
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getResourceReleaseType()
	 * @generated
	 */
	int RESOURCE_RELEASE_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RELEASE_TYPE__DESCRIPTION = STEP_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RELEASE_TYPE__ID = STEP_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RELEASE_TYPE__NAME = STEP_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Traceability Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RELEASE_TYPE__TRACEABILITY_LINK = STEP_TYPE__TRACEABILITY_LINK;

	/**
	 * The feature id for the '<em><b>Duration Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RELEASE_TYPE__DURATION_PERF_MEASURE_LIST = STEP_TYPE__DURATION_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Stop Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RELEASE_TYPE__STOP_PERF_MEASURE_LIST = STEP_TYPE__STOP_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Trigger Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RELEASE_TYPE__TRIGGER_PERF_MEASURE_LIST = STEP_TYPE__TRIGGER_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Refinement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RELEASE_TYPE__REFINEMENT = STEP_TYPE__REFINEMENT;

	/**
	 * The feature id for the '<em><b>External Demand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RELEASE_TYPE__EXTERNAL_DEMAND = STEP_TYPE__EXTERNAL_DEMAND;

	/**
	 * The feature id for the '<em><b>Block T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RELEASE_TYPE__BLOCK_T = STEP_TYPE__BLOCK_T;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RELEASE_TYPE__COMPONENT = STEP_TYPE__COMPONENT;

	/**
	 * The feature id for the '<em><b>Host Demand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RELEASE_TYPE__HOST_DEMAND = STEP_TYPE__HOST_DEMAND;

	/**
	 * The feature id for the '<em><b>Nosync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RELEASE_TYPE__NOSYNC = STEP_TYPE__NOSYNC;

	/**
	 * The feature id for the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RELEASE_TYPE__PREDECESSOR = STEP_TYPE__PREDECESSOR;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RELEASE_TYPE__PROBABILITY = STEP_TYPE__PROBABILITY;

	/**
	 * The feature id for the '<em><b>Repetition Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RELEASE_TYPE__REPETITION_COUNT = STEP_TYPE__REPETITION_COUNT;

	/**
	 * The feature id for the '<em><b>Resp T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RELEASE_TYPE__RESP_T = STEP_TYPE__RESP_T;

	/**
	 * The feature id for the '<em><b>Step Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RELEASE_TYPE__STEP_KIND = STEP_TYPE__STEP_KIND;

	/**
	 * The feature id for the '<em><b>Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RELEASE_TYPE__SUCCESSOR = STEP_TYPE__SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Release</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RELEASE_TYPE__RELEASE = STEP_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>RUnits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RELEASE_TYPE__RUNITS = STEP_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resource Release Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_RELEASE_TYPE_FEATURE_COUNT = STEP_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link ca.carleton.sce.puma.CSM.impl.RoleBindingTypeImpl <em>Role Binding Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.impl.RoleBindingTypeImpl
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getRoleBindingType()
	 * @generated
	 */
	int ROLE_BINDING_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Element Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_BINDING_TYPE__ELEMENT_ID = 0;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_BINDING_TYPE__ELEMENT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Role Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_BINDING_TYPE__ROLE_ID = 2;

	/**
	 * The feature id for the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_BINDING_TYPE__ROLE_NAME = 3;

	/**
	 * The number of structural features of the '<em>Role Binding Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_BINDING_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link ca.carleton.sce.puma.CSM.impl.ScenarioTypeImpl <em>Scenario Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.impl.ScenarioTypeImpl
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getScenarioType()
	 * @generated
	 */
	int SCENARIO_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_TYPE__DESCRIPTION = CSM_ELEMENT_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_TYPE__ID = CSM_ELEMENT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_TYPE__NAME = CSM_ELEMENT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Traceability Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_TYPE__TRACEABILITY_LINK = CSM_ELEMENT_TYPE__TRACEABILITY_LINK;

	/**
	 * The feature id for the '<em><b>Step List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_TYPE__STEP_LIST = CSM_ELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comm Step List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_TYPE__COMM_STEP_LIST = CSM_ELEMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resource Acquire List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_TYPE__RESOURCE_ACQUIRE_LIST = CSM_ELEMENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resource Release List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_TYPE__RESOURCE_RELEASE_LIST = CSM_ELEMENT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Resource Pass List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_TYPE__RESOURCE_PASS_LIST = CSM_ELEMENT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Aspect Step List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_TYPE__ASPECT_STEP_LIST = CSM_ELEMENT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Start List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_TYPE__START_LIST = CSM_ELEMENT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>End List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_TYPE__END_LIST = CSM_ELEMENT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Sequence List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_TYPE__SEQUENCE_LIST = CSM_ELEMENT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Branch List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_TYPE__BRANCH_LIST = CSM_ELEMENT_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Merge List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_TYPE__MERGE_LIST = CSM_ELEMENT_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Fork List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_TYPE__FORK_LIST = CSM_ELEMENT_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Join List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_TYPE__JOIN_LIST = CSM_ELEMENT_TYPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Parent Refinement List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_TYPE__PARENT_REFINEMENT_LIST = CSM_ELEMENT_TYPE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_TYPE__PROBABILITY = CSM_ELEMENT_TYPE_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Scenario Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_TYPE_FEATURE_COUNT = CSM_ELEMENT_TYPE_FEATURE_COUNT + 15;

	/**
	 * The meta object id for the '{@link ca.carleton.sce.puma.CSM.impl.SequenceTypeImpl <em>Sequence Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.impl.SequenceTypeImpl
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getSequenceType()
	 * @generated
	 */
	int SEQUENCE_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__DESCRIPTION = PATH_CONNECTION_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__ID = PATH_CONNECTION_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__NAME = PATH_CONNECTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Traceability Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__TRACEABILITY_LINK = PATH_CONNECTION_TYPE__TRACEABILITY_LINK;

	/**
	 * The feature id for the '<em><b>Duration Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__DURATION_PERF_MEASURE_LIST = PATH_CONNECTION_TYPE__DURATION_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Stop Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__STOP_PERF_MEASURE_LIST = PATH_CONNECTION_TYPE__STOP_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Trigger Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__TRIGGER_PERF_MEASURE_LIST = PATH_CONNECTION_TYPE__TRIGGER_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__SOURCE = PATH_CONNECTION_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__TARGET = PATH_CONNECTION_TYPE__TARGET;

	/**
	 * The number of structural features of the '<em>Sequence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE_FEATURE_COUNT = PATH_CONNECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.carleton.sce.puma.CSM.impl.StartTypeImpl <em>Start Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.impl.StartTypeImpl
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getStartType()
	 * @generated
	 */
	int START_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TYPE__DESCRIPTION = PATH_CONNECTION_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TYPE__ID = PATH_CONNECTION_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TYPE__NAME = PATH_CONNECTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Traceability Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TYPE__TRACEABILITY_LINK = PATH_CONNECTION_TYPE__TRACEABILITY_LINK;

	/**
	 * The feature id for the '<em><b>Duration Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TYPE__DURATION_PERF_MEASURE_LIST = PATH_CONNECTION_TYPE__DURATION_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Stop Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TYPE__STOP_PERF_MEASURE_LIST = PATH_CONNECTION_TYPE__STOP_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Trigger Perf Measure List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TYPE__TRIGGER_PERF_MEASURE_LIST = PATH_CONNECTION_TYPE__TRIGGER_PERF_MEASURE_LIST;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TYPE__SOURCE = PATH_CONNECTION_TYPE__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TYPE__TARGET = PATH_CONNECTION_TYPE__TARGET;

	/**
	 * The feature id for the '<em><b>Closed Workload</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TYPE__CLOSED_WORKLOAD = PATH_CONNECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Open Workload</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TYPE__OPEN_WORKLOAD = PATH_CONNECTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>In Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TYPE__IN_BINDING = PATH_CONNECTION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Start Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TYPE_FEATURE_COUNT = PATH_CONNECTION_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link ca.carleton.sce.puma.CSM.impl.VariableTypeImpl <em>Variable Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.impl.VariableTypeImpl
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getVariableType()
	 * @generated
	 */
	int VARIABLE_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Variable Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link ca.carleton.sce.puma.CSM.ArrivalProcess <em>Arrival Process</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.ArrivalProcess
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getArrivalProcess()
	 * @generated
	 */
	int ARRIVAL_PROCESS = 36;

	/**
	 * The meta object id for the '{@link ca.carleton.sce.puma.CSM.MsgKind <em>Msg Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.MsgKind
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getMsgKind()
	 * @generated
	 */
	int MSG_KIND = 37;

	/**
	 * The meta object id for the '{@link ca.carleton.sce.puma.CSM.PerfMeasureKind <em>Perf Measure Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.PerfMeasureKind
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getPerfMeasureKind()
	 * @generated
	 */
	int PERF_MEASURE_KIND = 38;

	/**
	 * The meta object id for the '{@link ca.carleton.sce.puma.CSM.PerfValueKind <em>Perf Value Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.PerfValueKind
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getPerfValueKind()
	 * @generated
	 */
	int PERF_VALUE_KIND = 39;

	/**
	 * The meta object id for the '{@link ca.carleton.sce.puma.CSM.PerfValueSource <em>Perf Value Source</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.PerfValueSource
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getPerfValueSource()
	 * @generated
	 */
	int PERF_VALUE_SOURCE = 40;

	/**
	 * The meta object id for the '{@link ca.carleton.sce.puma.CSM.StepKind <em>Step Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.StepKind
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getStepKind()
	 * @generated
	 */
	int STEP_KIND = 41;

	/**
	 * The meta object id for the '{@link ca.carleton.sce.puma.CSM.SynchronizationKind <em>Synchronization Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.SynchronizationKind
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getSynchronizationKind()
	 * @generated
	 */
	int SYNCHRONIZATION_KIND = 42;

	/**
	 * The meta object id for the '<em>Arrival Process Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.ArrivalProcess
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getArrivalProcessObject()
	 * @generated
	 */
	int ARRIVAL_PROCESS_OBJECT = 43;

	/**
	 * The meta object id for the '<em>Msg Kind Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.MsgKind
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getMsgKindObject()
	 * @generated
	 */
	int MSG_KIND_OBJECT = 44;

	/**
	 * The meta object id for the '<em>Perf Measure Kind Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.PerfMeasureKind
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getPerfMeasureKindObject()
	 * @generated
	 */
	int PERF_MEASURE_KIND_OBJECT = 45;

	/**
	 * The meta object id for the '<em>Perf Value Kind Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.PerfValueKind
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getPerfValueKindObject()
	 * @generated
	 */
	int PERF_VALUE_KIND_OBJECT = 46;

	/**
	 * The meta object id for the '<em>Perf Value Source Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.PerfValueSource
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getPerfValueSourceObject()
	 * @generated
	 */
	int PERF_VALUE_SOURCE_OBJECT = 47;

	/**
	 * The meta object id for the '<em>Step Kind Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.StepKind
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getStepKindObject()
	 * @generated
	 */
	int STEP_KIND_OBJECT = 48;

	/**
	 * The meta object id for the '<em>Synchronization Kind Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.carleton.sce.puma.CSM.SynchronizationKind
	 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getSynchronizationKindObject()
	 * @generated
	 */
	int SYNCHRONIZATION_KIND_OBJECT = 49;


	/**
	 * Returns the meta object for class '{@link ca.carleton.sce.puma.CSM.ActiveResourceType <em>Active Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Active Resource Type</em>'.
	 * @see ca.carleton.sce.puma.CSM.ActiveResourceType
	 * @generated
	 */
	EClass getActiveResourceType();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.ActiveResourceType#getOpTime <em>Op Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op Time</em>'.
	 * @see ca.carleton.sce.puma.CSM.ActiveResourceType#getOpTime()
	 * @see #getActiveResourceType()
	 * @generated
	 */
	EAttribute getActiveResourceType_OpTime();

	/**
	 * Returns the meta object for class '{@link ca.carleton.sce.puma.CSM.AspectStepType <em>Aspect Step Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aspect Step Type</em>'.
	 * @see ca.carleton.sce.puma.CSM.AspectStepType
	 * @generated
	 */
	EClass getAspectStepType();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.AspectStepType#getAspectDefinition <em>Aspect Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aspect Definition</em>'.
	 * @see ca.carleton.sce.puma.CSM.AspectStepType#getAspectDefinition()
	 * @see #getAspectStepType()
	 * @generated
	 */
	EAttribute getAspectStepType_AspectDefinition();

	/**
	 * Returns the meta object for class '{@link ca.carleton.sce.puma.CSM.BranchType <em>Branch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch Type</em>'.
	 * @see ca.carleton.sce.puma.CSM.BranchType
	 * @generated
	 */
	EClass getBranchType();

	/**
	 * Returns the meta object for class '{@link ca.carleton.sce.puma.CSM.ClosedWorkloadType <em>Closed Workload Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Closed Workload Type</em>'.
	 * @see ca.carleton.sce.puma.CSM.ClosedWorkloadType
	 * @generated
	 */
	EClass getClosedWorkloadType();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.ClosedWorkloadType#getPopulation <em>Population</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Population</em>'.
	 * @see ca.carleton.sce.puma.CSM.ClosedWorkloadType#getPopulation()
	 * @see #getClosedWorkloadType()
	 * @generated
	 */
	EAttribute getClosedWorkloadType_Population();

	/**
	 * Returns the meta object for class '{@link ca.carleton.sce.puma.CSM.CommLinkType <em>Comm Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comm Link Type</em>'.
	 * @see ca.carleton.sce.puma.CSM.CommLinkType
	 * @generated
	 */
	EClass getCommLinkType();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.CommLinkType#getBlockT <em>Block T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block T</em>'.
	 * @see ca.carleton.sce.puma.CSM.CommLinkType#getBlockT()
	 * @see #getCommLinkType()
	 * @generated
	 */
	EAttribute getCommLinkType_BlockT();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.CommLinkType#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see ca.carleton.sce.puma.CSM.CommLinkType#getCapacity()
	 * @see #getCommLinkType()
	 * @generated
	 */
	EAttribute getCommLinkType_Capacity();

	/**
	 * Returns the meta object for the reference list '{@link ca.carleton.sce.puma.CSM.CommLinkType#getProcessingHostList <em>Processing Host List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Processing Host List</em>'.
	 * @see ca.carleton.sce.puma.CSM.CommLinkType#getProcessingHostList()
	 * @see #getCommLinkType()
	 * @generated
	 */
	EReference getCommLinkType_ProcessingHostList();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.CommLinkType#getResMult <em>Res Mult</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Res Mult</em>'.
	 * @see ca.carleton.sce.puma.CSM.CommLinkType#getResMult()
	 * @see #getCommLinkType()
	 * @generated
	 */
	EAttribute getCommLinkType_ResMult();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.CommLinkType#getSpeedFactor <em>Speed Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed Factor</em>'.
	 * @see ca.carleton.sce.puma.CSM.CommLinkType#getSpeedFactor()
	 * @see #getCommLinkType()
	 * @generated
	 */
	EAttribute getCommLinkType_SpeedFactor();

	/**
	 * Returns the meta object for class '{@link ca.carleton.sce.puma.CSM.CommStepType <em>Comm Step Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comm Step Type</em>'.
	 * @see ca.carleton.sce.puma.CSM.CommStepType
	 * @generated
	 */
	EClass getCommStepType();

	/**
	 * Returns the meta object for the reference '{@link ca.carleton.sce.puma.CSM.CommStepType#getCommLink <em>Comm Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Comm Link</em>'.
	 * @see ca.carleton.sce.puma.CSM.CommStepType#getCommLink()
	 * @see #getCommStepType()
	 * @generated
	 */
	EReference getCommStepType_CommLink();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.CommStepType#getMsgKind <em>Msg Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Msg Kind</em>'.
	 * @see ca.carleton.sce.puma.CSM.CommStepType#getMsgKind()
	 * @see #getCommStepType()
	 * @generated
	 */
	EAttribute getCommStepType_MsgKind();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.CommStepType#getMsgSize <em>Msg Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Msg Size</em>'.
	 * @see ca.carleton.sce.puma.CSM.CommStepType#getMsgSize()
	 * @see #getCommStepType()
	 * @generated
	 */
	EAttribute getCommStepType_MsgSize();

	/**
	 * Returns the meta object for the reference '{@link ca.carleton.sce.puma.CSM.CommStepType#getPredCommStep <em>Pred Comm Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pred Comm Step</em>'.
	 * @see ca.carleton.sce.puma.CSM.CommStepType#getPredCommStep()
	 * @see #getCommStepType()
	 * @generated
	 */
	EReference getCommStepType_PredCommStep();

	/**
	 * Returns the meta object for the reference '{@link ca.carleton.sce.puma.CSM.CommStepType#getRcvComp <em>Rcv Comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rcv Comp</em>'.
	 * @see ca.carleton.sce.puma.CSM.CommStepType#getRcvComp()
	 * @see #getCommStepType()
	 * @generated
	 */
	EReference getCommStepType_RcvComp();

	/**
	 * Returns the meta object for the reference '{@link ca.carleton.sce.puma.CSM.CommStepType#getSuccCommStep <em>Succ Comm Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Succ Comm Step</em>'.
	 * @see ca.carleton.sce.puma.CSM.CommStepType#getSuccCommStep()
	 * @see #getCommStepType()
	 * @generated
	 */
	EReference getCommStepType_SuccCommStep();

	/**
	 * Returns the meta object for the reference '{@link ca.carleton.sce.puma.CSM.CommStepType#getTxComp <em>Tx Comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tx Comp</em>'.
	 * @see ca.carleton.sce.puma.CSM.CommStepType#getTxComp()
	 * @see #getCommStepType()
	 * @generated
	 */
	EReference getCommStepType_TxComp();

	/**
	 * Returns the meta object for class '{@link ca.carleton.sce.puma.CSM.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Type</em>'.
	 * @see ca.carleton.sce.puma.CSM.ComponentType
	 * @generated
	 */
	EClass getComponentType();

	/**
	 * Returns the meta object for the reference '{@link ca.carleton.sce.puma.CSM.ComponentType#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Host</em>'.
	 * @see ca.carleton.sce.puma.CSM.ComponentType#getHost()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_Host();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.ComponentType#isIsActiveProcess <em>Is Active Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Active Process</em>'.
	 * @see ca.carleton.sce.puma.CSM.ComponentType#isIsActiveProcess()
	 * @see #getComponentType()
	 * @generated
	 */
	EAttribute getComponentType_IsActiveProcess();

	/**
	 * Returns the meta object for the reference '{@link ca.carleton.sce.puma.CSM.ComponentType#getParentComponent <em>Parent Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Component</em>'.
	 * @see ca.carleton.sce.puma.CSM.ComponentType#getParentComponent()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_ParentComponent();

	/**
	 * Returns the meta object for the reference list '{@link ca.carleton.sce.puma.CSM.ComponentType#getSubComponentList <em>Sub Component List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Component List</em>'.
	 * @see ca.carleton.sce.puma.CSM.ComponentType#getSubComponentList()
	 * @see #getComponentType()
	 * @generated
	 */
	EReference getComponentType_SubComponentList();

	/**
	 * Returns the meta object for class '{@link ca.carleton.sce.puma.CSM.CSMElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Type</em>'.
	 * @see ca.carleton.sce.puma.CSM.CSMElementType
	 * @generated
	 */
	EClass getCSMElementType();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.CSMElementType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ca.carleton.sce.puma.CSM.CSMElementType#getDescription()
	 * @see #getCSMElementType()
	 * @generated
	 */
	EAttribute getCSMElementType_Description();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.CSMElementType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ca.carleton.sce.puma.CSM.CSMElementType#getId()
	 * @see #getCSMElementType()
	 * @generated
	 */
	EAttribute getCSMElementType_Id();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.CSMElementType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ca.carleton.sce.puma.CSM.CSMElementType#getName()
	 * @see #getCSMElementType()
	 * @generated
	 */
	EAttribute getCSMElementType_Name();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.CSMElementType#getTraceabilityLink <em>Traceability Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Traceability Link</em>'.
	 * @see ca.carleton.sce.puma.CSM.CSMElementType#getTraceabilityLink()
	 * @see #getCSMElementType()
	 * @generated
	 */
	EAttribute getCSMElementType_TraceabilityLink();

	/**
	 * Returns the meta object for class '{@link ca.carleton.sce.puma.CSM.CSMType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see ca.carleton.sce.puma.CSM.CSMType
	 * @generated
	 */
	EClass getCSMType();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.carleton.sce.puma.CSM.CSMType#getScenarioList <em>Scenario List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenario List</em>'.
	 * @see ca.carleton.sce.puma.CSM.CSMType#getScenarioList()
	 * @see #getCSMType()
	 * @generated
	 */
	EReference getCSMType_ScenarioList();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.carleton.sce.puma.CSM.CSMType#getComponentList <em>Component List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component List</em>'.
	 * @see ca.carleton.sce.puma.CSM.CSMType#getComponentList()
	 * @see #getCSMType()
	 * @generated
	 */
	EReference getCSMType_ComponentList();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.carleton.sce.puma.CSM.CSMType#getCommLinkList <em>Comm Link List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comm Link List</em>'.
	 * @see ca.carleton.sce.puma.CSM.CSMType#getCommLinkList()
	 * @see #getCSMType()
	 * @generated
	 */
	EReference getCSMType_CommLinkList();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.carleton.sce.puma.CSM.CSMType#getProcessingResourceList <em>Processing Resource List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processing Resource List</em>'.
	 * @see ca.carleton.sce.puma.CSM.CSMType#getProcessingResourceList()
	 * @see #getCSMType()
	 * @generated
	 */
	EReference getCSMType_ProcessingResourceList();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.carleton.sce.puma.CSM.CSMType#getPerfMeasureList <em>Perf Measure List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Perf Measure List</em>'.
	 * @see ca.carleton.sce.puma.CSM.CSMType#getPerfMeasureList()
	 * @see #getCSMType()
	 * @generated
	 */
	EReference getCSMType_PerfMeasureList();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.carleton.sce.puma.CSM.CSMType#getLogicalResourceList <em>Logical Resource List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Logical Resource List</em>'.
	 * @see ca.carleton.sce.puma.CSM.CSMType#getLogicalResourceList()
	 * @see #getCSMType()
	 * @generated
	 */
	EReference getCSMType_LogicalResourceList();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.carleton.sce.puma.CSM.CSMType#getVariableList <em>Variable List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable List</em>'.
	 * @see ca.carleton.sce.puma.CSM.CSMType#getVariableList()
	 * @see #getCSMType()
	 * @generated
	 */
	EReference getCSMType_VariableList();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.CSMType#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see ca.carleton.sce.puma.CSM.CSMType#getAuthor()
	 * @see #getCSMType()
	 * @generated
	 */
	EAttribute getCSMType_Author();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.CSMType#getCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see ca.carleton.sce.puma.CSM.CSMType#getCreated()
	 * @see #getCSMType()
	 * @generated
	 */
	EAttribute getCSMType_Created();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.CSMType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ca.carleton.sce.puma.CSM.CSMType#getDescription()
	 * @see #getCSMType()
	 * @generated
	 */
	EAttribute getCSMType_Description();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.CSMType#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified</em>'.
	 * @see ca.carleton.sce.puma.CSM.CSMType#getModified()
	 * @see #getCSMType()
	 * @generated
	 */
	EAttribute getCSMType_Modified();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.CSMType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ca.carleton.sce.puma.CSM.CSMType#getName()
	 * @see #getCSMType()
	 * @generated
	 */
	EAttribute getCSMType_Name();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.CSMType#getTraceabilityLink <em>Traceability Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Traceability Link</em>'.
	 * @see ca.carleton.sce.puma.CSM.CSMType#getTraceabilityLink()
	 * @see #getCSMType()
	 * @generated
	 */
	EAttribute getCSMType_TraceabilityLink();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.CSMType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see ca.carleton.sce.puma.CSM.CSMType#getVersion()
	 * @see #getCSMType()
	 * @generated
	 */
	EAttribute getCSMType_Version();

	/**
	 * Returns the meta object for class '{@link ca.carleton.sce.puma.CSM.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see ca.carleton.sce.puma.CSM.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link ca.carleton.sce.puma.CSM.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see ca.carleton.sce.puma.CSM.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the containment reference '{@link ca.carleton.sce.puma.CSM.DocumentRoot#getCSM <em>CSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CSM</em>'.
	 * @see ca.carleton.sce.puma.CSM.DocumentRoot#getCSM()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CSM();

	/**
	 * Returns the meta object for class '{@link ca.carleton.sce.puma.CSM.EndType <em>End Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Type</em>'.
	 * @see ca.carleton.sce.puma.CSM.EndType
	 * @generated
	 */
	EClass getEndType();

	/**
	 * Returns the meta object for the reference '{@link ca.carleton.sce.puma.CSM.EndType#getOutBinding <em>Out Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Out Binding</em>'.
	 * @see ca.carleton.sce.puma.CSM.EndType#getOutBinding()
	 * @see #getEndType()
	 * @generated
	 */
	EReference getEndType_OutBinding();

	/**
	 * Returns the meta object for class '{@link ca.carleton.sce.puma.CSM.ExternalDemandType <em>External Demand Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Demand Type</em>'.
	 * @see ca.carleton.sce.puma.CSM.ExternalDemandType
	 * @generated
	 */
	EClass getExternalDemandType();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.ExternalDemandType#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see ca.carleton.sce.puma.CSM.ExternalDemandType#getCount()
	 * @see #getExternalDemandType()
	 * @generated
	 */
	EAttribute getExternalDemandType_Count();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.ExternalDemandType#getExternalOperation <em>External Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Operation</em>'.
	 * @see ca.carleton.sce.puma.CSM.ExternalDemandType#getExternalOperation()
	 * @see #getExternalDemandType()
	 * @generated
	 */
	EAttribute getExternalDemandType_ExternalOperation();

	/**
	 * Returns the meta object for class '{@link ca.carleton.sce.puma.CSM.ForkType <em>Fork Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fork Type</em>'.
	 * @see ca.carleton.sce.puma.CSM.ForkType
	 * @generated
	 */
	EClass getForkType();

	/**
	 * Returns the meta object for class '{@link ca.carleton.sce.puma.CSM.GeneralResourceType <em>General Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Resource Type</em>'.
	 * @see ca.carleton.sce.puma.CSM.GeneralResourceType
	 * @generated
	 */
	EClass getGeneralResourceType();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.GeneralResourceType#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see ca.carleton.sce.puma.CSM.GeneralResourceType#getMultiplicity()
	 * @see #getGeneralResourceType()
	 * @generated
	 */
	EAttribute getGeneralResourceType_Multiplicity();

	/**
	 * Returns the meta object for the reference list '{@link ca.carleton.sce.puma.CSM.GeneralResourceType#getPerfMeasureList <em>Perf Measure List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Perf Measure List</em>'.
	 * @see ca.carleton.sce.puma.CSM.GeneralResourceType#getPerfMeasureList()
	 * @see #getGeneralResourceType()
	 * @generated
	 */
	EReference getGeneralResourceType_PerfMeasureList();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.GeneralResourceType#getSchedPolicy <em>Sched Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sched Policy</em>'.
	 * @see ca.carleton.sce.puma.CSM.GeneralResourceType#getSchedPolicy()
	 * @see #getGeneralResourceType()
	 * @generated
	 */
	EAttribute getGeneralResourceType_SchedPolicy();

	/**
	 * Returns the meta object for class '{@link ca.carleton.sce.puma.CSM.InBindingType <em>In Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Binding Type</em>'.
	 * @see ca.carleton.sce.puma.CSM.InBindingType
	 * @generated
	 */
	EClass getInBindingType();

	/**
	 * Returns the meta object for the reference '{@link ca.carleton.sce.puma.CSM.InBindingType#getInStep <em>In Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Step</em>'.
	 * @see ca.carleton.sce.puma.CSM.InBindingType#getInStep()
	 * @see #getInBindingType()
	 * @generated
	 */
	EReference getInBindingType_InStep();

	/**
	 * Returns the meta object for the reference '{@link ca.carleton.sce.puma.CSM.InBindingType#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see ca.carleton.sce.puma.CSM.InBindingType#getStart()
	 * @see #getInBindingType()
	 * @generated
	 */
	EReference getInBindingType_Start();

	/**
	 * Returns the meta object for class '{@link ca.carleton.sce.puma.CSM.JoinType <em>Join Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Join Type</em>'.
	 * @see ca.carleton.sce.puma.CSM.JoinType
	 * @generated
	 */
	EClass getJoinType();

	/**
	 * Returns the meta object for class '{@link ca.carleton.sce.puma.CSM.LogicalResourceType <em>Logical Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Resource Type</em>'.
	 * @see ca.carleton.sce.puma.CSM.LogicalResourceType
	 * @generated
	 */
	EClass getLogicalResourceType();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.LogicalResourceType#isNestedOnly <em>Nested Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nested Only</em>'.
	 * @see ca.carleton.sce.puma.CSM.LogicalResourceType#isNestedOnly()
	 * @see #getLogicalResourceType()
	 * @generated
	 */
	EAttribute getLogicalResourceType_NestedOnly();

	/**
	 * Returns the meta object for class '{@link ca.carleton.sce.puma.CSM.MergeType <em>Merge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge Type</em>'.
	 * @see ca.carleton.sce.puma.CSM.MergeType
	 * @generated
	 */
	EClass getMergeType();

	/**
	 * Returns the meta object for class '{@link ca.carleton.sce.puma.CSM.OpenWorkloadType <em>Open Workload Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Workload Type</em>'.
	 * @see ca.carleton.sce.puma.CSM.OpenWorkloadType
	 * @generated
	 */
	EClass getOpenWorkloadType();

	/**
	 * Returns the meta object for class '{@link ca.carleton.sce.puma.CSM.OutBindingType <em>Out Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Out Binding Type</em>'.
	 * @see ca.carleton.sce.puma.CSM.OutBindingType
	 * @generated
	 */
	EClass getOutBindingType();

	/**
	 * Returns the meta object for the reference '{@link ca.carleton.sce.puma.CSM.OutBindingType#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see ca.carleton.sce.puma.CSM.OutBindingType#getEnd()
	 * @see #getOutBindingType()
	 * @generated
	 */
	EReference getOutBindingType_End();

	/**
	 * Returns the meta object for the reference '{@link ca.carleton.sce.puma.CSM.OutBindingType#getOutStep <em>Out Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Out Step</em>'.
	 * @see ca.carleton.sce.puma.CSM.OutBindingType#getOutStep()
	 * @see #getOutBindingType()
	 * @generated
	 */
	EReference getOutBindingType_OutStep();

	/**
	 * Returns the meta object for class '{@link ca.carleton.sce.puma.CSM.PathConnectionType <em>Path Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Connection Type</em>'.
	 * @see ca.carleton.sce.puma.CSM.PathConnectionType
	 * @generated
	 */
	EClass getPathConnectionType();

	/**
	 * Returns the meta object for the reference list '{@link ca.carleton.sce.puma.CSM.PathConnectionType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see ca.carleton.sce.puma.CSM.PathConnectionType#getSource()
	 * @see #getPathConnectionType()
	 * @generated
	 */
	EReference getPathConnectionType_Source();

	/**
	 * Returns the meta object for the reference list '{@link ca.carleton.sce.puma.CSM.PathConnectionType#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see ca.carleton.sce.puma.CSM.PathConnectionType#getTarget()
	 * @see #getPathConnectionType()
	 * @generated
	 */
	EReference getPathConnectionType_Target();

	/**
	 * Returns the meta object for class '{@link ca.carleton.sce.puma.CSM.PerfMeasureType <em>Perf Measure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Perf Measure Type</em>'.
	 * @see ca.carleton.sce.puma.CSM.PerfMeasureType
	 * @generated
	 */
	EClass getPerfMeasureType();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.carleton.sce.puma.CSM.PerfMeasureType#getPerfValueList <em>Perf Value List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Perf Value List</em>'.
	 * @see ca.carleton.sce.puma.CSM.PerfMeasureType#getPerfValueList()
	 * @see #getPerfMeasureType()
	 * @generated
	 */
	EReference getPerfMeasureType_PerfValueList();

	/**
	 * Returns the meta object for the reference '{@link ca.carleton.sce.puma.CSM.PerfMeasureType#getDurationOf <em>Duration Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Duration Of</em>'.
	 * @see ca.carleton.sce.puma.CSM.PerfMeasureType#getDurationOf()
	 * @see #getPerfMeasureType()
	 * @generated
	 */
	EReference getPerfMeasureType_DurationOf();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.PerfMeasureType#getMeasureKind <em>Measure Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Measure Kind</em>'.
	 * @see ca.carleton.sce.puma.CSM.PerfMeasureType#getMeasureKind()
	 * @see #getPerfMeasureType()
	 * @generated
	 */
	EAttribute getPerfMeasureType_MeasureKind();

	/**
	 * Returns the meta object for the reference '{@link ca.carleton.sce.puma.CSM.PerfMeasureType#getPredPerfMeasure <em>Pred Perf Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pred Perf Measure</em>'.
	 * @see ca.carleton.sce.puma.CSM.PerfMeasureType#getPredPerfMeasure()
	 * @see #getPerfMeasureType()
	 * @generated
	 */
	EReference getPerfMeasureType_PredPerfMeasure();

	/**
	 * Returns the meta object for the reference '{@link ca.carleton.sce.puma.CSM.PerfMeasureType#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see ca.carleton.sce.puma.CSM.PerfMeasureType#getResource()
	 * @see #getPerfMeasureType()
	 * @generated
	 */
	EReference getPerfMeasureType_Resource();

	/**
	 * Returns the meta object for the reference '{@link ca.carleton.sce.puma.CSM.PerfMeasureType#getStoppedBy <em>Stopped By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Stopped By</em>'.
	 * @see ca.carleton.sce.puma.CSM.PerfMeasureType#getStoppedBy()
	 * @see #getPerfMeasureType()
	 * @generated
	 */
	EReference getPerfMeasureType_StoppedBy();

	/**
	 * Returns the meta object for the reference '{@link ca.carleton.sce.puma.CSM.PerfMeasureType#getSuccPerfMeasure <em>Succ Perf Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Succ Perf Measure</em>'.
	 * @see ca.carleton.sce.puma.CSM.PerfMeasureType#getSuccPerfMeasure()
	 * @see #getPerfMeasureType()
	 * @generated
	 */
	EReference getPerfMeasureType_SuccPerfMeasure();

	/**
	 * Returns the meta object for the reference '{@link ca.carleton.sce.puma.CSM.PerfMeasureType#getTriggeredBy <em>Triggered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Triggered By</em>'.
	 * @see ca.carleton.sce.puma.CSM.PerfMeasureType#getTriggeredBy()
	 * @see #getPerfMeasureType()
	 * @generated
	 */
	EReference getPerfMeasureType_TriggeredBy();

	/**
	 * Returns the meta object for class '{@link ca.carleton.sce.puma.CSM.PerfValueType <em>Perf Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Perf Value Type</em>'.
	 * @see ca.carleton.sce.puma.CSM.PerfValueType
	 * @generated
	 */
	EClass getPerfValueType();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.PerfValueType#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see ca.carleton.sce.puma.CSM.PerfValueType#getKind()
	 * @see #getPerfValueType()
	 * @generated
	 */
	EAttribute getPerfValueType_Kind();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.PerfValueType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see ca.carleton.sce.puma.CSM.PerfValueType#getSource()
	 * @see #getPerfValueType()
	 * @generated
	 */
	EAttribute getPerfValueType_Source();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.PerfValueType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ca.carleton.sce.puma.CSM.PerfValueType#getValue()
	 * @see #getPerfValueType()
	 * @generated
	 */
	EAttribute getPerfValueType_Value();

	/**
	 * Returns the meta object for class '{@link ca.carleton.sce.puma.CSM.ProcessingResourceType <em>Processing Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing Resource Type</em>'.
	 * @see ca.carleton.sce.puma.CSM.ProcessingResourceType
	 * @generated
	 */
	EClass getProcessingResourceType();

	/**
	 * Returns the meta object for the reference list '{@link ca.carleton.sce.puma.CSM.ProcessingResourceType#getCommLinkList <em>Comm Link List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Comm Link List</em>'.
	 * @see ca.carleton.sce.puma.CSM.ProcessingResourceType#getCommLinkList()
	 * @see #getProcessingResourceType()
	 * @generated
	 */
	EReference getProcessingResourceType_CommLinkList();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.ProcessingResourceType#getCommRcvOvh <em>Comm Rcv Ovh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comm Rcv Ovh</em>'.
	 * @see ca.carleton.sce.puma.CSM.ProcessingResourceType#getCommRcvOvh()
	 * @see #getProcessingResourceType()
	 * @generated
	 */
	EAttribute getProcessingResourceType_CommRcvOvh();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.ProcessingResourceType#getCommTxOvh <em>Comm Tx Ovh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comm Tx Ovh</em>'.
	 * @see ca.carleton.sce.puma.CSM.ProcessingResourceType#getCommTxOvh()
	 * @see #getProcessingResourceType()
	 * @generated
	 */
	EAttribute getProcessingResourceType_CommTxOvh();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.ProcessingResourceType#getSpeedFactor <em>Speed Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed Factor</em>'.
	 * @see ca.carleton.sce.puma.CSM.ProcessingResourceType#getSpeedFactor()
	 * @see #getProcessingResourceType()
	 * @generated
	 */
	EAttribute getProcessingResourceType_SpeedFactor();

	/**
	 * Returns the meta object for class '{@link ca.carleton.sce.puma.CSM.RefinementType <em>Refinement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refinement Type</em>'.
	 * @see ca.carleton.sce.puma.CSM.RefinementType
	 * @generated
	 */
	EClass getRefinementType();

	/**
	 * Returns the meta object for the containment reference '{@link ca.carleton.sce.puma.CSM.RefinementType#getInBinding <em>In Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>In Binding</em>'.
	 * @see ca.carleton.sce.puma.CSM.RefinementType#getInBinding()
	 * @see #getRefinementType()
	 * @generated
	 */
	EReference getRefinementType_InBinding();

	/**
	 * Returns the meta object for the containment reference '{@link ca.carleton.sce.puma.CSM.RefinementType#getOutBinding <em>Out Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Out Binding</em>'.
	 * @see ca.carleton.sce.puma.CSM.RefinementType#getOutBinding()
	 * @see #getRefinementType()
	 * @generated
	 */
	EReference getRefinementType_OutBinding();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.carleton.sce.puma.CSM.RefinementType#getRoleBindingList <em>Role Binding List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role Binding List</em>'.
	 * @see ca.carleton.sce.puma.CSM.RefinementType#getRoleBindingList()
	 * @see #getRefinementType()
	 * @generated
	 */
	EReference getRefinementType_RoleBindingList();

	/**
	 * Returns the meta object for the reference '{@link ca.carleton.sce.puma.CSM.RefinementType#getParentStep <em>Parent Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Step</em>'.
	 * @see ca.carleton.sce.puma.CSM.RefinementType#getParentStep()
	 * @see #getRefinementType()
	 * @generated
	 */
	EReference getRefinementType_ParentStep();

	/**
	 * Returns the meta object for the reference '{@link ca.carleton.sce.puma.CSM.RefinementType#getSubScenario <em>Sub Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Scenario</em>'.
	 * @see ca.carleton.sce.puma.CSM.RefinementType#getSubScenario()
	 * @see #getRefinementType()
	 * @generated
	 */
	EReference getRefinementType_SubScenario();

	/**
	 * Returns the meta object for class '{@link ca.carleton.sce.puma.CSM.ResourceAcquireType <em>Resource Acquire Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Acquire Type</em>'.
	 * @see ca.carleton.sce.puma.CSM.ResourceAcquireType
	 * @generated
	 */
	EClass getResourceAcquireType();

	/**
	 * Returns the meta object for the reference '{@link ca.carleton.sce.puma.CSM.ResourceAcquireType#getAcquire <em>Acquire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Acquire</em>'.
	 * @see ca.carleton.sce.puma.CSM.ResourceAcquireType#getAcquire()
	 * @see #getResourceAcquireType()
	 * @generated
	 */
	EReference getResourceAcquireType_Acquire();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.ResourceAcquireType#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see ca.carleton.sce.puma.CSM.ResourceAcquireType#getPriority()
	 * @see #getResourceAcquireType()
	 * @generated
	 */
	EAttribute getResourceAcquireType_Priority();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.ResourceAcquireType#getRUnits <em>RUnits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RUnits</em>'.
	 * @see ca.carleton.sce.puma.CSM.ResourceAcquireType#getRUnits()
	 * @see #getResourceAcquireType()
	 * @generated
	 */
	EAttribute getResourceAcquireType_RUnits();

	/**
	 * Returns the meta object for class '{@link ca.carleton.sce.puma.CSM.ResourcePassType <em>Resource Pass Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Pass Type</em>'.
	 * @see ca.carleton.sce.puma.CSM.ResourcePassType
	 * @generated
	 */
	EClass getResourcePassType();

	/**
	 * Returns the meta object for the reference '{@link ca.carleton.sce.puma.CSM.ResourcePassType#getPass <em>Pass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pass</em>'.
	 * @see ca.carleton.sce.puma.CSM.ResourcePassType#getPass()
	 * @see #getResourcePassType()
	 * @generated
	 */
	EReference getResourcePassType_Pass();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.ResourcePassType#getRUnits <em>RUnits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RUnits</em>'.
	 * @see ca.carleton.sce.puma.CSM.ResourcePassType#getRUnits()
	 * @see #getResourcePassType()
	 * @generated
	 */
	EAttribute getResourcePassType_RUnits();

	/**
	 * Returns the meta object for class '{@link ca.carleton.sce.puma.CSM.ResourceReleaseType <em>Resource Release Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Release Type</em>'.
	 * @see ca.carleton.sce.puma.CSM.ResourceReleaseType
	 * @generated
	 */
	EClass getResourceReleaseType();

	/**
	 * Returns the meta object for the reference '{@link ca.carleton.sce.puma.CSM.ResourceReleaseType#getRelease <em>Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Release</em>'.
	 * @see ca.carleton.sce.puma.CSM.ResourceReleaseType#getRelease()
	 * @see #getResourceReleaseType()
	 * @generated
	 */
	EReference getResourceReleaseType_Release();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.ResourceReleaseType#getRUnits <em>RUnits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RUnits</em>'.
	 * @see ca.carleton.sce.puma.CSM.ResourceReleaseType#getRUnits()
	 * @see #getResourceReleaseType()
	 * @generated
	 */
	EAttribute getResourceReleaseType_RUnits();

	/**
	 * Returns the meta object for class '{@link ca.carleton.sce.puma.CSM.RoleBindingType <em>Role Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Binding Type</em>'.
	 * @see ca.carleton.sce.puma.CSM.RoleBindingType
	 * @generated
	 */
	EClass getRoleBindingType();

	/**
	 * Returns the meta object for the reference '{@link ca.carleton.sce.puma.CSM.RoleBindingType#getElementId <em>Element Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element Id</em>'.
	 * @see ca.carleton.sce.puma.CSM.RoleBindingType#getElementId()
	 * @see #getRoleBindingType()
	 * @generated
	 */
	EReference getRoleBindingType_ElementId();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.RoleBindingType#getElementName <em>Element Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Name</em>'.
	 * @see ca.carleton.sce.puma.CSM.RoleBindingType#getElementName()
	 * @see #getRoleBindingType()
	 * @generated
	 */
	EAttribute getRoleBindingType_ElementName();

	/**
	 * Returns the meta object for the reference '{@link ca.carleton.sce.puma.CSM.RoleBindingType#getRoleId <em>Role Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Id</em>'.
	 * @see ca.carleton.sce.puma.CSM.RoleBindingType#getRoleId()
	 * @see #getRoleBindingType()
	 * @generated
	 */
	EReference getRoleBindingType_RoleId();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.RoleBindingType#getRoleName <em>Role Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role Name</em>'.
	 * @see ca.carleton.sce.puma.CSM.RoleBindingType#getRoleName()
	 * @see #getRoleBindingType()
	 * @generated
	 */
	EAttribute getRoleBindingType_RoleName();

	/**
	 * Returns the meta object for class '{@link ca.carleton.sce.puma.CSM.ScenarioElementType <em>Scenario Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario Element Type</em>'.
	 * @see ca.carleton.sce.puma.CSM.ScenarioElementType
	 * @generated
	 */
	EClass getScenarioElementType();

	/**
	 * Returns the meta object for the reference list '{@link ca.carleton.sce.puma.CSM.ScenarioElementType#getDurationPerfMeasureList <em>Duration Perf Measure List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Duration Perf Measure List</em>'.
	 * @see ca.carleton.sce.puma.CSM.ScenarioElementType#getDurationPerfMeasureList()
	 * @see #getScenarioElementType()
	 * @generated
	 */
	EReference getScenarioElementType_DurationPerfMeasureList();

	/**
	 * Returns the meta object for the reference list '{@link ca.carleton.sce.puma.CSM.ScenarioElementType#getStopPerfMeasureList <em>Stop Perf Measure List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stop Perf Measure List</em>'.
	 * @see ca.carleton.sce.puma.CSM.ScenarioElementType#getStopPerfMeasureList()
	 * @see #getScenarioElementType()
	 * @generated
	 */
	EReference getScenarioElementType_StopPerfMeasureList();

	/**
	 * Returns the meta object for the reference list '{@link ca.carleton.sce.puma.CSM.ScenarioElementType#getTriggerPerfMeasureList <em>Trigger Perf Measure List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Trigger Perf Measure List</em>'.
	 * @see ca.carleton.sce.puma.CSM.ScenarioElementType#getTriggerPerfMeasureList()
	 * @see #getScenarioElementType()
	 * @generated
	 */
	EReference getScenarioElementType_TriggerPerfMeasureList();

	/**
	 * Returns the meta object for class '{@link ca.carleton.sce.puma.CSM.ScenarioType <em>Scenario Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario Type</em>'.
	 * @see ca.carleton.sce.puma.CSM.ScenarioType
	 * @generated
	 */
	EClass getScenarioType();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.carleton.sce.puma.CSM.ScenarioType#getStepList <em>Step List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step List</em>'.
	 * @see ca.carleton.sce.puma.CSM.ScenarioType#getStepList()
	 * @see #getScenarioType()
	 * @generated
	 */
	EReference getScenarioType_StepList();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.carleton.sce.puma.CSM.ScenarioType#getCommStepList <em>Comm Step List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comm Step List</em>'.
	 * @see ca.carleton.sce.puma.CSM.ScenarioType#getCommStepList()
	 * @see #getScenarioType()
	 * @generated
	 */
	EReference getScenarioType_CommStepList();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.carleton.sce.puma.CSM.ScenarioType#getResourceAcquireList <em>Resource Acquire List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Acquire List</em>'.
	 * @see ca.carleton.sce.puma.CSM.ScenarioType#getResourceAcquireList()
	 * @see #getScenarioType()
	 * @generated
	 */
	EReference getScenarioType_ResourceAcquireList();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.carleton.sce.puma.CSM.ScenarioType#getResourceReleaseList <em>Resource Release List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Release List</em>'.
	 * @see ca.carleton.sce.puma.CSM.ScenarioType#getResourceReleaseList()
	 * @see #getScenarioType()
	 * @generated
	 */
	EReference getScenarioType_ResourceReleaseList();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.carleton.sce.puma.CSM.ScenarioType#getResourcePassList <em>Resource Pass List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Pass List</em>'.
	 * @see ca.carleton.sce.puma.CSM.ScenarioType#getResourcePassList()
	 * @see #getScenarioType()
	 * @generated
	 */
	EReference getScenarioType_ResourcePassList();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.carleton.sce.puma.CSM.ScenarioType#getAspectStepList <em>Aspect Step List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aspect Step List</em>'.
	 * @see ca.carleton.sce.puma.CSM.ScenarioType#getAspectStepList()
	 * @see #getScenarioType()
	 * @generated
	 */
	EReference getScenarioType_AspectStepList();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.carleton.sce.puma.CSM.ScenarioType#getStartList <em>Start List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Start List</em>'.
	 * @see ca.carleton.sce.puma.CSM.ScenarioType#getStartList()
	 * @see #getScenarioType()
	 * @generated
	 */
	EReference getScenarioType_StartList();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.carleton.sce.puma.CSM.ScenarioType#getEndList <em>End List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>End List</em>'.
	 * @see ca.carleton.sce.puma.CSM.ScenarioType#getEndList()
	 * @see #getScenarioType()
	 * @generated
	 */
	EReference getScenarioType_EndList();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.carleton.sce.puma.CSM.ScenarioType#getSequenceList <em>Sequence List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence List</em>'.
	 * @see ca.carleton.sce.puma.CSM.ScenarioType#getSequenceList()
	 * @see #getScenarioType()
	 * @generated
	 */
	EReference getScenarioType_SequenceList();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.carleton.sce.puma.CSM.ScenarioType#getBranchList <em>Branch List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branch List</em>'.
	 * @see ca.carleton.sce.puma.CSM.ScenarioType#getBranchList()
	 * @see #getScenarioType()
	 * @generated
	 */
	EReference getScenarioType_BranchList();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.carleton.sce.puma.CSM.ScenarioType#getMergeList <em>Merge List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Merge List</em>'.
	 * @see ca.carleton.sce.puma.CSM.ScenarioType#getMergeList()
	 * @see #getScenarioType()
	 * @generated
	 */
	EReference getScenarioType_MergeList();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.carleton.sce.puma.CSM.ScenarioType#getForkList <em>Fork List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fork List</em>'.
	 * @see ca.carleton.sce.puma.CSM.ScenarioType#getForkList()
	 * @see #getScenarioType()
	 * @generated
	 */
	EReference getScenarioType_ForkList();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.carleton.sce.puma.CSM.ScenarioType#getJoinList <em>Join List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Join List</em>'.
	 * @see ca.carleton.sce.puma.CSM.ScenarioType#getJoinList()
	 * @see #getScenarioType()
	 * @generated
	 */
	EReference getScenarioType_JoinList();

	/**
	 * Returns the meta object for the reference list '{@link ca.carleton.sce.puma.CSM.ScenarioType#getParentRefinementList <em>Parent Refinement List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parent Refinement List</em>'.
	 * @see ca.carleton.sce.puma.CSM.ScenarioType#getParentRefinementList()
	 * @see #getScenarioType()
	 * @generated
	 */
	EReference getScenarioType_ParentRefinementList();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.ScenarioType#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ca.carleton.sce.puma.CSM.ScenarioType#getProbability()
	 * @see #getScenarioType()
	 * @generated
	 */
	EAttribute getScenarioType_Probability();

	/**
	 * Returns the meta object for class '{@link ca.carleton.sce.puma.CSM.SequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Type</em>'.
	 * @see ca.carleton.sce.puma.CSM.SequenceType
	 * @generated
	 */
	EClass getSequenceType();

	/**
	 * Returns the meta object for class '{@link ca.carleton.sce.puma.CSM.StartType <em>Start Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Type</em>'.
	 * @see ca.carleton.sce.puma.CSM.StartType
	 * @generated
	 */
	EClass getStartType();

	/**
	 * Returns the meta object for the containment reference '{@link ca.carleton.sce.puma.CSM.StartType#getClosedWorkload <em>Closed Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Closed Workload</em>'.
	 * @see ca.carleton.sce.puma.CSM.StartType#getClosedWorkload()
	 * @see #getStartType()
	 * @generated
	 */
	EReference getStartType_ClosedWorkload();

	/**
	 * Returns the meta object for the containment reference '{@link ca.carleton.sce.puma.CSM.StartType#getOpenWorkload <em>Open Workload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Open Workload</em>'.
	 * @see ca.carleton.sce.puma.CSM.StartType#getOpenWorkload()
	 * @see #getStartType()
	 * @generated
	 */
	EReference getStartType_OpenWorkload();

	/**
	 * Returns the meta object for the reference '{@link ca.carleton.sce.puma.CSM.StartType#getInBinding <em>In Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Binding</em>'.
	 * @see ca.carleton.sce.puma.CSM.StartType#getInBinding()
	 * @see #getStartType()
	 * @generated
	 */
	EReference getStartType_InBinding();

	/**
	 * Returns the meta object for class '{@link ca.carleton.sce.puma.CSM.StepType <em>Step Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step Type</em>'.
	 * @see ca.carleton.sce.puma.CSM.StepType
	 * @generated
	 */
	EClass getStepType();

	/**
	 * Returns the meta object for the containment reference '{@link ca.carleton.sce.puma.CSM.StepType#getRefinement <em>Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Refinement</em>'.
	 * @see ca.carleton.sce.puma.CSM.StepType#getRefinement()
	 * @see #getStepType()
	 * @generated
	 */
	EReference getStepType_Refinement();

	/**
	 * Returns the meta object for the containment reference '{@link ca.carleton.sce.puma.CSM.StepType#getExternalDemand <em>External Demand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>External Demand</em>'.
	 * @see ca.carleton.sce.puma.CSM.StepType#getExternalDemand()
	 * @see #getStepType()
	 * @generated
	 */
	EReference getStepType_ExternalDemand();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.StepType#getBlockT <em>Block T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block T</em>'.
	 * @see ca.carleton.sce.puma.CSM.StepType#getBlockT()
	 * @see #getStepType()
	 * @generated
	 */
	EAttribute getStepType_BlockT();

	/**
	 * Returns the meta object for the reference '{@link ca.carleton.sce.puma.CSM.StepType#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see ca.carleton.sce.puma.CSM.StepType#getComponent()
	 * @see #getStepType()
	 * @generated
	 */
	EReference getStepType_Component();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.StepType#getHostDemand <em>Host Demand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Demand</em>'.
	 * @see ca.carleton.sce.puma.CSM.StepType#getHostDemand()
	 * @see #getStepType()
	 * @generated
	 */
	EAttribute getStepType_HostDemand();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.StepType#getNosync <em>Nosync</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nosync</em>'.
	 * @see ca.carleton.sce.puma.CSM.StepType#getNosync()
	 * @see #getStepType()
	 * @generated
	 */
	EAttribute getStepType_Nosync();

	/**
	 * Returns the meta object for the reference '{@link ca.carleton.sce.puma.CSM.StepType#getPredecessor <em>Predecessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Predecessor</em>'.
	 * @see ca.carleton.sce.puma.CSM.StepType#getPredecessor()
	 * @see #getStepType()
	 * @generated
	 */
	EReference getStepType_Predecessor();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.StepType#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see ca.carleton.sce.puma.CSM.StepType#getProbability()
	 * @see #getStepType()
	 * @generated
	 */
	EAttribute getStepType_Probability();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.StepType#getRepetitionCount <em>Repetition Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repetition Count</em>'.
	 * @see ca.carleton.sce.puma.CSM.StepType#getRepetitionCount()
	 * @see #getStepType()
	 * @generated
	 */
	EAttribute getStepType_RepetitionCount();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.StepType#getRespT <em>Resp T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resp T</em>'.
	 * @see ca.carleton.sce.puma.CSM.StepType#getRespT()
	 * @see #getStepType()
	 * @generated
	 */
	EAttribute getStepType_RespT();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.StepType#getStepKind <em>Step Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Kind</em>'.
	 * @see ca.carleton.sce.puma.CSM.StepType#getStepKind()
	 * @see #getStepType()
	 * @generated
	 */
	EAttribute getStepType_StepKind();

	/**
	 * Returns the meta object for the reference '{@link ca.carleton.sce.puma.CSM.StepType#getSuccessor <em>Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Successor</em>'.
	 * @see ca.carleton.sce.puma.CSM.StepType#getSuccessor()
	 * @see #getStepType()
	 * @generated
	 */
	EReference getStepType_Successor();

	/**
	 * Returns the meta object for class '{@link ca.carleton.sce.puma.CSM.VariableType <em>Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Type</em>'.
	 * @see ca.carleton.sce.puma.CSM.VariableType
	 * @generated
	 */
	EClass getVariableType();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.VariableType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ca.carleton.sce.puma.CSM.VariableType#getDescription()
	 * @see #getVariableType()
	 * @generated
	 */
	EAttribute getVariableType_Description();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.VariableType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ca.carleton.sce.puma.CSM.VariableType#getName()
	 * @see #getVariableType()
	 * @generated
	 */
	EAttribute getVariableType_Name();

	/**
	 * Returns the meta object for class '{@link ca.carleton.sce.puma.CSM.WorkloadType <em>Workload Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workload Type</em>'.
	 * @see ca.carleton.sce.puma.CSM.WorkloadType
	 * @generated
	 */
	EClass getWorkloadType();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.WorkloadType#getArrivalParam1 <em>Arrival Param1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arrival Param1</em>'.
	 * @see ca.carleton.sce.puma.CSM.WorkloadType#getArrivalParam1()
	 * @see #getWorkloadType()
	 * @generated
	 */
	EAttribute getWorkloadType_ArrivalParam1();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.WorkloadType#getArrivalParam2 <em>Arrival Param2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arrival Param2</em>'.
	 * @see ca.carleton.sce.puma.CSM.WorkloadType#getArrivalParam2()
	 * @see #getWorkloadType()
	 * @generated
	 */
	EAttribute getWorkloadType_ArrivalParam2();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.WorkloadType#getArrivalProcess <em>Arrival Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arrival Process</em>'.
	 * @see ca.carleton.sce.puma.CSM.WorkloadType#getArrivalProcess()
	 * @see #getWorkloadType()
	 * @generated
	 */
	EAttribute getWorkloadType_ArrivalProcess();

	/**
	 * Returns the meta object for the attribute '{@link ca.carleton.sce.puma.CSM.WorkloadType#getExternalDelay <em>External Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Delay</em>'.
	 * @see ca.carleton.sce.puma.CSM.WorkloadType#getExternalDelay()
	 * @see #getWorkloadType()
	 * @generated
	 */
	EAttribute getWorkloadType_ExternalDelay();

	/**
	 * Returns the meta object for the reference list '{@link ca.carleton.sce.puma.CSM.WorkloadType#getResponseTimeList <em>Response Time List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Response Time List</em>'.
	 * @see ca.carleton.sce.puma.CSM.WorkloadType#getResponseTimeList()
	 * @see #getWorkloadType()
	 * @generated
	 */
	EReference getWorkloadType_ResponseTimeList();

	/**
	 * Returns the meta object for enum '{@link ca.carleton.sce.puma.CSM.ArrivalProcess <em>Arrival Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Arrival Process</em>'.
	 * @see ca.carleton.sce.puma.CSM.ArrivalProcess
	 * @generated
	 */
	EEnum getArrivalProcess();

	/**
	 * Returns the meta object for enum '{@link ca.carleton.sce.puma.CSM.MsgKind <em>Msg Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Msg Kind</em>'.
	 * @see ca.carleton.sce.puma.CSM.MsgKind
	 * @generated
	 */
	EEnum getMsgKind();

	/**
	 * Returns the meta object for enum '{@link ca.carleton.sce.puma.CSM.PerfMeasureKind <em>Perf Measure Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Perf Measure Kind</em>'.
	 * @see ca.carleton.sce.puma.CSM.PerfMeasureKind
	 * @generated
	 */
	EEnum getPerfMeasureKind();

	/**
	 * Returns the meta object for enum '{@link ca.carleton.sce.puma.CSM.PerfValueKind <em>Perf Value Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Perf Value Kind</em>'.
	 * @see ca.carleton.sce.puma.CSM.PerfValueKind
	 * @generated
	 */
	EEnum getPerfValueKind();

	/**
	 * Returns the meta object for enum '{@link ca.carleton.sce.puma.CSM.PerfValueSource <em>Perf Value Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Perf Value Source</em>'.
	 * @see ca.carleton.sce.puma.CSM.PerfValueSource
	 * @generated
	 */
	EEnum getPerfValueSource();

	/**
	 * Returns the meta object for enum '{@link ca.carleton.sce.puma.CSM.StepKind <em>Step Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Step Kind</em>'.
	 * @see ca.carleton.sce.puma.CSM.StepKind
	 * @generated
	 */
	EEnum getStepKind();

	/**
	 * Returns the meta object for enum '{@link ca.carleton.sce.puma.CSM.SynchronizationKind <em>Synchronization Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Synchronization Kind</em>'.
	 * @see ca.carleton.sce.puma.CSM.SynchronizationKind
	 * @generated
	 */
	EEnum getSynchronizationKind();

	/**
	 * Returns the meta object for data type '{@link ca.carleton.sce.puma.CSM.ArrivalProcess <em>Arrival Process Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Arrival Process Object</em>'.
	 * @see ca.carleton.sce.puma.CSM.ArrivalProcess
	 * @model instanceClass="ca.carleton.sce.puma.CSM.ArrivalProcess"
	 *        extendedMetaData="name='ArrivalProcess:Object' baseType='ArrivalProcess'"
	 * @generated
	 */
	EDataType getArrivalProcessObject();

	/**
	 * Returns the meta object for data type '{@link ca.carleton.sce.puma.CSM.MsgKind <em>Msg Kind Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Msg Kind Object</em>'.
	 * @see ca.carleton.sce.puma.CSM.MsgKind
	 * @model instanceClass="ca.carleton.sce.puma.CSM.MsgKind"
	 *        extendedMetaData="name='MsgKind:Object' baseType='MsgKind'"
	 * @generated
	 */
	EDataType getMsgKindObject();

	/**
	 * Returns the meta object for data type '{@link ca.carleton.sce.puma.CSM.PerfMeasureKind <em>Perf Measure Kind Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Perf Measure Kind Object</em>'.
	 * @see ca.carleton.sce.puma.CSM.PerfMeasureKind
	 * @model instanceClass="ca.carleton.sce.puma.CSM.PerfMeasureKind"
	 *        extendedMetaData="name='PerfMeasureKind:Object' baseType='PerfMeasureKind'"
	 * @generated
	 */
	EDataType getPerfMeasureKindObject();

	/**
	 * Returns the meta object for data type '{@link ca.carleton.sce.puma.CSM.PerfValueKind <em>Perf Value Kind Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Perf Value Kind Object</em>'.
	 * @see ca.carleton.sce.puma.CSM.PerfValueKind
	 * @model instanceClass="ca.carleton.sce.puma.CSM.PerfValueKind"
	 *        extendedMetaData="name='PerfValueKind:Object' baseType='PerfValueKind'"
	 * @generated
	 */
	EDataType getPerfValueKindObject();

	/**
	 * Returns the meta object for data type '{@link ca.carleton.sce.puma.CSM.PerfValueSource <em>Perf Value Source Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Perf Value Source Object</em>'.
	 * @see ca.carleton.sce.puma.CSM.PerfValueSource
	 * @model instanceClass="ca.carleton.sce.puma.CSM.PerfValueSource"
	 *        extendedMetaData="name='PerfValueSource:Object' baseType='PerfValueSource'"
	 * @generated
	 */
	EDataType getPerfValueSourceObject();

	/**
	 * Returns the meta object for data type '{@link ca.carleton.sce.puma.CSM.StepKind <em>Step Kind Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Step Kind Object</em>'.
	 * @see ca.carleton.sce.puma.CSM.StepKind
	 * @model instanceClass="ca.carleton.sce.puma.CSM.StepKind"
	 *        extendedMetaData="name='StepKind:Object' baseType='StepKind'"
	 * @generated
	 */
	EDataType getStepKindObject();

	/**
	 * Returns the meta object for data type '{@link ca.carleton.sce.puma.CSM.SynchronizationKind <em>Synchronization Kind Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Synchronization Kind Object</em>'.
	 * @see ca.carleton.sce.puma.CSM.SynchronizationKind
	 * @model instanceClass="ca.carleton.sce.puma.CSM.SynchronizationKind"
	 *        extendedMetaData="name='SynchronizationKind:Object' baseType='SynchronizationKind'"
	 * @generated
	 */
	EDataType getSynchronizationKindObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CSMFactory getCSMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ca.carleton.sce.puma.CSM.impl.ActiveResourceTypeImpl <em>Active Resource Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.impl.ActiveResourceTypeImpl
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getActiveResourceType()
		 * @generated
		 */
		EClass ACTIVE_RESOURCE_TYPE = eINSTANCE.getActiveResourceType();

		/**
		 * The meta object literal for the '<em><b>Op Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVE_RESOURCE_TYPE__OP_TIME = eINSTANCE.getActiveResourceType_OpTime();

		/**
		 * The meta object literal for the '{@link ca.carleton.sce.puma.CSM.impl.AspectStepTypeImpl <em>Aspect Step Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.impl.AspectStepTypeImpl
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getAspectStepType()
		 * @generated
		 */
		EClass ASPECT_STEP_TYPE = eINSTANCE.getAspectStepType();

		/**
		 * The meta object literal for the '<em><b>Aspect Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASPECT_STEP_TYPE__ASPECT_DEFINITION = eINSTANCE.getAspectStepType_AspectDefinition();

		/**
		 * The meta object literal for the '{@link ca.carleton.sce.puma.CSM.impl.BranchTypeImpl <em>Branch Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.impl.BranchTypeImpl
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getBranchType()
		 * @generated
		 */
		EClass BRANCH_TYPE = eINSTANCE.getBranchType();

		/**
		 * The meta object literal for the '{@link ca.carleton.sce.puma.CSM.impl.ClosedWorkloadTypeImpl <em>Closed Workload Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.impl.ClosedWorkloadTypeImpl
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getClosedWorkloadType()
		 * @generated
		 */
		EClass CLOSED_WORKLOAD_TYPE = eINSTANCE.getClosedWorkloadType();

		/**
		 * The meta object literal for the '<em><b>Population</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOSED_WORKLOAD_TYPE__POPULATION = eINSTANCE.getClosedWorkloadType_Population();

		/**
		 * The meta object literal for the '{@link ca.carleton.sce.puma.CSM.impl.CommLinkTypeImpl <em>Comm Link Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.impl.CommLinkTypeImpl
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getCommLinkType()
		 * @generated
		 */
		EClass COMM_LINK_TYPE = eINSTANCE.getCommLinkType();

		/**
		 * The meta object literal for the '<em><b>Block T</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMM_LINK_TYPE__BLOCK_T = eINSTANCE.getCommLinkType_BlockT();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMM_LINK_TYPE__CAPACITY = eINSTANCE.getCommLinkType_Capacity();

		/**
		 * The meta object literal for the '<em><b>Processing Host List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMM_LINK_TYPE__PROCESSING_HOST_LIST = eINSTANCE.getCommLinkType_ProcessingHostList();

		/**
		 * The meta object literal for the '<em><b>Res Mult</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMM_LINK_TYPE__RES_MULT = eINSTANCE.getCommLinkType_ResMult();

		/**
		 * The meta object literal for the '<em><b>Speed Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMM_LINK_TYPE__SPEED_FACTOR = eINSTANCE.getCommLinkType_SpeedFactor();

		/**
		 * The meta object literal for the '{@link ca.carleton.sce.puma.CSM.impl.CommStepTypeImpl <em>Comm Step Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.impl.CommStepTypeImpl
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getCommStepType()
		 * @generated
		 */
		EClass COMM_STEP_TYPE = eINSTANCE.getCommStepType();

		/**
		 * The meta object literal for the '<em><b>Comm Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMM_STEP_TYPE__COMM_LINK = eINSTANCE.getCommStepType_CommLink();

		/**
		 * The meta object literal for the '<em><b>Msg Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMM_STEP_TYPE__MSG_KIND = eINSTANCE.getCommStepType_MsgKind();

		/**
		 * The meta object literal for the '<em><b>Msg Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMM_STEP_TYPE__MSG_SIZE = eINSTANCE.getCommStepType_MsgSize();

		/**
		 * The meta object literal for the '<em><b>Pred Comm Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMM_STEP_TYPE__PRED_COMM_STEP = eINSTANCE.getCommStepType_PredCommStep();

		/**
		 * The meta object literal for the '<em><b>Rcv Comp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMM_STEP_TYPE__RCV_COMP = eINSTANCE.getCommStepType_RcvComp();

		/**
		 * The meta object literal for the '<em><b>Succ Comm Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMM_STEP_TYPE__SUCC_COMM_STEP = eINSTANCE.getCommStepType_SuccCommStep();

		/**
		 * The meta object literal for the '<em><b>Tx Comp</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMM_STEP_TYPE__TX_COMP = eINSTANCE.getCommStepType_TxComp();

		/**
		 * The meta object literal for the '{@link ca.carleton.sce.puma.CSM.impl.ComponentTypeImpl <em>Component Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.impl.ComponentTypeImpl
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getComponentType()
		 * @generated
		 */
		EClass COMPONENT_TYPE = eINSTANCE.getComponentType();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__HOST = eINSTANCE.getComponentType_Host();

		/**
		 * The meta object literal for the '<em><b>Is Active Process</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_TYPE__IS_ACTIVE_PROCESS = eINSTANCE.getComponentType_IsActiveProcess();

		/**
		 * The meta object literal for the '<em><b>Parent Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__PARENT_COMPONENT = eINSTANCE.getComponentType_ParentComponent();

		/**
		 * The meta object literal for the '<em><b>Sub Component List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_TYPE__SUB_COMPONENT_LIST = eINSTANCE.getComponentType_SubComponentList();

		/**
		 * The meta object literal for the '{@link ca.carleton.sce.puma.CSM.impl.CSMElementTypeImpl <em>Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.impl.CSMElementTypeImpl
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getCSMElementType()
		 * @generated
		 */
		EClass CSM_ELEMENT_TYPE = eINSTANCE.getCSMElementType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSM_ELEMENT_TYPE__DESCRIPTION = eINSTANCE.getCSMElementType_Description();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSM_ELEMENT_TYPE__ID = eINSTANCE.getCSMElementType_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSM_ELEMENT_TYPE__NAME = eINSTANCE.getCSMElementType_Name();

		/**
		 * The meta object literal for the '<em><b>Traceability Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSM_ELEMENT_TYPE__TRACEABILITY_LINK = eINSTANCE.getCSMElementType_TraceabilityLink();

		/**
		 * The meta object literal for the '{@link ca.carleton.sce.puma.CSM.impl.CSMTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.impl.CSMTypeImpl
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getCSMType()
		 * @generated
		 */
		EClass CSM_TYPE = eINSTANCE.getCSMType();

		/**
		 * The meta object literal for the '<em><b>Scenario List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM_TYPE__SCENARIO_LIST = eINSTANCE.getCSMType_ScenarioList();

		/**
		 * The meta object literal for the '<em><b>Component List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM_TYPE__COMPONENT_LIST = eINSTANCE.getCSMType_ComponentList();

		/**
		 * The meta object literal for the '<em><b>Comm Link List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM_TYPE__COMM_LINK_LIST = eINSTANCE.getCSMType_CommLinkList();

		/**
		 * The meta object literal for the '<em><b>Processing Resource List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM_TYPE__PROCESSING_RESOURCE_LIST = eINSTANCE.getCSMType_ProcessingResourceList();

		/**
		 * The meta object literal for the '<em><b>Perf Measure List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM_TYPE__PERF_MEASURE_LIST = eINSTANCE.getCSMType_PerfMeasureList();

		/**
		 * The meta object literal for the '<em><b>Logical Resource List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM_TYPE__LOGICAL_RESOURCE_LIST = eINSTANCE.getCSMType_LogicalResourceList();

		/**
		 * The meta object literal for the '<em><b>Variable List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CSM_TYPE__VARIABLE_LIST = eINSTANCE.getCSMType_VariableList();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSM_TYPE__AUTHOR = eINSTANCE.getCSMType_Author();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSM_TYPE__CREATED = eINSTANCE.getCSMType_Created();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSM_TYPE__DESCRIPTION = eINSTANCE.getCSMType_Description();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSM_TYPE__MODIFIED = eINSTANCE.getCSMType_Modified();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSM_TYPE__NAME = eINSTANCE.getCSMType_Name();

		/**
		 * The meta object literal for the '<em><b>Traceability Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSM_TYPE__TRACEABILITY_LINK = eINSTANCE.getCSMType_TraceabilityLink();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CSM_TYPE__VERSION = eINSTANCE.getCSMType_Version();

		/**
		 * The meta object literal for the '{@link ca.carleton.sce.puma.CSM.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.impl.DocumentRootImpl
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>CSM</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CSM = eINSTANCE.getDocumentRoot_CSM();

		/**
		 * The meta object literal for the '{@link ca.carleton.sce.puma.CSM.impl.EndTypeImpl <em>End Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.impl.EndTypeImpl
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getEndType()
		 * @generated
		 */
		EClass END_TYPE = eINSTANCE.getEndType();

		/**
		 * The meta object literal for the '<em><b>Out Binding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference END_TYPE__OUT_BINDING = eINSTANCE.getEndType_OutBinding();

		/**
		 * The meta object literal for the '{@link ca.carleton.sce.puma.CSM.impl.ExternalDemandTypeImpl <em>External Demand Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.impl.ExternalDemandTypeImpl
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getExternalDemandType()
		 * @generated
		 */
		EClass EXTERNAL_DEMAND_TYPE = eINSTANCE.getExternalDemandType();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_DEMAND_TYPE__COUNT = eINSTANCE.getExternalDemandType_Count();

		/**
		 * The meta object literal for the '<em><b>External Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_DEMAND_TYPE__EXTERNAL_OPERATION = eINSTANCE.getExternalDemandType_ExternalOperation();

		/**
		 * The meta object literal for the '{@link ca.carleton.sce.puma.CSM.impl.ForkTypeImpl <em>Fork Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.impl.ForkTypeImpl
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getForkType()
		 * @generated
		 */
		EClass FORK_TYPE = eINSTANCE.getForkType();

		/**
		 * The meta object literal for the '{@link ca.carleton.sce.puma.CSM.impl.GeneralResourceTypeImpl <em>General Resource Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.impl.GeneralResourceTypeImpl
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getGeneralResourceType()
		 * @generated
		 */
		EClass GENERAL_RESOURCE_TYPE = eINSTANCE.getGeneralResourceType();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERAL_RESOURCE_TYPE__MULTIPLICITY = eINSTANCE.getGeneralResourceType_Multiplicity();

		/**
		 * The meta object literal for the '<em><b>Perf Measure List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERAL_RESOURCE_TYPE__PERF_MEASURE_LIST = eINSTANCE.getGeneralResourceType_PerfMeasureList();

		/**
		 * The meta object literal for the '<em><b>Sched Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERAL_RESOURCE_TYPE__SCHED_POLICY = eINSTANCE.getGeneralResourceType_SchedPolicy();

		/**
		 * The meta object literal for the '{@link ca.carleton.sce.puma.CSM.impl.InBindingTypeImpl <em>In Binding Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.impl.InBindingTypeImpl
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getInBindingType()
		 * @generated
		 */
		EClass IN_BINDING_TYPE = eINSTANCE.getInBindingType();

		/**
		 * The meta object literal for the '<em><b>In Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IN_BINDING_TYPE__IN_STEP = eINSTANCE.getInBindingType_InStep();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IN_BINDING_TYPE__START = eINSTANCE.getInBindingType_Start();

		/**
		 * The meta object literal for the '{@link ca.carleton.sce.puma.CSM.impl.JoinTypeImpl <em>Join Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.impl.JoinTypeImpl
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getJoinType()
		 * @generated
		 */
		EClass JOIN_TYPE = eINSTANCE.getJoinType();

		/**
		 * The meta object literal for the '{@link ca.carleton.sce.puma.CSM.impl.LogicalResourceTypeImpl <em>Logical Resource Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.impl.LogicalResourceTypeImpl
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getLogicalResourceType()
		 * @generated
		 */
		EClass LOGICAL_RESOURCE_TYPE = eINSTANCE.getLogicalResourceType();

		/**
		 * The meta object literal for the '<em><b>Nested Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_RESOURCE_TYPE__NESTED_ONLY = eINSTANCE.getLogicalResourceType_NestedOnly();

		/**
		 * The meta object literal for the '{@link ca.carleton.sce.puma.CSM.impl.MergeTypeImpl <em>Merge Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.impl.MergeTypeImpl
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getMergeType()
		 * @generated
		 */
		EClass MERGE_TYPE = eINSTANCE.getMergeType();

		/**
		 * The meta object literal for the '{@link ca.carleton.sce.puma.CSM.impl.OpenWorkloadTypeImpl <em>Open Workload Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.impl.OpenWorkloadTypeImpl
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getOpenWorkloadType()
		 * @generated
		 */
		EClass OPEN_WORKLOAD_TYPE = eINSTANCE.getOpenWorkloadType();

		/**
		 * The meta object literal for the '{@link ca.carleton.sce.puma.CSM.impl.OutBindingTypeImpl <em>Out Binding Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.impl.OutBindingTypeImpl
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getOutBindingType()
		 * @generated
		 */
		EClass OUT_BINDING_TYPE = eINSTANCE.getOutBindingType();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUT_BINDING_TYPE__END = eINSTANCE.getOutBindingType_End();

		/**
		 * The meta object literal for the '<em><b>Out Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUT_BINDING_TYPE__OUT_STEP = eINSTANCE.getOutBindingType_OutStep();

		/**
		 * The meta object literal for the '{@link ca.carleton.sce.puma.CSM.impl.PathConnectionTypeImpl <em>Path Connection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.impl.PathConnectionTypeImpl
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getPathConnectionType()
		 * @generated
		 */
		EClass PATH_CONNECTION_TYPE = eINSTANCE.getPathConnectionType();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_CONNECTION_TYPE__SOURCE = eINSTANCE.getPathConnectionType_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATH_CONNECTION_TYPE__TARGET = eINSTANCE.getPathConnectionType_Target();

		/**
		 * The meta object literal for the '{@link ca.carleton.sce.puma.CSM.impl.PerfMeasureTypeImpl <em>Perf Measure Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.impl.PerfMeasureTypeImpl
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getPerfMeasureType()
		 * @generated
		 */
		EClass PERF_MEASURE_TYPE = eINSTANCE.getPerfMeasureType();

		/**
		 * The meta object literal for the '<em><b>Perf Value List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERF_MEASURE_TYPE__PERF_VALUE_LIST = eINSTANCE.getPerfMeasureType_PerfValueList();

		/**
		 * The meta object literal for the '<em><b>Duration Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERF_MEASURE_TYPE__DURATION_OF = eINSTANCE.getPerfMeasureType_DurationOf();

		/**
		 * The meta object literal for the '<em><b>Measure Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERF_MEASURE_TYPE__MEASURE_KIND = eINSTANCE.getPerfMeasureType_MeasureKind();

		/**
		 * The meta object literal for the '<em><b>Pred Perf Measure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERF_MEASURE_TYPE__PRED_PERF_MEASURE = eINSTANCE.getPerfMeasureType_PredPerfMeasure();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERF_MEASURE_TYPE__RESOURCE = eINSTANCE.getPerfMeasureType_Resource();

		/**
		 * The meta object literal for the '<em><b>Stopped By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERF_MEASURE_TYPE__STOPPED_BY = eINSTANCE.getPerfMeasureType_StoppedBy();

		/**
		 * The meta object literal for the '<em><b>Succ Perf Measure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERF_MEASURE_TYPE__SUCC_PERF_MEASURE = eINSTANCE.getPerfMeasureType_SuccPerfMeasure();

		/**
		 * The meta object literal for the '<em><b>Triggered By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERF_MEASURE_TYPE__TRIGGERED_BY = eINSTANCE.getPerfMeasureType_TriggeredBy();

		/**
		 * The meta object literal for the '{@link ca.carleton.sce.puma.CSM.impl.PerfValueTypeImpl <em>Perf Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.impl.PerfValueTypeImpl
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getPerfValueType()
		 * @generated
		 */
		EClass PERF_VALUE_TYPE = eINSTANCE.getPerfValueType();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERF_VALUE_TYPE__KIND = eINSTANCE.getPerfValueType_Kind();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERF_VALUE_TYPE__SOURCE = eINSTANCE.getPerfValueType_Source();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERF_VALUE_TYPE__VALUE = eINSTANCE.getPerfValueType_Value();

		/**
		 * The meta object literal for the '{@link ca.carleton.sce.puma.CSM.impl.ProcessingResourceTypeImpl <em>Processing Resource Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.impl.ProcessingResourceTypeImpl
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getProcessingResourceType()
		 * @generated
		 */
		EClass PROCESSING_RESOURCE_TYPE = eINSTANCE.getProcessingResourceType();

		/**
		 * The meta object literal for the '<em><b>Comm Link List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_RESOURCE_TYPE__COMM_LINK_LIST = eINSTANCE.getProcessingResourceType_CommLinkList();

		/**
		 * The meta object literal for the '<em><b>Comm Rcv Ovh</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_RESOURCE_TYPE__COMM_RCV_OVH = eINSTANCE.getProcessingResourceType_CommRcvOvh();

		/**
		 * The meta object literal for the '<em><b>Comm Tx Ovh</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_RESOURCE_TYPE__COMM_TX_OVH = eINSTANCE.getProcessingResourceType_CommTxOvh();

		/**
		 * The meta object literal for the '<em><b>Speed Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_RESOURCE_TYPE__SPEED_FACTOR = eINSTANCE.getProcessingResourceType_SpeedFactor();

		/**
		 * The meta object literal for the '{@link ca.carleton.sce.puma.CSM.impl.RefinementTypeImpl <em>Refinement Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.impl.RefinementTypeImpl
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getRefinementType()
		 * @generated
		 */
		EClass REFINEMENT_TYPE = eINSTANCE.getRefinementType();

		/**
		 * The meta object literal for the '<em><b>In Binding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINEMENT_TYPE__IN_BINDING = eINSTANCE.getRefinementType_InBinding();

		/**
		 * The meta object literal for the '<em><b>Out Binding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINEMENT_TYPE__OUT_BINDING = eINSTANCE.getRefinementType_OutBinding();

		/**
		 * The meta object literal for the '<em><b>Role Binding List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINEMENT_TYPE__ROLE_BINDING_LIST = eINSTANCE.getRefinementType_RoleBindingList();

		/**
		 * The meta object literal for the '<em><b>Parent Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINEMENT_TYPE__PARENT_STEP = eINSTANCE.getRefinementType_ParentStep();

		/**
		 * The meta object literal for the '<em><b>Sub Scenario</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFINEMENT_TYPE__SUB_SCENARIO = eINSTANCE.getRefinementType_SubScenario();

		/**
		 * The meta object literal for the '{@link ca.carleton.sce.puma.CSM.impl.ResourceAcquireTypeImpl <em>Resource Acquire Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.impl.ResourceAcquireTypeImpl
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getResourceAcquireType()
		 * @generated
		 */
		EClass RESOURCE_ACQUIRE_TYPE = eINSTANCE.getResourceAcquireType();

		/**
		 * The meta object literal for the '<em><b>Acquire</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ACQUIRE_TYPE__ACQUIRE = eINSTANCE.getResourceAcquireType_Acquire();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ACQUIRE_TYPE__PRIORITY = eINSTANCE.getResourceAcquireType_Priority();

		/**
		 * The meta object literal for the '<em><b>RUnits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ACQUIRE_TYPE__RUNITS = eINSTANCE.getResourceAcquireType_RUnits();

		/**
		 * The meta object literal for the '{@link ca.carleton.sce.puma.CSM.impl.ResourcePassTypeImpl <em>Resource Pass Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.impl.ResourcePassTypeImpl
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getResourcePassType()
		 * @generated
		 */
		EClass RESOURCE_PASS_TYPE = eINSTANCE.getResourcePassType();

		/**
		 * The meta object literal for the '<em><b>Pass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_PASS_TYPE__PASS = eINSTANCE.getResourcePassType_Pass();

		/**
		 * The meta object literal for the '<em><b>RUnits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_PASS_TYPE__RUNITS = eINSTANCE.getResourcePassType_RUnits();

		/**
		 * The meta object literal for the '{@link ca.carleton.sce.puma.CSM.impl.ResourceReleaseTypeImpl <em>Resource Release Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.impl.ResourceReleaseTypeImpl
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getResourceReleaseType()
		 * @generated
		 */
		EClass RESOURCE_RELEASE_TYPE = eINSTANCE.getResourceReleaseType();

		/**
		 * The meta object literal for the '<em><b>Release</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_RELEASE_TYPE__RELEASE = eINSTANCE.getResourceReleaseType_Release();

		/**
		 * The meta object literal for the '<em><b>RUnits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_RELEASE_TYPE__RUNITS = eINSTANCE.getResourceReleaseType_RUnits();

		/**
		 * The meta object literal for the '{@link ca.carleton.sce.puma.CSM.impl.RoleBindingTypeImpl <em>Role Binding Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.impl.RoleBindingTypeImpl
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getRoleBindingType()
		 * @generated
		 */
		EClass ROLE_BINDING_TYPE = eINSTANCE.getRoleBindingType();

		/**
		 * The meta object literal for the '<em><b>Element Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_BINDING_TYPE__ELEMENT_ID = eINSTANCE.getRoleBindingType_ElementId();

		/**
		 * The meta object literal for the '<em><b>Element Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_BINDING_TYPE__ELEMENT_NAME = eINSTANCE.getRoleBindingType_ElementName();

		/**
		 * The meta object literal for the '<em><b>Role Id</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_BINDING_TYPE__ROLE_ID = eINSTANCE.getRoleBindingType_RoleId();

		/**
		 * The meta object literal for the '<em><b>Role Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_BINDING_TYPE__ROLE_NAME = eINSTANCE.getRoleBindingType_RoleName();

		/**
		 * The meta object literal for the '{@link ca.carleton.sce.puma.CSM.impl.ScenarioElementTypeImpl <em>Scenario Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.impl.ScenarioElementTypeImpl
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getScenarioElementType()
		 * @generated
		 */
		EClass SCENARIO_ELEMENT_TYPE = eINSTANCE.getScenarioElementType();

		/**
		 * The meta object literal for the '<em><b>Duration Perf Measure List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO_ELEMENT_TYPE__DURATION_PERF_MEASURE_LIST = eINSTANCE.getScenarioElementType_DurationPerfMeasureList();

		/**
		 * The meta object literal for the '<em><b>Stop Perf Measure List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO_ELEMENT_TYPE__STOP_PERF_MEASURE_LIST = eINSTANCE.getScenarioElementType_StopPerfMeasureList();

		/**
		 * The meta object literal for the '<em><b>Trigger Perf Measure List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO_ELEMENT_TYPE__TRIGGER_PERF_MEASURE_LIST = eINSTANCE.getScenarioElementType_TriggerPerfMeasureList();

		/**
		 * The meta object literal for the '{@link ca.carleton.sce.puma.CSM.impl.ScenarioTypeImpl <em>Scenario Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.impl.ScenarioTypeImpl
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getScenarioType()
		 * @generated
		 */
		EClass SCENARIO_TYPE = eINSTANCE.getScenarioType();

		/**
		 * The meta object literal for the '<em><b>Step List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO_TYPE__STEP_LIST = eINSTANCE.getScenarioType_StepList();

		/**
		 * The meta object literal for the '<em><b>Comm Step List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO_TYPE__COMM_STEP_LIST = eINSTANCE.getScenarioType_CommStepList();

		/**
		 * The meta object literal for the '<em><b>Resource Acquire List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO_TYPE__RESOURCE_ACQUIRE_LIST = eINSTANCE.getScenarioType_ResourceAcquireList();

		/**
		 * The meta object literal for the '<em><b>Resource Release List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO_TYPE__RESOURCE_RELEASE_LIST = eINSTANCE.getScenarioType_ResourceReleaseList();

		/**
		 * The meta object literal for the '<em><b>Resource Pass List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO_TYPE__RESOURCE_PASS_LIST = eINSTANCE.getScenarioType_ResourcePassList();

		/**
		 * The meta object literal for the '<em><b>Aspect Step List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO_TYPE__ASPECT_STEP_LIST = eINSTANCE.getScenarioType_AspectStepList();

		/**
		 * The meta object literal for the '<em><b>Start List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO_TYPE__START_LIST = eINSTANCE.getScenarioType_StartList();

		/**
		 * The meta object literal for the '<em><b>End List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO_TYPE__END_LIST = eINSTANCE.getScenarioType_EndList();

		/**
		 * The meta object literal for the '<em><b>Sequence List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO_TYPE__SEQUENCE_LIST = eINSTANCE.getScenarioType_SequenceList();

		/**
		 * The meta object literal for the '<em><b>Branch List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO_TYPE__BRANCH_LIST = eINSTANCE.getScenarioType_BranchList();

		/**
		 * The meta object literal for the '<em><b>Merge List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO_TYPE__MERGE_LIST = eINSTANCE.getScenarioType_MergeList();

		/**
		 * The meta object literal for the '<em><b>Fork List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO_TYPE__FORK_LIST = eINSTANCE.getScenarioType_ForkList();

		/**
		 * The meta object literal for the '<em><b>Join List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO_TYPE__JOIN_LIST = eINSTANCE.getScenarioType_JoinList();

		/**
		 * The meta object literal for the '<em><b>Parent Refinement List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO_TYPE__PARENT_REFINEMENT_LIST = eINSTANCE.getScenarioType_ParentRefinementList();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO_TYPE__PROBABILITY = eINSTANCE.getScenarioType_Probability();

		/**
		 * The meta object literal for the '{@link ca.carleton.sce.puma.CSM.impl.SequenceTypeImpl <em>Sequence Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.impl.SequenceTypeImpl
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getSequenceType()
		 * @generated
		 */
		EClass SEQUENCE_TYPE = eINSTANCE.getSequenceType();

		/**
		 * The meta object literal for the '{@link ca.carleton.sce.puma.CSM.impl.StartTypeImpl <em>Start Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.impl.StartTypeImpl
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getStartType()
		 * @generated
		 */
		EClass START_TYPE = eINSTANCE.getStartType();

		/**
		 * The meta object literal for the '<em><b>Closed Workload</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_TYPE__CLOSED_WORKLOAD = eINSTANCE.getStartType_ClosedWorkload();

		/**
		 * The meta object literal for the '<em><b>Open Workload</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_TYPE__OPEN_WORKLOAD = eINSTANCE.getStartType_OpenWorkload();

		/**
		 * The meta object literal for the '<em><b>In Binding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_TYPE__IN_BINDING = eINSTANCE.getStartType_InBinding();

		/**
		 * The meta object literal for the '{@link ca.carleton.sce.puma.CSM.impl.StepTypeImpl <em>Step Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.impl.StepTypeImpl
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getStepType()
		 * @generated
		 */
		EClass STEP_TYPE = eINSTANCE.getStepType();

		/**
		 * The meta object literal for the '<em><b>Refinement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP_TYPE__REFINEMENT = eINSTANCE.getStepType_Refinement();

		/**
		 * The meta object literal for the '<em><b>External Demand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP_TYPE__EXTERNAL_DEMAND = eINSTANCE.getStepType_ExternalDemand();

		/**
		 * The meta object literal for the '<em><b>Block T</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP_TYPE__BLOCK_T = eINSTANCE.getStepType_BlockT();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP_TYPE__COMPONENT = eINSTANCE.getStepType_Component();

		/**
		 * The meta object literal for the '<em><b>Host Demand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP_TYPE__HOST_DEMAND = eINSTANCE.getStepType_HostDemand();

		/**
		 * The meta object literal for the '<em><b>Nosync</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP_TYPE__NOSYNC = eINSTANCE.getStepType_Nosync();

		/**
		 * The meta object literal for the '<em><b>Predecessor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP_TYPE__PREDECESSOR = eINSTANCE.getStepType_Predecessor();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP_TYPE__PROBABILITY = eINSTANCE.getStepType_Probability();

		/**
		 * The meta object literal for the '<em><b>Repetition Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP_TYPE__REPETITION_COUNT = eINSTANCE.getStepType_RepetitionCount();

		/**
		 * The meta object literal for the '<em><b>Resp T</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP_TYPE__RESP_T = eINSTANCE.getStepType_RespT();

		/**
		 * The meta object literal for the '<em><b>Step Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP_TYPE__STEP_KIND = eINSTANCE.getStepType_StepKind();

		/**
		 * The meta object literal for the '<em><b>Successor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP_TYPE__SUCCESSOR = eINSTANCE.getStepType_Successor();

		/**
		 * The meta object literal for the '{@link ca.carleton.sce.puma.CSM.impl.VariableTypeImpl <em>Variable Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.impl.VariableTypeImpl
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getVariableType()
		 * @generated
		 */
		EClass VARIABLE_TYPE = eINSTANCE.getVariableType();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_TYPE__DESCRIPTION = eINSTANCE.getVariableType_Description();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_TYPE__NAME = eINSTANCE.getVariableType_Name();

		/**
		 * The meta object literal for the '{@link ca.carleton.sce.puma.CSM.impl.WorkloadTypeImpl <em>Workload Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.impl.WorkloadTypeImpl
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getWorkloadType()
		 * @generated
		 */
		EClass WORKLOAD_TYPE = eINSTANCE.getWorkloadType();

		/**
		 * The meta object literal for the '<em><b>Arrival Param1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKLOAD_TYPE__ARRIVAL_PARAM1 = eINSTANCE.getWorkloadType_ArrivalParam1();

		/**
		 * The meta object literal for the '<em><b>Arrival Param2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKLOAD_TYPE__ARRIVAL_PARAM2 = eINSTANCE.getWorkloadType_ArrivalParam2();

		/**
		 * The meta object literal for the '<em><b>Arrival Process</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKLOAD_TYPE__ARRIVAL_PROCESS = eINSTANCE.getWorkloadType_ArrivalProcess();

		/**
		 * The meta object literal for the '<em><b>External Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKLOAD_TYPE__EXTERNAL_DELAY = eINSTANCE.getWorkloadType_ExternalDelay();

		/**
		 * The meta object literal for the '<em><b>Response Time List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKLOAD_TYPE__RESPONSE_TIME_LIST = eINSTANCE.getWorkloadType_ResponseTimeList();

		/**
		 * The meta object literal for the '{@link ca.carleton.sce.puma.CSM.ArrivalProcess <em>Arrival Process</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.ArrivalProcess
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getArrivalProcess()
		 * @generated
		 */
		EEnum ARRIVAL_PROCESS = eINSTANCE.getArrivalProcess();

		/**
		 * The meta object literal for the '{@link ca.carleton.sce.puma.CSM.MsgKind <em>Msg Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.MsgKind
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getMsgKind()
		 * @generated
		 */
		EEnum MSG_KIND = eINSTANCE.getMsgKind();

		/**
		 * The meta object literal for the '{@link ca.carleton.sce.puma.CSM.PerfMeasureKind <em>Perf Measure Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.PerfMeasureKind
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getPerfMeasureKind()
		 * @generated
		 */
		EEnum PERF_MEASURE_KIND = eINSTANCE.getPerfMeasureKind();

		/**
		 * The meta object literal for the '{@link ca.carleton.sce.puma.CSM.PerfValueKind <em>Perf Value Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.PerfValueKind
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getPerfValueKind()
		 * @generated
		 */
		EEnum PERF_VALUE_KIND = eINSTANCE.getPerfValueKind();

		/**
		 * The meta object literal for the '{@link ca.carleton.sce.puma.CSM.PerfValueSource <em>Perf Value Source</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.PerfValueSource
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getPerfValueSource()
		 * @generated
		 */
		EEnum PERF_VALUE_SOURCE = eINSTANCE.getPerfValueSource();

		/**
		 * The meta object literal for the '{@link ca.carleton.sce.puma.CSM.StepKind <em>Step Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.StepKind
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getStepKind()
		 * @generated
		 */
		EEnum STEP_KIND = eINSTANCE.getStepKind();

		/**
		 * The meta object literal for the '{@link ca.carleton.sce.puma.CSM.SynchronizationKind <em>Synchronization Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.SynchronizationKind
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getSynchronizationKind()
		 * @generated
		 */
		EEnum SYNCHRONIZATION_KIND = eINSTANCE.getSynchronizationKind();

		/**
		 * The meta object literal for the '<em>Arrival Process Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.ArrivalProcess
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getArrivalProcessObject()
		 * @generated
		 */
		EDataType ARRIVAL_PROCESS_OBJECT = eINSTANCE.getArrivalProcessObject();

		/**
		 * The meta object literal for the '<em>Msg Kind Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.MsgKind
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getMsgKindObject()
		 * @generated
		 */
		EDataType MSG_KIND_OBJECT = eINSTANCE.getMsgKindObject();

		/**
		 * The meta object literal for the '<em>Perf Measure Kind Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.PerfMeasureKind
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getPerfMeasureKindObject()
		 * @generated
		 */
		EDataType PERF_MEASURE_KIND_OBJECT = eINSTANCE.getPerfMeasureKindObject();

		/**
		 * The meta object literal for the '<em>Perf Value Kind Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.PerfValueKind
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getPerfValueKindObject()
		 * @generated
		 */
		EDataType PERF_VALUE_KIND_OBJECT = eINSTANCE.getPerfValueKindObject();

		/**
		 * The meta object literal for the '<em>Perf Value Source Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.PerfValueSource
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getPerfValueSourceObject()
		 * @generated
		 */
		EDataType PERF_VALUE_SOURCE_OBJECT = eINSTANCE.getPerfValueSourceObject();

		/**
		 * The meta object literal for the '<em>Step Kind Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.StepKind
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getStepKindObject()
		 * @generated
		 */
		EDataType STEP_KIND_OBJECT = eINSTANCE.getStepKindObject();

		/**
		 * The meta object literal for the '<em>Synchronization Kind Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.carleton.sce.puma.CSM.SynchronizationKind
		 * @see ca.carleton.sce.puma.CSM.impl.CSMPackageImpl#getSynchronizationKindObject()
		 * @generated
		 */
		EDataType SYNCHRONIZATION_KIND_OBJECT = eINSTANCE.getSynchronizationKindObject();

	}

} //CSMPackage
