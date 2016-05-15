/**
 */
package ca.carleton.sce.puma.CSM.impl;

import ca.carleton.sce.puma.CSM.CSMPackage;
import ca.carleton.sce.puma.CSM.LogicalResourceType;
import ca.carleton.sce.puma.CSM.GeneralResourceType;
import ca.carleton.sce.puma.CSM.ResourcePassType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Pass Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.ResourcePassTypeImpl#getPass <em>Pass</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.ResourcePassTypeImpl#getRUnits <em>RUnits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourcePassTypeImpl extends StepTypeImpl implements ResourcePassType {
	/**
	 * The cached value of the '{@link #getPass() <em>Pass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPass()
	 * @generated
	 * @ordered
	 */
	protected LogicalResourceType pass;

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
	protected ResourcePassTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSMPackage.Literals.RESOURCE_PASS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalResourceType getPass() {
		return pass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPass(LogicalResourceType newPass) {
		LogicalResourceType oldPass = pass;
		pass = newPass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.RESOURCE_PASS_TYPE__PASS, oldPass, pass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.RESOURCE_PASS_TYPE__RUNITS, oldRUnits, rUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CSMPackage.RESOURCE_PASS_TYPE__PASS:
				return getPass();
			case CSMPackage.RESOURCE_PASS_TYPE__RUNITS:
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
			case CSMPackage.RESOURCE_PASS_TYPE__PASS:
				setPass((LogicalResourceType)newValue);
				return;
			case CSMPackage.RESOURCE_PASS_TYPE__RUNITS:
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
			case CSMPackage.RESOURCE_PASS_TYPE__PASS:
				setPass((LogicalResourceType)null);
				return;
			case CSMPackage.RESOURCE_PASS_TYPE__RUNITS:
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
			case CSMPackage.RESOURCE_PASS_TYPE__PASS:
				return pass != null;
			case CSMPackage.RESOURCE_PASS_TYPE__RUNITS:
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
		result.append(" (rUnits: ");
		result.append(rUnits);
		result.append(')');
		return result.toString();
	}

} //ResourcePassTypeImpl
