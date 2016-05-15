/**
 */
package ca.carleton.sce.puma.CSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Release Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.ResourceReleaseType#getRelease <em>Release</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.ResourceReleaseType#getRUnits <em>RUnits</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.carleton.sce.puma.CSM.CSMPackage#getResourceReleaseType()
 * @model extendedMetaData="name='ResourceReleaseType' kind='elementOnly'"
 * @generated
 */
public interface ResourceReleaseType extends StepType {
	/**
	 * Returns the value of the '<em><b>Release</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Release</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release</em>' reference.
	 * @see #setRelease(GeneralResourceType)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getResourceReleaseType_Release()
	 * @model resolveProxies="false" required="true"
	 *        extendedMetaData="kind='attribute' name='release'"
	 * @generated
	 */
	GeneralResourceType getRelease();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.ResourceReleaseType#getRelease <em>Release</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release</em>' reference.
	 * @see #getRelease()
	 * @generated
	 */
	void setRelease(GeneralResourceType value);

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
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getResourceReleaseType_RUnits()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='rUnits'"
	 * @generated
	 */
	String getRUnits();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.ResourceReleaseType#getRUnits <em>RUnits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RUnits</em>' attribute.
	 * @see #getRUnits()
	 * @generated
	 */
	void setRUnits(String value);

} // ResourceReleaseType
