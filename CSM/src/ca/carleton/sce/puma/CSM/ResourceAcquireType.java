/**
 */
package ca.carleton.sce.puma.CSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Acquire Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.ResourceAcquireType#getAcquire <em>Acquire</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.ResourceAcquireType#getPriority <em>Priority</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.ResourceAcquireType#getRUnits <em>RUnits</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.carleton.sce.puma.CSM.CSMPackage#getResourceAcquireType()
 * @model extendedMetaData="name='ResourceAcquireType' kind='elementOnly'"
 * @generated
 */
public interface ResourceAcquireType extends StepType {
	/**
	 * Returns the value of the '<em><b>Acquire</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acquire</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acquire</em>' reference.
	 * @see #setAcquire(GeneralResourceType)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getResourceAcquireType_Acquire()
	 * @model resolveProxies="false" required="true"
	 *        extendedMetaData="kind='attribute' name='acquire'"
	 * @generated
	 */
	GeneralResourceType getAcquire();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.ResourceAcquireType#getAcquire <em>Acquire</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acquire</em>' reference.
	 * @see #getAcquire()
	 * @generated
	 */
	void setAcquire(GeneralResourceType value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(String)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getResourceAcquireType_Priority()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='priority'"
	 * @generated
	 */
	String getPriority();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.ResourceAcquireType#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(String value);

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
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getResourceAcquireType_RUnits()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='rUnits'"
	 * @generated
	 */
	String getRUnits();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.ResourceAcquireType#getRUnits <em>RUnits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RUnits</em>' attribute.
	 * @see #getRUnits()
	 * @generated
	 */
	void setRUnits(String value);

} // ResourceAcquireType
