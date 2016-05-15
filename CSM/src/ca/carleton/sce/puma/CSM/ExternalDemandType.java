/**
 */
package ca.carleton.sce.puma.CSM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Demand Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.ExternalDemandType#getCount <em>Count</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.ExternalDemandType#getExternalOperation <em>External Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.carleton.sce.puma.CSM.CSMPackage#getExternalDemandType()
 * @model extendedMetaData="name='ExternalDemandType' kind='empty'"
 * @generated
 */
public interface ExternalDemandType extends ScenarioElementType {
	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(String)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getExternalDemandType_Count()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='count'"
	 * @generated
	 */
	String getCount();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.ExternalDemandType#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(String value);

	/**
	 * Returns the value of the '<em><b>External Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Operation</em>' attribute.
	 * @see #setExternalOperation(String)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getExternalDemandType_ExternalOperation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='externalOperation'"
	 * @generated
	 */
	String getExternalOperation();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.ExternalDemandType#getExternalOperation <em>External Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Operation</em>' attribute.
	 * @see #getExternalOperation()
	 * @generated
	 */
	void setExternalOperation(String value);

} // ExternalDemandType
