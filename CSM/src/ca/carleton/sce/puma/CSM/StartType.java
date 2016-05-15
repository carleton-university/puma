/**
 */
package ca.carleton.sce.puma.CSM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.StartType#getClosedWorkload <em>Closed Workload</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.StartType#getOpenWorkload <em>Open Workload</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.StartType#getInBinding <em>In Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.carleton.sce.puma.CSM.CSMPackage#getStartType()
 * @model extendedMetaData="name='StartType' kind='elementOnly'"
 * @generated
 */
public interface StartType extends PathConnectionType {
	/**
	 * Returns the value of the '<em><b>Closed Workload</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Closed Workload</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closed Workload</em>' containment reference.
	 * @see #setClosedWorkload(ClosedWorkloadType)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getStartType_ClosedWorkload()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ClosedWorkload'"
	 * @generated
	 */
	ClosedWorkloadType getClosedWorkload();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.StartType#getClosedWorkload <em>Closed Workload</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closed Workload</em>' containment reference.
	 * @see #getClosedWorkload()
	 * @generated
	 */
	void setClosedWorkload(ClosedWorkloadType value);

	/**
	 * Returns the value of the '<em><b>Open Workload</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Open Workload</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open Workload</em>' containment reference.
	 * @see #setOpenWorkload(OpenWorkloadType)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getStartType_OpenWorkload()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OpenWorkload'"
	 * @generated
	 */
	OpenWorkloadType getOpenWorkload();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.StartType#getOpenWorkload <em>Open Workload</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open Workload</em>' containment reference.
	 * @see #getOpenWorkload()
	 * @generated
	 */
	void setOpenWorkload(OpenWorkloadType value);

	/**
	 * Returns the value of the '<em><b>In Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Binding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Binding</em>' reference.
	 * @see #setInBinding(InBindingType)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getStartType_InBinding()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='attribute' name='inBinding'"
	 * @generated
	 */
	InBindingType getInBinding();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.StartType#getInBinding <em>In Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Binding</em>' reference.
	 * @see #getInBinding()
	 * @generated
	 */
	void setInBinding(InBindingType value);

} // StartType
