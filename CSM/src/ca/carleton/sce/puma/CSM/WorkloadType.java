/**
 */
package ca.carleton.sce.puma.CSM;

import org.eclipse.emf.common.util.EList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workload Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.WorkloadType#getArrivalParam1 <em>Arrival Param1</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.WorkloadType#getArrivalParam2 <em>Arrival Param2</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.WorkloadType#getArrivalProcess <em>Arrival Process</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.WorkloadType#getExternalDelay <em>External Delay</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.WorkloadType#getResponseTimeList <em>Response Time List</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.carleton.sce.puma.CSM.CSMPackage#getWorkloadType()
 * @model abstract="true"
 *        extendedMetaData="name='WorkloadType' kind='empty'"
 * @generated
 */
public interface WorkloadType extends ScenarioElementType {
	/**
	 * Returns the value of the '<em><b>Arrival Param1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arrival Param1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrival Param1</em>' attribute.
	 * @see #setArrivalParam1(String)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getWorkloadType_ArrivalParam1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='arrivalParam1'"
	 * @generated
	 */
	String getArrivalParam1();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.WorkloadType#getArrivalParam1 <em>Arrival Param1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrival Param1</em>' attribute.
	 * @see #getArrivalParam1()
	 * @generated
	 */
	void setArrivalParam1(String value);

	/**
	 * Returns the value of the '<em><b>Arrival Param2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arrival Param2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrival Param2</em>' attribute.
	 * @see #setArrivalParam2(String)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getWorkloadType_ArrivalParam2()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='arrivalParam2'"
	 * @generated
	 */
	String getArrivalParam2();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.WorkloadType#getArrivalParam2 <em>Arrival Param2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrival Param2</em>' attribute.
	 * @see #getArrivalParam2()
	 * @generated
	 */
	void setArrivalParam2(String value);

	/**
	 * Returns the value of the '<em><b>Arrival Process</b></em>' attribute.
	 * The default value is <code>"poissonPDF"</code>.
	 * The literals are from the enumeration {@link ca.carleton.sce.puma.CSM.ArrivalProcess}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arrival Process</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrival Process</em>' attribute.
	 * @see ca.carleton.sce.puma.CSM.ArrivalProcess
	 * @see #isSetArrivalProcess()
	 * @see #unsetArrivalProcess()
	 * @see #setArrivalProcess(ArrivalProcess)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getWorkloadType_ArrivalProcess()
	 * @model default="poissonPDF" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='arrivalProcess'"
	 * @generated
	 */
	ArrivalProcess getArrivalProcess();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.WorkloadType#getArrivalProcess <em>Arrival Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrival Process</em>' attribute.
	 * @see ca.carleton.sce.puma.CSM.ArrivalProcess
	 * @see #isSetArrivalProcess()
	 * @see #unsetArrivalProcess()
	 * @see #getArrivalProcess()
	 * @generated
	 */
	void setArrivalProcess(ArrivalProcess value);

	/**
	 * Unsets the value of the '{@link ca.carleton.sce.puma.CSM.WorkloadType#getArrivalProcess <em>Arrival Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArrivalProcess()
	 * @see #getArrivalProcess()
	 * @see #setArrivalProcess(ArrivalProcess)
	 * @generated
	 */
	void unsetArrivalProcess();

	/**
	 * Returns whether the value of the '{@link ca.carleton.sce.puma.CSM.WorkloadType#getArrivalProcess <em>Arrival Process</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Arrival Process</em>' attribute is set.
	 * @see #unsetArrivalProcess()
	 * @see #getArrivalProcess()
	 * @see #setArrivalProcess(ArrivalProcess)
	 * @generated
	 */
	boolean isSetArrivalProcess();

	/**
	 * Returns the value of the '<em><b>External Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Delay</em>' attribute.
	 * @see #setExternalDelay(String)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getWorkloadType_ExternalDelay()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='externalDelay'"
	 * @generated
	 */
	String getExternalDelay();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.WorkloadType#getExternalDelay <em>External Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Delay</em>' attribute.
	 * @see #getExternalDelay()
	 * @generated
	 */
	void setExternalDelay(String value);

	/**
	 * Returns the value of the '<em><b>Response Time List</b></em>' reference list.
	 * The list contents are of type {@link ca.carleton.sce.puma.CSM.PerfMeasureType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Time List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Time List</em>' reference list.
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getWorkloadType_ResponseTimeList()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='attribute' name='responseTimeList'"
	 * @generated
	 */
	EList<PerfMeasureType> getResponseTimeList();

} // WorkloadType
