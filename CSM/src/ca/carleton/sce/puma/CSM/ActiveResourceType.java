/**
 */
package ca.carleton.sce.puma.CSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Active Resource Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.ActiveResourceType#getOpTime <em>Op Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.carleton.sce.puma.CSM.CSMPackage#getActiveResourceType()
 * @model extendedMetaData="name='ActiveResourceType' kind='empty'"
 * @generated
 */
public interface ActiveResourceType extends GeneralResourceType {
	/**
	 * Returns the value of the '<em><b>Op Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op Time</em>' attribute.
	 * @see #setOpTime(String)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getActiveResourceType_OpTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='opTime'"
	 * @generated
	 */
	String getOpTime();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.ActiveResourceType#getOpTime <em>Op Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Time</em>' attribute.
	 * @see #getOpTime()
	 * @generated
	 */
	void setOpTime(String value);

} // ActiveResourceType
