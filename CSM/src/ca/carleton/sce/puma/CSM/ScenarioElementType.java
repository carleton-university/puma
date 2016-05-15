/**
 */
package ca.carleton.sce.puma.CSM;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.ScenarioElementType#getDurationPerfMeasureList <em>Duration Perf Measure List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.ScenarioElementType#getStopPerfMeasureList <em>Stop Perf Measure List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.ScenarioElementType#getTriggerPerfMeasureList <em>Trigger Perf Measure List</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.carleton.sce.puma.CSM.CSMPackage#getScenarioElementType()
 * @model abstract="true"
 *        extendedMetaData="name='ScenarioElementType' kind='empty'"
 * @generated
 */
public interface ScenarioElementType extends CSMElementType {
	/**
	 * Returns the value of the '<em><b>Duration Perf Measure List</b></em>' reference list.
	 * The list contents are of type {@link ca.carleton.sce.puma.CSM.PerfMeasureType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration Perf Measure List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration Perf Measure List</em>' reference list.
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getScenarioElementType_DurationPerfMeasureList()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='attribute' name='durationPerfMeasureList'"
	 * @generated
	 */
	EList<PerfMeasureType> getDurationPerfMeasureList();

	/**
	 * Returns the value of the '<em><b>Stop Perf Measure List</b></em>' reference list.
	 * The list contents are of type {@link ca.carleton.sce.puma.CSM.PerfMeasureType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stop Perf Measure List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Perf Measure List</em>' reference list.
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getScenarioElementType_StopPerfMeasureList()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='attribute' name='stopPerfMeasureList'"
	 * @generated
	 */
	EList<PerfMeasureType> getStopPerfMeasureList();

	/**
	 * Returns the value of the '<em><b>Trigger Perf Measure List</b></em>' reference list.
	 * The list contents are of type {@link ca.carleton.sce.puma.CSM.PerfMeasureType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger Perf Measure List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Perf Measure List</em>' reference list.
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getScenarioElementType_TriggerPerfMeasureList()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='attribute' name='triggerPerfMeasureList'"
	 * @generated
	 */
	EList<PerfMeasureType> getTriggerPerfMeasureList();

} // ScenarioElementType
