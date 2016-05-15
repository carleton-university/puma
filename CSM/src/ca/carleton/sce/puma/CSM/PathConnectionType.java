/**
 */
package ca.carleton.sce.puma.CSM;

import java.util.List;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Connection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.PathConnectionType#getSource <em>Source</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.PathConnectionType#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.carleton.sce.puma.CSM.CSMPackage#getPathConnectionType()
 * @model abstract="true"
 *        extendedMetaData="name='PathConnectionType' kind='empty'"
 * @generated
 */
public interface PathConnectionType extends ScenarioElementType {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link ca.carleton.sce.puma.CSM.StepType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getPathConnectionType_Source()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='attribute' name='source'"
	 * @generated
	 */
	EList<StepType> getSource();

	/**
	 * @generated NOT
	 */
	void setSource(EList<StepType> newSource); 
	
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link ca.carleton.sce.puma.CSM.StepType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getPathConnectionType_Target()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='attribute' name='target'"
	 * @generated
	 */
	EList<StepType> getTarget();
	
	/**
	 * @generated NOT
	 */
	void setTarget(EList<StepType> newTarget); 
	
	/**
	 * @generated NOT
	 */
	int getPathSegmentID(); 
	
	/**
	 * @generated NOT
	 */
	void setPathSegmentID(int segmentId); 

} // PathConnectionType
