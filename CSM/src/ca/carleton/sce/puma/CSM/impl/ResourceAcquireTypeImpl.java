/**
 */
package ca.carleton.sce.puma.CSM.impl;

import ca.carleton.sce.puma.CSM.CSMPackage;
import ca.carleton.sce.puma.CSM.GeneralResourceType;
import ca.carleton.sce.puma.CSM.ResourceAcquireType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Acquire Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.ResourceAcquireTypeImpl#getAcquire <em>Acquire</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.ResourceAcquireTypeImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.ResourceAcquireTypeImpl#getRUnits <em>RUnits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceAcquireTypeImpl extends StepTypeImpl implements ResourceAcquireType {
	/**
	 * The cached value of the '{@link #getAcquire() <em>Acquire</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcquire()
	 * @generated
	 * @ordered
	 */
	protected GeneralResourceType acquire;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected String priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRUnits() <em>RUnits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRUnits()
	 * @generated
	 * @ordered
	 */
	protected static final String RUNITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRUnits() <em>RUnits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRUnits()
	 * @generated
	 * @ordered
	 */
	protected String rUnits = RUNITS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceAcquireTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSMPackage.Literals.RESOURCE_ACQUIRE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralResourceType getAcquire() {
		return acquire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcquire(GeneralResourceType newAcquire) {
		GeneralResourceType oldAcquire = acquire;
		acquire = newAcquire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.RESOURCE_ACQUIRE_TYPE__ACQUIRE, oldAcquire, acquire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(String newPriority) {
		String oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.RESOURCE_ACQUIRE_TYPE__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRUnits() {
		return rUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRUnits(String newRUnits) {
		String oldRUnits = rUnits;
		rUnits = newRUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.RESOURCE_ACQUIRE_TYPE__RUNITS, oldRUnits, rUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CSMPackage.RESOURCE_ACQUIRE_TYPE__ACQUIRE:
				return getAcquire();
			case CSMPackage.RESOURCE_ACQUIRE_TYPE__PRIORITY:
				return getPriority();
			case CSMPackage.RESOURCE_ACQUIRE_TYPE__RUNITS:
				return getRUnits();
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
			case CSMPackage.RESOURCE_ACQUIRE_TYPE__ACQUIRE:
				setAcquire((GeneralResourceType)newValue);
				return;
			case CSMPackage.RESOURCE_ACQUIRE_TYPE__PRIORITY:
				setPriority((String)newValue);
				return;
			case CSMPackage.RESOURCE_ACQUIRE_TYPE__RUNITS:
				setRUnits((String)newValue);
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
			case CSMPackage.RESOURCE_ACQUIRE_TYPE__ACQUIRE:
				setAcquire((GeneralResourceType)null);
				return;
			case CSMPackage.RESOURCE_ACQUIRE_TYPE__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case CSMPackage.RESOURCE_ACQUIRE_TYPE__RUNITS:
				setRUnits(RUNITS_EDEFAULT);
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
			case CSMPackage.RESOURCE_ACQUIRE_TYPE__ACQUIRE:
				return acquire != null;
			case CSMPackage.RESOURCE_ACQUIRE_TYPE__PRIORITY:
				return PRIORITY_EDEFAULT == null ? priority != null : !PRIORITY_EDEFAULT.equals(priority);
			case CSMPackage.RESOURCE_ACQUIRE_TYPE__RUNITS:
				return RUNITS_EDEFAULT == null ? rUnits != null : !RUNITS_EDEFAULT.equals(rUnits);
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
		result.append(" (priority: ");
		result.append(priority);
		result.append(", rUnits: ");
		result.append(rUnits);
		result.append(')');
		return result.toString();
	}

} //ResourceAcquireTypeImpl
