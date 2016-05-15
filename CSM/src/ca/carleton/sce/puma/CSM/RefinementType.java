/**
 */
package ca.carleton.sce.puma.CSM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refinement Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.RefinementType#getInBinding <em>In Binding</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.RefinementType#getOutBinding <em>Out Binding</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.RefinementType#getRoleBindingList <em>Role Binding List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.RefinementType#getParentStep <em>Parent Step</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.RefinementType#getSubScenario <em>Sub Scenario</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.carleton.sce.puma.CSM.CSMPackage#getRefinementType()
 * @model extendedMetaData="name='RefinementType' kind='elementOnly'"
 * @generated
 */
public interface RefinementType extends EObject {
	/**
	 * Returns the value of the '<em><b>In Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Binding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Binding</em>' containment reference.
	 * @see #setInBinding(InBindingType)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getRefinementType_InBinding()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='InBinding'"
	 * @generated
	 */
	InBindingType getInBinding();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.RefinementType#getInBinding <em>In Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Binding</em>' containment reference.
	 * @see #getInBinding()
	 * @generated
	 */
	void setInBinding(InBindingType value);

	/**
	 * Returns the value of the '<em><b>Out Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Binding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Binding</em>' containment reference.
	 * @see #setOutBinding(OutBindingType)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getRefinementType_OutBinding()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='OutBinding'"
	 * @generated
	 */
	OutBindingType getOutBinding();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.RefinementType#getOutBinding <em>Out Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Binding</em>' containment reference.
	 * @see #getOutBinding()
	 * @generated
	 */
	void setOutBinding(OutBindingType value);

	/**
	 * Returns the value of the '<em><b>Role Binding List</b></em>' containment reference list.
	 * The list contents are of type {@link ca.carleton.sce.puma.CSM.RoleBindingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Binding List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Binding List</em>' containment reference list.
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getRefinementType_RoleBindingList()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RoleBinding'"
	 * @generated
	 */
	EList<RoleBindingType> getRoleBindingList();

	/**
	 * Returns the value of the '<em><b>Parent Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Step</em>' reference.
	 * @see #setParentStep(StepType)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getRefinementType_ParentStep()
	 * @model resolveProxies="false" required="true"
	 *        extendedMetaData="kind='attribute' name='parentStep'"
	 * @generated
	 */
	StepType getParentStep();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.RefinementType#getParentStep <em>Parent Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Step</em>' reference.
	 * @see #getParentStep()
	 * @generated
	 */
	void setParentStep(StepType value);

	/**
	 * Returns the value of the '<em><b>Sub Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Scenario</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Scenario</em>' reference.
	 * @see #setSubScenario(ScenarioType)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getRefinementType_SubScenario()
	 * @model resolveProxies="false" required="true"
	 *        extendedMetaData="kind='attribute' name='subScenario'"
	 * @generated
	 */
	ScenarioType getSubScenario();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.RefinementType#getSubScenario <em>Sub Scenario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Scenario</em>' reference.
	 * @see #getSubScenario()
	 * @generated
	 */
	void setSubScenario(ScenarioType value);

} // RefinementType
