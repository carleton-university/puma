/**
 */
package ca.carleton.sce.puma.CSM.impl;

import ca.carleton.sce.puma.CSM.CSMPackage;
import ca.carleton.sce.puma.CSM.ClassifierType;
import ca.carleton.sce.puma.CSM.PathConnectionType;
import ca.carleton.sce.puma.CSM.StepType;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Connection Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.PathConnectionTypeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.PathConnectionTypeImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PathConnectionTypeImpl extends ScenarioElementTypeImpl implements PathConnectionType {
	
	/**
	 * @generated NOT
	 */
	private int pathSegmentId; 
	
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<StepType> source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<StepType> target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathConnectionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSMPackage.Literals.PATH_CONNECTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StepType> getSource() {
		if (source == null) {
			source = new EObjectEList<StepType>(StepType.class, this, CSMPackage.PATH_CONNECTION_TYPE__SOURCE);
		}
		return source;
	}

	/**
	 * @generated NOT
	 */
	public void setSource(EList<StepType> newSource) {
		EList<StepType> oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.PATH_CONNECTION_TYPE__SOURCE, oldSource, source));
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StepType> getTarget() {
		if (target == null) {
			target = new EObjectEList<StepType>(StepType.class, this, CSMPackage.PATH_CONNECTION_TYPE__TARGET);
		}
		return target;
	}

	/**
	 * @generated NOT
	 */
	public void setTarget(EList<StepType> newTarget) {
		EList<StepType> oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.PATH_CONNECTION_TYPE__TARGET, oldTarget, target));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CSMPackage.PATH_CONNECTION_TYPE__SOURCE:
				return getSource();
			case CSMPackage.PATH_CONNECTION_TYPE__TARGET:
				return getTarget();
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
			case CSMPackage.PATH_CONNECTION_TYPE__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends StepType>)newValue);
				return;
			case CSMPackage.PATH_CONNECTION_TYPE__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends StepType>)newValue);
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
			case CSMPackage.PATH_CONNECTION_TYPE__SOURCE:
				getSource().clear();
				return;
			case CSMPackage.PATH_CONNECTION_TYPE__TARGET:
				getTarget().clear();
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
			case CSMPackage.PATH_CONNECTION_TYPE__SOURCE:
				return source != null && !source.isEmpty();
			case CSMPackage.PATH_CONNECTION_TYPE__TARGET:
				return target != null && !target.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * @generated NOT
	 */
	public int getPathSegmentID()
	{
		return pathSegmentId; 
	}
	
	/**
	 * @generated NOT
	 */
	public void setPathSegmentID(int id)
	{
		this.pathSegmentId = id; 
	}

} //PathConnectionTypeImpl
