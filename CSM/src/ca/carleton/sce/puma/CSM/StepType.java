/**
 */
package ca.carleton.sce.puma.CSM;

import java.util.List;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.StepType#getRefinement <em>Refinement</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.StepType#getExternalDemand <em>External Demand</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.StepType#getBlockT <em>Block T</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.StepType#getComponent <em>Component</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.StepType#getHostDemand <em>Host Demand</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.StepType#getNosync <em>Nosync</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.StepType#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.StepType#getProbability <em>Probability</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.StepType#getRepetitionCount <em>Repetition Count</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.StepType#getRespT <em>Resp T</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.StepType#getStepKind <em>Step Kind</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.StepType#getSuccessor <em>Successor</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.carleton.sce.puma.CSM.CSMPackage#getStepType()
 * @model extendedMetaData="name='StepType' kind='elementOnly'"
 * @generated
 */
public interface StepType extends ScenarioElementType {
	/**
	 * Returns the value of the '<em><b>Refinement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refinement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refinement</em>' containment reference.
	 * @see #setRefinement(RefinementType)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getStepType_Refinement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Refinement'"
	 * @generated
	 */
	RefinementType getRefinement();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.StepType#getRefinement <em>Refinement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refinement</em>' containment reference.
	 * @see #getRefinement()
	 * @generated
	 */
	void setRefinement(RefinementType value);

	/**
	 * Returns the value of the '<em><b>External Demand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Demand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Demand</em>' containment reference.
	 * @see #setExternalDemand(ExternalDemandType)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getStepType_ExternalDemand()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExternalDemand'"
	 * @generated
	 */
	ExternalDemandType getExternalDemand();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.StepType#getExternalDemand <em>External Demand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Demand</em>' containment reference.
	 * @see #getExternalDemand()
	 * @generated
	 */
	void setExternalDemand(ExternalDemandType value);

	/**
	 * Returns the value of the '<em><b>Block T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block T</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block T</em>' attribute.
	 * @see #setBlockT(String)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getStepType_BlockT()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='blockT'"
	 * @generated
	 */
	String getBlockT();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.StepType#getBlockT <em>Block T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block T</em>' attribute.
	 * @see #getBlockT()
	 * @generated
	 */
	void setBlockT(String value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(ComponentType)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getStepType_Component()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='attribute' name='component'"
	 * @generated
	 */
	ComponentType getComponent();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.StepType#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(ComponentType value);

	/**
	 * Returns the value of the '<em><b>Host Demand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Demand</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Demand</em>' attribute.
	 * @see #setHostDemand(String)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getStepType_HostDemand()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='hostDemand'"
	 * @generated
	 */
	String getHostDemand();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.StepType#getHostDemand <em>Host Demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Demand</em>' attribute.
	 * @see #getHostDemand()
	 * @generated
	 */
	void setHostDemand(String value);

	/**
	 * Returns the value of the '<em><b>Nosync</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * The literals are from the enumeration {@link ca.carleton.sce.puma.CSM.SynchronizationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nosync</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nosync</em>' attribute.
	 * @see ca.carleton.sce.puma.CSM.SynchronizationKind
	 * @see #isSetNosync()
	 * @see #unsetNosync()
	 * @see #setNosync(SynchronizationKind)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getStepType_Nosync()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='nosync'"
	 * @generated
	 */
	SynchronizationKind getNosync();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.StepType#getNosync <em>Nosync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nosync</em>' attribute.
	 * @see ca.carleton.sce.puma.CSM.SynchronizationKind
	 * @see #isSetNosync()
	 * @see #unsetNosync()
	 * @see #getNosync()
	 * @generated
	 */
	void setNosync(SynchronizationKind value);

	/**
	 * Unsets the value of the '{@link ca.carleton.sce.puma.CSM.StepType#getNosync <em>Nosync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNosync()
	 * @see #getNosync()
	 * @see #setNosync(SynchronizationKind)
	 * @generated
	 */
	void unsetNosync();

	/**
	 * Returns whether the value of the '{@link ca.carleton.sce.puma.CSM.StepType#getNosync <em>Nosync</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nosync</em>' attribute is set.
	 * @see #unsetNosync()
	 * @see #getNosync()
	 * @see #setNosync(SynchronizationKind)
	 * @generated
	 */
	boolean isSetNosync();

	/**
	 * Returns the value of the '<em><b>Predecessor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predecessor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecessor</em>' reference.
	 * @see #setPredecessor(PathConnectionType)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getStepType_Predecessor()
	 * @model resolveProxies="false" required="true"
	 *        extendedMetaData="kind='attribute' name='predecessor'"
	 * @generated
	 */
	PathConnectionType getPredecessor();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.StepType#getPredecessor <em>Predecessor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predecessor</em>' reference.
	 * @see #getPredecessor()
	 * @generated
	 */
	void setPredecessor(PathConnectionType value);

	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(String)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getStepType_Probability()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='probability'"
	 * @generated
	 */
	String getProbability();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.StepType#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(String value);

	/**
	 * Returns the value of the '<em><b>Repetition Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repetition Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repetition Count</em>' attribute.
	 * @see #setRepetitionCount(String)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getStepType_RepetitionCount()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='repetitionCount'"
	 * @generated
	 */
	String getRepetitionCount();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.StepType#getRepetitionCount <em>Repetition Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repetition Count</em>' attribute.
	 * @see #getRepetitionCount()
	 * @generated
	 */
	void setRepetitionCount(String value);

	/**
	 * Returns the value of the '<em><b>Resp T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resp T</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resp T</em>' attribute.
	 * @see #setRespT(String)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getStepType_RespT()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='respT'"
	 * @generated
	 */
	String getRespT();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.StepType#getRespT <em>Resp T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resp T</em>' attribute.
	 * @see #getRespT()
	 * @generated
	 */
	void setRespT(String value);

	/**
	 * Returns the value of the '<em><b>Step Kind</b></em>' attribute.
	 * The default value is <code>"normal"</code>.
	 * The literals are from the enumeration {@link ca.carleton.sce.puma.CSM.StepKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Kind</em>' attribute.
	 * @see ca.carleton.sce.puma.CSM.StepKind
	 * @see #isSetStepKind()
	 * @see #unsetStepKind()
	 * @see #setStepKind(StepKind)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getStepType_StepKind()
	 * @model default="normal" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='stepKind'"
	 * @generated
	 */
	StepKind getStepKind();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.StepType#getStepKind <em>Step Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Kind</em>' attribute.
	 * @see ca.carleton.sce.puma.CSM.StepKind
	 * @see #isSetStepKind()
	 * @see #unsetStepKind()
	 * @see #getStepKind()
	 * @generated
	 */
	void setStepKind(StepKind value);

	/**
	 * Unsets the value of the '{@link ca.carleton.sce.puma.CSM.StepType#getStepKind <em>Step Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStepKind()
	 * @see #getStepKind()
	 * @see #setStepKind(StepKind)
	 * @generated
	 */
	void unsetStepKind();

	/**
	 * Returns whether the value of the '{@link ca.carleton.sce.puma.CSM.StepType#getStepKind <em>Step Kind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Step Kind</em>' attribute is set.
	 * @see #unsetStepKind()
	 * @see #getStepKind()
	 * @see #setStepKind(StepKind)
	 * @generated
	 */
	boolean isSetStepKind();

	/**
	 * Returns the value of the '<em><b>Successor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Successor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successor</em>' reference.
	 * @see #setSuccessor(PathConnectionType)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getStepType_Successor()
	 * @model resolveProxies="false" required="true"
	 *        extendedMetaData="kind='attribute' name='successor'"
	 * @generated
	 */
	PathConnectionType getSuccessor();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.StepType#getSuccessor <em>Successor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Successor</em>' reference.
	 * @see #getSuccessor()
	 * @generated
	 */
	void setSuccessor(PathConnectionType value);
	
	/**
	 * @generated NOT
	 */
	int getPathSegmentID(); 
	
	/**
	 * @generated NOT
	 */
	void setPathSegmentID(int id); 
	

} // StepType
