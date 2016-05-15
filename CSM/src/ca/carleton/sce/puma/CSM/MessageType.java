/**
 */
package ca.carleton.sce.puma.CSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.MessageType#getKind <em>Kind</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.MessageType#getMulti <em>Multi</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.MessageType#getRelatedMessage <em>Related Message</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.MessageType#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.carleton.sce.puma.CSM.CSMPackage#getMessageType()
 * @model extendedMetaData="name='MessageType' kind='empty'"
 * @generated
 */
public interface MessageType extends ClassifierType {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The default value is <code>"async"</code>.
	 * The literals are from the enumeration {@link ca.carleton.sce.puma.CSM.MsgKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see ca.carleton.sce.puma.CSM.MsgKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #setKind(MsgKind)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getMessageType_Kind()
	 * @model default="async" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='kind'"
	 * @generated
	 */
	MsgKind getKind();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.MessageType#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see ca.carleton.sce.puma.CSM.MsgKind
	 * @see #isSetKind()
	 * @see #unsetKind()
	 * @see #getKind()
	 * @generated
	 */
	void setKind(MsgKind value);

	/**
	 * Unsets the value of the '{@link ca.carleton.sce.puma.CSM.MessageType#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKind()
	 * @see #getKind()
	 * @see #setKind(MsgKind)
	 * @generated
	 */
	void unsetKind();

	/**
	 * Returns whether the value of the '{@link ca.carleton.sce.puma.CSM.MessageType#getKind <em>Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kind</em>' attribute is set.
	 * @see #unsetKind()
	 * @see #getKind()
	 * @see #setKind(MsgKind)
	 * @generated
	 */
	boolean isSetKind();

	/**
	 * Returns the value of the '<em><b>Multi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi</em>' attribute.
	 * @see #setMulti(String)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getMessageType_Multi()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='multi'"
	 * @generated
	 */
	String getMulti();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.MessageType#getMulti <em>Multi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi</em>' attribute.
	 * @see #getMulti()
	 * @generated
	 */
	void setMulti(String value);

	/**
	 * Returns the value of the '<em><b>Related Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Message</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Message</em>' reference.
	 * @see #setRelatedMessage(MessageType)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getMessageType_RelatedMessage()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='attribute' name='relatedMessage'"
	 * @generated
	 */
	MessageType getRelatedMessage();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.MessageType#getRelatedMessage <em>Related Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Message</em>' reference.
	 * @see #getRelatedMessage()
	 * @generated
	 */
	void setRelatedMessage(MessageType value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(String)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getMessageType_Size()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='size'"
	 * @generated
	 */
	String getSize();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.MessageType#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(String value);

} // MessageType
