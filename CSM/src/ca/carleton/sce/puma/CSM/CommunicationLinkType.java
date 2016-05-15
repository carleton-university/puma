/**
 */
package ca.carleton.sce.puma.CSM;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Link Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.CommunicationLinkType#getBlockT <em>Block T</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.CommunicationLinkType#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.CommunicationLinkType#getProcessingHosts <em>Processing Hosts</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.CommunicationLinkType#getResMult <em>Res Mult</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.CommunicationLinkType#getSpeedFactor <em>Speed Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.carleton.sce.puma.CSM.CSMPackage#getCommunicationLinkType()
 * @model extendedMetaData="name='CommunicationLinkType' kind='empty'"
 * @generated
 */
public interface CommunicationLinkType extends EObject {
	/**
	 * Returns the value of the '<em><b>Block T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block T</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block T</em>' attribute.
	 * @see #setBlockT(String)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getCommunicationLinkType_BlockT()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='blockT'"
	 * @generated
	 */
	String getBlockT();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.CommunicationLinkType#getBlockT <em>Block T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block T</em>' attribute.
	 * @see #getBlockT()
	 * @generated
	 */
	void setBlockT(String value);

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(String)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getCommunicationLinkType_Capacity()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='capacity'"
	 * @generated
	 */
	String getCapacity();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.CommunicationLinkType#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(String value);

	/**
	 * Returns the value of the '<em><b>Processing Hosts</b></em>' reference list.
	 * The list contents are of type {@link ca.carleton.sce.puma.CSM.ProcessingResourceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Hosts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Hosts</em>' reference list.
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getCommunicationLinkType_ProcessingHosts()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='attribute' name='processingHosts'"
	 * @generated
	 */
	EList<ProcessingResourceType> getProcessingHosts();

	/**
	 * Returns the value of the '<em><b>Res Mult</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Res Mult</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Res Mult</em>' attribute.
	 * @see #isSetResMult()
	 * @see #unsetResMult()
	 * @see #setResMult(int)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getCommunicationLinkType_ResMult()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='resMult'"
	 * @generated
	 */
	int getResMult();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.CommunicationLinkType#getResMult <em>Res Mult</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Res Mult</em>' attribute.
	 * @see #isSetResMult()
	 * @see #unsetResMult()
	 * @see #getResMult()
	 * @generated
	 */
	void setResMult(int value);

	/**
	 * Unsets the value of the '{@link ca.carleton.sce.puma.CSM.CommunicationLinkType#getResMult <em>Res Mult</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResMult()
	 * @see #getResMult()
	 * @see #setResMult(int)
	 * @generated
	 */
	void unsetResMult();

	/**
	 * Returns whether the value of the '{@link ca.carleton.sce.puma.CSM.CommunicationLinkType#getResMult <em>Res Mult</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Res Mult</em>' attribute is set.
	 * @see #unsetResMult()
	 * @see #getResMult()
	 * @see #setResMult(int)
	 * @generated
	 */
	boolean isSetResMult();

	/**
	 * Returns the value of the '<em><b>Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed Factor</em>' attribute.
	 * @see #isSetSpeedFactor()
	 * @see #unsetSpeedFactor()
	 * @see #setSpeedFactor(float)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getCommunicationLinkType_SpeedFactor()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='speedFactor'"
	 * @generated
	 */
	float getSpeedFactor();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.CommunicationLinkType#getSpeedFactor <em>Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed Factor</em>' attribute.
	 * @see #isSetSpeedFactor()
	 * @see #unsetSpeedFactor()
	 * @see #getSpeedFactor()
	 * @generated
	 */
	void setSpeedFactor(float value);

	/**
	 * Unsets the value of the '{@link ca.carleton.sce.puma.CSM.CommunicationLinkType#getSpeedFactor <em>Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpeedFactor()
	 * @see #getSpeedFactor()
	 * @see #setSpeedFactor(float)
	 * @generated
	 */
	void unsetSpeedFactor();

	/**
	 * Returns whether the value of the '{@link ca.carleton.sce.puma.CSM.CommunicationLinkType#getSpeedFactor <em>Speed Factor</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Speed Factor</em>' attribute is set.
	 * @see #unsetSpeedFactor()
	 * @see #getSpeedFactor()
	 * @see #setSpeedFactor(float)
	 * @generated
	 */
	boolean isSetSpeedFactor();

} // CommunicationLinkType
