/**
 */
package ca.carleton.sce.puma.CSM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.RoleBindingType#getElementId <em>Element Id</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.RoleBindingType#getElementName <em>Element Name</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.RoleBindingType#getRoleId <em>Role Id</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.RoleBindingType#getRoleName <em>Role Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.carleton.sce.puma.CSM.CSMPackage#getRoleBindingType()
 * @model extendedMetaData="name='RoleBindingType' kind='empty'"
 * @generated
 */
public interface RoleBindingType extends EObject {
	/**
	 * Returns the value of the '<em><b>Element Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Id</em>' reference.
	 * @see #setElementId(CSMElementType)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getRoleBindingType_ElementId()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='attribute' name='elementId'"
	 * @generated
	 */
	CSMElementType getElementId();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.RoleBindingType#getElementId <em>Element Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Id</em>' reference.
	 * @see #getElementId()
	 * @generated
	 */
	void setElementId(CSMElementType value);

	/**
	 * Returns the value of the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Name</em>' attribute.
	 * @see #setElementName(String)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getRoleBindingType_ElementName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='elementName'"
	 * @generated
	 */
	String getElementName();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.RoleBindingType#getElementName <em>Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Name</em>' attribute.
	 * @see #getElementName()
	 * @generated
	 */
	void setElementName(String value);

	/**
	 * Returns the value of the '<em><b>Role Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Id</em>' reference.
	 * @see #setRoleId(CSMElementType)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getRoleBindingType_RoleId()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='attribute' name='roleId'"
	 * @generated
	 */
	CSMElementType getRoleId();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.RoleBindingType#getRoleId <em>Role Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Id</em>' reference.
	 * @see #getRoleId()
	 * @generated
	 */
	void setRoleId(CSMElementType value);

	/**
	 * Returns the value of the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Name</em>' attribute.
	 * @see #setRoleName(String)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getRoleBindingType_RoleName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='roleName'"
	 * @generated
	 */
	String getRoleName();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.RoleBindingType#getRoleName <em>Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Name</em>' attribute.
	 * @see #getRoleName()
	 * @generated
	 */
	void setRoleName(String value);

} // RoleBindingType
