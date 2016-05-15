/**
 */
package ca.carleton.sce.puma.CSM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processing Resource Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.ProcessingResourceType#getCommLinkList <em>Comm Link List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.ProcessingResourceType#getCommRcvOvh <em>Comm Rcv Ovh</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.ProcessingResourceType#getCommTxOvh <em>Comm Tx Ovh</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.ProcessingResourceType#getSpeedFactor <em>Speed Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.carleton.sce.puma.CSM.CSMPackage#getProcessingResourceType()
 * @model extendedMetaData="name='ProcessingResourceType' kind='empty'"
 * @generated
 */
public interface ProcessingResourceType extends ActiveResourceType {
	/**
	 * Returns the value of the '<em><b>Comm Link List</b></em>' reference list.
	 * The list contents are of type {@link ca.carleton.sce.puma.CSM.CommLinkType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comm Link List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comm Link List</em>' reference list.
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getProcessingResourceType_CommLinkList()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='attribute' name='commLinkList'"
	 * @generated
	 */
	EList<CommLinkType> getCommLinkList();

	/**
	 * Returns the value of the '<em><b>Comm Rcv Ovh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comm Rcv Ovh</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comm Rcv Ovh</em>' attribute.
	 * @see #setCommRcvOvh(String)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getProcessingResourceType_CommRcvOvh()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='commRcvOvh'"
	 * @generated
	 */
	String getCommRcvOvh();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.ProcessingResourceType#getCommRcvOvh <em>Comm Rcv Ovh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comm Rcv Ovh</em>' attribute.
	 * @see #getCommRcvOvh()
	 * @generated
	 */
	void setCommRcvOvh(String value);

	/**
	 * Returns the value of the '<em><b>Comm Tx Ovh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comm Tx Ovh</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comm Tx Ovh</em>' attribute.
	 * @see #setCommTxOvh(String)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getProcessingResourceType_CommTxOvh()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='commTxOvh'"
	 * @generated
	 */
	String getCommTxOvh();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.ProcessingResourceType#getCommTxOvh <em>Comm Tx Ovh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comm Tx Ovh</em>' attribute.
	 * @see #getCommTxOvh()
	 * @generated
	 */
	void setCommTxOvh(String value);

	/**
	 * Returns the value of the '<em><b>Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed Factor</em>' attribute.
	 * @see #setSpeedFactor(float)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getProcessingResourceType_SpeedFactor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='speedFactor'"
	 * @generated
	 */
	float getSpeedFactor();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.ProcessingResourceType#getSpeedFactor <em>Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed Factor</em>' attribute.
	 * @see #getSpeedFactor()
	 * @generated
	 */
	void setSpeedFactor(float value);

} // ProcessingResourceType
