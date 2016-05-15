/**
 */
package ca.carleton.sce.puma.CSM.impl;

import ca.carleton.sce.puma.CSM.CSMPackage;
import ca.carleton.sce.puma.CSM.GeneralResourceType;
import ca.carleton.sce.puma.CSM.ResourceReleaseType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Release Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.ResourceReleaseTypeImpl#getRelease <em>Release</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.ResourceReleaseTypeImpl#getRUnits <em>RUnits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceReleaseTypeImpl extends StepTypeImpl implements ResourceReleaseType {
	/**
	 * The cached value of the '{@link #getRelease() <em>Release</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelease()
	 * @generated
	 * @ordered
	 */
	protected GeneralResourceType release;

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
	protected ResourceReleaseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSMPackage.Literals.RESOURCE_RELEASE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralResourceType getRelease() {
		return release;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelease(GeneralResourceType newRelease) {
		GeneralResourceType oldRelease = release;
		release = newRelease;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.RESOURCE_RELEASE_TYPE__RELEASE, oldRelease, release));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.RESOURCE_RELEASE_TYPE__RUNITS, oldRUnits, rUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CSMPackage.RESOURCE_RELEASE_TYPE__RELEASE:
				return getRelease();
			case CSMPackage.RESOURCE_RELEASE_TYPE__RUNITS:
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
			case CSMPackage.RESOURCE_RELEASE_TYPE__RELEASE:
				setRelease((GeneralResourceType)newValue);
				return;
			case CSMPackage.RESOURCE_RELEASE_TYPE__RUNITS:
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
			case CSMPackage.RESOURCE_RELEASE_TYPE__RELEASE:
				setRelease((GeneralResourceType)null);
				return;
			case CSMPackage.RESOURCE_RELEASE_TYPE__RUNITS:
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
			case CSMPackage.RESOURCE_RELEASE_TYPE__RELEASE:
				return release != null;
			case CSMPackage.RESOURCE_RELEASE_TYPE__RUNITS:
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

} //ResourceReleaseTypeImpl
