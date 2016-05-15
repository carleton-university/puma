/**
 */
package ca.carleton.sce.puma.CSM.impl;

import ca.carleton.sce.puma.CSM.ActiveResourceType;
import ca.carleton.sce.puma.CSM.CSMPackage;
import ca.carleton.sce.puma.CSM.CSMType;
import ca.carleton.sce.puma.CSM.CommLinkType;
import ca.carleton.sce.puma.CSM.CommunicationLinkType;
import ca.carleton.sce.puma.CSM.ComponentType;
import ca.carleton.sce.puma.CSM.ExternalDemandType;
import ca.carleton.sce.puma.CSM.ExternalOperationType;
import ca.carleton.sce.puma.CSM.LogicalResourceType;
import ca.carleton.sce.puma.CSM.PassiveResourceType;
import ca.carleton.sce.puma.CSM.PerfMeasureType;
import ca.carleton.sce.puma.CSM.ProcessingResourceType;
import ca.carleton.sce.puma.CSM.ScenarioType;

import ca.carleton.sce.puma.CSM.VariableType;
import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.CSMTypeImpl#getScenarioList <em>Scenario List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.CSMTypeImpl#getComponentList <em>Component List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.CSMTypeImpl#getCommLinkList <em>Comm Link List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.CSMTypeImpl#getProcessingResourceList <em>Processing Resource List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.CSMTypeImpl#getLogicalResourceList <em>Logical Resource List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.CSMTypeImpl#getVariableList <em>Variable List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.CSMTypeImpl#getPerfMeasureList <em>Perf Measure List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.CSMTypeImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.CSMTypeImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.CSMTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.CSMTypeImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.CSMTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.CSMTypeImpl#getTraceabilityLink <em>Traceability Link</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.CSMTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CSMTypeImpl extends EObjectImpl implements CSMType {
	/**
	 * The cached value of the '{@link #getScenarioList() <em>Scenario List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarioList()
	 * @generated
	 * @ordered
	 */
	protected EList<ScenarioType> scenarioList;

	/**
	 * The cached value of the '{@link #getComponentList() <em>Component List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentList()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentType> componentList;

	/**
	 * The cached value of the '{@link #getCommLinkList() <em>Comm Link List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommLinkList()
	 * @generated
	 * @ordered
	 */
	protected EList<CommLinkType> commLinkList;

	/**
	 * The cached value of the '{@link #getProcessingResourceList() <em>Processing Resource List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingResourceList()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessingResourceType> processingResourceList;

	/**
	 * The cached value of the '{@link #getLogicalResourceList() <em>Logical Resource List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalResourceList()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalResourceType> logicalResourceList;

	/**
	 * The cached value of the '{@link #getVariableList() <em>Variable List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableList()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableType> variableList;

	/**
	 * The cached value of the '{@link #getPerfMeasureList() <em>Perf Measure List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerfMeasureList()
	 * @generated
	 * @ordered
	 */
	protected EList<PerfMeasureType> perfMeasureList;

	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar CREATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar created = CREATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar MODIFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar modified = MODIFIED_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTraceabilityLink() <em>Traceability Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceabilityLink()
	 * @generated
	 * @ordered
	 */
	protected static final String TRACEABILITY_LINK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTraceabilityLink() <em>Traceability Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceabilityLink()
	 * @generated
	 * @ordered
	 */
	protected String traceabilityLink = TRACEABILITY_LINK_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSMTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSMPackage.Literals.CSM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScenarioType> getScenarioList() {
		if (scenarioList == null) {
			scenarioList = new EObjectContainmentEList<ScenarioType>(ScenarioType.class, this, CSMPackage.CSM_TYPE__SCENARIO_LIST);
		}
		return scenarioList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentType> getComponentList() {
		if (componentList == null) {
			componentList = new EObjectContainmentEList<ComponentType>(ComponentType.class, this, CSMPackage.CSM_TYPE__COMPONENT_LIST);
		}
		return componentList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommLinkType> getCommLinkList() {
		if (commLinkList == null) {
			commLinkList = new EObjectContainmentEList<CommLinkType>(CommLinkType.class, this, CSMPackage.CSM_TYPE__COMM_LINK_LIST);
		}
		return commLinkList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessingResourceType> getProcessingResourceList() {
		if (processingResourceList == null) {
			processingResourceList = new EObjectContainmentEList<ProcessingResourceType>(ProcessingResourceType.class, this, CSMPackage.CSM_TYPE__PROCESSING_RESOURCE_LIST);
		}
		return processingResourceList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PerfMeasureType> getPerfMeasureList() {
		if (perfMeasureList == null) {
			perfMeasureList = new EObjectContainmentEList<PerfMeasureType>(PerfMeasureType.class, this, CSMPackage.CSM_TYPE__PERF_MEASURE_LIST);
		}
		return perfMeasureList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalResourceType> getLogicalResourceList() {
		if (logicalResourceList == null) {
			logicalResourceList = new EObjectContainmentEList<LogicalResourceType>(LogicalResourceType.class, this, CSMPackage.CSM_TYPE__LOGICAL_RESOURCE_LIST);
		}
		return logicalResourceList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableType> getVariableList() {
		if (variableList == null) {
			variableList = new EObjectContainmentEList<VariableType>(VariableType.class, this, CSMPackage.CSM_TYPE__VARIABLE_LIST);
		}
		return variableList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.CSM_TYPE__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated(XMLGregorianCalendar newCreated) {
		XMLGregorianCalendar oldCreated = created;
		created = newCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.CSM_TYPE__CREATED, oldCreated, created));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.CSM_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getModified() {
		return modified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModified(XMLGregorianCalendar newModified) {
		XMLGregorianCalendar oldModified = modified;
		modified = newModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.CSM_TYPE__MODIFIED, oldModified, modified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.CSM_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTraceabilityLink() {
		return traceabilityLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceabilityLink(String newTraceabilityLink) {
		String oldTraceabilityLink = traceabilityLink;
		traceabilityLink = newTraceabilityLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.CSM_TYPE__TRACEABILITY_LINK, oldTraceabilityLink, traceabilityLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.CSM_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CSMPackage.CSM_TYPE__SCENARIO_LIST:
				return ((InternalEList<?>)getScenarioList()).basicRemove(otherEnd, msgs);
			case CSMPackage.CSM_TYPE__COMPONENT_LIST:
				return ((InternalEList<?>)getComponentList()).basicRemove(otherEnd, msgs);
			case CSMPackage.CSM_TYPE__COMM_LINK_LIST:
				return ((InternalEList<?>)getCommLinkList()).basicRemove(otherEnd, msgs);
			case CSMPackage.CSM_TYPE__PROCESSING_RESOURCE_LIST:
				return ((InternalEList<?>)getProcessingResourceList()).basicRemove(otherEnd, msgs);
			case CSMPackage.CSM_TYPE__LOGICAL_RESOURCE_LIST:
				return ((InternalEList<?>)getLogicalResourceList()).basicRemove(otherEnd, msgs);
			case CSMPackage.CSM_TYPE__VARIABLE_LIST:
				return ((InternalEList<?>)getVariableList()).basicRemove(otherEnd, msgs);
			case CSMPackage.CSM_TYPE__PERF_MEASURE_LIST:
				return ((InternalEList<?>)getPerfMeasureList()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CSMPackage.CSM_TYPE__SCENARIO_LIST:
				return getScenarioList();
			case CSMPackage.CSM_TYPE__COMPONENT_LIST:
				return getComponentList();
			case CSMPackage.CSM_TYPE__COMM_LINK_LIST:
				return getCommLinkList();
			case CSMPackage.CSM_TYPE__PROCESSING_RESOURCE_LIST:
				return getProcessingResourceList();
			case CSMPackage.CSM_TYPE__LOGICAL_RESOURCE_LIST:
				return getLogicalResourceList();
			case CSMPackage.CSM_TYPE__VARIABLE_LIST:
				return getVariableList();
			case CSMPackage.CSM_TYPE__PERF_MEASURE_LIST:
				return getPerfMeasureList();
			case CSMPackage.CSM_TYPE__AUTHOR:
				return getAuthor();
			case CSMPackage.CSM_TYPE__CREATED:
				return getCreated();
			case CSMPackage.CSM_TYPE__DESCRIPTION:
				return getDescription();
			case CSMPackage.CSM_TYPE__MODIFIED:
				return getModified();
			case CSMPackage.CSM_TYPE__NAME:
				return getName();
			case CSMPackage.CSM_TYPE__TRACEABILITY_LINK:
				return getTraceabilityLink();
			case CSMPackage.CSM_TYPE__VERSION:
				return getVersion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CSMPackage.CSM_TYPE__SCENARIO_LIST:
				getScenarioList().clear();
				getScenarioList().addAll((Collection<? extends ScenarioType>)newValue);
				return;
			case CSMPackage.CSM_TYPE__COMPONENT_LIST:
				getComponentList().clear();
				getComponentList().addAll((Collection<? extends ComponentType>)newValue);
				return;
			case CSMPackage.CSM_TYPE__COMM_LINK_LIST:
				getCommLinkList().clear();
				getCommLinkList().addAll((Collection<? extends CommLinkType>)newValue);
				return;
			case CSMPackage.CSM_TYPE__PROCESSING_RESOURCE_LIST:
				getProcessingResourceList().clear();
				getProcessingResourceList().addAll((Collection<? extends ProcessingResourceType>)newValue);
				return;
			case CSMPackage.CSM_TYPE__LOGICAL_RESOURCE_LIST:
				getLogicalResourceList().clear();
				getLogicalResourceList().addAll((Collection<? extends LogicalResourceType>)newValue);
				return;
			case CSMPackage.CSM_TYPE__VARIABLE_LIST:
				getVariableList().clear();
				getVariableList().addAll((Collection<? extends VariableType>)newValue);
				return;
			case CSMPackage.CSM_TYPE__PERF_MEASURE_LIST:
				getPerfMeasureList().clear();
				getPerfMeasureList().addAll((Collection<? extends PerfMeasureType>)newValue);
				return;
			case CSMPackage.CSM_TYPE__AUTHOR:
				setAuthor((String)newValue);
				return;
			case CSMPackage.CSM_TYPE__CREATED:
				setCreated((XMLGregorianCalendar)newValue);
				return;
			case CSMPackage.CSM_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CSMPackage.CSM_TYPE__MODIFIED:
				setModified((XMLGregorianCalendar)newValue);
				return;
			case CSMPackage.CSM_TYPE__NAME:
				setName((String)newValue);
				return;
			case CSMPackage.CSM_TYPE__TRACEABILITY_LINK:
				setTraceabilityLink((String)newValue);
				return;
			case CSMPackage.CSM_TYPE__VERSION:
				setVersion((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CSMPackage.CSM_TYPE__SCENARIO_LIST:
				getScenarioList().clear();
				return;
			case CSMPackage.CSM_TYPE__COMPONENT_LIST:
				getComponentList().clear();
				return;
			case CSMPackage.CSM_TYPE__COMM_LINK_LIST:
				getCommLinkList().clear();
				return;
			case CSMPackage.CSM_TYPE__PROCESSING_RESOURCE_LIST:
				getProcessingResourceList().clear();
				return;
			case CSMPackage.CSM_TYPE__LOGICAL_RESOURCE_LIST:
				getLogicalResourceList().clear();
				return;
			case CSMPackage.CSM_TYPE__VARIABLE_LIST:
				getVariableList().clear();
				return;
			case CSMPackage.CSM_TYPE__PERF_MEASURE_LIST:
				getPerfMeasureList().clear();
				return;
			case CSMPackage.CSM_TYPE__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case CSMPackage.CSM_TYPE__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case CSMPackage.CSM_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CSMPackage.CSM_TYPE__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case CSMPackage.CSM_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CSMPackage.CSM_TYPE__TRACEABILITY_LINK:
				setTraceabilityLink(TRACEABILITY_LINK_EDEFAULT);
				return;
			case CSMPackage.CSM_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CSMPackage.CSM_TYPE__SCENARIO_LIST:
				return scenarioList != null && !scenarioList.isEmpty();
			case CSMPackage.CSM_TYPE__COMPONENT_LIST:
				return componentList != null && !componentList.isEmpty();
			case CSMPackage.CSM_TYPE__COMM_LINK_LIST:
				return commLinkList != null && !commLinkList.isEmpty();
			case CSMPackage.CSM_TYPE__PROCESSING_RESOURCE_LIST:
				return processingResourceList != null && !processingResourceList.isEmpty();
			case CSMPackage.CSM_TYPE__LOGICAL_RESOURCE_LIST:
				return logicalResourceList != null && !logicalResourceList.isEmpty();
			case CSMPackage.CSM_TYPE__VARIABLE_LIST:
				return variableList != null && !variableList.isEmpty();
			case CSMPackage.CSM_TYPE__PERF_MEASURE_LIST:
				return perfMeasureList != null && !perfMeasureList.isEmpty();
			case CSMPackage.CSM_TYPE__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case CSMPackage.CSM_TYPE__CREATED:
				return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
			case CSMPackage.CSM_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CSMPackage.CSM_TYPE__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case CSMPackage.CSM_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CSMPackage.CSM_TYPE__TRACEABILITY_LINK:
				return TRACEABILITY_LINK_EDEFAULT == null ? traceabilityLink != null : !TRACEABILITY_LINK_EDEFAULT.equals(traceabilityLink);
			case CSMPackage.CSM_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (author: ");
		result.append(author);
		result.append(", created: ");
		result.append(created);
		result.append(", description: ");
		result.append(description);
		result.append(", modified: ");
		result.append(modified);
		result.append(", name: ");
		result.append(name);
		result.append(", traceabilityLink: ");
		result.append(traceabilityLink);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //CSMTypeImpl
