/**
 */
package ca.carleton.sce.puma.CSM;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.OutputSetType#getPostCondition <em>Post Condition</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.OutputSetType#getSuccessorSubset <em>Successor Subset</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.carleton.sce.puma.CSM.CSMPackage#getOutputSetType()
 * @model extendedMetaData="name='OutputSetType' kind='elementOnly'"
 * @generated
 */
public interface OutputSetType extends EObject {
	/**
	 * Returns the value of the '<em><b>Post Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Condition</em>' containment reference.
	 * @see #setPostCondition(PostConditionType)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getOutputSetType_PostCondition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PostCondition'"
	 * @generated
	 */
	PostConditionType getPostCondition();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.OutputSetType#getPostCondition <em>Post Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Condition</em>' containment reference.
	 * @see #getPostCondition()
	 * @generated
	 */
	void setPostCondition(PostConditionType value);

	/**
	 * Returns the value of the '<em><b>Successor Subset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Successor Subset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successor Subset</em>' attribute.
	 * @see #setSuccessorSubset(List)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getOutputSetType_SuccessorSubset()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" required="true" many="false"
	 *        extendedMetaData="kind='attribute' name='successorSubset'"
	 * @generated
	 */
	List<String> getSuccessorSubset();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.OutputSetType#getSuccessorSubset <em>Successor Subset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Successor Subset</em>' attribute.
	 * @see #getSuccessorSubset()
	 * @generated
	 */
	void setSuccessorSubset(List<String> value);

} // OutputSetType
