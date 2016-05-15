/**
 */
package ca.carleton.sce.puma.CSM.impl;

import ca.carleton.sce.puma.CSM.CSMPackage;
import ca.carleton.sce.puma.CSM.CommLinkType;
import ca.carleton.sce.puma.CSM.CommStepType;

import ca.carleton.sce.puma.CSM.ComponentType;
import ca.carleton.sce.puma.CSM.CommunicationLinkType;
import ca.carleton.sce.puma.CSM.MsgKind;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comm Step Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.CommStepTypeImpl#getCommLink <em>Comm Link</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.CommStepTypeImpl#getMsgKind <em>Msg Kind</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.CommStepTypeImpl#getMsgSize <em>Msg Size</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.CommStepTypeImpl#getPredCommStep <em>Pred Comm Step</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.CommStepTypeImpl#getRcvComp <em>Rcv Comp</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.CommStepTypeImpl#getSuccCommStep <em>Succ Comm Step</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.CommStepTypeImpl#getTxComp <em>Tx Comp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommStepTypeImpl extends StepTypeImpl implements CommStepType {
	/**
	 * The cached value of the '{@link #getCommLink() <em>Comm Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommLink()
	 * @generated
	 * @ordered
	 */
	protected CommLinkType commLink;

	/**
	 * The default value of the '{@link #getMsgKind() <em>Msg Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsgKind()
	 * @generated
	 * @ordered
	 */
	protected static final MsgKind MSG_KIND_EDEFAULT = MsgKind.ASYNC;

	/**
	 * The cached value of the '{@link #getMsgKind() <em>Msg Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsgKind()
	 * @generated
	 * @ordered
	 */
	protected MsgKind msgKind = MSG_KIND_EDEFAULT;

	/**
	 * This is true if the Msg Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean msgKindESet;

	/**
	 * The default value of the '{@link #getMsgSize() <em>Msg Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsgSize()
	 * @generated
	 * @ordered
	 */
	protected static final String MSG_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMsgSize() <em>Msg Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsgSize()
	 * @generated
	 * @ordered
	 */
	protected String msgSize = MSG_SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPredCommStep() <em>Pred Comm Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredCommStep()
	 * @generated
	 * @ordered
	 */
	protected CommStepType predCommStep;

	/**
	 * The cached value of the '{@link #getRcvComp() <em>Rcv Comp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRcvComp()
	 * @generated
	 * @ordered
	 */
	protected ComponentType rcvComp;

	/**
	 * The cached value of the '{@link #getSuccCommStep() <em>Succ Comm Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccCommStep()
	 * @generated
	 * @ordered
	 */
	protected CommStepType succCommStep;

	/**
	 * The cached value of the '{@link #getTxComp() <em>Tx Comp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxComp()
	 * @generated
	 * @ordered
	 */
	protected ComponentType txComp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public CommStepTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSMPackage.Literals.COMM_STEP_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommLinkType getCommLink() {
		return commLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommLink(CommLinkType newCommLink) {
		CommLinkType oldCommLink = commLink;
		commLink = newCommLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.COMM_STEP_TYPE__COMM_LINK, oldCommLink, commLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MsgKind getMsgKind() {
		return msgKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMsgKind(MsgKind newMsgKind) {
		MsgKind oldMsgKind = msgKind;
		msgKind = newMsgKind == null ? MSG_KIND_EDEFAULT : newMsgKind;
		boolean oldMsgKindESet = msgKindESet;
		msgKindESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.COMM_STEP_TYPE__MSG_KIND, oldMsgKind, msgKind, !oldMsgKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMsgKind() {
		MsgKind oldMsgKind = msgKind;
		boolean oldMsgKindESet = msgKindESet;
		msgKind = MSG_KIND_EDEFAULT;
		msgKindESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CSMPackage.COMM_STEP_TYPE__MSG_KIND, oldMsgKind, MSG_KIND_EDEFAULT, oldMsgKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMsgKind() {
		return msgKindESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMsgSize() {
		return msgSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMsgSize(String newMsgSize) {
		String oldMsgSize = msgSize;
		msgSize = newMsgSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.COMM_STEP_TYPE__MSG_SIZE, oldMsgSize, msgSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommStepType getPredCommStep() {
		return predCommStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredCommStep(CommStepType newPredCommStep) {
		CommStepType oldPredCommStep = predCommStep;
		predCommStep = newPredCommStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.COMM_STEP_TYPE__PRED_COMM_STEP, oldPredCommStep, predCommStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType getRcvComp() {
		return rcvComp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRcvComp(ComponentType newRcvComp) {
		ComponentType oldRcvComp = rcvComp;
		rcvComp = newRcvComp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.COMM_STEP_TYPE__RCV_COMP, oldRcvComp, rcvComp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommStepType getSuccCommStep() {
		return succCommStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccCommStep(CommStepType newSuccCommStep) {
		CommStepType oldSuccCommStep = succCommStep;
		succCommStep = newSuccCommStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.COMM_STEP_TYPE__SUCC_COMM_STEP, oldSuccCommStep, succCommStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType getTxComp() {
		return txComp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTxComp(ComponentType newTxComp) {
		ComponentType oldTxComp = txComp;
		txComp = newTxComp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.COMM_STEP_TYPE__TX_COMP, oldTxComp, txComp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CSMPackage.COMM_STEP_TYPE__COMM_LINK:
				return getCommLink();
			case CSMPackage.COMM_STEP_TYPE__MSG_KIND:
				return getMsgKind();
			case CSMPackage.COMM_STEP_TYPE__MSG_SIZE:
				return getMsgSize();
			case CSMPackage.COMM_STEP_TYPE__PRED_COMM_STEP:
				return getPredCommStep();
			case CSMPackage.COMM_STEP_TYPE__RCV_COMP:
				return getRcvComp();
			case CSMPackage.COMM_STEP_TYPE__SUCC_COMM_STEP:
				return getSuccCommStep();
			case CSMPackage.COMM_STEP_TYPE__TX_COMP:
				return getTxComp();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CSMPackage.COMM_STEP_TYPE__COMM_LINK:
				setCommLink((CommLinkType)newValue);
				return;
			case CSMPackage.COMM_STEP_TYPE__MSG_KIND:
				setMsgKind((MsgKind)newValue);
				return;
			case CSMPackage.COMM_STEP_TYPE__MSG_SIZE:
				setMsgSize((String)newValue);
				return;
			case CSMPackage.COMM_STEP_TYPE__PRED_COMM_STEP:
				setPredCommStep((CommStepType)newValue);
				return;
			case CSMPackage.COMM_STEP_TYPE__RCV_COMP:
				setRcvComp((ComponentType)newValue);
				return;
			case CSMPackage.COMM_STEP_TYPE__SUCC_COMM_STEP:
				setSuccCommStep((CommStepType)newValue);
				return;
			case CSMPackage.COMM_STEP_TYPE__TX_COMP:
				setTxComp((ComponentType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CSMPackage.COMM_STEP_TYPE__COMM_LINK:
				setCommLink((CommLinkType)null);
				return;
			case CSMPackage.COMM_STEP_TYPE__MSG_KIND:
				unsetMsgKind();
				return;
			case CSMPackage.COMM_STEP_TYPE__MSG_SIZE:
				setMsgSize(MSG_SIZE_EDEFAULT);
				return;
			case CSMPackage.COMM_STEP_TYPE__PRED_COMM_STEP:
				setPredCommStep((CommStepType)null);
				return;
			case CSMPackage.COMM_STEP_TYPE__RCV_COMP:
				setRcvComp((ComponentType)null);
				return;
			case CSMPackage.COMM_STEP_TYPE__SUCC_COMM_STEP:
				setSuccCommStep((CommStepType)null);
				return;
			case CSMPackage.COMM_STEP_TYPE__TX_COMP:
				setTxComp((ComponentType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CSMPackage.COMM_STEP_TYPE__COMM_LINK:
				return commLink != null;
			case CSMPackage.COMM_STEP_TYPE__MSG_KIND:
				return isSetMsgKind();
			case CSMPackage.COMM_STEP_TYPE__MSG_SIZE:
				return MSG_SIZE_EDEFAULT == null ? msgSize != null : !MSG_SIZE_EDEFAULT.equals(msgSize);
			case CSMPackage.COMM_STEP_TYPE__PRED_COMM_STEP:
				return predCommStep != null;
			case CSMPackage.COMM_STEP_TYPE__RCV_COMP:
				return rcvComp != null;
			case CSMPackage.COMM_STEP_TYPE__SUCC_COMM_STEP:
				return succCommStep != null;
			case CSMPackage.COMM_STEP_TYPE__TX_COMP:
				return txComp != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (msgKind: ");
		if (msgKindESet) result.append(msgKind); else result.append("<unset>");
		result.append(", msgSize: ");
		result.append(msgSize);
		result.append(')');
		return result.toString();
	}

} //CommStepTypeImpl
