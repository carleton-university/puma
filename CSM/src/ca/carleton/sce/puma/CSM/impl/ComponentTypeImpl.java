/**
 */
package ca.carleton.sce.puma.CSM.impl;

import ca.carleton.sce.puma.CSM.CSMPackage;
import ca.carleton.sce.puma.CSM.ComponentType;
import ca.carleton.sce.puma.CSM.ProcessingResourceType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.ComponentTypeImpl#getHost <em>Host</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.ComponentTypeImpl#isIsActiveProcess <em>Is Active Process</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.ComponentTypeImpl#getParentComponent <em>Parent Component</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.ComponentTypeImpl#getSubComponentList <em>Sub Component List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentTypeImpl extends LogicalResourceTypeImpl implements ComponentType {
	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected ProcessingResourceType host;

	/**
	 * The default value of the '{@link #isIsActiveProcess() <em>Is Active Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActiveProcess()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ACTIVE_PROCESS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsActiveProcess() <em>Is Active Process</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActiveProcess()
	 * @generated
	 * @ordered
	 */
	protected boolean isActiveProcess = IS_ACTIVE_PROCESS_EDEFAULT;

	/**
	 * This is true if the Is Active Process attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isActiveProcessESet;

	/**
	 * The cached value of the '{@link #getParentComponent() <em>Parent Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentComponent()
	 * @generated
	 * @ordered
	 */
	protected ComponentType parentComponent;

	/**
	 * The cached value of the '{@link #getSubComponentList() <em>Sub Component List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubComponentList()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentType> subComponentList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ComponentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSMPackage.Literals.COMPONENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingResourceType getHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHost(ProcessingResourceType newHost) {
		ProcessingResourceType oldHost = host;
		host = newHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.COMPONENT_TYPE__HOST, oldHost, host));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsActiveProcess() {
		return isActiveProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsActiveProcess(boolean newIsActiveProcess) {
		boolean oldIsActiveProcess = isActiveProcess;
		isActiveProcess = newIsActiveProcess;
		boolean oldIsActiveProcessESet = isActiveProcessESet;
		isActiveProcessESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.COMPONENT_TYPE__IS_ACTIVE_PROCESS, oldIsActiveProcess, isActiveProcess, !oldIsActiveProcessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsActiveProcess() {
		boolean oldIsActiveProcess = isActiveProcess;
		boolean oldIsActiveProcessESet = isActiveProcessESet;
		isActiveProcess = IS_ACTIVE_PROCESS_EDEFAULT;
		isActiveProcessESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CSMPackage.COMPONENT_TYPE__IS_ACTIVE_PROCESS, oldIsActiveProcess, IS_ACTIVE_PROCESS_EDEFAULT, oldIsActiveProcessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsActiveProcess() {
		return isActiveProcessESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType getParentComponent() {
		return parentComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentComponent(ComponentType newParentComponent) {
		ComponentType oldParentComponent = parentComponent;
		parentComponent = newParentComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.COMPONENT_TYPE__PARENT_COMPONENT, oldParentComponent, parentComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentType> getSubComponentList() {
		if (subComponentList == null) {
			subComponentList = new EObjectEList<ComponentType>(ComponentType.class, this, CSMPackage.COMPONENT_TYPE__SUB_COMPONENT_LIST);
		}
		return subComponentList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CSMPackage.COMPONENT_TYPE__HOST:
				return getHost();
			case CSMPackage.COMPONENT_TYPE__IS_ACTIVE_PROCESS:
				return isIsActiveProcess();
			case CSMPackage.COMPONENT_TYPE__PARENT_COMPONENT:
				return getParentComponent();
			case CSMPackage.COMPONENT_TYPE__SUB_COMPONENT_LIST:
				return getSubComponentList();
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
			case CSMPackage.COMPONENT_TYPE__HOST:
				setHost((ProcessingResourceType)newValue);
				return;
			case CSMPackage.COMPONENT_TYPE__IS_ACTIVE_PROCESS:
				setIsActiveProcess((Boolean)newValue);
				return;
			case CSMPackage.COMPONENT_TYPE__PARENT_COMPONENT:
				setParentComponent((ComponentType)newValue);
				return;
			case CSMPackage.COMPONENT_TYPE__SUB_COMPONENT_LIST:
				getSubComponentList().clear();
				getSubComponentList().addAll((Collection<? extends ComponentType>)newValue);
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
			case CSMPackage.COMPONENT_TYPE__HOST:
				setHost((ProcessingResourceType)null);
				return;
			case CSMPackage.COMPONENT_TYPE__IS_ACTIVE_PROCESS:
				unsetIsActiveProcess();
				return;
			case CSMPackage.COMPONENT_TYPE__PARENT_COMPONENT:
				setParentComponent((ComponentType)null);
				return;
			case CSMPackage.COMPONENT_TYPE__SUB_COMPONENT_LIST:
				getSubComponentList().clear();
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
			case CSMPackage.COMPONENT_TYPE__HOST:
				return host != null;
			case CSMPackage.COMPONENT_TYPE__IS_ACTIVE_PROCESS:
				return isSetIsActiveProcess();
			case CSMPackage.COMPONENT_TYPE__PARENT_COMPONENT:
				return parentComponent != null;
			case CSMPackage.COMPONENT_TYPE__SUB_COMPONENT_LIST:
				return subComponentList != null && !subComponentList.isEmpty();
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
		result.append(" (isActiveProcess: ");
		if (isActiveProcessESet) result.append(isActiveProcess); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ComponentTypeImpl
