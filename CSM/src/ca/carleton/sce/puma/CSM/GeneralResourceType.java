/**
 */
package ca.carleton.sce.puma.CSM;

import org.eclipse.emf.common.util.EList;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Resource Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.GeneralResourceType#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.GeneralResourceType#getPerfMeasureList <em>Perf Measure List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.GeneralResourceType#getSchedPolicy <em>Sched Policy</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.carleton.sce.puma.CSM.CSMPackage#getGeneralResourceType()
 * @model abstract="true"
 *        extendedMetaData="name='GeneralResourceType' kind='empty'"
 * @generated
 */
public interface GeneralResourceType extends CSMElementType {
	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' attribute.
	 * @see #setMultiplicity(String)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getGeneralResourceType_Multiplicity()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='multiplicity'"
	 * @generated
	 */
	String getMultiplicity();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.GeneralResourceType#getMultiplicity <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' attribute.
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(String value);

	/**
	 * Returns the value of the '<em><b>Perf Measure List</b></em>' reference list.
	 * The list contents are of type {@link ca.carleton.sce.puma.CSM.PerfMeasureType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perf Measure List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perf Measure List</em>' reference list.
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getGeneralResourceType_PerfMeasureList()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='attribute' name='perfMeasureList'"
	 * @generated
	 */
	EList<PerfMeasureType> getPerfMeasureList();

	/**
	 * Returns the value of the '<em><b>Sched Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sched Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sched Policy</em>' attribute.
	 * @see #setSchedPolicy(String)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getGeneralResourceType_SchedPolicy()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='schedPolicy'"
	 * @generated
	 */
	String getSchedPolicy();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.GeneralResourceType#getSchedPolicy <em>Sched Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sched Policy</em>' attribute.
	 * @see #getSchedPolicy()
	 * @generated
	 */
	void setSchedPolicy(String value);

} // GeneralResourceType
