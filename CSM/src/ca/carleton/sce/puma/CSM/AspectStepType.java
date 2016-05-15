/**
 */
package ca.carleton.sce.puma.CSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aspect Step Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.AspectStepType#getAspectDefinition <em>Aspect Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.carleton.sce.puma.CSM.CSMPackage#getAspectStepType()
 * @model extendedMetaData="name='AspectStepType' kind='elementOnly'"
 * @generated
 */
public interface AspectStepType extends StepType {
	/**
	 * Returns the value of the '<em><b>Aspect Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aspect Definition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aspect Definition</em>' attribute.
	 * @see #setAspectDefinition(String)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getAspectStepType_AspectDefinition()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='aspectDefinition'"
	 * @generated
	 */
	String getAspectDefinition();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.AspectStepType#getAspectDefinition <em>Aspect Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aspect Definition</em>' attribute.
	 * @see #getAspectDefinition()
	 * @generated
	 */
	void setAspectDefinition(String value);

} // AspectStepType
