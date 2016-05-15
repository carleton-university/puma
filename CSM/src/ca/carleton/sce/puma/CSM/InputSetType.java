/**
 */
package ca.carleton.sce.puma.CSM;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.InputSetType#getPreCondition <em>Pre Condition</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.InputSetType#getPredecessorSubset <em>Predecessor Subset</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.carleton.sce.puma.CSM.CSMPackage#getInputSetType()
 * @model extendedMetaData="name='InputSetType' kind='elementOnly'"
 * @generated
 */
public interface InputSetType extends EObject {
	/**
	 * Returns the value of the '<em><b>Pre Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Condition</em>' containment reference.
	 * @see #setPreCondition(PreConditionType)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getInputSetType_PreCondition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PreCondition'"
	 * @generated
	 */
	PreConditionType getPreCondition();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.InputSetType#getPreCondition <em>Pre Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Condition</em>' containment reference.
	 * @see #getPreCondition()
	 * @generated
	 */
	void setPreCondition(PreConditionType value);

	/**
	 * Returns the value of the '<em><b>Predecessor Subset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predecessor Subset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecessor Subset</em>' attribute.
	 * @see #setPredecessorSubset(List)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getInputSetType_PredecessorSubset()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" required="true" many="false"
	 *        extendedMetaData="kind='attribute' name='predecessorSubset'"
	 * @generated
	 */
	List<String> getPredecessorSubset();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.InputSetType#getPredecessorSubset <em>Predecessor Subset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predecessor Subset</em>' attribute.
	 * @see #getPredecessorSubset()
	 * @generated
	 */
	void setPredecessorSubset(List<String> value);

} // InputSetType
