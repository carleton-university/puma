/**
 */
package ca.carleton.sce.puma.CSM.impl;

import ca.carleton.sce.puma.CSM.AspectStepType;
import ca.carleton.sce.puma.CSM.CSMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aspect Step Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.AspectStepTypeImpl#getAspectDefinition <em>Aspect Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AspectStepTypeImpl extends StepTypeImpl implements AspectStepType {
	/**
	 * The default value of the '{@link #getAspectDefinition() <em>Aspect Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspectDefinition()
	 * @generated
	 * @ordered
	 */
	protected static final String ASPECT_DEFINITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAspectDefinition() <em>Aspect Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspectDefinition()
	 * @generated
	 * @ordered
	 */
	protected String aspectDefinition = ASPECT_DEFINITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AspectStepTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSMPackage.Literals.ASPECT_STEP_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAspectDefinition() {
		return aspectDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAspectDefinition(String newAspectDefinition) {
		String oldAspectDefinition = aspectDefinition;
		aspectDefinition = newAspectDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.ASPECT_STEP_TYPE__ASPECT_DEFINITION, oldAspectDefinition, aspectDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CSMPackage.ASPECT_STEP_TYPE__ASPECT_DEFINITION:
				return getAspectDefinition();
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
			case CSMPackage.ASPECT_STEP_TYPE__ASPECT_DEFINITION:
				setAspectDefinition((String)newValue);
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
			case CSMPackage.ASPECT_STEP_TYPE__ASPECT_DEFINITION:
				setAspectDefinition(ASPECT_DEFINITION_EDEFAULT);
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
			case CSMPackage.ASPECT_STEP_TYPE__ASPECT_DEFINITION:
				return ASPECT_DEFINITION_EDEFAULT == null ? aspectDefinition != null : !ASPECT_DEFINITION_EDEFAULT.equals(aspectDefinition);
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
		result.append(" (aspectDefinition: ");
		result.append(aspectDefinition);
		result.append(')');
		return result.toString();
	}

} //AspectStepTypeImpl
