/**
 */
package ca.carleton.sce.puma.CSM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Perf Measure Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.PerfMeasureType#getPerfValueList <em>Perf Value List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.PerfMeasureType#getDurationOf <em>Duration Of</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.PerfMeasureType#getMeasureKind <em>Measure Kind</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.PerfMeasureType#getPredPerfMeasure <em>Pred Perf Measure</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.PerfMeasureType#getResource <em>Resource</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.PerfMeasureType#getStoppedBy <em>Stopped By</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.PerfMeasureType#getSuccPerfMeasure <em>Succ Perf Measure</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.PerfMeasureType#getTriggeredBy <em>Triggered By</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.carleton.sce.puma.CSM.CSMPackage#getPerfMeasureType()
 * @model extendedMetaData="name='PerfMeasureType' kind='elementOnly'"
 * @generated
 */
public interface PerfMeasureType extends CSMElementType {
	/**
	 * Returns the value of the '<em><b>Perf Value List</b></em>' containment reference list.
	 * The list contents are of type {@link ca.carleton.sce.puma.CSM.PerfValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perf Value List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perf Value List</em>' containment reference list.
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getPerfMeasureType_PerfValueList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PerfValue'"
	 * @generated
	 */
	EList<PerfValueType> getPerfValueList();

	/**
	 * Returns the value of the '<em><b>Duration Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration Of</em>' reference.
	 * @see #setDurationOf(ScenarioElementType)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getPerfMeasureType_DurationOf()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='attribute' name='durationOf'"
	 * @generated
	 */
	ScenarioElementType getDurationOf();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.PerfMeasureType#getDurationOf <em>Duration Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration Of</em>' reference.
	 * @see #getDurationOf()
	 * @generated
	 */
	void setDurationOf(ScenarioElementType value);

	/**
	 * Returns the value of the '<em><b>Measure Kind</b></em>' attribute.
	 * The default value is <code>"delay"</code>.
	 * The literals are from the enumeration {@link ca.carleton.sce.puma.CSM.PerfMeasureKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Kind</em>' attribute.
	 * @see ca.carleton.sce.puma.CSM.PerfMeasureKind
	 * @see #isSetMeasureKind()
	 * @see #unsetMeasureKind()
	 * @see #setMeasureKind(PerfMeasureKind)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getPerfMeasureType_MeasureKind()
	 * @model default="delay" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='measureKind'"
	 * @generated
	 */
	PerfMeasureKind getMeasureKind();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.PerfMeasureType#getMeasureKind <em>Measure Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Kind</em>' attribute.
	 * @see ca.carleton.sce.puma.CSM.PerfMeasureKind
	 * @see #isSetMeasureKind()
	 * @see #unsetMeasureKind()
	 * @see #getMeasureKind()
	 * @generated
	 */
	void setMeasureKind(PerfMeasureKind value);

	/**
	 * Unsets the value of the '{@link ca.carleton.sce.puma.CSM.PerfMeasureType#getMeasureKind <em>Measure Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMeasureKind()
	 * @see #getMeasureKind()
	 * @see #setMeasureKind(PerfMeasureKind)
	 * @generated
	 */
	void unsetMeasureKind();

	/**
	 * Returns whether the value of the '{@link ca.carleton.sce.puma.CSM.PerfMeasureType#getMeasureKind <em>Measure Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Measure Kind</em>' attribute is set.
	 * @see #unsetMeasureKind()
	 * @see #getMeasureKind()
	 * @see #setMeasureKind(PerfMeasureKind)
	 * @generated
	 */
	boolean isSetMeasureKind();

	/**
	 * Returns the value of the '<em><b>Pred Perf Measure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pred Perf Measure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pred Perf Measure</em>' reference.
	 * @see #setPredPerfMeasure(PerfMeasureType)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getPerfMeasureType_PredPerfMeasure()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='attribute' name='predPerfMeasure'"
	 * @generated
	 */
	PerfMeasureType getPredPerfMeasure();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.PerfMeasureType#getPredPerfMeasure <em>Pred Perf Measure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pred Perf Measure</em>' reference.
	 * @see #getPredPerfMeasure()
	 * @generated
	 */
	void setPredPerfMeasure(PerfMeasureType value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(GeneralResourceType)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getPerfMeasureType_Resource()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='attribute' name='resource'"
	 * @generated
	 */
	GeneralResourceType getResource();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.PerfMeasureType#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(GeneralResourceType value);

	/**
	 * Returns the value of the '<em><b>Stopped By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stopped By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stopped By</em>' reference.
	 * @see #setStoppedBy(ScenarioElementType)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getPerfMeasureType_StoppedBy()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='attribute' name='stoppedBy'"
	 * @generated
	 */
	ScenarioElementType getStoppedBy();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.PerfMeasureType#getStoppedBy <em>Stopped By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stopped By</em>' reference.
	 * @see #getStoppedBy()
	 * @generated
	 */
	void setStoppedBy(ScenarioElementType value);

	/**
	 * Returns the value of the '<em><b>Succ Perf Measure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Succ Perf Measure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Succ Perf Measure</em>' reference.
	 * @see #setSuccPerfMeasure(PerfMeasureType)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getPerfMeasureType_SuccPerfMeasure()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='attribute' name='succPerfMeasure'"
	 * @generated
	 */
	PerfMeasureType getSuccPerfMeasure();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.PerfMeasureType#getSuccPerfMeasure <em>Succ Perf Measure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Succ Perf Measure</em>' reference.
	 * @see #getSuccPerfMeasure()
	 * @generated
	 */
	void setSuccPerfMeasure(PerfMeasureType value);

	/**
	 * Returns the value of the '<em><b>Triggered By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggered By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggered By</em>' reference.
	 * @see #setTriggeredBy(ScenarioElementType)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getPerfMeasureType_TriggeredBy()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='attribute' name='triggeredBy'"
	 * @generated
	 */
	ScenarioElementType getTriggeredBy();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.PerfMeasureType#getTriggeredBy <em>Triggered By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triggered By</em>' reference.
	 * @see #getTriggeredBy()
	 * @generated
	 */
	void setTriggeredBy(ScenarioElementType value);

} // PerfMeasureType
