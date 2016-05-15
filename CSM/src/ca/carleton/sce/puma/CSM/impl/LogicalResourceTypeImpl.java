/**
 */
package ca.carleton.sce.puma.CSM.impl;

import ca.carleton.sce.puma.CSM.CSMPackage;
import ca.carleton.sce.puma.CSM.LogicalResourceType;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Resource Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.LogicalResourceTypeImpl#isNestedOnly <em>Nested Only</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LogicalResourceTypeImpl extends GeneralResourceTypeImpl implements LogicalResourceType {
	/**
	 * The default value of the '{@link #isNestedOnly() <em>Nested Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNestedOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NESTED_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNestedOnly() <em>Nested Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNestedOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean nestedOnly = NESTED_ONLY_EDEFAULT;

	/**
	 * This is true if the Nested Only attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nestedOnlyESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalResourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSMPackage.Literals.LOGICAL_RESOURCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNestedOnly() {
		return nestedOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNestedOnly(boolean newNestedOnly) {
		boolean oldNestedOnly = nestedOnly;
		nestedOnly = newNestedOnly;
		boolean oldNestedOnlyESet = nestedOnlyESet;
		nestedOnlyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.LOGICAL_RESOURCE_TYPE__NESTED_ONLY, oldNestedOnly, nestedOnly, !oldNestedOnlyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNestedOnly() {
		boolean oldNestedOnly = nestedOnly;
		boolean oldNestedOnlyESet = nestedOnlyESet;
		nestedOnly = NESTED_ONLY_EDEFAULT;
		nestedOnlyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CSMPackage.LOGICAL_RESOURCE_TYPE__NESTED_ONLY, oldNestedOnly, NESTED_ONLY_EDEFAULT, oldNestedOnlyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNestedOnly() {
		return nestedOnlyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CSMPackage.LOGICAL_RESOURCE_TYPE__NESTED_ONLY:
				return isNestedOnly();
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
			case CSMPackage.LOGICAL_RESOURCE_TYPE__NESTED_ONLY:
				setNestedOnly((Boolean)newValue);
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
			case CSMPackage.LOGICAL_RESOURCE_TYPE__NESTED_ONLY:
				unsetNestedOnly();
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
			case CSMPackage.LOGICAL_RESOURCE_TYPE__NESTED_ONLY:
				return isSetNestedOnly();
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
		result.append(" (nestedOnly: ");
		if (nestedOnlyESet) result.append(nestedOnly); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //LogicalResourceTypeImpl
