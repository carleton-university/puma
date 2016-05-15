/**
 */
package ca.carleton.sce.puma.CSM.impl;

import ca.carleton.sce.puma.CSM.ActiveResourceType;
import ca.carleton.sce.puma.CSM.ArrivalProcess;
import ca.carleton.sce.puma.CSM.AspectStepType;
import ca.carleton.sce.puma.CSM.BranchType;
import ca.carleton.sce.puma.CSM.CSMElementType;
import ca.carleton.sce.puma.CSM.CSMFactory;
import ca.carleton.sce.puma.CSM.CSMPackage;
import ca.carleton.sce.puma.CSM.CSMType;
import ca.carleton.sce.puma.CSM.ClassifierType;
import ca.carleton.sce.puma.CSM.ClosedWorkloadType;
import ca.carleton.sce.puma.CSM.CommLinkType;
import ca.carleton.sce.puma.CSM.CommStepType;
import ca.carleton.sce.puma.CSM.CommunicationLinkType;
import ca.carleton.sce.puma.CSM.ComponentType;
import ca.carleton.sce.puma.CSM.ConstraintType;
import ca.carleton.sce.puma.CSM.DocumentRoot;
import ca.carleton.sce.puma.CSM.EndType;
import ca.carleton.sce.puma.CSM.ExternalDemandType;
import ca.carleton.sce.puma.CSM.ExternalOperationType;
import ca.carleton.sce.puma.CSM.ForkType;
import ca.carleton.sce.puma.CSM.GeneralResourceType;
import ca.carleton.sce.puma.CSM.InBindingType;
import ca.carleton.sce.puma.CSM.InputSetType;
import ca.carleton.sce.puma.CSM.JoinType;
import ca.carleton.sce.puma.CSM.LogicalResourceType;
import ca.carleton.sce.puma.CSM.MergeType;
import ca.carleton.sce.puma.CSM.MessageType;
import ca.carleton.sce.puma.CSM.MsgKind;
import ca.carleton.sce.puma.CSM.OpenWorkloadType;
import ca.carleton.sce.puma.CSM.OutBindingType;
import ca.carleton.sce.puma.CSM.OutputSetType;
import ca.carleton.sce.puma.CSM.PassiveResourceType;
import ca.carleton.sce.puma.CSM.PathConnectionType;
import ca.carleton.sce.puma.CSM.PerfMeasureKind;
import ca.carleton.sce.puma.CSM.PerfAttribute;
import ca.carleton.sce.puma.CSM.PerfMeasureType;
import ca.carleton.sce.puma.CSM.PerfValueKind;
import ca.carleton.sce.puma.CSM.PerfValueSource;
import ca.carleton.sce.puma.CSM.PerfValueType;
import ca.carleton.sce.puma.CSM.PostConditionType;
import ca.carleton.sce.puma.CSM.PreConditionType;
import ca.carleton.sce.puma.CSM.ProcessingResourceType;
import ca.carleton.sce.puma.CSM.RefinementType;
import ca.carleton.sce.puma.CSM.ResourceAcquireType;
import ca.carleton.sce.puma.CSM.ResourcePassType;
import ca.carleton.sce.puma.CSM.ResourceReleaseType;
import ca.carleton.sce.puma.CSM.RoleBindingType;
import ca.carleton.sce.puma.CSM.ScenarioElementType;
import ca.carleton.sce.puma.CSM.ScenarioType;
import ca.carleton.sce.puma.CSM.SequenceType;
import ca.carleton.sce.puma.CSM.StartType;
import ca.carleton.sce.puma.CSM.StepKind;
import ca.carleton.sce.puma.CSM.StepType;
import ca.carleton.sce.puma.CSM.SynchronizationKind;
import ca.carleton.sce.puma.CSM.VariableType;
import ca.carleton.sce.puma.CSM.WorkloadType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CSMPackageImpl extends EPackageImpl implements CSMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activeResourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aspectStepTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass branchTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass closedWorkloadTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commLinkTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commStepTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csmElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass csmTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalDemandTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalResourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inBindingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalResourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openWorkloadTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outBindingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathConnectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass perfMeasureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass perfValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processingResourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refinementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceAcquireTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourcePassTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceReleaseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleBindingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenarioElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenarioTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workloadTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum arrivalProcessEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum msgKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum perfMeasureKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum perfValueKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum perfValueSourceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stepKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum synchronizationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType arrivalProcessObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType msgKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType perfMeasureKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType perfValueKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType perfValueSourceObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stepKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType synchronizationKindObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CSMPackageImpl() {
		super(eNS_URI, CSMFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CSMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CSMPackage init() {
		if (isInited) return (CSMPackage)EPackage.Registry.INSTANCE.getEPackage(CSMPackage.eNS_URI);

		// Obtain or create and register package
		CSMPackageImpl theCSMPackage = (CSMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CSMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CSMPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCSMPackage.createPackageContents();

		// Initialize created meta-data
		theCSMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCSMPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CSMPackage.eNS_URI, theCSMPackage);
		return theCSMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActiveResourceType() {
		return activeResourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActiveResourceType_OpTime() {
		return (EAttribute)activeResourceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAspectStepType() {
		return aspectStepTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAspectStepType_AspectDefinition() {
		return (EAttribute)aspectStepTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBranchType() {
		return branchTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClosedWorkloadType() {
		return closedWorkloadTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClosedWorkloadType_Population() {
		return (EAttribute)closedWorkloadTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommLinkType() {
		return commLinkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommLinkType_BlockT() {
		return (EAttribute)commLinkTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommLinkType_Capacity() {
		return (EAttribute)commLinkTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommLinkType_ProcessingHostList() {
		return (EReference)commLinkTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommLinkType_ResMult() {
		return (EAttribute)commLinkTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommLinkType_SpeedFactor() {
		return (EAttribute)commLinkTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommStepType() {
		return commStepTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommStepType_CommLink() {
		return (EReference)commStepTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommStepType_MsgKind() {
		return (EAttribute)commStepTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommStepType_MsgSize() {
		return (EAttribute)commStepTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommStepType_PredCommStep() {
		return (EReference)commStepTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommStepType_RcvComp() {
		return (EReference)commStepTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommStepType_SuccCommStep() {
		return (EReference)commStepTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommStepType_TxComp() {
		return (EReference)commStepTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentType() {
		return componentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentType_Host() {
		return (EReference)componentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentType_IsActiveProcess() {
		return (EAttribute)componentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentType_ParentComponent() {
		return (EReference)componentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentType_SubComponentList() {
		return (EReference)componentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSMElementType() {
		return csmElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSMElementType_Description() {
		return (EAttribute)csmElementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSMElementType_Id() {
		return (EAttribute)csmElementTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSMElementType_Name() {
		return (EAttribute)csmElementTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSMElementType_TraceabilityLink() {
		return (EAttribute)csmElementTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCSMType() {
		return csmTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSMType_ScenarioList() {
		return (EReference)csmTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSMType_ComponentList() {
		return (EReference)csmTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSMType_CommLinkList() {
		return (EReference)csmTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSMType_ProcessingResourceList() {
		return (EReference)csmTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSMType_PerfMeasureList() {
		return (EReference)csmTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSMType_LogicalResourceList() {
		return (EReference)csmTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCSMType_VariableList() {
		return (EReference)csmTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSMType_Author() {
		return (EAttribute)csmTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSMType_Created() {
		return (EAttribute)csmTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSMType_Description() {
		return (EAttribute)csmTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSMType_Modified() {
		return (EAttribute)csmTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSMType_Name() {
		return (EAttribute)csmTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSMType_TraceabilityLink() {
		return (EAttribute)csmTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCSMType_Version() {
		return (EAttribute)csmTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CSM() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndType() {
		return endTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndType_OutBinding() {
		return (EReference)endTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalDemandType() {
		return externalDemandTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalDemandType_Count() {
		return (EAttribute)externalDemandTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalDemandType_ExternalOperation() {
		return (EAttribute)externalDemandTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForkType() {
		return forkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralResourceType() {
		return generalResourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralResourceType_Multiplicity() {
		return (EAttribute)generalResourceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralResourceType_PerfMeasureList() {
		return (EReference)generalResourceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralResourceType_SchedPolicy() {
		return (EAttribute)generalResourceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInBindingType() {
		return inBindingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInBindingType_InStep() {
		return (EReference)inBindingTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInBindingType_Start() {
		return (EReference)inBindingTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinType() {
		return joinTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalResourceType() {
		return logicalResourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalResourceType_NestedOnly() {
		return (EAttribute)logicalResourceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMergeType() {
		return mergeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenWorkloadType() {
		return openWorkloadTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutBindingType() {
		return outBindingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutBindingType_End() {
		return (EReference)outBindingTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutBindingType_OutStep() {
		return (EReference)outBindingTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathConnectionType() {
		return pathConnectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathConnectionType_Source() {
		return (EReference)pathConnectionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathConnectionType_Target() {
		return (EReference)pathConnectionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerfMeasureType() {
		return perfMeasureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerfMeasureType_PerfValueList() {
		return (EReference)perfMeasureTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerfMeasureType_DurationOf() {
		return (EReference)perfMeasureTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerfMeasureType_MeasureKind() {
		return (EAttribute)perfMeasureTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerfMeasureType_PredPerfMeasure() {
		return (EReference)perfMeasureTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerfMeasureType_Resource() {
		return (EReference)perfMeasureTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerfMeasureType_StoppedBy() {
		return (EReference)perfMeasureTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerfMeasureType_SuccPerfMeasure() {
		return (EReference)perfMeasureTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerfMeasureType_TriggeredBy() {
		return (EReference)perfMeasureTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerfValueType() {
		return perfValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerfValueType_Kind() {
		return (EAttribute)perfValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerfValueType_Source() {
		return (EAttribute)perfValueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerfValueType_Value() {
		return (EAttribute)perfValueTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessingResourceType() {
		return processingResourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcessingResourceType_CommLinkList() {
		return (EReference)processingResourceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessingResourceType_CommRcvOvh() {
		return (EAttribute)processingResourceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessingResourceType_CommTxOvh() {
		return (EAttribute)processingResourceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessingResourceType_SpeedFactor() {
		return (EAttribute)processingResourceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefinementType() {
		return refinementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefinementType_InBinding() {
		return (EReference)refinementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefinementType_OutBinding() {
		return (EReference)refinementTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefinementType_RoleBindingList() {
		return (EReference)refinementTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefinementType_ParentStep() {
		return (EReference)refinementTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefinementType_SubScenario() {
		return (EReference)refinementTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceAcquireType() {
		return resourceAcquireTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceAcquireType_Acquire() {
		return (EReference)resourceAcquireTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceAcquireType_Priority() {
		return (EAttribute)resourceAcquireTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceAcquireType_RUnits() {
		return (EAttribute)resourceAcquireTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourcePassType() {
		return resourcePassTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourcePassType_Pass() {
		return (EReference)resourcePassTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourcePassType_RUnits() {
		return (EAttribute)resourcePassTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceReleaseType() {
		return resourceReleaseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceReleaseType_Release() {
		return (EReference)resourceReleaseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceReleaseType_RUnits() {
		return (EAttribute)resourceReleaseTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleBindingType() {
		return roleBindingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleBindingType_ElementId() {
		return (EReference)roleBindingTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleBindingType_ElementName() {
		return (EAttribute)roleBindingTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleBindingType_RoleId() {
		return (EReference)roleBindingTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleBindingType_RoleName() {
		return (EAttribute)roleBindingTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScenarioElementType() {
		return scenarioElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenarioElementType_DurationPerfMeasureList() {
		return (EReference)scenarioElementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenarioElementType_StopPerfMeasureList() {
		return (EReference)scenarioElementTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenarioElementType_TriggerPerfMeasureList() {
		return (EReference)scenarioElementTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScenarioType() {
		return scenarioTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenarioType_StepList() {
		return (EReference)scenarioTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenarioType_CommStepList() {
		return (EReference)scenarioTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenarioType_ResourceAcquireList() {
		return (EReference)scenarioTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenarioType_ResourceReleaseList() {
		return (EReference)scenarioTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenarioType_ResourcePassList() {
		return (EReference)scenarioTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenarioType_AspectStepList() {
		return (EReference)scenarioTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenarioType_StartList() {
		return (EReference)scenarioTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenarioType_EndList() {
		return (EReference)scenarioTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenarioType_SequenceList() {
		return (EReference)scenarioTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenarioType_BranchList() {
		return (EReference)scenarioTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenarioType_MergeList() {
		return (EReference)scenarioTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenarioType_ForkList() {
		return (EReference)scenarioTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenarioType_JoinList() {
		return (EReference)scenarioTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenarioType_ParentRefinementList() {
		return (EReference)scenarioTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenarioType_Probability() {
		return (EAttribute)scenarioTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceType() {
		return sequenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartType() {
		return startTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartType_ClosedWorkload() {
		return (EReference)startTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartType_OpenWorkload() {
		return (EReference)startTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartType_InBinding() {
		return (EReference)startTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStepType() {
		return stepTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStepType_Refinement() {
		return (EReference)stepTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStepType_ExternalDemand() {
		return (EReference)stepTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStepType_BlockT() {
		return (EAttribute)stepTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStepType_Component() {
		return (EReference)stepTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStepType_HostDemand() {
		return (EAttribute)stepTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStepType_Nosync() {
		return (EAttribute)stepTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStepType_Predecessor() {
		return (EReference)stepTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStepType_Probability() {
		return (EAttribute)stepTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStepType_RepetitionCount() {
		return (EAttribute)stepTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStepType_RespT() {
		return (EAttribute)stepTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStepType_StepKind() {
		return (EAttribute)stepTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStepType_Successor() {
		return (EReference)stepTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableType() {
		return variableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableType_Description() {
		return (EAttribute)variableTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableType_Name() {
		return (EAttribute)variableTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkloadType() {
		return workloadTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkloadType_ArrivalParam1() {
		return (EAttribute)workloadTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkloadType_ArrivalParam2() {
		return (EAttribute)workloadTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkloadType_ArrivalProcess() {
		return (EAttribute)workloadTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkloadType_ExternalDelay() {
		return (EAttribute)workloadTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkloadType_ResponseTimeList() {
		return (EReference)workloadTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getArrivalProcess() {
		return arrivalProcessEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMsgKind() {
		return msgKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPerfMeasureKind() {
		return perfMeasureKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPerfValueKind() {
		return perfValueKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPerfValueSource() {
		return perfValueSourceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStepKind() {
		return stepKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSynchronizationKind() {
		return synchronizationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getArrivalProcessObject() {
		return arrivalProcessObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMsgKindObject() {
		return msgKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPerfMeasureKindObject() {
		return perfMeasureKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPerfValueKindObject() {
		return perfValueKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPerfValueSourceObject() {
		return perfValueSourceObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStepKindObject() {
		return stepKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSynchronizationKindObject() {
		return synchronizationKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMFactory getCSMFactory() {
		return (CSMFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		activeResourceTypeEClass = createEClass(ACTIVE_RESOURCE_TYPE);
		createEAttribute(activeResourceTypeEClass, ACTIVE_RESOURCE_TYPE__OP_TIME);

		aspectStepTypeEClass = createEClass(ASPECT_STEP_TYPE);
		createEAttribute(aspectStepTypeEClass, ASPECT_STEP_TYPE__ASPECT_DEFINITION);

		branchTypeEClass = createEClass(BRANCH_TYPE);

		closedWorkloadTypeEClass = createEClass(CLOSED_WORKLOAD_TYPE);
		createEAttribute(closedWorkloadTypeEClass, CLOSED_WORKLOAD_TYPE__POPULATION);

		commLinkTypeEClass = createEClass(COMM_LINK_TYPE);
		createEAttribute(commLinkTypeEClass, COMM_LINK_TYPE__BLOCK_T);
		createEAttribute(commLinkTypeEClass, COMM_LINK_TYPE__CAPACITY);
		createEReference(commLinkTypeEClass, COMM_LINK_TYPE__PROCESSING_HOST_LIST);
		createEAttribute(commLinkTypeEClass, COMM_LINK_TYPE__RES_MULT);
		createEAttribute(commLinkTypeEClass, COMM_LINK_TYPE__SPEED_FACTOR);

		commStepTypeEClass = createEClass(COMM_STEP_TYPE);
		createEReference(commStepTypeEClass, COMM_STEP_TYPE__COMM_LINK);
		createEAttribute(commStepTypeEClass, COMM_STEP_TYPE__MSG_KIND);
		createEAttribute(commStepTypeEClass, COMM_STEP_TYPE__MSG_SIZE);
		createEReference(commStepTypeEClass, COMM_STEP_TYPE__PRED_COMM_STEP);
		createEReference(commStepTypeEClass, COMM_STEP_TYPE__RCV_COMP);
		createEReference(commStepTypeEClass, COMM_STEP_TYPE__SUCC_COMM_STEP);
		createEReference(commStepTypeEClass, COMM_STEP_TYPE__TX_COMP);

		componentTypeEClass = createEClass(COMPONENT_TYPE);
		createEReference(componentTypeEClass, COMPONENT_TYPE__HOST);
		createEAttribute(componentTypeEClass, COMPONENT_TYPE__IS_ACTIVE_PROCESS);
		createEReference(componentTypeEClass, COMPONENT_TYPE__PARENT_COMPONENT);
		createEReference(componentTypeEClass, COMPONENT_TYPE__SUB_COMPONENT_LIST);

		csmElementTypeEClass = createEClass(CSM_ELEMENT_TYPE);
		createEAttribute(csmElementTypeEClass, CSM_ELEMENT_TYPE__DESCRIPTION);
		createEAttribute(csmElementTypeEClass, CSM_ELEMENT_TYPE__ID);
		createEAttribute(csmElementTypeEClass, CSM_ELEMENT_TYPE__NAME);
		createEAttribute(csmElementTypeEClass, CSM_ELEMENT_TYPE__TRACEABILITY_LINK);

		csmTypeEClass = createEClass(CSM_TYPE);
		createEReference(csmTypeEClass, CSM_TYPE__SCENARIO_LIST);
		createEReference(csmTypeEClass, CSM_TYPE__COMPONENT_LIST);
		createEReference(csmTypeEClass, CSM_TYPE__COMM_LINK_LIST);
		createEReference(csmTypeEClass, CSM_TYPE__PROCESSING_RESOURCE_LIST);
		createEReference(csmTypeEClass, CSM_TYPE__LOGICAL_RESOURCE_LIST);
		createEReference(csmTypeEClass, CSM_TYPE__VARIABLE_LIST);
		createEReference(csmTypeEClass, CSM_TYPE__PERF_MEASURE_LIST);
		createEAttribute(csmTypeEClass, CSM_TYPE__AUTHOR);
		createEAttribute(csmTypeEClass, CSM_TYPE__CREATED);
		createEAttribute(csmTypeEClass, CSM_TYPE__DESCRIPTION);
		createEAttribute(csmTypeEClass, CSM_TYPE__MODIFIED);
		createEAttribute(csmTypeEClass, CSM_TYPE__NAME);
		createEAttribute(csmTypeEClass, CSM_TYPE__TRACEABILITY_LINK);
		createEAttribute(csmTypeEClass, CSM_TYPE__VERSION);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CSM);

		endTypeEClass = createEClass(END_TYPE);
		createEReference(endTypeEClass, END_TYPE__OUT_BINDING);

		externalDemandTypeEClass = createEClass(EXTERNAL_DEMAND_TYPE);
		createEAttribute(externalDemandTypeEClass, EXTERNAL_DEMAND_TYPE__COUNT);
		createEAttribute(externalDemandTypeEClass, EXTERNAL_DEMAND_TYPE__EXTERNAL_OPERATION);

		forkTypeEClass = createEClass(FORK_TYPE);

		generalResourceTypeEClass = createEClass(GENERAL_RESOURCE_TYPE);
		createEAttribute(generalResourceTypeEClass, GENERAL_RESOURCE_TYPE__MULTIPLICITY);
		createEReference(generalResourceTypeEClass, GENERAL_RESOURCE_TYPE__PERF_MEASURE_LIST);
		createEAttribute(generalResourceTypeEClass, GENERAL_RESOURCE_TYPE__SCHED_POLICY);

		inBindingTypeEClass = createEClass(IN_BINDING_TYPE);
		createEReference(inBindingTypeEClass, IN_BINDING_TYPE__IN_STEP);
		createEReference(inBindingTypeEClass, IN_BINDING_TYPE__START);

		joinTypeEClass = createEClass(JOIN_TYPE);

		logicalResourceTypeEClass = createEClass(LOGICAL_RESOURCE_TYPE);
		createEAttribute(logicalResourceTypeEClass, LOGICAL_RESOURCE_TYPE__NESTED_ONLY);

		mergeTypeEClass = createEClass(MERGE_TYPE);

		openWorkloadTypeEClass = createEClass(OPEN_WORKLOAD_TYPE);

		outBindingTypeEClass = createEClass(OUT_BINDING_TYPE);
		createEReference(outBindingTypeEClass, OUT_BINDING_TYPE__END);
		createEReference(outBindingTypeEClass, OUT_BINDING_TYPE__OUT_STEP);

		pathConnectionTypeEClass = createEClass(PATH_CONNECTION_TYPE);
		createEReference(pathConnectionTypeEClass, PATH_CONNECTION_TYPE__SOURCE);
		createEReference(pathConnectionTypeEClass, PATH_CONNECTION_TYPE__TARGET);

		perfMeasureTypeEClass = createEClass(PERF_MEASURE_TYPE);
		createEReference(perfMeasureTypeEClass, PERF_MEASURE_TYPE__PERF_VALUE_LIST);
		createEReference(perfMeasureTypeEClass, PERF_MEASURE_TYPE__DURATION_OF);
		createEAttribute(perfMeasureTypeEClass, PERF_MEASURE_TYPE__MEASURE_KIND);
		createEReference(perfMeasureTypeEClass, PERF_MEASURE_TYPE__PRED_PERF_MEASURE);
		createEReference(perfMeasureTypeEClass, PERF_MEASURE_TYPE__RESOURCE);
		createEReference(perfMeasureTypeEClass, PERF_MEASURE_TYPE__STOPPED_BY);
		createEReference(perfMeasureTypeEClass, PERF_MEASURE_TYPE__SUCC_PERF_MEASURE);
		createEReference(perfMeasureTypeEClass, PERF_MEASURE_TYPE__TRIGGERED_BY);

		perfValueTypeEClass = createEClass(PERF_VALUE_TYPE);
		createEAttribute(perfValueTypeEClass, PERF_VALUE_TYPE__KIND);
		createEAttribute(perfValueTypeEClass, PERF_VALUE_TYPE__SOURCE);
		createEAttribute(perfValueTypeEClass, PERF_VALUE_TYPE__VALUE);

		processingResourceTypeEClass = createEClass(PROCESSING_RESOURCE_TYPE);
		createEReference(processingResourceTypeEClass, PROCESSING_RESOURCE_TYPE__COMM_LINK_LIST);
		createEAttribute(processingResourceTypeEClass, PROCESSING_RESOURCE_TYPE__COMM_RCV_OVH);
		createEAttribute(processingResourceTypeEClass, PROCESSING_RESOURCE_TYPE__COMM_TX_OVH);
		createEAttribute(processingResourceTypeEClass, PROCESSING_RESOURCE_TYPE__SPEED_FACTOR);

		refinementTypeEClass = createEClass(REFINEMENT_TYPE);
		createEReference(refinementTypeEClass, REFINEMENT_TYPE__IN_BINDING);
		createEReference(refinementTypeEClass, REFINEMENT_TYPE__OUT_BINDING);
		createEReference(refinementTypeEClass, REFINEMENT_TYPE__ROLE_BINDING_LIST);
		createEReference(refinementTypeEClass, REFINEMENT_TYPE__PARENT_STEP);
		createEReference(refinementTypeEClass, REFINEMENT_TYPE__SUB_SCENARIO);

		resourceAcquireTypeEClass = createEClass(RESOURCE_ACQUIRE_TYPE);
		createEReference(resourceAcquireTypeEClass, RESOURCE_ACQUIRE_TYPE__ACQUIRE);
		createEAttribute(resourceAcquireTypeEClass, RESOURCE_ACQUIRE_TYPE__PRIORITY);
		createEAttribute(resourceAcquireTypeEClass, RESOURCE_ACQUIRE_TYPE__RUNITS);

		resourcePassTypeEClass = createEClass(RESOURCE_PASS_TYPE);
		createEReference(resourcePassTypeEClass, RESOURCE_PASS_TYPE__PASS);
		createEAttribute(resourcePassTypeEClass, RESOURCE_PASS_TYPE__RUNITS);

		resourceReleaseTypeEClass = createEClass(RESOURCE_RELEASE_TYPE);
		createEReference(resourceReleaseTypeEClass, RESOURCE_RELEASE_TYPE__RELEASE);
		createEAttribute(resourceReleaseTypeEClass, RESOURCE_RELEASE_TYPE__RUNITS);

		roleBindingTypeEClass = createEClass(ROLE_BINDING_TYPE);
		createEReference(roleBindingTypeEClass, ROLE_BINDING_TYPE__ELEMENT_ID);
		createEAttribute(roleBindingTypeEClass, ROLE_BINDING_TYPE__ELEMENT_NAME);
		createEReference(roleBindingTypeEClass, ROLE_BINDING_TYPE__ROLE_ID);
		createEAttribute(roleBindingTypeEClass, ROLE_BINDING_TYPE__ROLE_NAME);

		scenarioElementTypeEClass = createEClass(SCENARIO_ELEMENT_TYPE);
		createEReference(scenarioElementTypeEClass, SCENARIO_ELEMENT_TYPE__DURATION_PERF_MEASURE_LIST);
		createEReference(scenarioElementTypeEClass, SCENARIO_ELEMENT_TYPE__STOP_PERF_MEASURE_LIST);
		createEReference(scenarioElementTypeEClass, SCENARIO_ELEMENT_TYPE__TRIGGER_PERF_MEASURE_LIST);

		scenarioTypeEClass = createEClass(SCENARIO_TYPE);
		createEReference(scenarioTypeEClass, SCENARIO_TYPE__STEP_LIST);
		createEReference(scenarioTypeEClass, SCENARIO_TYPE__COMM_STEP_LIST);
		createEReference(scenarioTypeEClass, SCENARIO_TYPE__RESOURCE_ACQUIRE_LIST);
		createEReference(scenarioTypeEClass, SCENARIO_TYPE__RESOURCE_RELEASE_LIST);
		createEReference(scenarioTypeEClass, SCENARIO_TYPE__RESOURCE_PASS_LIST);
		createEReference(scenarioTypeEClass, SCENARIO_TYPE__ASPECT_STEP_LIST);
		createEReference(scenarioTypeEClass, SCENARIO_TYPE__START_LIST);
		createEReference(scenarioTypeEClass, SCENARIO_TYPE__END_LIST);
		createEReference(scenarioTypeEClass, SCENARIO_TYPE__SEQUENCE_LIST);
		createEReference(scenarioTypeEClass, SCENARIO_TYPE__BRANCH_LIST);
		createEReference(scenarioTypeEClass, SCENARIO_TYPE__MERGE_LIST);
		createEReference(scenarioTypeEClass, SCENARIO_TYPE__FORK_LIST);
		createEReference(scenarioTypeEClass, SCENARIO_TYPE__JOIN_LIST);
		createEReference(scenarioTypeEClass, SCENARIO_TYPE__PARENT_REFINEMENT_LIST);
		createEAttribute(scenarioTypeEClass, SCENARIO_TYPE__PROBABILITY);

		sequenceTypeEClass = createEClass(SEQUENCE_TYPE);

		startTypeEClass = createEClass(START_TYPE);
		createEReference(startTypeEClass, START_TYPE__CLOSED_WORKLOAD);
		createEReference(startTypeEClass, START_TYPE__OPEN_WORKLOAD);
		createEReference(startTypeEClass, START_TYPE__IN_BINDING);

		stepTypeEClass = createEClass(STEP_TYPE);
		createEReference(stepTypeEClass, STEP_TYPE__REFINEMENT);
		createEReference(stepTypeEClass, STEP_TYPE__EXTERNAL_DEMAND);
		createEAttribute(stepTypeEClass, STEP_TYPE__BLOCK_T);
		createEReference(stepTypeEClass, STEP_TYPE__COMPONENT);
		createEAttribute(stepTypeEClass, STEP_TYPE__HOST_DEMAND);
		createEAttribute(stepTypeEClass, STEP_TYPE__NOSYNC);
		createEReference(stepTypeEClass, STEP_TYPE__PREDECESSOR);
		createEAttribute(stepTypeEClass, STEP_TYPE__PROBABILITY);
		createEAttribute(stepTypeEClass, STEP_TYPE__REPETITION_COUNT);
		createEAttribute(stepTypeEClass, STEP_TYPE__RESP_T);
		createEAttribute(stepTypeEClass, STEP_TYPE__STEP_KIND);
		createEReference(stepTypeEClass, STEP_TYPE__SUCCESSOR);

		variableTypeEClass = createEClass(VARIABLE_TYPE);
		createEAttribute(variableTypeEClass, VARIABLE_TYPE__DESCRIPTION);
		createEAttribute(variableTypeEClass, VARIABLE_TYPE__NAME);

		workloadTypeEClass = createEClass(WORKLOAD_TYPE);
		createEAttribute(workloadTypeEClass, WORKLOAD_TYPE__ARRIVAL_PARAM1);
		createEAttribute(workloadTypeEClass, WORKLOAD_TYPE__ARRIVAL_PARAM2);
		createEAttribute(workloadTypeEClass, WORKLOAD_TYPE__ARRIVAL_PROCESS);
		createEAttribute(workloadTypeEClass, WORKLOAD_TYPE__EXTERNAL_DELAY);
		createEReference(workloadTypeEClass, WORKLOAD_TYPE__RESPONSE_TIME_LIST);

		// Create enums
		arrivalProcessEEnum = createEEnum(ARRIVAL_PROCESS);
		msgKindEEnum = createEEnum(MSG_KIND);
		perfMeasureKindEEnum = createEEnum(PERF_MEASURE_KIND);
		perfValueKindEEnum = createEEnum(PERF_VALUE_KIND);
		perfValueSourceEEnum = createEEnum(PERF_VALUE_SOURCE);
		stepKindEEnum = createEEnum(STEP_KIND);
		synchronizationKindEEnum = createEEnum(SYNCHRONIZATION_KIND);

		// Create data types
		arrivalProcessObjectEDataType = createEDataType(ARRIVAL_PROCESS_OBJECT);
		msgKindObjectEDataType = createEDataType(MSG_KIND_OBJECT);
		perfMeasureKindObjectEDataType = createEDataType(PERF_MEASURE_KIND_OBJECT);
		perfValueKindObjectEDataType = createEDataType(PERF_VALUE_KIND_OBJECT);
		perfValueSourceObjectEDataType = createEDataType(PERF_VALUE_SOURCE_OBJECT);
		stepKindObjectEDataType = createEDataType(STEP_KIND_OBJECT);
		synchronizationKindObjectEDataType = createEDataType(SYNCHRONIZATION_KIND_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		activeResourceTypeEClass.getESuperTypes().add(this.getGeneralResourceType());
		aspectStepTypeEClass.getESuperTypes().add(this.getStepType());
		branchTypeEClass.getESuperTypes().add(this.getPathConnectionType());
		closedWorkloadTypeEClass.getESuperTypes().add(this.getWorkloadType());
		commLinkTypeEClass.getESuperTypes().add(this.getComponentType());
		commStepTypeEClass.getESuperTypes().add(this.getStepType());
		componentTypeEClass.getESuperTypes().add(this.getLogicalResourceType());
		endTypeEClass.getESuperTypes().add(this.getPathConnectionType());
		externalDemandTypeEClass.getESuperTypes().add(this.getScenarioElementType());
		forkTypeEClass.getESuperTypes().add(this.getPathConnectionType());
		generalResourceTypeEClass.getESuperTypes().add(this.getCSMElementType());
		joinTypeEClass.getESuperTypes().add(this.getPathConnectionType());
		logicalResourceTypeEClass.getESuperTypes().add(this.getGeneralResourceType());
		mergeTypeEClass.getESuperTypes().add(this.getPathConnectionType());
		openWorkloadTypeEClass.getESuperTypes().add(this.getWorkloadType());
		pathConnectionTypeEClass.getESuperTypes().add(this.getScenarioElementType());
		perfMeasureTypeEClass.getESuperTypes().add(this.getCSMElementType());
		processingResourceTypeEClass.getESuperTypes().add(this.getActiveResourceType());
		resourceAcquireTypeEClass.getESuperTypes().add(this.getStepType());
		resourcePassTypeEClass.getESuperTypes().add(this.getStepType());
		resourceReleaseTypeEClass.getESuperTypes().add(this.getStepType());
		scenarioElementTypeEClass.getESuperTypes().add(this.getCSMElementType());
		scenarioTypeEClass.getESuperTypes().add(this.getCSMElementType());
		sequenceTypeEClass.getESuperTypes().add(this.getPathConnectionType());
		startTypeEClass.getESuperTypes().add(this.getPathConnectionType());
		stepTypeEClass.getESuperTypes().add(this.getScenarioElementType());
		workloadTypeEClass.getESuperTypes().add(this.getScenarioElementType());

		// Initialize classes and features; add operations and parameters
		initEClass(activeResourceTypeEClass, ActiveResourceType.class, "ActiveResourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActiveResourceType_OpTime(), theXMLTypePackage.getString(), "opTime", null, 0, 1, ActiveResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aspectStepTypeEClass, AspectStepType.class, "AspectStepType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAspectStepType_AspectDefinition(), theXMLTypePackage.getString(), "aspectDefinition", null, 1, 1, AspectStepType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(branchTypeEClass, BranchType.class, "BranchType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(closedWorkloadTypeEClass, ClosedWorkloadType.class, "ClosedWorkloadType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClosedWorkloadType_Population(), theXMLTypePackage.getString(), "population", null, 1, 1, ClosedWorkloadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commLinkTypeEClass, CommLinkType.class, "CommLinkType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommLinkType_BlockT(), theXMLTypePackage.getString(), "blockT", null, 0, 1, CommLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommLinkType_Capacity(), theXMLTypePackage.getString(), "capacity", null, 0, 1, CommLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommLinkType_ProcessingHostList(), this.getProcessingResourceType(), null, "processingHostList", null, 0, -1, CommLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommLinkType_ResMult(), theXMLTypePackage.getInt(), "resMult", "1", 0, 1, CommLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommLinkType_SpeedFactor(), theXMLTypePackage.getFloat(), "speedFactor", null, 0, 1, CommLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commStepTypeEClass, CommStepType.class, "CommStepType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommStepType_CommLink(), this.getCommLinkType(), null, "commLink", null, 0, 1, CommStepType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommStepType_MsgKind(), this.getMsgKind(), "msgKind", "async", 0, 1, CommStepType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommStepType_MsgSize(), theXMLTypePackage.getString(), "msgSize", null, 0, 1, CommStepType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommStepType_PredCommStep(), this.getCommStepType(), null, "predCommStep", null, 0, 1, CommStepType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommStepType_RcvComp(), this.getComponentType(), null, "rcvComp", null, 0, 1, CommStepType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommStepType_SuccCommStep(), this.getCommStepType(), null, "succCommStep", null, 0, 1, CommStepType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommStepType_TxComp(), this.getComponentType(), null, "txComp", null, 0, 1, CommStepType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentTypeEClass, ComponentType.class, "ComponentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentType_Host(), this.getProcessingResourceType(), null, "host", null, 1, 1, ComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentType_IsActiveProcess(), theXMLTypePackage.getBoolean(), "isActiveProcess", null, 0, 1, ComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentType_ParentComponent(), this.getComponentType(), null, "parentComponent", null, 0, 1, ComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentType_SubComponentList(), this.getComponentType(), null, "subComponentList", null, 0, -1, ComponentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(csmElementTypeEClass, CSMElementType.class, "CSMElementType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCSMElementType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, CSMElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSMElementType_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, CSMElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSMElementType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, CSMElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSMElementType_TraceabilityLink(), theXMLTypePackage.getString(), "traceabilityLink", null, 0, 1, CSMElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(csmTypeEClass, CSMType.class, "CSMType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCSMType_ScenarioList(), this.getScenarioType(), null, "scenarioList", null, 0, -1, CSMType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSMType_ComponentList(), this.getComponentType(), null, "componentList", null, 0, -1, CSMType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSMType_CommLinkList(), this.getCommLinkType(), null, "commLinkList", null, 0, -1, CSMType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSMType_ProcessingResourceList(), this.getProcessingResourceType(), null, "processingResourceList", null, 0, -1, CSMType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSMType_LogicalResourceList(), this.getLogicalResourceType(), null, "logicalResourceList", null, 0, -1, CSMType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSMType_VariableList(), this.getVariableType(), null, "variableList", null, 0, -1, CSMType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCSMType_PerfMeasureList(), this.getPerfMeasureType(), null, "perfMeasureList", null, 0, -1, CSMType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSMType_Author(), theXMLTypePackage.getString(), "author", null, 0, 1, CSMType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSMType_Created(), theXMLTypePackage.getDateTime(), "created", null, 0, 1, CSMType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSMType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, CSMType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSMType_Modified(), theXMLTypePackage.getDateTime(), "modified", null, 0, 1, CSMType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSMType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, CSMType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSMType_TraceabilityLink(), theXMLTypePackage.getString(), "traceabilityLink", null, 0, 1, CSMType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCSMType_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, CSMType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, DocumentRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_CSM(), ecorePackage.getEObject(), null, "cSM", null, 1, 1, DocumentRoot.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(endTypeEClass, EndType.class, "EndType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEndType_OutBinding(), this.getOutBindingType(), null, "outBinding", null, 0, 1, EndType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalDemandTypeEClass, ExternalDemandType.class, "ExternalDemandType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalDemandType_Count(), theXMLTypePackage.getString(), "count", null, 0, 1, ExternalDemandType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalDemandType_ExternalOperation(), theXMLTypePackage.getString(), "externalOperation", null, 0, 1, ExternalDemandType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forkTypeEClass, ForkType.class, "ForkType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(generalResourceTypeEClass, GeneralResourceType.class, "GeneralResourceType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneralResourceType_Multiplicity(), theXMLTypePackage.getString(), "multiplicity", null, 0, 1, GeneralResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneralResourceType_PerfMeasureList(), this.getPerfMeasureType(), null, "perfMeasureList", null, 0, -1, GeneralResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeneralResourceType_SchedPolicy(), theXMLTypePackage.getString(), "schedPolicy", null, 0, 1, GeneralResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inBindingTypeEClass, InBindingType.class, "InBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInBindingType_InStep(), this.getStepType(), null, "inStep", null, 1, 1, InBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInBindingType_Start(), this.getStartType(), null, "start", null, 1, 1, InBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(joinTypeEClass, JoinType.class, "JoinType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(logicalResourceTypeEClass, LogicalResourceType.class, "LogicalResourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogicalResourceType_NestedOnly(), theXMLTypePackage.getBoolean(), "nestedOnly", "false", 0, 1, LogicalResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mergeTypeEClass, MergeType.class, "MergeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(openWorkloadTypeEClass, OpenWorkloadType.class, "OpenWorkloadType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outBindingTypeEClass, OutBindingType.class, "OutBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutBindingType_End(), this.getEndType(), null, "end", null, 1, 1, OutBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutBindingType_OutStep(), this.getStepType(), null, "outStep", null, 1, 1, OutBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathConnectionTypeEClass, PathConnectionType.class, "PathConnectionType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPathConnectionType_Source(), this.getStepType(), null, "source", null, 0, -1, PathConnectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPathConnectionType_Target(), this.getStepType(), null, "target", null, 0, -1, PathConnectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(perfMeasureTypeEClass, PerfMeasureType.class, "PerfMeasureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPerfMeasureType_PerfValueList(), this.getPerfValueType(), null, "perfValueList", null, 0, -1, PerfMeasureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerfMeasureType_DurationOf(), this.getScenarioElementType(), null, "durationOf", null, 0, 1, PerfMeasureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerfMeasureType_MeasureKind(), this.getPerfMeasureKind(), "measureKind", "delay", 0, 1, PerfMeasureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerfMeasureType_PredPerfMeasure(), this.getPerfMeasureType(), null, "predPerfMeasure", null, 0, 1, PerfMeasureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerfMeasureType_Resource(), this.getGeneralResourceType(), null, "resource", null, 0, 1, PerfMeasureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerfMeasureType_StoppedBy(), this.getScenarioElementType(), null, "stoppedBy", null, 0, 1, PerfMeasureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerfMeasureType_SuccPerfMeasure(), this.getPerfMeasureType(), null, "succPerfMeasure", null, 0, 1, PerfMeasureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerfMeasureType_TriggeredBy(), this.getScenarioElementType(), null, "triggeredBy", null, 0, 1, PerfMeasureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(perfValueTypeEClass, PerfValueType.class, "PerfValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerfValueType_Kind(), this.getPerfValueKind(), "kind", "mean", 0, 1, PerfValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerfValueType_Source(), this.getPerfValueSource(), "source", "required", 0, 1, PerfValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerfValueType_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, PerfValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processingResourceTypeEClass, ProcessingResourceType.class, "ProcessingResourceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessingResourceType_CommLinkList(), this.getCommLinkType(), null, "commLinkList", null, 0, -1, ProcessingResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessingResourceType_CommRcvOvh(), theXMLTypePackage.getString(), "commRcvOvh", null, 0, 1, ProcessingResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessingResourceType_CommTxOvh(), theXMLTypePackage.getString(), "commTxOvh", null, 0, 1, ProcessingResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessingResourceType_SpeedFactor(), theXMLTypePackage.getFloat(), "speedFactor", null, 0, 1, ProcessingResourceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refinementTypeEClass, RefinementType.class, "RefinementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRefinementType_InBinding(), this.getInBindingType(), null, "inBinding", null, 1, 1, RefinementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefinementType_OutBinding(), this.getOutBindingType(), null, "outBinding", null, 1, 1, RefinementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefinementType_RoleBindingList(), this.getRoleBindingType(), null, "roleBindingList", null, 1, -1, RefinementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefinementType_ParentStep(), this.getStepType(), null, "parentStep", null, 1, 1, RefinementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefinementType_SubScenario(), this.getScenarioType(), null, "subScenario", null, 1, 1, RefinementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceAcquireTypeEClass, ResourceAcquireType.class, "ResourceAcquireType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceAcquireType_Acquire(), this.getGeneralResourceType(), null, "acquire", null, 1, 1, ResourceAcquireType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceAcquireType_Priority(), theXMLTypePackage.getString(), "priority", null, 0, 1, ResourceAcquireType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceAcquireType_RUnits(), theXMLTypePackage.getString(), "rUnits", null, 0, 1, ResourceAcquireType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourcePassTypeEClass, ResourcePassType.class, "ResourcePassType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourcePassType_Pass(), this.getLogicalResourceType(), null, "pass", null, 1, 1, ResourcePassType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourcePassType_RUnits(), theXMLTypePackage.getString(), "rUnits", null, 0, 1, ResourcePassType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceReleaseTypeEClass, ResourceReleaseType.class, "ResourceReleaseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceReleaseType_Release(), this.getGeneralResourceType(), null, "release", null, 1, 1, ResourceReleaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceReleaseType_RUnits(), theXMLTypePackage.getString(), "rUnits", null, 0, 1, ResourceReleaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleBindingTypeEClass, RoleBindingType.class, "RoleBindingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleBindingType_ElementId(), this.getCSMElementType(), null, "elementId", null, 0, 1, RoleBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleBindingType_ElementName(), theXMLTypePackage.getString(), "elementName", null, 1, 1, RoleBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleBindingType_RoleId(), this.getCSMElementType(), null, "roleId", null, 0, 1, RoleBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoleBindingType_RoleName(), theXMLTypePackage.getString(), "roleName", null, 1, 1, RoleBindingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scenarioElementTypeEClass, ScenarioElementType.class, "ScenarioElementType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScenarioElementType_DurationPerfMeasureList(), this.getPerfMeasureType(), null, "durationPerfMeasureList", null, 0, -1, ScenarioElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenarioElementType_StopPerfMeasureList(), this.getPerfMeasureType(), null, "stopPerfMeasureList", null, 0, -1, ScenarioElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenarioElementType_TriggerPerfMeasureList(), this.getPerfMeasureType(), null, "triggerPerfMeasureList", null, 0, -1, ScenarioElementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scenarioTypeEClass, ScenarioType.class, "ScenarioType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScenarioType_StepList(), this.getStepType(), null, "stepList", null, 0, -1, ScenarioType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenarioType_CommStepList(), this.getCommStepType(), null, "commStepList", null, 0, -1, ScenarioType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenarioType_ResourceAcquireList(), this.getResourceAcquireType(), null, "resourceAcquireList", null, 0, -1, ScenarioType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenarioType_ResourceReleaseList(), this.getResourceReleaseType(), null, "resourceReleaseList", null, 0, -1, ScenarioType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenarioType_ResourcePassList(), this.getResourcePassType(), null, "resourcePassList", null, 0, -1, ScenarioType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenarioType_AspectStepList(), this.getAspectStepType(), null, "aspectStepList", null, 0, -1, ScenarioType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenarioType_StartList(), this.getStartType(), null, "startList", null, 0, -1, ScenarioType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenarioType_EndList(), this.getEndType(), null, "endList", null, 0, -1, ScenarioType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenarioType_SequenceList(), this.getSequenceType(), null, "sequenceList", null, 0, -1, ScenarioType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenarioType_BranchList(), this.getBranchType(), null, "branchList", null, 0, -1, ScenarioType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenarioType_MergeList(), this.getMergeType(), null, "mergeList", null, 0, -1, ScenarioType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenarioType_ForkList(), this.getForkType(), null, "forkList", null, 0, -1, ScenarioType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenarioType_JoinList(), this.getJoinType(), null, "joinList", null, 0, -1, ScenarioType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenarioType_ParentRefinementList(), this.getRefinementType(), null, "parentRefinementList", null, 0, -1, ScenarioType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScenarioType_Probability(), theXMLTypePackage.getString(), "probability", null, 0, 1, ScenarioType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceTypeEClass, SequenceType.class, "SequenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(startTypeEClass, StartType.class, "StartType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStartType_ClosedWorkload(), this.getClosedWorkloadType(), null, "closedWorkload", null, 0, 1, StartType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStartType_OpenWorkload(), this.getOpenWorkloadType(), null, "openWorkload", null, 0, 1, StartType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStartType_InBinding(), this.getInBindingType(), null, "inBinding", null, 0, 1, StartType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stepTypeEClass, StepType.class, "StepType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStepType_Refinement(), this.getRefinementType(), null, "refinement", null, 0, 1, StepType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStepType_ExternalDemand(), this.getExternalDemandType(), null, "externalDemand", null, 0, 1, StepType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStepType_BlockT(), theXMLTypePackage.getString(), "blockT", null, 0, 1, StepType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStepType_Component(), this.getComponentType(), null, "component", null, 0, 1, StepType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStepType_HostDemand(), theXMLTypePackage.getString(), "hostDemand", null, 0, 1, StepType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStepType_Nosync(), this.getSynchronizationKind(), "nosync", "false", 0, 1, StepType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStepType_Predecessor(), this.getPathConnectionType(), null, "predecessor", null, 1, 1, StepType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStepType_Probability(), theXMLTypePackage.getString(), "probability", null, 0, 1, StepType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStepType_RepetitionCount(), theXMLTypePackage.getString(), "repetitionCount", null, 0, 1, StepType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStepType_RespT(), theXMLTypePackage.getString(), "respT", null, 0, 1, StepType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStepType_StepKind(), this.getStepKind(), "stepKind", "normal", 0, 1, StepType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStepType_Successor(), this.getPathConnectionType(), null, "successor", null, 1, 1, StepType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableTypeEClass, VariableType.class, "VariableType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariableType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, VariableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariableType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, VariableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workloadTypeEClass, WorkloadType.class, "WorkloadType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkloadType_ArrivalParam1(), theXMLTypePackage.getString(), "arrivalParam1", null, 0, 1, WorkloadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkloadType_ArrivalParam2(), theXMLTypePackage.getString(), "arrivalParam2", null, 0, 1, WorkloadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkloadType_ArrivalProcess(), this.getArrivalProcess(), "arrivalProcess", "poissonPDF", 0, 1, WorkloadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkloadType_ExternalDelay(), theXMLTypePackage.getString(), "externalDelay", null, 0, 1, WorkloadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkloadType_ResponseTimeList(), this.getPerfMeasureType(), null, "responseTimeList", null, 0, -1, WorkloadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(arrivalProcessEEnum, ArrivalProcess.class, "ArrivalProcess");
		addEEnumLiteral(arrivalProcessEEnum, ArrivalProcess.PERIODIC);
		addEEnumLiteral(arrivalProcessEEnum, ArrivalProcess.PHASE_TYPE);
		addEEnumLiteral(arrivalProcessEEnum, ArrivalProcess.POISSON_PDF);
		addEEnumLiteral(arrivalProcessEEnum, ArrivalProcess.UNIFORM);

		initEEnum(msgKindEEnum, MsgKind.class, "MsgKind");
		addEEnumLiteral(msgKindEEnum, MsgKind.ASYNC);
		addEEnumLiteral(msgKindEEnum, MsgKind.FWD);
		addEEnumLiteral(msgKindEEnum, MsgKind.SYNC);
		addEEnumLiteral(msgKindEEnum, MsgKind.REPLY);

		initEEnum(perfMeasureKindEEnum, PerfMeasureKind.class, "PerfMeasureKind");
		addEEnumLiteral(perfMeasureKindEEnum, PerfMeasureKind.DELAY);
		addEEnumLiteral(perfMeasureKindEEnum, PerfMeasureKind.INTERVAL);
		addEEnumLiteral(perfMeasureKindEEnum, PerfMeasureKind.THROUGHPUT);
		addEEnumLiteral(perfMeasureKindEEnum, PerfMeasureKind.UTILIZATION);
		addEEnumLiteral(perfMeasureKindEEnum, PerfMeasureKind.WAIT);

		initEEnum(perfValueKindEEnum, PerfValueKind.class, "PerfValueKind");
		addEEnumLiteral(perfValueKindEEnum, PerfValueKind.DISTRIBUTION);
		addEEnumLiteral(perfValueKindEEnum, PerfValueKind.MAX);
		addEEnumLiteral(perfValueKindEEnum, PerfValueKind.MEAN);
		addEEnumLiteral(perfValueKindEEnum, PerfValueKind.MIN);
		addEEnumLiteral(perfValueKindEEnum, PerfValueKind.MOMENT);
		addEEnumLiteral(perfValueKindEEnum, PerfValueKind.PERCENTILE);
		addEEnumLiteral(perfValueKindEEnum, PerfValueKind.VARIANCE);

		initEEnum(perfValueSourceEEnum, PerfValueSource.class, "PerfValueSource");
		addEEnumLiteral(perfValueSourceEEnum, PerfValueSource.ASSUMED);
		addEEnumLiteral(perfValueSourceEEnum, PerfValueSource.MEASURED);
		addEEnumLiteral(perfValueSourceEEnum, PerfValueSource.PREDICTED);
		addEEnumLiteral(perfValueSourceEEnum, PerfValueSource.REQUIRED);

		initEEnum(stepKindEEnum, StepKind.class, "StepKind");
		addEEnumLiteral(stepKindEEnum, StepKind.NORMAL);
		addEEnumLiteral(stepKindEEnum, StepKind.EXTERNAL_OPERATION);
		addEEnumLiteral(stepKindEEnum, StepKind.BEHAVIOR_DEMAND);
		addEEnumLiteral(stepKindEEnum, StepKind.SERVICE_DEMAND);
		addEEnumLiteral(stepKindEEnum, StepKind.NULL_STEP);

		initEEnum(synchronizationKindEEnum, SynchronizationKind.class, "SynchronizationKind");
		addEEnumLiteral(synchronizationKindEEnum, SynchronizationKind.FALSE);
		addEEnumLiteral(synchronizationKindEEnum, SynchronizationKind.TRUE);

		// Initialize data types
		initEDataType(arrivalProcessObjectEDataType, ArrivalProcess.class, "ArrivalProcessObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(msgKindObjectEDataType, MsgKind.class, "MsgKindObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(perfMeasureKindObjectEDataType, PerfMeasureKind.class, "PerfMeasureKindObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(perfValueKindObjectEDataType, PerfValueKind.class, "PerfValueKindObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(perfValueSourceObjectEDataType, PerfValueSource.class, "PerfValueSourceObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stepKindObjectEDataType, StepKind.class, "StepKindObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(synchronizationKindObjectEDataType, SynchronizationKind.class, "SynchronizationKindObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (activeResourceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ActiveResourceType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getActiveResourceType_OpTime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "opTime"
		   });		
		addAnnotation
		  (arrivalProcessEEnum, 
		   source, 
		   new String[] {
			 "name", "ArrivalProcess"
		   });		
		addAnnotation
		  (arrivalProcessObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "ArrivalProcess:Object",
			 "baseType", "ArrivalProcess"
		   });		
		addAnnotation
		  (aspectStepTypeEClass, 
		   source, 
		   new String[] {
			 "name", "AspectStepType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAspectStepType_AspectDefinition(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "aspectDefinition"
		   });		
		addAnnotation
		  (branchTypeEClass, 
		   source, 
		   new String[] {
			 "name", "BranchType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (closedWorkloadTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ClosedWorkloadType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getClosedWorkloadType_Population(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "population"
		   });		
		addAnnotation
		  (commLinkTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CommLinkType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getCommLinkType_BlockT(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "blockT"
		   });		
		addAnnotation
		  (getCommLinkType_Capacity(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "capacity"
		   });		
		addAnnotation
		  (getCommLinkType_ProcessingHostList(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "processingHostList"
		   });		
		addAnnotation
		  (getCommLinkType_ResMult(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "resMult"
		   });		
		addAnnotation
		  (getCommLinkType_SpeedFactor(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "speedFactor"
		   });		
		addAnnotation
		  (commStepTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CommStepType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCommStepType_CommLink(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "commLink"
		   });		
		addAnnotation
		  (getCommStepType_MsgKind(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "msgKind"
		   });		
		addAnnotation
		  (getCommStepType_MsgSize(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "msgSize"
		   });		
		addAnnotation
		  (getCommStepType_PredCommStep(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "predCommStep"
		   });		
		addAnnotation
		  (getCommStepType_RcvComp(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rcvComp"
		   });		
		addAnnotation
		  (getCommStepType_SuccCommStep(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "succCommStep"
		   });		
		addAnnotation
		  (getCommStepType_TxComp(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "txComp"
		   });		
		addAnnotation
		  (componentTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ComponentType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getComponentType_Host(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "host"
		   });		
		addAnnotation
		  (getComponentType_IsActiveProcess(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "isActiveProcess"
		   });		
		addAnnotation
		  (getComponentType_ParentComponent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "parentComponent"
		   });		
		addAnnotation
		  (getComponentType_SubComponentList(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "subComponentList"
		   });		
		addAnnotation
		  (csmElementTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CSMElementType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getCSMElementType_Description(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "description"
		   });		
		addAnnotation
		  (getCSMElementType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getCSMElementType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getCSMElementType_TraceabilityLink(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "traceabilityLink"
		   });		
		addAnnotation
		  (csmTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CSM",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCSMType_ScenarioList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Scenario"
		   });		
		addAnnotation
		  (getCSMType_ComponentList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Component"
		   });		
		addAnnotation
		  (getCSMType_CommLinkList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CommLink"
		   });		
		addAnnotation
		  (getCSMType_ProcessingResourceList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ProcessingResource"
		   });		
		addAnnotation
		  (getCSMType_LogicalResourceList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LogicalResource"
		   });		
		addAnnotation
		  (getCSMType_VariableList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Variable"
		   });		
		addAnnotation
		  (getCSMType_PerfMeasureList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PerfMeasure"
		   });		
		addAnnotation
		  (getCSMType_Author(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "author"
		   });		
		addAnnotation
		  (getCSMType_Created(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "created"
		   });		
		addAnnotation
		  (getCSMType_Description(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "description"
		   });		
		addAnnotation
		  (getCSMType_Modified(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "modified"
		   });		
		addAnnotation
		  (getCSMType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getCSMType_TraceabilityLink(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "traceabilityLink"
		   });		
		addAnnotation
		  (getCSMType_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "CSModel",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_CSM(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CSM"
		   });		
		addAnnotation
		  (endTypeEClass, 
		   source, 
		   new String[] {
			 "name", "EndType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getEndType_OutBinding(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "outBinding"
		   });		
		addAnnotation
		  (externalDemandTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ExternalDemandType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getExternalDemandType_Count(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "count"
		   });		
		addAnnotation
		  (getExternalDemandType_ExternalOperation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "externalOperation"
		   });		
		addAnnotation
		  (forkTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ForkType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (generalResourceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "GeneralResourceType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getGeneralResourceType_Multiplicity(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "multiplicity"
		   });		
		addAnnotation
		  (getGeneralResourceType_PerfMeasureList(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "perfMeasureList"
		   });		
		addAnnotation
		  (getGeneralResourceType_SchedPolicy(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "schedPolicy"
		   });		
		addAnnotation
		  (inBindingTypeEClass, 
		   source, 
		   new String[] {
			 "name", "InBindingType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getInBindingType_InStep(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "inStep"
		   });		
		addAnnotation
		  (getInBindingType_Start(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "start"
		   });		
		addAnnotation
		  (joinTypeEClass, 
		   source, 
		   new String[] {
			 "name", "JoinType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (logicalResourceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "LogicalResourceType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getLogicalResourceType_NestedOnly(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "nestedOnly"
		   });		
		addAnnotation
		  (mergeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "MergeType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (msgKindEEnum, 
		   source, 
		   new String[] {
			 "name", "MsgKind"
		   });		
		addAnnotation
		  (msgKindObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "MsgKind:Object",
			 "baseType", "MsgKind"
		   });		
		addAnnotation
		  (openWorkloadTypeEClass, 
		   source, 
		   new String[] {
			 "name", "OpenWorkloadType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (outBindingTypeEClass, 
		   source, 
		   new String[] {
			 "name", "OutBindingType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getOutBindingType_End(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "end"
		   });		
		addAnnotation
		  (getOutBindingType_OutStep(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "outStep"
		   });		
		addAnnotation
		  (pathConnectionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PathConnectionType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getPathConnectionType_Source(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "source"
		   });		
		addAnnotation
		  (getPathConnectionType_Target(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "target"
		   });		
		addAnnotation
		  (perfMeasureKindEEnum, 
		   source, 
		   new String[] {
			 "name", "PerfMeasureKind"
		   });		
		addAnnotation
		  (perfMeasureKindObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "PerfMeasureKind:Object",
			 "baseType", "PerfMeasureKind"
		   });		
		addAnnotation
		  (perfMeasureTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PerfMeasureType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPerfMeasureType_PerfValueList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PerfValue"
		   });		
		addAnnotation
		  (getPerfMeasureType_DurationOf(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "durationOf"
		   });		
		addAnnotation
		  (getPerfMeasureType_MeasureKind(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "measureKind"
		   });		
		addAnnotation
		  (getPerfMeasureType_PredPerfMeasure(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "predPerfMeasure"
		   });		
		addAnnotation
		  (getPerfMeasureType_Resource(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "resource"
		   });		
		addAnnotation
		  (getPerfMeasureType_StoppedBy(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "stoppedBy"
		   });		
		addAnnotation
		  (getPerfMeasureType_SuccPerfMeasure(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "succPerfMeasure"
		   });		
		addAnnotation
		  (getPerfMeasureType_TriggeredBy(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "triggeredBy"
		   });		
		addAnnotation
		  (perfValueKindEEnum, 
		   source, 
		   new String[] {
			 "name", "PerfValueKind"
		   });		
		addAnnotation
		  (perfValueKindObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "PerfValueKind:Object",
			 "baseType", "PerfValueKind"
		   });		
		addAnnotation
		  (perfValueSourceEEnum, 
		   source, 
		   new String[] {
			 "name", "PerfValueSource"
		   });		
		addAnnotation
		  (perfValueSourceObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "PerfValueSource:Object",
			 "baseType", "PerfValueSource"
		   });		
		addAnnotation
		  (perfValueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PerfValueType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getPerfValueType_Kind(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "kind"
		   });		
		addAnnotation
		  (getPerfValueType_Source(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "source"
		   });		
		addAnnotation
		  (getPerfValueType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });		
		addAnnotation
		  (processingResourceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ProcessingResourceType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getProcessingResourceType_CommLinkList(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "commLinkList"
		   });		
		addAnnotation
		  (getProcessingResourceType_CommRcvOvh(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "commRcvOvh"
		   });		
		addAnnotation
		  (getProcessingResourceType_CommTxOvh(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "commTxOvh"
		   });		
		addAnnotation
		  (getProcessingResourceType_SpeedFactor(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "speedFactor"
		   });		
		addAnnotation
		  (refinementTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RefinementType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRefinementType_InBinding(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "InBinding"
		   });		
		addAnnotation
		  (getRefinementType_OutBinding(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OutBinding"
		   });		
		addAnnotation
		  (getRefinementType_RoleBindingList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RoleBinding"
		   });		
		addAnnotation
		  (getRefinementType_ParentStep(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "parentStep"
		   });		
		addAnnotation
		  (getRefinementType_SubScenario(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "subScenario"
		   });		
		addAnnotation
		  (resourceAcquireTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ResourceAcquireType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getResourceAcquireType_Acquire(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "acquire"
		   });		
		addAnnotation
		  (getResourceAcquireType_Priority(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "priority"
		   });		
		addAnnotation
		  (getResourceAcquireType_RUnits(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rUnits"
		   });		
		addAnnotation
		  (resourcePassTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ResourcePassType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getResourcePassType_Pass(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "pass"
		   });		
		addAnnotation
		  (getResourcePassType_RUnits(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rUnits"
		   });		
		addAnnotation
		  (resourceReleaseTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ResourceReleaseType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getResourceReleaseType_Release(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "release"
		   });		
		addAnnotation
		  (getResourceReleaseType_RUnits(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rUnits"
		   });		
		addAnnotation
		  (roleBindingTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RoleBindingType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getRoleBindingType_ElementId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "elementId"
		   });		
		addAnnotation
		  (getRoleBindingType_ElementName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "elementName"
		   });		
		addAnnotation
		  (getRoleBindingType_RoleId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "roleId"
		   });		
		addAnnotation
		  (getRoleBindingType_RoleName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "roleName"
		   });		
		addAnnotation
		  (scenarioElementTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ScenarioElementType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getScenarioElementType_DurationPerfMeasureList(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "durationPerfMeasureList"
		   });		
		addAnnotation
		  (getScenarioElementType_StopPerfMeasureList(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "stopPerfMeasureList"
		   });		
		addAnnotation
		  (getScenarioElementType_TriggerPerfMeasureList(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "triggerPerfMeasureList"
		   });		
		addAnnotation
		  (scenarioTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ScenarioType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getScenarioType_StepList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Step"
		   });		
		addAnnotation
		  (getScenarioType_CommStepList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CommStep"
		   });		
		addAnnotation
		  (getScenarioType_ResourceAcquireList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ResourceAcquire"
		   });		
		addAnnotation
		  (getScenarioType_ResourceReleaseList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ResourceRelease"
		   });		
		addAnnotation
		  (getScenarioType_ResourcePassList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ResourcePass"
		   });		
		addAnnotation
		  (getScenarioType_AspectStepList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AspectStep"
		   });		
		addAnnotation
		  (getScenarioType_StartList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Start"
		   });		
		addAnnotation
		  (getScenarioType_EndList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "End"
		   });		
		addAnnotation
		  (getScenarioType_SequenceList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Sequence"
		   });		
		addAnnotation
		  (getScenarioType_BranchList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Branch"
		   });		
		addAnnotation
		  (getScenarioType_MergeList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Merge"
		   });		
		addAnnotation
		  (getScenarioType_ForkList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Fork"
		   });		
		addAnnotation
		  (getScenarioType_JoinList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Join"
		   });		
		addAnnotation
		  (getScenarioType_ParentRefinementList(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "parentRefinementList"
		   });		
		addAnnotation
		  (getScenarioType_Probability(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "probability"
		   });		
		addAnnotation
		  (sequenceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SequenceType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (startTypeEClass, 
		   source, 
		   new String[] {
			 "name", "StartType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getStartType_ClosedWorkload(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ClosedWorkload"
		   });		
		addAnnotation
		  (getStartType_OpenWorkload(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OpenWorkload"
		   });		
		addAnnotation
		  (getStartType_InBinding(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "inBinding"
		   });		
		addAnnotation
		  (stepKindEEnum, 
		   source, 
		   new String[] {
			 "name", "StepKind"
		   });		
		addAnnotation
		  (stepKindObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "StepKind:Object",
			 "baseType", "StepKind"
		   });		
		addAnnotation
		  (stepTypeEClass, 
		   source, 
		   new String[] {
			 "name", "StepType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getStepType_Refinement(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Refinement"
		   });		
		addAnnotation
		  (getStepType_ExternalDemand(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExternalDemand"
		   });		
		addAnnotation
		  (getStepType_BlockT(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "blockT"
		   });		
		addAnnotation
		  (getStepType_Component(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "component"
		   });		
		addAnnotation
		  (getStepType_HostDemand(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "hostDemand"
		   });		
		addAnnotation
		  (getStepType_Nosync(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "nosync"
		   });		
		addAnnotation
		  (getStepType_Predecessor(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "predecessor"
		   });		
		addAnnotation
		  (getStepType_Probability(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "probability"
		   });		
		addAnnotation
		  (getStepType_RepetitionCount(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "repetitionCount"
		   });		
		addAnnotation
		  (getStepType_RespT(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "respT"
		   });		
		addAnnotation
		  (getStepType_StepKind(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "stepKind"
		   });		
		addAnnotation
		  (getStepType_Successor(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "successor"
		   });		
		addAnnotation
		  (synchronizationKindEEnum, 
		   source, 
		   new String[] {
			 "name", "SynchronizationKind"
		   });		
		addAnnotation
		  (synchronizationKindObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "SynchronizationKind:Object",
			 "baseType", "SynchronizationKind"
		   });		
		addAnnotation
		  (variableTypeEClass, 
		   source, 
		   new String[] {
			 "name", "VariableType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getVariableType_Description(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "description"
		   });		
		addAnnotation
		  (getVariableType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (workloadTypeEClass, 
		   source, 
		   new String[] {
			 "name", "WorkloadType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getWorkloadType_ArrivalParam1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "arrivalParam1"
		   });		
		addAnnotation
		  (getWorkloadType_ArrivalParam2(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "arrivalParam2"
		   });		
		addAnnotation
		  (getWorkloadType_ArrivalProcess(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "arrivalProcess"
		   });		
		addAnnotation
		  (getWorkloadType_ExternalDelay(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "externalDelay"
		   });		
		addAnnotation
		  (getWorkloadType_ResponseTimeList(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "responseTimeList"
		   });
	}

} //CSMPackageImpl
