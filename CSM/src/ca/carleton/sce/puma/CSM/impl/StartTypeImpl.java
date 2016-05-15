/**
 */
package ca.carleton.sce.puma.CSM.impl;

import ca.carleton.sce.puma.CSM.CSMPackage;
import ca.carleton.sce.puma.CSM.ClosedWorkloadType;
import ca.carleton.sce.puma.CSM.InBindingType;
import ca.carleton.sce.puma.CSM.OpenWorkloadType;
import ca.carleton.sce.puma.CSM.StartType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.StartTypeImpl#getClosedWorkload <em>Closed Workload</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.StartTypeImpl#getOpenWorkload <em>Open Workload</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.StartTypeImpl#getInBinding <em>In Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StartTypeImpl extends PathConnectionTypeImpl implements StartType {
	/**
	 * The cached value of the '{@link #getClosedWorkload() <em>Closed Workload</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosedWorkload()
	 * @generated
	 * @ordered
	 */
	protected ClosedWorkloadType closedWorkload;

	/**
	 * The cached value of the '{@link #getOpenWorkload() <em>Open Workload</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenWorkload()
	 * @generated
	 * @ordered
	 */
	protected OpenWorkloadType openWorkload;

	/**
	 * The cached value of the '{@link #getInBinding() <em>In Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInBinding()
	 * @generated
	 * @ordered
	 */
	protected InBindingType inBinding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSMPackage.Literals.START_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClosedWorkloadType getClosedWorkload() {
		return closedWorkload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClosedWorkload(ClosedWorkloadType newClosedWorkload, NotificationChain msgs) {
		ClosedWorkloadType oldClosedWorkload = closedWorkload;
		closedWorkload = newClosedWorkload;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CSMPackage.START_TYPE__CLOSED_WORKLOAD, oldClosedWorkload, newClosedWorkload);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClosedWorkload(ClosedWorkloadType newClosedWorkload) {
		if (newClosedWorkload != closedWorkload) {
			NotificationChain msgs = null;
			if (closedWorkload != null)
				msgs = ((InternalEObject)closedWorkload).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CSMPackage.START_TYPE__CLOSED_WORKLOAD, null, msgs);
			if (newClosedWorkload != null)
				msgs = ((InternalEObject)newClosedWorkload).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CSMPackage.START_TYPE__CLOSED_WORKLOAD, null, msgs);
			msgs = basicSetClosedWorkload(newClosedWorkload, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.START_TYPE__CLOSED_WORKLOAD, newClosedWorkload, newClosedWorkload));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenWorkloadType getOpenWorkload() {
		return openWorkload;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpenWorkload(OpenWorkloadType newOpenWorkload, NotificationChain msgs) {
		OpenWorkloadType oldOpenWorkload = openWorkload;
		openWorkload = newOpenWorkload;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CSMPackage.START_TYPE__OPEN_WORKLOAD, oldOpenWorkload, newOpenWorkload);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpenWorkload(OpenWorkloadType newOpenWorkload) {
		if (newOpenWorkload != openWorkload) {
			NotificationChain msgs = null;
			if (openWorkload != null)
				msgs = ((InternalEObject)openWorkload).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CSMPackage.START_TYPE__OPEN_WORKLOAD, null, msgs);
			if (newOpenWorkload != null)
				msgs = ((InternalEObject)newOpenWorkload).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CSMPackage.START_TYPE__OPEN_WORKLOAD, null, msgs);
			msgs = basicSetOpenWorkload(newOpenWorkload, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.START_TYPE__OPEN_WORKLOAD, newOpenWorkload, newOpenWorkload));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InBindingType getInBinding() {
		return inBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInBinding(InBindingType newInBinding) {
		InBindingType oldInBinding = inBinding;
		inBinding = newInBinding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.START_TYPE__IN_BINDING, oldInBinding, inBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CSMPackage.START_TYPE__CLOSED_WORKLOAD:
				return basicSetClosedWorkload(null, msgs);
			case CSMPackage.START_TYPE__OPEN_WORKLOAD:
				return basicSetOpenWorkload(null, msgs);
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
			case CSMPackage.START_TYPE__CLOSED_WORKLOAD:
				return getClosedWorkload();
			case CSMPackage.START_TYPE__OPEN_WORKLOAD:
				return getOpenWorkload();
			case CSMPackage.START_TYPE__IN_BINDING:
				return getInBinding();
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
			case CSMPackage.START_TYPE__CLOSED_WORKLOAD:
				setClosedWorkload((ClosedWorkloadType)newValue);
				return;
			case CSMPackage.START_TYPE__OPEN_WORKLOAD:
				setOpenWorkload((OpenWorkloadType)newValue);
				return;
			case CSMPackage.START_TYPE__IN_BINDING:
				setInBinding((InBindingType)newValue);
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
			case CSMPackage.START_TYPE__CLOSED_WORKLOAD:
				setClosedWorkload((ClosedWorkloadType)null);
				return;
			case CSMPackage.START_TYPE__OPEN_WORKLOAD:
				setOpenWorkload((OpenWorkloadType)null);
				return;
			case CSMPackage.START_TYPE__IN_BINDING:
				setInBinding((InBindingType)null);
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
			case CSMPackage.START_TYPE__CLOSED_WORKLOAD:
				return closedWorkload != null;
			case CSMPackage.START_TYPE__OPEN_WORKLOAD:
				return openWorkload != null;
			case CSMPackage.START_TYPE__IN_BINDING:
				return inBinding != null;
		}
		return super.eIsSet(featureID);
	}

} //StartTypeImpl
