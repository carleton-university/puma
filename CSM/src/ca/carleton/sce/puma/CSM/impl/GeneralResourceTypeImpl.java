/**
 */
package ca.carleton.sce.puma.CSM.impl;

import ca.carleton.sce.puma.CSM.CSMPackage;
import ca.carleton.sce.puma.CSM.GeneralResourceType;

import ca.carleton.sce.puma.CSM.PerfMeasureType;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>General Resource Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.GeneralResourceTypeImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.GeneralResourceTypeImpl#getPerfMeasureList <em>Perf Measure List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.GeneralResourceTypeImpl#getSchedPolicy <em>Sched Policy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GeneralResourceTypeImpl extends CSMElementTypeImpl implements GeneralResourceType {
	/**
	 * The default value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTIPLICITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected String multiplicity = MULTIPLICITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPerfMeasureList() <em>Perf Measure List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerfMeasureList()
	 * @generated
	 * @ordered
	 */
	protected EList<PerfMeasureType> perfMeasureList;

	/**
	 * The default value of the '{@link #getSchedPolicy() <em>Sched Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHED_POLICY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchedPolicy() <em>Sched Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedPolicy()
	 * @generated
	 * @ordered
	 */
	protected String schedPolicy = SCHED_POLICY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralResourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSMPackage.Literals.GENERAL_RESOURCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMultiplicity() {
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicity(String newMultiplicity) {
		String oldMultiplicity = multiplicity;
		multiplicity = newMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.GENERAL_RESOURCE_TYPE__MULTIPLICITY, oldMultiplicity, multiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PerfMeasureType> getPerfMeasureList() {
		if (perfMeasureList == null) {
			perfMeasureList = new EObjectEList<PerfMeasureType>(PerfMeasureType.class, this, CSMPackage.GENERAL_RESOURCE_TYPE__PERF_MEASURE_LIST);
		}
		return perfMeasureList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchedPolicy() {
		return schedPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedPolicy(String newSchedPolicy) {
		String oldSchedPolicy = schedPolicy;
		schedPolicy = newSchedPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.GENERAL_RESOURCE_TYPE__SCHED_POLICY, oldSchedPolicy, schedPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CSMPackage.GENERAL_RESOURCE_TYPE__MULTIPLICITY:
				return getMultiplicity();
			case CSMPackage.GENERAL_RESOURCE_TYPE__PERF_MEASURE_LIST:
				return getPerfMeasureList();
			case CSMPackage.GENERAL_RESOURCE_TYPE__SCHED_POLICY:
				return getSchedPolicy();
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
			case CSMPackage.GENERAL_RESOURCE_TYPE__MULTIPLICITY:
				setMultiplicity((String)newValue);
				return;
			case CSMPackage.GENERAL_RESOURCE_TYPE__PERF_MEASURE_LIST:
				getPerfMeasureList().clear();
				getPerfMeasureList().addAll((Collection<? extends PerfMeasureType>)newValue);
				return;
			case CSMPackage.GENERAL_RESOURCE_TYPE__SCHED_POLICY:
				setSchedPolicy((String)newValue);
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
			case CSMPackage.GENERAL_RESOURCE_TYPE__MULTIPLICITY:
				setMultiplicity(MULTIPLICITY_EDEFAULT);
				return;
			case CSMPackage.GENERAL_RESOURCE_TYPE__PERF_MEASURE_LIST:
				getPerfMeasureList().clear();
				return;
			case CSMPackage.GENERAL_RESOURCE_TYPE__SCHED_POLICY:
				setSchedPolicy(SCHED_POLICY_EDEFAULT);
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
			case CSMPackage.GENERAL_RESOURCE_TYPE__MULTIPLICITY:
				return MULTIPLICITY_EDEFAULT == null ? multiplicity != null : !MULTIPLICITY_EDEFAULT.equals(multiplicity);
			case CSMPackage.GENERAL_RESOURCE_TYPE__PERF_MEASURE_LIST:
				return perfMeasureList != null && !perfMeasureList.isEmpty();
			case CSMPackage.GENERAL_RESOURCE_TYPE__SCHED_POLICY:
				return SCHED_POLICY_EDEFAULT == null ? schedPolicy != null : !SCHED_POLICY_EDEFAULT.equals(schedPolicy);
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
		result.append(" (multiplicity: ");
		result.append(multiplicity);
		result.append(", schedPolicy: ");
		result.append(schedPolicy);
		result.append(')');
		return result.toString();
	}

} //GeneralResourceTypeImpl
