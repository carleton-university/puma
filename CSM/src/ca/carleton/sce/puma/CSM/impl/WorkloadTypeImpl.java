/**
 */
package ca.carleton.sce.puma.CSM.impl;

import ca.carleton.sce.puma.CSM.ArrivalProcess;
import ca.carleton.sce.puma.CSM.CSMPackage;
import ca.carleton.sce.puma.CSM.PerfMeasureType;
import ca.carleton.sce.puma.CSM.WorkloadType;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workload Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.WorkloadTypeImpl#getArrivalParam1 <em>Arrival Param1</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.WorkloadTypeImpl#getArrivalParam2 <em>Arrival Param2</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.WorkloadTypeImpl#getArrivalProcess <em>Arrival Process</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.WorkloadTypeImpl#getExternalDelay <em>External Delay</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.WorkloadTypeImpl#getResponseTimeList <em>Response Time List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class WorkloadTypeImpl extends ScenarioElementTypeImpl implements WorkloadType {
	/**
	 * The default value of the '{@link #getArrivalParam1() <em>Arrival Param1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalParam1()
	 * @generated
	 * @ordered
	 */
	protected static final String ARRIVAL_PARAM1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArrivalParam1() <em>Arrival Param1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalParam1()
	 * @generated
	 * @ordered
	 */
	protected String arrivalParam1 = ARRIVAL_PARAM1_EDEFAULT;

	/**
	 * The default value of the '{@link #getArrivalParam2() <em>Arrival Param2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalParam2()
	 * @generated
	 * @ordered
	 */
	protected static final String ARRIVAL_PARAM2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArrivalParam2() <em>Arrival Param2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalParam2()
	 * @generated
	 * @ordered
	 */
	protected String arrivalParam2 = ARRIVAL_PARAM2_EDEFAULT;

	/**
	 * The default value of the '{@link #getArrivalProcess() <em>Arrival Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalProcess()
	 * @generated
	 * @ordered
	 */
	protected static final ArrivalProcess ARRIVAL_PROCESS_EDEFAULT = ArrivalProcess.POISSON_PDF;

	/**
	 * The cached value of the '{@link #getArrivalProcess() <em>Arrival Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrivalProcess()
	 * @generated
	 * @ordered
	 */
	protected ArrivalProcess arrivalProcess = ARRIVAL_PROCESS_EDEFAULT;

	/**
	 * This is true if the Arrival Process attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean arrivalProcessESet;

	/**
	 * The default value of the '{@link #getExternalDelay() <em>External Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalDelay()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_DELAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalDelay() <em>External Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalDelay()
	 * @generated
	 * @ordered
	 */
	protected String externalDelay = EXTERNAL_DELAY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResponseTimeList() <em>Response Time List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseTimeList()
	 * @generated
	 * @ordered
	 */
	protected EList<PerfMeasureType> responseTimeList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkloadTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSMPackage.Literals.WORKLOAD_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArrivalParam1() {
		return arrivalParam1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrivalParam1(String newArrivalParam1) {
		String oldArrivalParam1 = arrivalParam1;
		arrivalParam1 = newArrivalParam1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.WORKLOAD_TYPE__ARRIVAL_PARAM1, oldArrivalParam1, arrivalParam1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArrivalParam2() {
		return arrivalParam2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrivalParam2(String newArrivalParam2) {
		String oldArrivalParam2 = arrivalParam2;
		arrivalParam2 = newArrivalParam2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.WORKLOAD_TYPE__ARRIVAL_PARAM2, oldArrivalParam2, arrivalParam2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrivalProcess getArrivalProcess() {
		return arrivalProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrivalProcess(ArrivalProcess newArrivalProcess) {
		ArrivalProcess oldArrivalProcess = arrivalProcess;
		arrivalProcess = newArrivalProcess == null ? ARRIVAL_PROCESS_EDEFAULT : newArrivalProcess;
		boolean oldArrivalProcessESet = arrivalProcessESet;
		arrivalProcessESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.WORKLOAD_TYPE__ARRIVAL_PROCESS, oldArrivalProcess, arrivalProcess, !oldArrivalProcessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetArrivalProcess() {
		ArrivalProcess oldArrivalProcess = arrivalProcess;
		boolean oldArrivalProcessESet = arrivalProcessESet;
		arrivalProcess = ARRIVAL_PROCESS_EDEFAULT;
		arrivalProcessESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CSMPackage.WORKLOAD_TYPE__ARRIVAL_PROCESS, oldArrivalProcess, ARRIVAL_PROCESS_EDEFAULT, oldArrivalProcessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetArrivalProcess() {
		return arrivalProcessESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExternalDelay() {
		return externalDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalDelay(String newExternalDelay) {
		String oldExternalDelay = externalDelay;
		externalDelay = newExternalDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.WORKLOAD_TYPE__EXTERNAL_DELAY, oldExternalDelay, externalDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PerfMeasureType> getResponseTimeList() {
		if (responseTimeList == null) {
			responseTimeList = new EObjectEList<PerfMeasureType>(PerfMeasureType.class, this, CSMPackage.WORKLOAD_TYPE__RESPONSE_TIME_LIST);
		}
		return responseTimeList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CSMPackage.WORKLOAD_TYPE__ARRIVAL_PARAM1:
				return getArrivalParam1();
			case CSMPackage.WORKLOAD_TYPE__ARRIVAL_PARAM2:
				return getArrivalParam2();
			case CSMPackage.WORKLOAD_TYPE__ARRIVAL_PROCESS:
				return getArrivalProcess();
			case CSMPackage.WORKLOAD_TYPE__EXTERNAL_DELAY:
				return getExternalDelay();
			case CSMPackage.WORKLOAD_TYPE__RESPONSE_TIME_LIST:
				return getResponseTimeList();
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
			case CSMPackage.WORKLOAD_TYPE__ARRIVAL_PARAM1:
				setArrivalParam1((String)newValue);
				return;
			case CSMPackage.WORKLOAD_TYPE__ARRIVAL_PARAM2:
				setArrivalParam2((String)newValue);
				return;
			case CSMPackage.WORKLOAD_TYPE__ARRIVAL_PROCESS:
				setArrivalProcess((ArrivalProcess)newValue);
				return;
			case CSMPackage.WORKLOAD_TYPE__EXTERNAL_DELAY:
				setExternalDelay((String)newValue);
				return;
			case CSMPackage.WORKLOAD_TYPE__RESPONSE_TIME_LIST:
				getResponseTimeList().clear();
				getResponseTimeList().addAll((Collection<? extends PerfMeasureType>)newValue);
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
			case CSMPackage.WORKLOAD_TYPE__ARRIVAL_PARAM1:
				setArrivalParam1(ARRIVAL_PARAM1_EDEFAULT);
				return;
			case CSMPackage.WORKLOAD_TYPE__ARRIVAL_PARAM2:
				setArrivalParam2(ARRIVAL_PARAM2_EDEFAULT);
				return;
			case CSMPackage.WORKLOAD_TYPE__ARRIVAL_PROCESS:
				unsetArrivalProcess();
				return;
			case CSMPackage.WORKLOAD_TYPE__EXTERNAL_DELAY:
				setExternalDelay(EXTERNAL_DELAY_EDEFAULT);
				return;
			case CSMPackage.WORKLOAD_TYPE__RESPONSE_TIME_LIST:
				getResponseTimeList().clear();
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
			case CSMPackage.WORKLOAD_TYPE__ARRIVAL_PARAM1:
				return ARRIVAL_PARAM1_EDEFAULT == null ? arrivalParam1 != null : !ARRIVAL_PARAM1_EDEFAULT.equals(arrivalParam1);
			case CSMPackage.WORKLOAD_TYPE__ARRIVAL_PARAM2:
				return ARRIVAL_PARAM2_EDEFAULT == null ? arrivalParam2 != null : !ARRIVAL_PARAM2_EDEFAULT.equals(arrivalParam2);
			case CSMPackage.WORKLOAD_TYPE__ARRIVAL_PROCESS:
				return isSetArrivalProcess();
			case CSMPackage.WORKLOAD_TYPE__EXTERNAL_DELAY:
				return EXTERNAL_DELAY_EDEFAULT == null ? externalDelay != null : !EXTERNAL_DELAY_EDEFAULT.equals(externalDelay);
			case CSMPackage.WORKLOAD_TYPE__RESPONSE_TIME_LIST:
				return responseTimeList != null && !responseTimeList.isEmpty();
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
		result.append(" (arrivalParam1: ");
		result.append(arrivalParam1);
		result.append(", arrivalParam2: ");
		result.append(arrivalParam2);
		result.append(", arrivalProcess: ");
		if (arrivalProcessESet) result.append(arrivalProcess); else result.append("<unset>");
		result.append(", externalDelay: ");
		result.append(externalDelay);
		result.append(')');
		return result.toString();
	}

} //WorkloadTypeImpl
