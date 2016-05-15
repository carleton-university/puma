/**
 */
package ca.carleton.sce.puma.CSM.impl;

import ca.carleton.sce.puma.CSM.CSMPackage;
import ca.carleton.sce.puma.CSM.CommLinkType;
import ca.carleton.sce.puma.CSM.CommunicationLinkType;
import ca.carleton.sce.puma.CSM.ProcessingResourceType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processing Resource Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.ProcessingResourceTypeImpl#getCommLinkList <em>Comm Link List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.ProcessingResourceTypeImpl#getCommRcvOvh <em>Comm Rcv Ovh</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.ProcessingResourceTypeImpl#getCommTxOvh <em>Comm Tx Ovh</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.ProcessingResourceTypeImpl#getSpeedFactor <em>Speed Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessingResourceTypeImpl extends ActiveResourceTypeImpl implements ProcessingResourceType {
	/**
	 * The cached value of the '{@link #getCommLinkList() <em>Comm Link List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommLinkList()
	 * @generated
	 * @ordered
	 */
	protected EList<CommLinkType> commLinkList;

	/**
	 * The default value of the '{@link #getCommRcvOvh() <em>Comm Rcv Ovh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommRcvOvh()
	 * @generated
	 * @ordered
	 */
	protected static final String COMM_RCV_OVH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommRcvOvh() <em>Comm Rcv Ovh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommRcvOvh()
	 * @generated
	 * @ordered
	 */
	protected String commRcvOvh = COMM_RCV_OVH_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommTxOvh() <em>Comm Tx Ovh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommTxOvh()
	 * @generated
	 * @ordered
	 */
	protected static final String COMM_TX_OVH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommTxOvh() <em>Comm Tx Ovh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommTxOvh()
	 * @generated
	 * @ordered
	 */
	protected String commTxOvh = COMM_TX_OVH_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpeedFactor() <em>Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedFactor()
	 * @generated
	 * @ordered
	 */
	protected static final float SPEED_FACTOR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSpeedFactor() <em>Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedFactor()
	 * @generated
	 * @ordered
	 */
	protected float speedFactor = SPEED_FACTOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessingResourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSMPackage.Literals.PROCESSING_RESOURCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommLinkType> getCommLinkList() {
		if (commLinkList == null) {
			commLinkList = new EObjectEList<CommLinkType>(CommLinkType.class, this, CSMPackage.PROCESSING_RESOURCE_TYPE__COMM_LINK_LIST);
		}
		return commLinkList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommRcvOvh() {
		return commRcvOvh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommRcvOvh(String newCommRcvOvh) {
		String oldCommRcvOvh = commRcvOvh;
		commRcvOvh = newCommRcvOvh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.PROCESSING_RESOURCE_TYPE__COMM_RCV_OVH, oldCommRcvOvh, commRcvOvh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommTxOvh() {
		return commTxOvh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommTxOvh(String newCommTxOvh) {
		String oldCommTxOvh = commTxOvh;
		commTxOvh = newCommTxOvh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.PROCESSING_RESOURCE_TYPE__COMM_TX_OVH, oldCommTxOvh, commTxOvh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSpeedFactor() {
		return speedFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeedFactor(float newSpeedFactor) {
		float oldSpeedFactor = speedFactor;
		speedFactor = newSpeedFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.PROCESSING_RESOURCE_TYPE__SPEED_FACTOR, oldSpeedFactor, speedFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CSMPackage.PROCESSING_RESOURCE_TYPE__COMM_LINK_LIST:
				return getCommLinkList();
			case CSMPackage.PROCESSING_RESOURCE_TYPE__COMM_RCV_OVH:
				return getCommRcvOvh();
			case CSMPackage.PROCESSING_RESOURCE_TYPE__COMM_TX_OVH:
				return getCommTxOvh();
			case CSMPackage.PROCESSING_RESOURCE_TYPE__SPEED_FACTOR:
				return getSpeedFactor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CSMPackage.PROCESSING_RESOURCE_TYPE__COMM_LINK_LIST:
				getCommLinkList().clear();
				getCommLinkList().addAll((Collection<? extends CommLinkType>)newValue);
				return;
			case CSMPackage.PROCESSING_RESOURCE_TYPE__COMM_RCV_OVH:
				setCommRcvOvh((String)newValue);
				return;
			case CSMPackage.PROCESSING_RESOURCE_TYPE__COMM_TX_OVH:
				setCommTxOvh((String)newValue);
				return;
			case CSMPackage.PROCESSING_RESOURCE_TYPE__SPEED_FACTOR:
				setSpeedFactor((Float)newValue);
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
			case CSMPackage.PROCESSING_RESOURCE_TYPE__COMM_LINK_LIST:
				getCommLinkList().clear();
				return;
			case CSMPackage.PROCESSING_RESOURCE_TYPE__COMM_RCV_OVH:
				setCommRcvOvh(COMM_RCV_OVH_EDEFAULT);
				return;
			case CSMPackage.PROCESSING_RESOURCE_TYPE__COMM_TX_OVH:
				setCommTxOvh(COMM_TX_OVH_EDEFAULT);
				return;
			case CSMPackage.PROCESSING_RESOURCE_TYPE__SPEED_FACTOR:
				setSpeedFactor(SPEED_FACTOR_EDEFAULT);
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
			case CSMPackage.PROCESSING_RESOURCE_TYPE__COMM_LINK_LIST:
				return commLinkList != null && !commLinkList.isEmpty();
			case CSMPackage.PROCESSING_RESOURCE_TYPE__COMM_RCV_OVH:
				return COMM_RCV_OVH_EDEFAULT == null ? commRcvOvh != null : !COMM_RCV_OVH_EDEFAULT.equals(commRcvOvh);
			case CSMPackage.PROCESSING_RESOURCE_TYPE__COMM_TX_OVH:
				return COMM_TX_OVH_EDEFAULT == null ? commTxOvh != null : !COMM_TX_OVH_EDEFAULT.equals(commTxOvh);
			case CSMPackage.PROCESSING_RESOURCE_TYPE__SPEED_FACTOR:
				return speedFactor != SPEED_FACTOR_EDEFAULT;
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
		result.append(" (commRcvOvh: ");
		result.append(commRcvOvh);
		result.append(", commTxOvh: ");
		result.append(commTxOvh);
		result.append(", speedFactor: ");
		result.append(speedFactor);
		result.append(')');
		return result.toString();
	}

} //ProcessingResourceTypeImpl
