/**
 */
package ca.carleton.sce.puma.CSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Pass Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.ResourcePassType#getPass <em>Pass</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.ResourcePassType#getRUnits <em>RUnits</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.carleton.sce.puma.CSM.CSMPackage#getResourcePassType()
 * @model extendedMetaData="name='ResourcePassType' kind='elementOnly'"
 * @generated
 */
public interface ResourcePassType extends StepType {
	/**
	 * Returns the value of the '<em><b>Pass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pass</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pass</em>' reference.
	 * @see #setPass(LogicalResourceType)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getResourcePassType_Pass()
	 * @model resolveProxies="false" required="true"
	 *        extendedMetaData="kind='attribute' name='pass'"
	 * @generated
	 */
	LogicalResourceType getPass();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.ResourcePassType#getPass <em>Pass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pass</em>' reference.
	 * @see #getPass()
	 * @generated
	 */
	void setPass(LogicalResourceType value);

	/**
	 * Returns the value of the '<em><b>RUnits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RUnits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RUnits</em>' attribute.
	 * @see #setRUnits(String)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getResourcePassType_RUnits()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='rUnits'"
	 * @generated
	 */
	String getRUnits();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.ResourcePassType#getRUnits <em>RUnits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RUnits</em>' attribute.
	 * @see #getRUnits()
	 * @generated
	 */
	void setRUnits(String value);

} // ResourcePassType
