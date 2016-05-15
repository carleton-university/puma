/**
 */
package ca.carleton.sce.puma.CSM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.InBindingType#getInStep <em>In Step</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.InBindingType#getStart <em>Start</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.carleton.sce.puma.CSM.CSMPackage#getInBindingType()
 * @model extendedMetaData="name='InBindingType' kind='empty'"
 * @generated
 */
public interface InBindingType extends EObject {
	/**
	 * Returns the value of the '<em><b>In Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Step</em>' reference.
	 * @see #setInStep(StepType)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getInBindingType_InStep()
	 * @model resolveProxies="false" required="true"
	 *        extendedMetaData="kind='attribute' name='inStep'"
	 * @generated
	 */
	StepType getInStep();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.InBindingType#getInStep <em>In Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Step</em>' reference.
	 * @see #getInStep()
	 * @generated
	 */
	void setInStep(StepType value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(StartType)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getInBindingType_Start()
	 * @model resolveProxies="false" required="true"
	 *        extendedMetaData="kind='attribute' name='start'"
	 * @generated
	 */
	StartType getStart();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.InBindingType#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(StartType value);

} // InBindingType
