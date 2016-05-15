/**
 */
package ca.carleton.sce.puma.CSM.impl;

import ca.carleton.sce.puma.CSM.ActiveResourceType;
import ca.carleton.sce.puma.CSM.CSMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Active Resource Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.ActiveResourceTypeImpl#getOpTime <em>Op Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActiveResourceTypeImpl extends GeneralResourceTypeImpl implements ActiveResourceType {
	/**
	 * The default value of the '{@link #getOpTime() <em>Op Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpTime()
	 * @generated
	 * @ordered
	 */
	protected static final String OP_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpTime() <em>Op Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpTime()
	 * @generated
	 * @ordered
	 */
	protected String opTime = OP_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActiveResourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSMPackage.Literals.ACTIVE_RESOURCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOpTime() {
		return opTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpTime(String newOpTime) {
		String oldOpTime = opTime;
		opTime = newOpTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.ACTIVE_RESOURCE_TYPE__OP_TIME, oldOpTime, opTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CSMPackage.ACTIVE_RESOURCE_TYPE__OP_TIME:
				return getOpTime();
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
			case CSMPackage.ACTIVE_RESOURCE_TYPE__OP_TIME:
				setOpTime((String)newValue);
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
			case CSMPackage.ACTIVE_RESOURCE_TYPE__OP_TIME:
				setOpTime(OP_TIME_EDEFAULT);
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
			case CSMPackage.ACTIVE_RESOURCE_TYPE__OP_TIME:
				return OP_TIME_EDEFAULT == null ? opTime != null : !OP_TIME_EDEFAULT.equals(opTime);
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
		result.append(" (opTime: ");
		result.append(opTime);
		result.append(')');
		return result.toString();
	}

} //ActiveResourceTypeImpl
