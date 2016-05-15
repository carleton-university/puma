/**
 */
package ca.carleton.sce.puma.CSM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.ScenarioType#getStepList <em>Step List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.ScenarioType#getCommStepList <em>Comm Step List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.ScenarioType#getResourceAcquireList <em>Resource Acquire List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.ScenarioType#getResourceReleaseList <em>Resource Release List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.ScenarioType#getResourcePassList <em>Resource Pass List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.ScenarioType#getAspectStepList <em>Aspect Step List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.ScenarioType#getStartList <em>Start List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.ScenarioType#getEndList <em>End List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.ScenarioType#getSequenceList <em>Sequence List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.ScenarioType#getBranchList <em>Branch List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.ScenarioType#getMergeList <em>Merge List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.ScenarioType#getForkList <em>Fork List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.ScenarioType#getJoinList <em>Join List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.ScenarioType#getParentRefinementList <em>Parent Refinement List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.ScenarioType#getProbability <em>Probability</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.carleton.sce.puma.CSM.CSMPackage#getScenarioType()
 * @model extendedMetaData="name='ScenarioType' kind='elementOnly'"
 * @generated
 */
public interface ScenarioType extends CSMElementType {
	/**
	 * Returns the value of the '<em><b>Step List</b></em>' containment reference list.
	 * The list contents are of type {@link ca.carleton.sce.puma.CSM.StepType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step List</em>' containment reference list.
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getScenarioType_StepList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Step'"
	 * @generated
	 */
	EList<StepType> getStepList();

	/**
	 * Returns the value of the '<em><b>Comm Step List</b></em>' containment reference list.
	 * The list contents are of type {@link ca.carleton.sce.puma.CSM.CommStepType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comm Step List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comm Step List</em>' containment reference list.
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getScenarioType_CommStepList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CommStep'"
	 * @generated
	 */
	EList<CommStepType> getCommStepList();

	/**
	 * Returns the value of the '<em><b>Resource Acquire List</b></em>' containment reference list.
	 * The list contents are of type {@link ca.carleton.sce.puma.CSM.ResourceAcquireType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Acquire List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Acquire List</em>' containment reference list.
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getScenarioType_ResourceAcquireList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ResourceAcquire'"
	 * @generated
	 */
	EList<ResourceAcquireType> getResourceAcquireList();

	/**
	 * Returns the value of the '<em><b>Resource Release List</b></em>' containment reference list.
	 * The list contents are of type {@link ca.carleton.sce.puma.CSM.ResourceReleaseType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Release List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Release List</em>' containment reference list.
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getScenarioType_ResourceReleaseList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ResourceRelease'"
	 * @generated
	 */
	EList<ResourceReleaseType> getResourceReleaseList();

	/**
	 * Returns the value of the '<em><b>Resource Pass List</b></em>' containment reference list.
	 * The list contents are of type {@link ca.carleton.sce.puma.CSM.ResourcePassType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Pass List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Pass List</em>' containment reference list.
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getScenarioType_ResourcePassList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ResourcePass'"
	 * @generated
	 */
	EList<ResourcePassType> getResourcePassList();

	/**
	 * Returns the value of the '<em><b>Aspect Step List</b></em>' containment reference list.
	 * The list contents are of type {@link ca.carleton.sce.puma.CSM.AspectStepType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aspect Step List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aspect Step List</em>' containment reference list.
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getScenarioType_AspectStepList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AspectStep'"
	 * @generated
	 */
	EList<AspectStepType> getAspectStepList();

	/**
	 * Returns the value of the '<em><b>Start List</b></em>' containment reference list.
	 * The list contents are of type {@link ca.carleton.sce.puma.CSM.StartType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start List</em>' containment reference list.
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getScenarioType_StartList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Start'"
	 * @generated
	 */
	EList<StartType> getStartList();

	/**
	 * Returns the value of the '<em><b>End List</b></em>' containment reference list.
	 * The list contents are of type {@link ca.carleton.sce.puma.CSM.EndType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End List</em>' containment reference list.
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getScenarioType_EndList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='End'"
	 * @generated
	 */
	EList<EndType> getEndList();

	/**
	 * Returns the value of the '<em><b>Sequence List</b></em>' containment reference list.
	 * The list contents are of type {@link ca.carleton.sce.puma.CSM.SequenceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence List</em>' containment reference list.
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getScenarioType_SequenceList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Sequence'"
	 * @generated
	 */
	EList<SequenceType> getSequenceList();

	/**
	 * Returns the value of the '<em><b>Branch List</b></em>' containment reference list.
	 * The list contents are of type {@link ca.carleton.sce.puma.CSM.BranchType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branch List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch List</em>' containment reference list.
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getScenarioType_BranchList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Branch'"
	 * @generated
	 */
	EList<BranchType> getBranchList();

	/**
	 * Returns the value of the '<em><b>Merge List</b></em>' containment reference list.
	 * The list contents are of type {@link ca.carleton.sce.puma.CSM.MergeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merge List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merge List</em>' containment reference list.
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getScenarioType_MergeList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Merge'"
	 * @generated
	 */
	EList<MergeType> getMergeList();

	/**
	 * Returns the value of the '<em><b>Fork List</b></em>' containment reference list.
	 * The list contents are of type {@link ca.carleton.sce.puma.CSM.ForkType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fork List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fork List</em>' containment reference list.
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getScenarioType_ForkList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fork'"
	 * @generated
	 */
	EList<ForkType> getForkList();

	/**
	 * Returns the value of the '<em><b>Join List</b></em>' containment reference list.
	 * The list contents are of type {@link ca.carleton.sce.puma.CSM.JoinType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join List</em>' containment reference list.
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getScenarioType_JoinList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Join'"
	 * @generated
	 */
	EList<JoinType> getJoinList();

	/**
	 * Returns the value of the '<em><b>Parent Refinement List</b></em>' reference list.
	 * The list contents are of type {@link ca.carleton.sce.puma.CSM.RefinementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Refinement List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Refinement List</em>' reference list.
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getScenarioType_ParentRefinementList()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='attribute' name='parentRefinementList'"
	 * @generated
	 */
	EList<RefinementType> getParentRefinementList();

	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(String)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getScenarioType_Probability()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='probability'"
	 * @generated
	 */
	String getProbability();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.ScenarioType#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(String value);

} // ScenarioType
