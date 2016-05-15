/**
 */
package ca.carleton.sce.puma.CSM;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.CSMType#getScenarioList <em>Scenario List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.CSMType#getComponentList <em>Component List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.CSMType#getCommLinkList <em>Comm Link List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.CSMType#getProcessingResourceList <em>Processing Resource List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.CSMType#getLogicalResourceList <em>Logical Resource List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.CSMType#getVariableList <em>Variable List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.CSMType#getPerfMeasureList <em>Perf Measure List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.CSMType#getAuthor <em>Author</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.CSMType#getCreated <em>Created</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.CSMType#getDescription <em>Description</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.CSMType#getModified <em>Modified</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.CSMType#getName <em>Name</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.CSMType#getTraceabilityLink <em>Traceability Link</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.CSMType#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.carleton.sce.puma.CSM.CSMPackage#getCSMType()
 * @model extendedMetaData="name='CSM' kind='elementOnly'"
 * @generated
 */
public interface CSMType extends EObject {
	/**
	 * Returns the value of the '<em><b>Scenario List</b></em>' containment reference list.
	 * The list contents are of type {@link ca.carleton.sce.puma.CSM.ScenarioType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario List</em>' containment reference list.
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getCSMType_ScenarioList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Scenario'"
	 * @generated
	 */
	EList<ScenarioType> getScenarioList();

	/**
	 * Returns the value of the '<em><b>Component List</b></em>' containment reference list.
	 * The list contents are of type {@link ca.carleton.sce.puma.CSM.ComponentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component List</em>' containment reference list.
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getCSMType_ComponentList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Component'"
	 * @generated
	 */
	EList<ComponentType> getComponentList();

	/**
	 * Returns the value of the '<em><b>Comm Link List</b></em>' containment reference list.
	 * The list contents are of type {@link ca.carleton.sce.puma.CSM.CommLinkType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comm Link List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comm Link List</em>' containment reference list.
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getCSMType_CommLinkList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CommLink'"
	 * @generated
	 */
	EList<CommLinkType> getCommLinkList();

	/**
	 * Returns the value of the '<em><b>Processing Resource List</b></em>' containment reference list.
	 * The list contents are of type {@link ca.carleton.sce.puma.CSM.ProcessingResourceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Resource List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Resource List</em>' containment reference list.
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getCSMType_ProcessingResourceList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ProcessingResource'"
	 * @generated
	 */
	EList<ProcessingResourceType> getProcessingResourceList();

	/**
	 * Returns the value of the '<em><b>Perf Measure List</b></em>' containment reference list.
	 * The list contents are of type {@link ca.carleton.sce.puma.CSM.PerfMeasureType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perf Measure List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perf Measure List</em>' containment reference list.
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getCSMType_PerfMeasureList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PerfMeasure'"
	 * @generated
	 */
	EList<PerfMeasureType> getPerfMeasureList();

	/**
	 * Returns the value of the '<em><b>Logical Resource List</b></em>' containment reference list.
	 * The list contents are of type {@link ca.carleton.sce.puma.CSM.LogicalResourceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Resource List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Resource List</em>' containment reference list.
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getCSMType_LogicalResourceList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LogicalResource'"
	 * @generated
	 */
	EList<LogicalResourceType> getLogicalResourceList();

	/**
	 * Returns the value of the '<em><b>Variable List</b></em>' containment reference list.
	 * The list contents are of type {@link ca.carleton.sce.puma.CSM.VariableType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable List</em>' containment reference list.
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getCSMType_VariableList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Variable'"
	 * @generated
	 */
	EList<VariableType> getVariableList();

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getCSMType_Author()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='author'"
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.CSMType#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created</em>' attribute.
	 * @see #setCreated(XMLGregorianCalendar)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getCSMType_Created()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='attribute' name='created'"
	 * @generated
	 */
	XMLGregorianCalendar getCreated();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.CSMType#getCreated <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' attribute.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getCSMType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.CSMType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modified</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified</em>' attribute.
	 * @see #setModified(XMLGregorianCalendar)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getCSMType_Modified()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='attribute' name='modified'"
	 * @generated
	 */
	XMLGregorianCalendar getModified();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.CSMType#getModified <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified</em>' attribute.
	 * @see #getModified()
	 * @generated
	 */
	void setModified(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getCSMType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.CSMType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Traceability Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Traceability Link</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traceability Link</em>' attribute.
	 * @see #setTraceabilityLink(String)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getCSMType_TraceabilityLink()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='traceabilityLink'"
	 * @generated
	 */
	String getTraceabilityLink();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.CSMType#getTraceabilityLink <em>Traceability Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Traceability Link</em>' attribute.
	 * @see #getTraceabilityLink()
	 * @generated
	 */
	void setTraceabilityLink(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see ca.carleton.sce.puma.CSM.CSMPackage#getCSMType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link ca.carleton.sce.puma.CSM.CSMType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // CSMType
