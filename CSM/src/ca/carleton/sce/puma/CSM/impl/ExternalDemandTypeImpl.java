/**
 */
package ca.carleton.sce.puma.CSM.impl;

import ca.carleton.sce.puma.CSM.CSMPackage;
import ca.carleton.sce.puma.CSM.ExternalDemandType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Demand Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.ExternalDemandTypeImpl#getCount <em>Count</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.ExternalDemandTypeImpl#getExternalOperation <em>External Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternalDemandTypeImpl extends ScenarioElementTypeImpl implements ExternalDemandType {
	/**
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected String count = COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getExternalOperation() <em>External Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalOperation()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_OPERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalOperation() <em>External Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalOperation()
	 * @generated
	 * @ordered
	 */
	protected String externalOperation = EXTERNAL_OPERATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalDemandTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSMPackage.Literals.EXTERNAL_DEMAND_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(String newCount) {
		String oldCount = count;
		count = newCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.EXTERNAL_DEMAND_TYPE__COUNT, oldCount, count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExternalOperation() {
		return externalOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalOperation(String newExternalOperation) {
		String oldExternalOperation = externalOperation;
		externalOperation = newExternalOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.EXTERNAL_DEMAND_TYPE__EXTERNAL_OPERATION, oldExternalOperation, externalOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CSMPackage.EXTERNAL_DEMAND_TYPE__COUNT:
				return getCount();
			case CSMPackage.EXTERNAL_DEMAND_TYPE__EXTERNAL_OPERATION:
				return getExternalOperation();
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
			case CSMPackage.EXTERNAL_DEMAND_TYPE__COUNT:
				setCount((String)newValue);
				return;
			case CSMPackage.EXTERNAL_DEMAND_TYPE__EXTERNAL_OPERATION:
				setExternalOperation((String)newValue);
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
			case CSMPackage.EXTERNAL_DEMAND_TYPE__COUNT:
				setCount(COUNT_EDEFAULT);
				return;
			case CSMPackage.EXTERNAL_DEMAND_TYPE__EXTERNAL_OPERATION:
				setExternalOperation(EXTERNAL_OPERATION_EDEFAULT);
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
			case CSMPackage.EXTERNAL_DEMAND_TYPE__COUNT:
				return COUNT_EDEFAULT == null ? count != null : !COUNT_EDEFAULT.equals(count);
			case CSMPackage.EXTERNAL_DEMAND_TYPE__EXTERNAL_OPERATION:
				return EXTERNAL_OPERATION_EDEFAULT == null ? externalOperation != null : !EXTERNAL_OPERATION_EDEFAULT.equals(externalOperation);
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
		result.append(" (count: ");
		result.append(count);
		result.append(", externalOperation: ");
		result.append(externalOperation);
		result.append(')');
		return result.toString();
	}

} //ExternalDemandTypeImpl
