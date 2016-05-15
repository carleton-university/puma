/**
 */
package ca.carleton.sce.puma.CSM.impl;

import ca.carleton.sce.puma.CSM.CSMPackage;
import ca.carleton.sce.puma.CSM.PerfMeasureType;
import ca.carleton.sce.puma.CSM.ScenarioElementType;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.ScenarioElementTypeImpl#getDurationPerfMeasureList <em>Duration Perf Measure List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.ScenarioElementTypeImpl#getStopPerfMeasureList <em>Stop Perf Measure List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.ScenarioElementTypeImpl#getTriggerPerfMeasureList <em>Trigger Perf Measure List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ScenarioElementTypeImpl extends CSMElementTypeImpl implements ScenarioElementType {
	/**
	 * The cached value of the '{@link #getDurationPerfMeasureList() <em>Duration Perf Measure List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationPerfMeasureList()
	 * @generated
	 * @ordered
	 */
	protected EList<PerfMeasureType> durationPerfMeasureList;

	/**
	 * The cached value of the '{@link #getStopPerfMeasureList() <em>Stop Perf Measure List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopPerfMeasureList()
	 * @generated
	 * @ordered
	 */
	protected EList<PerfMeasureType> stopPerfMeasureList;

	/**
	 * The cached value of the '{@link #getTriggerPerfMeasureList() <em>Trigger Perf Measure List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerPerfMeasureList()
	 * @generated
	 * @ordered
	 */
	protected EList<PerfMeasureType> triggerPerfMeasureList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioElementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSMPackage.Literals.SCENARIO_ELEMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PerfMeasureType> getDurationPerfMeasureList() {
		if (durationPerfMeasureList == null) {
			durationPerfMeasureList = new EObjectEList<PerfMeasureType>(PerfMeasureType.class, this, CSMPackage.SCENARIO_ELEMENT_TYPE__DURATION_PERF_MEASURE_LIST);
		}
		return durationPerfMeasureList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PerfMeasureType> getStopPerfMeasureList() {
		if (stopPerfMeasureList == null) {
			stopPerfMeasureList = new EObjectEList<PerfMeasureType>(PerfMeasureType.class, this, CSMPackage.SCENARIO_ELEMENT_TYPE__STOP_PERF_MEASURE_LIST);
		}
		return stopPerfMeasureList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PerfMeasureType> getTriggerPerfMeasureList() {
		if (triggerPerfMeasureList == null) {
			triggerPerfMeasureList = new EObjectEList<PerfMeasureType>(PerfMeasureType.class, this, CSMPackage.SCENARIO_ELEMENT_TYPE__TRIGGER_PERF_MEASURE_LIST);
		}
		return triggerPerfMeasureList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CSMPackage.SCENARIO_ELEMENT_TYPE__DURATION_PERF_MEASURE_LIST:
				return getDurationPerfMeasureList();
			case CSMPackage.SCENARIO_ELEMENT_TYPE__STOP_PERF_MEASURE_LIST:
				return getStopPerfMeasureList();
			case CSMPackage.SCENARIO_ELEMENT_TYPE__TRIGGER_PERF_MEASURE_LIST:
				return getTriggerPerfMeasureList();
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
			case CSMPackage.SCENARIO_ELEMENT_TYPE__DURATION_PERF_MEASURE_LIST:
				getDurationPerfMeasureList().clear();
				getDurationPerfMeasureList().addAll((Collection<? extends PerfMeasureType>)newValue);
				return;
			case CSMPackage.SCENARIO_ELEMENT_TYPE__STOP_PERF_MEASURE_LIST:
				getStopPerfMeasureList().clear();
				getStopPerfMeasureList().addAll((Collection<? extends PerfMeasureType>)newValue);
				return;
			case CSMPackage.SCENARIO_ELEMENT_TYPE__TRIGGER_PERF_MEASURE_LIST:
				getTriggerPerfMeasureList().clear();
				getTriggerPerfMeasureList().addAll((Collection<? extends PerfMeasureType>)newValue);
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
			case CSMPackage.SCENARIO_ELEMENT_TYPE__DURATION_PERF_MEASURE_LIST:
				getDurationPerfMeasureList().clear();
				return;
			case CSMPackage.SCENARIO_ELEMENT_TYPE__STOP_PERF_MEASURE_LIST:
				getStopPerfMeasureList().clear();
				return;
			case CSMPackage.SCENARIO_ELEMENT_TYPE__TRIGGER_PERF_MEASURE_LIST:
				getTriggerPerfMeasureList().clear();
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
			case CSMPackage.SCENARIO_ELEMENT_TYPE__DURATION_PERF_MEASURE_LIST:
				return durationPerfMeasureList != null && !durationPerfMeasureList.isEmpty();
			case CSMPackage.SCENARIO_ELEMENT_TYPE__STOP_PERF_MEASURE_LIST:
				return stopPerfMeasureList != null && !stopPerfMeasureList.isEmpty();
			case CSMPackage.SCENARIO_ELEMENT_TYPE__TRIGGER_PERF_MEASURE_LIST:
				return triggerPerfMeasureList != null && !triggerPerfMeasureList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ScenarioElementTypeImpl
