/**
 */
package ca.carleton.sce.puma.CSM.impl;

import ca.carleton.sce.puma.CSM.CSMPackage;
import ca.carleton.sce.puma.CSM.EndType;
import ca.carleton.sce.puma.CSM.OutBindingType;

import ca.carleton.sce.puma.CSM.StepType;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Out Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.OutBindingTypeImpl#getEnd <em>End</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.OutBindingTypeImpl#getOutStep <em>Out Step</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutBindingTypeImpl extends EObjectImpl implements OutBindingType {
	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected EndType end;

	/**
	 * The cached value of the '{@link #getOutStep() <em>Out Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutStep()
	 * @generated
	 * @ordered
	 */
	protected StepType outStep;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutBindingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSMPackage.Literals.OUT_BINDING_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndType getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(EndType newEnd) {
		EndType oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.OUT_BINDING_TYPE__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepType getOutStep() {
		return outStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutStep(StepType newOutStep) {
		StepType oldOutStep = outStep;
		outStep = newOutStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.OUT_BINDING_TYPE__OUT_STEP, oldOutStep, outStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CSMPackage.OUT_BINDING_TYPE__END:
				return getEnd();
			case CSMPackage.OUT_BINDING_TYPE__OUT_STEP:
				return getOutStep();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CSMPackage.OUT_BINDING_TYPE__END:
				setEnd((EndType)newValue);
				return;
			case CSMPackage.OUT_BINDING_TYPE__OUT_STEP:
				setOutStep((StepType)newValue);
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
			case CSMPackage.OUT_BINDING_TYPE__END:
				setEnd((EndType)null);
				return;
			case CSMPackage.OUT_BINDING_TYPE__OUT_STEP:
				setOutStep((StepType)null);
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
			case CSMPackage.OUT_BINDING_TYPE__END:
				return end != null;
			case CSMPackage.OUT_BINDING_TYPE__OUT_STEP:
				return outStep != null;
		}
		return super.eIsSet(featureID);
	}

} //OutBindingTypeImpl
