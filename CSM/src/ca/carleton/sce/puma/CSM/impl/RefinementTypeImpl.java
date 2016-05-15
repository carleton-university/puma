/**
 */
package ca.carleton.sce.puma.CSM.impl;

import ca.carleton.sce.puma.CSM.CSMPackage;
import ca.carleton.sce.puma.CSM.InBindingType;
import ca.carleton.sce.puma.CSM.OutBindingType;
import ca.carleton.sce.puma.CSM.RefinementType;
import ca.carleton.sce.puma.CSM.RoleBindingType;
import ca.carleton.sce.puma.CSM.ScenarioType;
import ca.carleton.sce.puma.CSM.StepType;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Refinement Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.RefinementTypeImpl#getInBinding <em>In Binding</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.RefinementTypeImpl#getOutBinding <em>Out Binding</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.RefinementTypeImpl#getRoleBindingList <em>Role Binding List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.RefinementTypeImpl#getParentStep <em>Parent Step</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.RefinementTypeImpl#getSubScenario <em>Sub Scenario</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RefinementTypeImpl extends EObjectImpl implements RefinementType {
	/**
	 * The cached value of the '{@link #getInBinding() <em>In Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInBinding()
	 * @generated
	 * @ordered
	 */
	protected InBindingType inBinding;

	/**
	 * The cached value of the '{@link #getOutBinding() <em>Out Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutBinding()
	 * @generated
	 * @ordered
	 */
	protected OutBindingType outBinding;

	/**
	 * The cached value of the '{@link #getRoleBindingList() <em>Role Binding List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleBindingList()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleBindingType> roleBindingList;

	/**
	 * The cached value of the '{@link #getParentStep() <em>Parent Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentStep()
	 * @generated
	 * @ordered
	 */
	protected StepType parentStep;

	/**
	 * The cached value of the '{@link #getSubScenario() <em>Sub Scenario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubScenario()
	 * @generated
	 * @ordered
	 */
	protected ScenarioType subScenario;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefinementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSMPackage.Literals.REFINEMENT_TYPE;
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
	public NotificationChain basicSetInBinding(InBindingType newInBinding, NotificationChain msgs) {
		InBindingType oldInBinding = inBinding;
		inBinding = newInBinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CSMPackage.REFINEMENT_TYPE__IN_BINDING, oldInBinding, newInBinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInBinding(InBindingType newInBinding) {
		if (newInBinding != inBinding) {
			NotificationChain msgs = null;
			if (inBinding != null)
				msgs = ((InternalEObject)inBinding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CSMPackage.REFINEMENT_TYPE__IN_BINDING, null, msgs);
			if (newInBinding != null)
				msgs = ((InternalEObject)newInBinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CSMPackage.REFINEMENT_TYPE__IN_BINDING, null, msgs);
			msgs = basicSetInBinding(newInBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.REFINEMENT_TYPE__IN_BINDING, newInBinding, newInBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutBindingType getOutBinding() {
		return outBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutBinding(OutBindingType newOutBinding, NotificationChain msgs) {
		OutBindingType oldOutBinding = outBinding;
		outBinding = newOutBinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CSMPackage.REFINEMENT_TYPE__OUT_BINDING, oldOutBinding, newOutBinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutBinding(OutBindingType newOutBinding) {
		if (newOutBinding != outBinding) {
			NotificationChain msgs = null;
			if (outBinding != null)
				msgs = ((InternalEObject)outBinding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CSMPackage.REFINEMENT_TYPE__OUT_BINDING, null, msgs);
			if (newOutBinding != null)
				msgs = ((InternalEObject)newOutBinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CSMPackage.REFINEMENT_TYPE__OUT_BINDING, null, msgs);
			msgs = basicSetOutBinding(newOutBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.REFINEMENT_TYPE__OUT_BINDING, newOutBinding, newOutBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleBindingType> getRoleBindingList() {
		if (roleBindingList == null) {
			roleBindingList = new EObjectContainmentEList<RoleBindingType>(RoleBindingType.class, this, CSMPackage.REFINEMENT_TYPE__ROLE_BINDING_LIST);
		}
		return roleBindingList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepType getParentStep() {
		return parentStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentStep(StepType newParentStep) {
		StepType oldParentStep = parentStep;
		parentStep = newParentStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.REFINEMENT_TYPE__PARENT_STEP, oldParentStep, parentStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioType getSubScenario() {
		return subScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubScenario(ScenarioType newSubScenario) {
		ScenarioType oldSubScenario = subScenario;
		subScenario = newSubScenario;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.REFINEMENT_TYPE__SUB_SCENARIO, oldSubScenario, subScenario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CSMPackage.REFINEMENT_TYPE__IN_BINDING:
				return basicSetInBinding(null, msgs);
			case CSMPackage.REFINEMENT_TYPE__OUT_BINDING:
				return basicSetOutBinding(null, msgs);
			case CSMPackage.REFINEMENT_TYPE__ROLE_BINDING_LIST:
				return ((InternalEList<?>)getRoleBindingList()).basicRemove(otherEnd, msgs);
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
			case CSMPackage.REFINEMENT_TYPE__IN_BINDING:
				return getInBinding();
			case CSMPackage.REFINEMENT_TYPE__OUT_BINDING:
				return getOutBinding();
			case CSMPackage.REFINEMENT_TYPE__ROLE_BINDING_LIST:
				return getRoleBindingList();
			case CSMPackage.REFINEMENT_TYPE__PARENT_STEP:
				return getParentStep();
			case CSMPackage.REFINEMENT_TYPE__SUB_SCENARIO:
				return getSubScenario();
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
			case CSMPackage.REFINEMENT_TYPE__IN_BINDING:
				setInBinding((InBindingType)newValue);
				return;
			case CSMPackage.REFINEMENT_TYPE__OUT_BINDING:
				setOutBinding((OutBindingType)newValue);
				return;
			case CSMPackage.REFINEMENT_TYPE__ROLE_BINDING_LIST:
				getRoleBindingList().clear();
				getRoleBindingList().addAll((Collection<? extends RoleBindingType>)newValue);
				return;
			case CSMPackage.REFINEMENT_TYPE__PARENT_STEP:
				setParentStep((StepType)newValue);
				return;
			case CSMPackage.REFINEMENT_TYPE__SUB_SCENARIO:
				setSubScenario((ScenarioType)newValue);
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
			case CSMPackage.REFINEMENT_TYPE__IN_BINDING:
				setInBinding((InBindingType)null);
				return;
			case CSMPackage.REFINEMENT_TYPE__OUT_BINDING:
				setOutBinding((OutBindingType)null);
				return;
			case CSMPackage.REFINEMENT_TYPE__ROLE_BINDING_LIST:
				getRoleBindingList().clear();
				return;
			case CSMPackage.REFINEMENT_TYPE__PARENT_STEP:
				setParentStep((StepType)null);
				return;
			case CSMPackage.REFINEMENT_TYPE__SUB_SCENARIO:
				setSubScenario((ScenarioType)null);
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
			case CSMPackage.REFINEMENT_TYPE__IN_BINDING:
				return inBinding != null;
			case CSMPackage.REFINEMENT_TYPE__OUT_BINDING:
				return outBinding != null;
			case CSMPackage.REFINEMENT_TYPE__ROLE_BINDING_LIST:
				return roleBindingList != null && !roleBindingList.isEmpty();
			case CSMPackage.REFINEMENT_TYPE__PARENT_STEP:
				return parentStep != null;
			case CSMPackage.REFINEMENT_TYPE__SUB_SCENARIO:
				return subScenario != null;
		}
		return super.eIsSet(featureID);
	}

} //RefinementTypeImpl
