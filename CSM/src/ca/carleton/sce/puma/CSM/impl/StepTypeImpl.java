/**
 */
package ca.carleton.sce.puma.CSM.impl;

import ca.carleton.sce.puma.CSM.AspectStepType;
import ca.carleton.sce.puma.CSM.CSMPackage;
import ca.carleton.sce.puma.CSM.ComponentType;
import ca.carleton.sce.puma.CSM.ExternalDemandType;
import ca.carleton.sce.puma.CSM.InputSetType;
import ca.carleton.sce.puma.CSM.OutputSetType;
import ca.carleton.sce.puma.CSM.PathConnectionType;
import ca.carleton.sce.puma.CSM.PostConditionType;
import ca.carleton.sce.puma.CSM.PreConditionType;
import ca.carleton.sce.puma.CSM.RefinementType;
import ca.carleton.sce.puma.CSM.StepKind;
import ca.carleton.sce.puma.CSM.ResourceAcquireType;
import ca.carleton.sce.puma.CSM.ResourcePassType;
import ca.carleton.sce.puma.CSM.ResourceReleaseType;
import ca.carleton.sce.puma.CSM.ScenarioElementType;
import ca.carleton.sce.puma.CSM.StepType;
import ca.carleton.sce.puma.CSM.SynchronizationKind;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.StepTypeImpl#getRefinement <em>Refinement</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.StepTypeImpl#getExternalDemand <em>External Demand</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.StepTypeImpl#getBlockT <em>Block T</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.StepTypeImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.StepTypeImpl#getHostDemand <em>Host Demand</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.StepTypeImpl#getNosync <em>Nosync</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.StepTypeImpl#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.StepTypeImpl#getProbability <em>Probability</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.StepTypeImpl#getRepetitionCount <em>Repetition Count</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.StepTypeImpl#getRespT <em>Resp T</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.StepTypeImpl#getStepKind <em>Step Kind</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.StepTypeImpl#getSuccessor <em>Successor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StepTypeImpl extends ScenarioElementTypeImpl implements StepType {
	
	/**
	 * @generated NOT
	 */
	private int pathSegmentId; 
	
	/**
	 * The cached value of the '{@link #getRefinement() <em>Refinement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinement()
	 * @generated
	 * @ordered
	 */
	protected RefinementType refinement;

	/**
	 * The cached value of the '{@link #getExternalDemand() <em>External Demand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalDemand()
	 * @generated
	 * @ordered
	 */
	protected ExternalDemandType externalDemand;

	/**
	 * The default value of the '{@link #getBlockT() <em>Block T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockT()
	 * @generated
	 * @ordered
	 */
	protected static final String BLOCK_T_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlockT() <em>Block T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockT()
	 * @generated
	 * @ordered
	 */
	protected String blockT = BLOCK_T_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected ComponentType component;

	/**
	 * The default value of the '{@link #getHostDemand() <em>Host Demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostDemand()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_DEMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostDemand() <em>Host Demand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostDemand()
	 * @generated
	 * @ordered
	 */
	protected String hostDemand = HOST_DEMAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getNosync() <em>Nosync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNosync()
	 * @generated
	 * @ordered
	 */
	protected static final SynchronizationKind NOSYNC_EDEFAULT = SynchronizationKind.FALSE;

	/**
	 * The cached value of the '{@link #getNosync() <em>Nosync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNosync()
	 * @generated
	 * @ordered
	 */
	protected SynchronizationKind nosync = NOSYNC_EDEFAULT;

	/**
	 * This is true if the Nosync attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nosyncESet;

	/**
	 * The cached value of the '{@link #getPredecessor() <em>Predecessor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecessor()
	 * @generated
	 * @ordered
	 */
	protected PathConnectionType predecessor;

	/**
	 * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected static final String PROBABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected String probability = PROBABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepetitionCount() <em>Repetition Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepetitionCount()
	 * @generated
	 * @ordered
	 */
	protected static final String REPETITION_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepetitionCount() <em>Repetition Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepetitionCount()
	 * @generated
	 * @ordered
	 */
	protected String repetitionCount = REPETITION_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRespT() <em>Resp T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRespT()
	 * @generated
	 * @ordered
	 */
	protected static final String RESP_T_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRespT() <em>Resp T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRespT()
	 * @generated
	 * @ordered
	 */
	protected String respT = RESP_T_EDEFAULT;

	/**
	 * The default value of the '{@link #getStepKind() <em>Step Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepKind()
	 * @generated
	 * @ordered
	 */
	protected static final StepKind STEP_KIND_EDEFAULT = StepKind.NORMAL;

	/**
	 * The cached value of the '{@link #getStepKind() <em>Step Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepKind()
	 * @generated
	 * @ordered
	 */
	protected StepKind stepKind = STEP_KIND_EDEFAULT;

	/**
	 * This is true if the Step Kind attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stepKindESet;

	/**
	 * The cached value of the '{@link #getSuccessor() <em>Successor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessor()
	 * @generated
	 * @ordered
	 */
	protected PathConnectionType successor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSMPackage.Literals.STEP_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefinementType getRefinement() {
		return refinement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefinement(RefinementType newRefinement, NotificationChain msgs) {
		RefinementType oldRefinement = refinement;
		refinement = newRefinement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CSMPackage.STEP_TYPE__REFINEMENT, oldRefinement, newRefinement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefinement(RefinementType newRefinement) {
		if (newRefinement != refinement) {
			NotificationChain msgs = null;
			if (refinement != null)
				msgs = ((InternalEObject)refinement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CSMPackage.STEP_TYPE__REFINEMENT, null, msgs);
			if (newRefinement != null)
				msgs = ((InternalEObject)newRefinement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CSMPackage.STEP_TYPE__REFINEMENT, null, msgs);
			msgs = basicSetRefinement(newRefinement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.STEP_TYPE__REFINEMENT, newRefinement, newRefinement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalDemandType getExternalDemand() {
		return externalDemand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternalDemand(ExternalDemandType newExternalDemand, NotificationChain msgs) {
		ExternalDemandType oldExternalDemand = externalDemand;
		externalDemand = newExternalDemand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CSMPackage.STEP_TYPE__EXTERNAL_DEMAND, oldExternalDemand, newExternalDemand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalDemand(ExternalDemandType newExternalDemand) {
		if (newExternalDemand != externalDemand) {
			NotificationChain msgs = null;
			if (externalDemand != null)
				msgs = ((InternalEObject)externalDemand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CSMPackage.STEP_TYPE__EXTERNAL_DEMAND, null, msgs);
			if (newExternalDemand != null)
				msgs = ((InternalEObject)newExternalDemand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CSMPackage.STEP_TYPE__EXTERNAL_DEMAND, null, msgs);
			msgs = basicSetExternalDemand(newExternalDemand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.STEP_TYPE__EXTERNAL_DEMAND, newExternalDemand, newExternalDemand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBlockT() {
		return blockT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockT(String newBlockT) {
		String oldBlockT = blockT;
		blockT = newBlockT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.STEP_TYPE__BLOCK_T, oldBlockT, blockT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentType getComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(ComponentType newComponent) {
		ComponentType oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.STEP_TYPE__COMPONENT, oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHostDemand() {
		return hostDemand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostDemand(String newHostDemand) {
		String oldHostDemand = hostDemand;
		hostDemand = newHostDemand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.STEP_TYPE__HOST_DEMAND, oldHostDemand, hostDemand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizationKind getNosync() {
		return nosync;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNosync(SynchronizationKind newNosync) {
		SynchronizationKind oldNosync = nosync;
		nosync = newNosync == null ? NOSYNC_EDEFAULT : newNosync;
		boolean oldNosyncESet = nosyncESet;
		nosyncESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.STEP_TYPE__NOSYNC, oldNosync, nosync, !oldNosyncESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNosync() {
		SynchronizationKind oldNosync = nosync;
		boolean oldNosyncESet = nosyncESet;
		nosync = NOSYNC_EDEFAULT;
		nosyncESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CSMPackage.STEP_TYPE__NOSYNC, oldNosync, NOSYNC_EDEFAULT, oldNosyncESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNosync() {
		return nosyncESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathConnectionType getPredecessor() {
		return predecessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredecessor(PathConnectionType newPredecessor) {
		PathConnectionType oldPredecessor = predecessor;
		predecessor = newPredecessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.STEP_TYPE__PREDECESSOR, oldPredecessor, predecessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProbability() {
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbability(String newProbability) {
		String oldProbability = probability;
		probability = newProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.STEP_TYPE__PROBABILITY, oldProbability, probability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepetitionCount() {
		return repetitionCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepetitionCount(String newRepetitionCount) {
		String oldRepetitionCount = repetitionCount;
		repetitionCount = newRepetitionCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.STEP_TYPE__REPETITION_COUNT, oldRepetitionCount, repetitionCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRespT() {
		return respT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRespT(String newRespT) {
		String oldRespT = respT;
		respT = newRespT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.STEP_TYPE__RESP_T, oldRespT, respT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepKind getStepKind() {
		return stepKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStepKind(StepKind newStepKind) {
		StepKind oldStepKind = stepKind;
		stepKind = newStepKind == null ? STEP_KIND_EDEFAULT : newStepKind;
		boolean oldStepKindESet = stepKindESet;
		stepKindESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.STEP_TYPE__STEP_KIND, oldStepKind, stepKind, !oldStepKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStepKind() {
		StepKind oldStepKind = stepKind;
		boolean oldStepKindESet = stepKindESet;
		stepKind = STEP_KIND_EDEFAULT;
		stepKindESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CSMPackage.STEP_TYPE__STEP_KIND, oldStepKind, STEP_KIND_EDEFAULT, oldStepKindESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStepKind() {
		return stepKindESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathConnectionType getSuccessor() {
		return successor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccessor(PathConnectionType newSuccessor) {
		PathConnectionType oldSuccessor = successor;
		successor = newSuccessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.STEP_TYPE__SUCCESSOR, oldSuccessor, successor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CSMPackage.STEP_TYPE__REFINEMENT:
				return basicSetRefinement(null, msgs);
			case CSMPackage.STEP_TYPE__EXTERNAL_DEMAND:
				return basicSetExternalDemand(null, msgs);
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
			case CSMPackage.STEP_TYPE__REFINEMENT:
				return getRefinement();
			case CSMPackage.STEP_TYPE__EXTERNAL_DEMAND:
				return getExternalDemand();
			case CSMPackage.STEP_TYPE__BLOCK_T:
				return getBlockT();
			case CSMPackage.STEP_TYPE__COMPONENT:
				return getComponent();
			case CSMPackage.STEP_TYPE__HOST_DEMAND:
				return getHostDemand();
			case CSMPackage.STEP_TYPE__NOSYNC:
				return getNosync();
			case CSMPackage.STEP_TYPE__PREDECESSOR:
				return getPredecessor();
			case CSMPackage.STEP_TYPE__PROBABILITY:
				return getProbability();
			case CSMPackage.STEP_TYPE__REPETITION_COUNT:
				return getRepetitionCount();
			case CSMPackage.STEP_TYPE__RESP_T:
				return getRespT();
			case CSMPackage.STEP_TYPE__STEP_KIND:
				return getStepKind();
			case CSMPackage.STEP_TYPE__SUCCESSOR:
				return getSuccessor();
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
			case CSMPackage.STEP_TYPE__REFINEMENT:
				setRefinement((RefinementType)newValue);
				return;
			case CSMPackage.STEP_TYPE__EXTERNAL_DEMAND:
				setExternalDemand((ExternalDemandType)newValue);
				return;
			case CSMPackage.STEP_TYPE__BLOCK_T:
				setBlockT((String)newValue);
				return;
			case CSMPackage.STEP_TYPE__COMPONENT:
				setComponent((ComponentType)newValue);
				return;
			case CSMPackage.STEP_TYPE__HOST_DEMAND:
				setHostDemand((String)newValue);
				return;
			case CSMPackage.STEP_TYPE__NOSYNC:
				setNosync((SynchronizationKind)newValue);
				return;
			case CSMPackage.STEP_TYPE__PREDECESSOR:
				setPredecessor((PathConnectionType)newValue);
				return;
			case CSMPackage.STEP_TYPE__PROBABILITY:
				setProbability((String)newValue);
				return;
			case CSMPackage.STEP_TYPE__REPETITION_COUNT:
				setRepetitionCount((String)newValue);
				return;
			case CSMPackage.STEP_TYPE__RESP_T:
				setRespT((String)newValue);
				return;
			case CSMPackage.STEP_TYPE__STEP_KIND:
				setStepKind((StepKind)newValue);
				return;
			case CSMPackage.STEP_TYPE__SUCCESSOR:
				setSuccessor((PathConnectionType)newValue);
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
			case CSMPackage.STEP_TYPE__REFINEMENT:
				setRefinement((RefinementType)null);
				return;
			case CSMPackage.STEP_TYPE__EXTERNAL_DEMAND:
				setExternalDemand((ExternalDemandType)null);
				return;
			case CSMPackage.STEP_TYPE__BLOCK_T:
				setBlockT(BLOCK_T_EDEFAULT);
				return;
			case CSMPackage.STEP_TYPE__COMPONENT:
				setComponent((ComponentType)null);
				return;
			case CSMPackage.STEP_TYPE__HOST_DEMAND:
				setHostDemand(HOST_DEMAND_EDEFAULT);
				return;
			case CSMPackage.STEP_TYPE__NOSYNC:
				unsetNosync();
				return;
			case CSMPackage.STEP_TYPE__PREDECESSOR:
				setPredecessor((PathConnectionType)null);
				return;
			case CSMPackage.STEP_TYPE__PROBABILITY:
				setProbability(PROBABILITY_EDEFAULT);
				return;
			case CSMPackage.STEP_TYPE__REPETITION_COUNT:
				setRepetitionCount(REPETITION_COUNT_EDEFAULT);
				return;
			case CSMPackage.STEP_TYPE__RESP_T:
				setRespT(RESP_T_EDEFAULT);
				return;
			case CSMPackage.STEP_TYPE__STEP_KIND:
				unsetStepKind();
				return;
			case CSMPackage.STEP_TYPE__SUCCESSOR:
				setSuccessor((PathConnectionType)null);
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
			case CSMPackage.STEP_TYPE__REFINEMENT:
				return refinement != null;
			case CSMPackage.STEP_TYPE__EXTERNAL_DEMAND:
				return externalDemand != null;
			case CSMPackage.STEP_TYPE__BLOCK_T:
				return BLOCK_T_EDEFAULT == null ? blockT != null : !BLOCK_T_EDEFAULT.equals(blockT);
			case CSMPackage.STEP_TYPE__COMPONENT:
				return component != null;
			case CSMPackage.STEP_TYPE__HOST_DEMAND:
				return HOST_DEMAND_EDEFAULT == null ? hostDemand != null : !HOST_DEMAND_EDEFAULT.equals(hostDemand);
			case CSMPackage.STEP_TYPE__NOSYNC:
				return isSetNosync();
			case CSMPackage.STEP_TYPE__PREDECESSOR:
				return predecessor != null;
			case CSMPackage.STEP_TYPE__PROBABILITY:
				return PROBABILITY_EDEFAULT == null ? probability != null : !PROBABILITY_EDEFAULT.equals(probability);
			case CSMPackage.STEP_TYPE__REPETITION_COUNT:
				return REPETITION_COUNT_EDEFAULT == null ? repetitionCount != null : !REPETITION_COUNT_EDEFAULT.equals(repetitionCount);
			case CSMPackage.STEP_TYPE__RESP_T:
				return RESP_T_EDEFAULT == null ? respT != null : !RESP_T_EDEFAULT.equals(respT);
			case CSMPackage.STEP_TYPE__STEP_KIND:
				return isSetStepKind();
			case CSMPackage.STEP_TYPE__SUCCESSOR:
				return successor != null;
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
		result.append(" (blockT: ");
		result.append(blockT);
		result.append(", hostDemand: ");
		result.append(hostDemand);
		result.append(", nosync: ");
		if (nosyncESet) result.append(nosync); else result.append("<unset>");
		result.append(", probability: ");
		result.append(probability);
		result.append(", repetitionCount: ");
		result.append(repetitionCount);
		result.append(", respT: ");
		result.append(respT);
		result.append(", stepKind: ");
		if (stepKindESet) result.append(stepKind); else result.append("<unset>");
		result.append(')');
		return result.toString();
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
	

} //StepTypeImpl
