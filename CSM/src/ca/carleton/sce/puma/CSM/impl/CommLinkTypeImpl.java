/**
 */
package ca.carleton.sce.puma.CSM.impl;

import ca.carleton.sce.puma.CSM.CSMPackage;
import ca.carleton.sce.puma.CSM.CommLinkType;
import ca.carleton.sce.puma.CSM.ProcessingResourceType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comm Link Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.CommLinkTypeImpl#getBlockT <em>Block T</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.CommLinkTypeImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.CommLinkTypeImpl#getProcessingHostList <em>Processing Host List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.CommLinkTypeImpl#getResMult <em>Res Mult</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.CommLinkTypeImpl#getSpeedFactor <em>Speed Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommLinkTypeImpl extends ComponentTypeImpl implements CommLinkType {
	/**
	 * The default value of the '{@link #getBlockT() <em>Block T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockT()
	 * @generated
	 * @ordered
	 */
	protected static final String BLOCK_T_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlockT() <em>Block T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockT()
	 * @generated
	 * @ordered
	 */
	protected String blockT = BLOCK_T_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected String capacity = CAPACITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProcessingHostList() <em>Processing Host List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingHostList()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessingResourceType> processingHostList;

	/**
	 * The default value of the '{@link #getResMult() <em>Res Mult</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResMult()
	 * @generated
	 * @ordered
	 */
	protected static final int RES_MULT_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getResMult() <em>Res Mult</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResMult()
	 * @generated
	 * @ordered
	 */
	protected int resMult = RES_MULT_EDEFAULT;

	/**
	 * This is true if the Res Mult attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean resMultESet;

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
	 * This is true if the Speed Factor attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean speedFactorESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommLinkTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSMPackage.Literals.COMM_LINK_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBlockT() {
		return blockT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockT(String newBlockT) {
		String oldBlockT = blockT;
		blockT = newBlockT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.COMM_LINK_TYPE__BLOCK_T, oldBlockT, blockT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacity(String newCapacity) {
		String oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.COMM_LINK_TYPE__CAPACITY, oldCapacity, capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessingResourceType> getProcessingHostList() {
		if (processingHostList == null) {
			processingHostList = new EObjectEList<ProcessingResourceType>(ProcessingResourceType.class, this, CSMPackage.COMM_LINK_TYPE__PROCESSING_HOST_LIST);
		}
		return processingHostList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getResMult() {
		return resMult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResMult(int newResMult) {
		int oldResMult = resMult;
		resMult = newResMult;
		boolean oldResMultESet = resMultESet;
		resMultESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.COMM_LINK_TYPE__RES_MULT, oldResMult, resMult, !oldResMultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetResMult() {
		int oldResMult = resMult;
		boolean oldResMultESet = resMultESet;
		resMult = RES_MULT_EDEFAULT;
		resMultESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CSMPackage.COMM_LINK_TYPE__RES_MULT, oldResMult, RES_MULT_EDEFAULT, oldResMultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetResMult() {
		return resMultESet;
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
		boolean oldSpeedFactorESet = speedFactorESet;
		speedFactorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.COMM_LINK_TYPE__SPEED_FACTOR, oldSpeedFactor, speedFactor, !oldSpeedFactorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpeedFactor() {
		float oldSpeedFactor = speedFactor;
		boolean oldSpeedFactorESet = speedFactorESet;
		speedFactor = SPEED_FACTOR_EDEFAULT;
		speedFactorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CSMPackage.COMM_LINK_TYPE__SPEED_FACTOR, oldSpeedFactor, SPEED_FACTOR_EDEFAULT, oldSpeedFactorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpeedFactor() {
		return speedFactorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CSMPackage.COMM_LINK_TYPE__BLOCK_T:
				return getBlockT();
			case CSMPackage.COMM_LINK_TYPE__CAPACITY:
				return getCapacity();
			case CSMPackage.COMM_LINK_TYPE__PROCESSING_HOST_LIST:
				return getProcessingHostList();
			case CSMPackage.COMM_LINK_TYPE__RES_MULT:
				return getResMult();
			case CSMPackage.COMM_LINK_TYPE__SPEED_FACTOR:
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
			case CSMPackage.COMM_LINK_TYPE__BLOCK_T:
				setBlockT((String)newValue);
				return;
			case CSMPackage.COMM_LINK_TYPE__CAPACITY:
				setCapacity((String)newValue);
				return;
			case CSMPackage.COMM_LINK_TYPE__PROCESSING_HOST_LIST:
				getProcessingHostList().clear();
				getProcessingHostList().addAll((Collection<? extends ProcessingResourceType>)newValue);
				return;
			case CSMPackage.COMM_LINK_TYPE__RES_MULT:
				setResMult((Integer)newValue);
				return;
			case CSMPackage.COMM_LINK_TYPE__SPEED_FACTOR:
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
			case CSMPackage.COMM_LINK_TYPE__BLOCK_T:
				setBlockT(BLOCK_T_EDEFAULT);
				return;
			case CSMPackage.COMM_LINK_TYPE__CAPACITY:
				setCapacity(CAPACITY_EDEFAULT);
				return;
			case CSMPackage.COMM_LINK_TYPE__PROCESSING_HOST_LIST:
				getProcessingHostList().clear();
				return;
			case CSMPackage.COMM_LINK_TYPE__RES_MULT:
				unsetResMult();
				return;
			case CSMPackage.COMM_LINK_TYPE__SPEED_FACTOR:
				unsetSpeedFactor();
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
			case CSMPackage.COMM_LINK_TYPE__BLOCK_T:
				return BLOCK_T_EDEFAULT == null ? blockT != null : !BLOCK_T_EDEFAULT.equals(blockT);
			case CSMPackage.COMM_LINK_TYPE__CAPACITY:
				return CAPACITY_EDEFAULT == null ? capacity != null : !CAPACITY_EDEFAULT.equals(capacity);
			case CSMPackage.COMM_LINK_TYPE__PROCESSING_HOST_LIST:
				return processingHostList != null && !processingHostList.isEmpty();
			case CSMPackage.COMM_LINK_TYPE__RES_MULT:
				return isSetResMult();
			case CSMPackage.COMM_LINK_TYPE__SPEED_FACTOR:
				return isSetSpeedFactor();
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
		result.append(" (blockT: ");
		result.append(blockT);
		result.append(", capacity: ");
		result.append(capacity);
		result.append(", resMult: ");
		if (resMultESet) result.append(resMult); else result.append("<unset>");
		result.append(", speedFactor: ");
		if (speedFactorESet) result.append(speedFactor); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CommLinkTypeImpl
