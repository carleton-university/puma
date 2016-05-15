/**
 */
package ca.carleton.sce.puma.CSM.impl;

import ca.carleton.sce.puma.CSM.CSMPackage;
import ca.carleton.sce.puma.CSM.GeneralResourceType;
import ca.carleton.sce.puma.CSM.PerfMeasureKind;
import ca.carleton.sce.puma.CSM.PerfAttribute;
import ca.carleton.sce.puma.CSM.PerfMeasureType;
import ca.carleton.sce.puma.CSM.PerfValueType;

import ca.carleton.sce.puma.CSM.ScenarioElementType;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Perf Measure Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.PerfMeasureTypeImpl#getPerfValueList <em>Perf Value List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.PerfMeasureTypeImpl#getDurationOf <em>Duration Of</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.PerfMeasureTypeImpl#getMeasureKind <em>Measure Kind</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.PerfMeasureTypeImpl#getPredPerfMeasure <em>Pred Perf Measure</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.PerfMeasureTypeImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.PerfMeasureTypeImpl#getStoppedBy <em>Stopped By</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.PerfMeasureTypeImpl#getSuccPerfMeasure <em>Succ Perf Measure</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.PerfMeasureTypeImpl#getTriggeredBy <em>Triggered By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PerfMeasureTypeImpl extends CSMElementTypeImpl implements PerfMeasureType {
	/**
	 * The cached value of the '{@link #getPerfValueList() <em>Perf Value List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerfValueList()
	 * @generated
	 * @ordered
	 */
	protected EList<PerfValueType> perfValueList;

	/**
	 * The cached value of the '{@link #getDurationOf() <em>Duration Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationOf()
	 * @generated
	 * @ordered
	 */
	protected ScenarioElementType durationOf;

	/**
	 * The default value of the '{@link #getMeasureKind() <em>Measure Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureKind()
	 * @generated
	 * @ordered
	 */
	protected static final PerfMeasureKind MEASURE_KIND_EDEFAULT = PerfMeasureKind.DELAY;

	/**
	 * The cached value of the '{@link #getMeasureKind() <em>Measure Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureKind()
	 * @generated
	 * @ordered
	 */
	protected PerfMeasureKind measureKind = MEASURE_KIND_EDEFAULT;

	/**
	 * This is true if the Measure Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean measureKindESet;

	/**
	 * The cached value of the '{@link #getPredPerfMeasure() <em>Pred Perf Measure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredPerfMeasure()
	 * @generated
	 * @ordered
	 */
	protected PerfMeasureType predPerfMeasure;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected GeneralResourceType resource;

	/**
	 * The cached value of the '{@link #getStoppedBy() <em>Stopped By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoppedBy()
	 * @generated
	 * @ordered
	 */
	protected ScenarioElementType stoppedBy;

	/**
	 * The cached value of the '{@link #getSuccPerfMeasure() <em>Succ Perf Measure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccPerfMeasure()
	 * @generated
	 * @ordered
	 */
	protected PerfMeasureType succPerfMeasure;

	/**
	 * The cached value of the '{@link #getTriggeredBy() <em>Triggered By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggeredBy()
	 * @generated
	 * @ordered
	 */
	protected ScenarioElementType triggeredBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerfMeasureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSMPackage.Literals.PERF_MEASURE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PerfValueType> getPerfValueList() {
		if (perfValueList == null) {
			perfValueList = new EObjectContainmentEList<PerfValueType>(PerfValueType.class, this, CSMPackage.PERF_MEASURE_TYPE__PERF_VALUE_LIST);
		}
		return perfValueList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioElementType getDurationOf() {
		return durationOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurationOf(ScenarioElementType newDurationOf) {
		ScenarioElementType oldDurationOf = durationOf;
		durationOf = newDurationOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.PERF_MEASURE_TYPE__DURATION_OF, oldDurationOf, durationOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerfMeasureKind getMeasureKind() {
		return measureKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasureKind(PerfMeasureKind newMeasureKind) {
		PerfMeasureKind oldMeasureKind = measureKind;
		measureKind = newMeasureKind == null ? MEASURE_KIND_EDEFAULT : newMeasureKind;
		boolean oldMeasureKindESet = measureKindESet;
		measureKindESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.PERF_MEASURE_TYPE__MEASURE_KIND, oldMeasureKind, measureKind, !oldMeasureKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMeasureKind() {
		PerfMeasureKind oldMeasureKind = measureKind;
		boolean oldMeasureKindESet = measureKindESet;
		measureKind = MEASURE_KIND_EDEFAULT;
		measureKindESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CSMPackage.PERF_MEASURE_TYPE__MEASURE_KIND, oldMeasureKind, MEASURE_KIND_EDEFAULT, oldMeasureKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMeasureKind() {
		return measureKindESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerfMeasureType getPredPerfMeasure() {
		return predPerfMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredPerfMeasure(PerfMeasureType newPredPerfMeasure) {
		PerfMeasureType oldPredPerfMeasure = predPerfMeasure;
		predPerfMeasure = newPredPerfMeasure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.PERF_MEASURE_TYPE__PRED_PERF_MEASURE, oldPredPerfMeasure, predPerfMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralResourceType getResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(GeneralResourceType newResource) {
		GeneralResourceType oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.PERF_MEASURE_TYPE__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioElementType getStoppedBy() {
		return stoppedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStoppedBy(ScenarioElementType newStoppedBy) {
		ScenarioElementType oldStoppedBy = stoppedBy;
		stoppedBy = newStoppedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.PERF_MEASURE_TYPE__STOPPED_BY, oldStoppedBy, stoppedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerfMeasureType getSuccPerfMeasure() {
		return succPerfMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccPerfMeasure(PerfMeasureType newSuccPerfMeasure) {
		PerfMeasureType oldSuccPerfMeasure = succPerfMeasure;
		succPerfMeasure = newSuccPerfMeasure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.PERF_MEASURE_TYPE__SUCC_PERF_MEASURE, oldSuccPerfMeasure, succPerfMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioElementType getTriggeredBy() {
		return triggeredBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggeredBy(ScenarioElementType newTriggeredBy) {
		ScenarioElementType oldTriggeredBy = triggeredBy;
		triggeredBy = newTriggeredBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.PERF_MEASURE_TYPE__TRIGGERED_BY, oldTriggeredBy, triggeredBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CSMPackage.PERF_MEASURE_TYPE__PERF_VALUE_LIST:
				return ((InternalEList<?>)getPerfValueList()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CSMPackage.PERF_MEASURE_TYPE__PERF_VALUE_LIST:
				return getPerfValueList();
			case CSMPackage.PERF_MEASURE_TYPE__DURATION_OF:
				return getDurationOf();
			case CSMPackage.PERF_MEASURE_TYPE__MEASURE_KIND:
				return getMeasureKind();
			case CSMPackage.PERF_MEASURE_TYPE__PRED_PERF_MEASURE:
				return getPredPerfMeasure();
			case CSMPackage.PERF_MEASURE_TYPE__RESOURCE:
				return getResource();
			case CSMPackage.PERF_MEASURE_TYPE__STOPPED_BY:
				return getStoppedBy();
			case CSMPackage.PERF_MEASURE_TYPE__SUCC_PERF_MEASURE:
				return getSuccPerfMeasure();
			case CSMPackage.PERF_MEASURE_TYPE__TRIGGERED_BY:
				return getTriggeredBy();
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
			case CSMPackage.PERF_MEASURE_TYPE__PERF_VALUE_LIST:
				getPerfValueList().clear();
				getPerfValueList().addAll((Collection<? extends PerfValueType>)newValue);
				return;
			case CSMPackage.PERF_MEASURE_TYPE__DURATION_OF:
				setDurationOf((ScenarioElementType)newValue);
				return;
			case CSMPackage.PERF_MEASURE_TYPE__MEASURE_KIND:
				setMeasureKind((PerfMeasureKind)newValue);
				return;
			case CSMPackage.PERF_MEASURE_TYPE__PRED_PERF_MEASURE:
				setPredPerfMeasure((PerfMeasureType)newValue);
				return;
			case CSMPackage.PERF_MEASURE_TYPE__RESOURCE:
				setResource((GeneralResourceType)newValue);
				return;
			case CSMPackage.PERF_MEASURE_TYPE__STOPPED_BY:
				setStoppedBy((ScenarioElementType)newValue);
				return;
			case CSMPackage.PERF_MEASURE_TYPE__SUCC_PERF_MEASURE:
				setSuccPerfMeasure((PerfMeasureType)newValue);
				return;
			case CSMPackage.PERF_MEASURE_TYPE__TRIGGERED_BY:
				setTriggeredBy((ScenarioElementType)newValue);
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
			case CSMPackage.PERF_MEASURE_TYPE__PERF_VALUE_LIST:
				getPerfValueList().clear();
				return;
			case CSMPackage.PERF_MEASURE_TYPE__DURATION_OF:
				setDurationOf((ScenarioElementType)null);
				return;
			case CSMPackage.PERF_MEASURE_TYPE__MEASURE_KIND:
				unsetMeasureKind();
				return;
			case CSMPackage.PERF_MEASURE_TYPE__PRED_PERF_MEASURE:
				setPredPerfMeasure((PerfMeasureType)null);
				return;
			case CSMPackage.PERF_MEASURE_TYPE__RESOURCE:
				setResource((GeneralResourceType)null);
				return;
			case CSMPackage.PERF_MEASURE_TYPE__STOPPED_BY:
				setStoppedBy((ScenarioElementType)null);
				return;
			case CSMPackage.PERF_MEASURE_TYPE__SUCC_PERF_MEASURE:
				setSuccPerfMeasure((PerfMeasureType)null);
				return;
			case CSMPackage.PERF_MEASURE_TYPE__TRIGGERED_BY:
				setTriggeredBy((ScenarioElementType)null);
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
			case CSMPackage.PERF_MEASURE_TYPE__PERF_VALUE_LIST:
				return perfValueList != null && !perfValueList.isEmpty();
			case CSMPackage.PERF_MEASURE_TYPE__DURATION_OF:
				return durationOf != null;
			case CSMPackage.PERF_MEASURE_TYPE__MEASURE_KIND:
				return isSetMeasureKind();
			case CSMPackage.PERF_MEASURE_TYPE__PRED_PERF_MEASURE:
				return predPerfMeasure != null;
			case CSMPackage.PERF_MEASURE_TYPE__RESOURCE:
				return resource != null;
			case CSMPackage.PERF_MEASURE_TYPE__STOPPED_BY:
				return stoppedBy != null;
			case CSMPackage.PERF_MEASURE_TYPE__SUCC_PERF_MEASURE:
				return succPerfMeasure != null;
			case CSMPackage.PERF_MEASURE_TYPE__TRIGGERED_BY:
				return triggeredBy != null;
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
		result.append(" (measureKind: ");
		if (measureKindESet) result.append(measureKind); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PerfMeasureTypeImpl
