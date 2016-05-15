/**
 */
package ca.carleton.sce.puma.CSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comm Step Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.CommStepType#getCommLink <em>Comm Link</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.CommStepType#getMsgKind <em>Msg Kind</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.CommStepType#getMsgSize <em>Msg Size</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.CommStepType#getPredCommStep <em>Pred Comm Step</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.CommStepType#getRcvComp <em>Rcv Comp</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.CommStepType#getSuccCommStep <em>Succ Comm Step</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.CommStepType#getTxComp <em>Tx Comp</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.carleton.sce.puma.CSM.CSMPackage#getCommStepType()
 * @model extendedMetaData="name='CommStepType' kind='elementOnly'"
 * @generated
 */
public interface CommStepType extends StepType {
	/**
	 * Returns the value of the '<em><b>Comm Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comm Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comm Link</em>' reference.
	 * @see #setCommLink(CommLinkType)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getCommStepType_CommLink()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='attribute' name='commLink'"
	 * @generated
	 */
	CommLinkType getCommLink();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.CommStepType#getCommLink <em>Comm Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comm Link</em>' reference.
	 * @see #getCommLink()
	 * @generated
	 */
	void setCommLink(CommLinkType value);

	/**
	 * Returns the value of the '<em><b>Msg Kind</b></em>' attribute.
	 * The default value is <code>"async"</code>.
	 * The literals are from the enumeration {@link ca.carleton.sce.puma.CSM.MsgKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msg Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msg Kind</em>' attribute.
	 * @see ca.carleton.sce.puma.CSM.MsgKind
	 * @see #isSetMsgKind()
	 * @see #unsetMsgKind()
	 * @see #setMsgKind(MsgKind)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getCommStepType_MsgKind()
	 * @model default="async" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='msgKind'"
	 * @generated
	 */
	MsgKind getMsgKind();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.CommStepType#getMsgKind <em>Msg Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msg Kind</em>' attribute.
	 * @see ca.carleton.sce.puma.CSM.MsgKind
	 * @see #isSetMsgKind()
	 * @see #unsetMsgKind()
	 * @see #getMsgKind()
	 * @generated
	 */
	void setMsgKind(MsgKind value);

	/**
	 * Unsets the value of the '{@link ca.carleton.sce.puma.CSM.CommStepType#getMsgKind <em>Msg Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMsgKind()
	 * @see #getMsgKind()
	 * @see #setMsgKind(MsgKind)
	 * @generated
	 */
	void unsetMsgKind();

	/**
	 * Returns whether the value of the '{@link ca.carleton.sce.puma.CSM.CommStepType#getMsgKind <em>Msg Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Msg Kind</em>' attribute is set.
	 * @see #unsetMsgKind()
	 * @see #getMsgKind()
	 * @see #setMsgKind(MsgKind)
	 * @generated
	 */
	boolean isSetMsgKind();

	/**
	 * Returns the value of the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msg Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msg Size</em>' attribute.
	 * @see #setMsgSize(String)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getCommStepType_MsgSize()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='msgSize'"
	 * @generated
	 */
	String getMsgSize();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.CommStepType#getMsgSize <em>Msg Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msg Size</em>' attribute.
	 * @see #getMsgSize()
	 * @generated
	 */
	void setMsgSize(String value);

	/**
	 * Returns the value of the '<em><b>Pred Comm Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pred Comm Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pred Comm Step</em>' reference.
	 * @see #setPredCommStep(CommStepType)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getCommStepType_PredCommStep()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='attribute' name='predCommStep'"
	 * @generated
	 */
	CommStepType getPredCommStep();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.CommStepType#getPredCommStep <em>Pred Comm Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pred Comm Step</em>' reference.
	 * @see #getPredCommStep()
	 * @generated
	 */
	void setPredCommStep(CommStepType value);

	/**
	 * Returns the value of the '<em><b>Rcv Comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rcv Comp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rcv Comp</em>' reference.
	 * @see #setRcvComp(ComponentType)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getCommStepType_RcvComp()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='attribute' name='rcvComp'"
	 * @generated
	 */
	ComponentType getRcvComp();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.CommStepType#getRcvComp <em>Rcv Comp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rcv Comp</em>' reference.
	 * @see #getRcvComp()
	 * @generated
	 */
	void setRcvComp(ComponentType value);

	/**
	 * Returns the value of the '<em><b>Succ Comm Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Succ Comm Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Succ Comm Step</em>' reference.
	 * @see #setSuccCommStep(CommStepType)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getCommStepType_SuccCommStep()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='attribute' name='succCommStep'"
	 * @generated
	 */
	CommStepType getSuccCommStep();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.CommStepType#getSuccCommStep <em>Succ Comm Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Succ Comm Step</em>' reference.
	 * @see #getSuccCommStep()
	 * @generated
	 */
	void setSuccCommStep(CommStepType value);

	/**
	 * Returns the value of the '<em><b>Tx Comp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tx Comp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tx Comp</em>' reference.
	 * @see #setTxComp(ComponentType)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getCommStepType_TxComp()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='attribute' name='txComp'"
	 * @generated
	 */
	ComponentType getTxComp();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.CommStepType#getTxComp <em>Tx Comp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tx Comp</em>' reference.
	 * @see #getTxComp()
	 * @generated
	 */
	void setTxComp(ComponentType value);

} // CommStepType
