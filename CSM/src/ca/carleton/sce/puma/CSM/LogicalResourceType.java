/**
 */
package ca.carleton.sce.puma.CSM;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Resource Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.LogicalResourceType#isNestedOnly <em>Nested Only</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.carleton.sce.puma.CSM.CSMPackage#getLogicalResourceType()
 * @model extendedMetaData="name='LogicalResourceType' kind='empty'"
 * @generated
 */
public interface LogicalResourceType extends GeneralResourceType {
	/**
	 * Returns the value of the '<em><b>Nested Only</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Only</em>' attribute.
	 * @see #isSetNestedOnly()
	 * @see #unsetNestedOnly()
	 * @see #setNestedOnly(boolean)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getLogicalResourceType_NestedOnly()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='nestedOnly'"
	 * @generated
	 */
	boolean isNestedOnly();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.LogicalResourceType#isNestedOnly <em>Nested Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nested Only</em>' attribute.
	 * @see #isSetNestedOnly()
	 * @see #unsetNestedOnly()
	 * @see #isNestedOnly()
	 * @generated
	 */
	void setNestedOnly(boolean value);

	/**
	 * Unsets the value of the '{@link ca.carleton.sce.puma.CSM.LogicalResourceType#isNestedOnly <em>Nested Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNestedOnly()
	 * @see #isNestedOnly()
	 * @see #setNestedOnly(boolean)
	 * @generated
	 */
	void unsetNestedOnly();

	/**
	 * Returns whether the value of the '{@link ca.carleton.sce.puma.CSM.LogicalResourceType#isNestedOnly <em>Nested Only</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nested Only</em>' attribute is set.
	 * @see #unsetNestedOnly()
	 * @see #isNestedOnly()
	 * @see #setNestedOnly(boolean)
	 * @generated
	 */
	boolean isSetNestedOnly();

} // LogicalResourceType
