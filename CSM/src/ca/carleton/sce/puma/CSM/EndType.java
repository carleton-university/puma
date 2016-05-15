/**
 */
package ca.carleton.sce.puma.CSM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.EndType#getOutBinding <em>Out Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.carleton.sce.puma.CSM.CSMPackage#getEndType()
 * @model extendedMetaData="name='EndType' kind='empty'"
 * @generated
 */
public interface EndType extends PathConnectionType {
	/**
	 * Returns the value of the '<em><b>Out Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Binding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Binding</em>' reference.
	 * @see #setOutBinding(OutBindingType)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getEndType_OutBinding()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='attribute' name='outBinding'"
	 * @generated
	 */
	OutBindingType getOutBinding();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.EndType#getOutBinding <em>Out Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Binding</em>' reference.
	 * @see #getOutBinding()
	 * @generated
	 */
	void setOutBinding(OutBindingType value);

} // EndType
