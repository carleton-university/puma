/**
 */
package ca.carleton.sce.puma.CSM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.ComponentType#getHost <em>Host</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.ComponentType#isIsActiveProcess <em>Is Active Process</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.ComponentType#getParentComponent <em>Parent Component</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.ComponentType#getSubComponentList <em>Sub Component List</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.carleton.sce.puma.CSM.CSMPackage#getComponentType()
 * @model extendedMetaData="name='ComponentType' kind='empty'"
 * @generated
 */
public interface ComponentType extends LogicalResourceType {
	/**
	 * Returns the value of the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' reference.
	 * @see #setHost(ProcessingResourceType)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getComponentType_Host()
	 * @model resolveProxies="false" required="true"
	 *        extendedMetaData="kind='attribute' name='host'"
	 * @generated
	 */
	ProcessingResourceType getHost();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.ComponentType#getHost <em>Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' reference.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(ProcessingResourceType value);

	/**
	 * Returns the value of the '<em><b>Is Active Process</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Active Process</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Active Process</em>' attribute.
	 * @see #isSetIsActiveProcess()
	 * @see #unsetIsActiveProcess()
	 * @see #setIsActiveProcess(boolean)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getComponentType_IsActiveProcess()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isActiveProcess'"
	 * @generated
	 */
	boolean isIsActiveProcess();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.ComponentType#isIsActiveProcess <em>Is Active Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Active Process</em>' attribute.
	 * @see #isSetIsActiveProcess()
	 * @see #unsetIsActiveProcess()
	 * @see #isIsActiveProcess()
	 * @generated
	 */
	void setIsActiveProcess(boolean value);

	/**
	 * Unsets the value of the '{@link ca.carleton.sce.puma.CSM.ComponentType#isIsActiveProcess <em>Is Active Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsActiveProcess()
	 * @see #isIsActiveProcess()
	 * @see #setIsActiveProcess(boolean)
	 * @generated
	 */
	void unsetIsActiveProcess();

	/**
	 * Returns whether the value of the '{@link ca.carleton.sce.puma.CSM.ComponentType#isIsActiveProcess <em>Is Active Process</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Active Process</em>' attribute is set.
	 * @see #unsetIsActiveProcess()
	 * @see #isIsActiveProcess()
	 * @see #setIsActiveProcess(boolean)
	 * @generated
	 */
	boolean isSetIsActiveProcess();

	/**
	 * Returns the value of the '<em><b>Parent Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Component</em>' reference.
	 * @see #setParentComponent(ComponentType)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getComponentType_ParentComponent()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='attribute' name='parentComponent'"
	 * @generated
	 */
	ComponentType getParentComponent();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.ComponentType#getParentComponent <em>Parent Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Component</em>' reference.
	 * @see #getParentComponent()
	 * @generated
	 */
	void setParentComponent(ComponentType value);

	/**
	 * Returns the value of the '<em><b>Sub Component List</b></em>' reference list.
	 * The list contents are of type {@link ca.carleton.sce.puma.CSM.ComponentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Component List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Component List</em>' reference list.
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getComponentType_SubComponentList()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='attribute' name='subComponentList'"
	 * @generated
	 */
	EList<ComponentType> getSubComponentList();

} // ComponentType
