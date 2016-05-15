/**
 */
package ca.carleton.sce.puma.CSM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Out Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.OutBindingType#getEnd <em>End</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.OutBindingType#getOutStep <em>Out Step</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.carleton.sce.puma.CSM.CSMPackage#getOutBindingType()
 * @model extendedMetaData="name='OutBindingType' kind='empty'"
 * @generated
 */
public interface OutBindingType extends EObject {
	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(EndType)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getOutBindingType_End()
	 * @model resolveProxies="false" required="true"
	 *        extendedMetaData="kind='attribute' name='end'"
	 * @generated
	 */
	EndType getEnd();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.OutBindingType#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(EndType value);

	/**
	 * Returns the value of the '<em><b>Out Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Step</em>' reference.
	 * @see #setOutStep(StepType)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getOutBindingType_OutStep()
	 * @model resolveProxies="false" required="true"
	 *        extendedMetaData="kind='attribute' name='outStep'"
	 * @generated
	 */
	StepType getOutStep();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.OutBindingType#getOutStep <em>Out Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Step</em>' reference.
	 * @see #getOutStep()
	 * @generated
	 */
	void setOutStep(StepType value);

} // OutBindingType
