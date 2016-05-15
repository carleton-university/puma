/**
 */
package ca.carleton.sce.puma.CSM.impl;

import ca.carleton.sce.puma.CSM.AspectStepType;
import ca.carleton.sce.puma.CSM.BranchType;
import ca.carleton.sce.puma.CSM.CSMPackage;
import ca.carleton.sce.puma.CSM.ClassifierType;
import ca.carleton.sce.puma.CSM.CommStepType;
import ca.carleton.sce.puma.CSM.EndType;
import ca.carleton.sce.puma.CSM.ForkType;
import ca.carleton.sce.puma.CSM.JoinType;
import ca.carleton.sce.puma.CSM.MergeType;
import ca.carleton.sce.puma.CSM.MessageType;
import ca.carleton.sce.puma.CSM.RefinementType;
import ca.carleton.sce.puma.CSM.ResourceAcquireType;
import ca.carleton.sce.puma.CSM.ResourcePassType;
import ca.carleton.sce.puma.CSM.ResourceReleaseType;
import ca.carleton.sce.puma.CSM.ScenarioType;
import ca.carleton.sce.puma.CSM.SequenceType;
import ca.carleton.sce.puma.CSM.StartType;
import ca.carleton.sce.puma.CSM.StepType;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Scenario Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.ScenarioTypeImpl#getStepList <em>Step List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.ScenarioTypeImpl#getCommStepList <em>Comm Step List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.ScenarioTypeImpl#getResourceAcquireList <em>Resource Acquire List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.ScenarioTypeImpl#getResourceReleaseList <em>Resource Release List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.ScenarioTypeImpl#getResourcePassList <em>Resource Pass List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.ScenarioTypeImpl#getAspectStepList <em>Aspect Step List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.ScenarioTypeImpl#getStartList <em>Start List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.ScenarioTypeImpl#getEndList <em>End List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.ScenarioTypeImpl#getSequenceList <em>Sequence List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.ScenarioTypeImpl#getBranchList <em>Branch List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.ScenarioTypeImpl#getMergeList <em>Merge List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.ScenarioTypeImpl#getForkList <em>Fork List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.ScenarioTypeImpl#getJoinList <em>Join List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.ScenarioTypeImpl#getParentRefinementList <em>Parent Refinement List</em>}</li>
 *   <li>{@link ca.carleton.sce.puma.CSM.impl.ScenarioTypeImpl#getProbability <em>Probability</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScenarioTypeImpl extends CSMElementTypeImpl implements ScenarioType {
	/**
	 * The cached value of the '{@link #getStepList() <em>Step List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStepList()
	 * @generated
	 * @ordered
	 */
	protected EList<StepType> stepList;

	/**
	 * The cached value of the '{@link #getCommStepList() <em>Comm Step List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommStepList()
	 * @generated
	 * @ordered
	 */
	protected EList<CommStepType> commStepList;

	/**
	 * The cached value of the '{@link #getResourceAcquireList() <em>Resource Acquire List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceAcquireList()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceAcquireType> resourceAcquireList;

	/**
	 * The cached value of the '{@link #getResourceReleaseList() <em>Resource Release List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceReleaseList()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceReleaseType> resourceReleaseList;

	/**
	 * The cached value of the '{@link #getResourcePassList() <em>Resource Pass List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourcePassList()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourcePassType> resourcePassList;

	/**
	 * The cached value of the '{@link #getAspectStepList() <em>Aspect Step List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspectStepList()
	 * @generated
	 * @ordered
	 */
	protected EList<AspectStepType> aspectStepList;

	/**
	 * The cached value of the '{@link #getStartList() <em>Start List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartList()
	 * @generated
	 * @ordered
	 */
	protected EList<StartType> startList;

	/**
	 * The cached value of the '{@link #getEndList() <em>End List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndList()
	 * @generated
	 * @ordered
	 */
	protected EList<EndType> endList;

	/**
	 * The cached value of the '{@link #getSequenceList() <em>Sequence List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceList()
	 * @generated
	 * @ordered
	 */
	protected EList<SequenceType> sequenceList;

	/**
	 * The cached value of the '{@link #getBranchList() <em>Branch List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranchList()
	 * @generated
	 * @ordered
	 */
	protected EList<BranchType> branchList;

	/**
	 * The cached value of the '{@link #getMergeList() <em>Merge List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMergeList()
	 * @generated
	 * @ordered
	 */
	protected EList<MergeType> mergeList;

	/**
	 * The cached value of the '{@link #getForkList() <em>Fork List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForkList()
	 * @generated
	 * @ordered
	 */
	protected EList<ForkType> forkList;

	/**
	 * The cached value of the '{@link #getJoinList() <em>Join List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinList()
	 * @generated
	 * @ordered
	 */
	protected EList<JoinType> joinList;

	/**
	 * The cached value of the '{@link #getParentRefinementList() <em>Parent Refinement List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentRefinementList()
	 * @generated
	 * @ordered
	 */
	protected EList<RefinementType> parentRefinementList;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSMPackage.Literals.SCENARIO_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StepType> getStepList() {
		if (stepList == null) {
			stepList = new EObjectContainmentEList<StepType>(StepType.class, this, CSMPackage.SCENARIO_TYPE__STEP_LIST);
		}
		return stepList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommStepType> getCommStepList() {
		if (commStepList == null) {
			commStepList = new EObjectContainmentEList<CommStepType>(CommStepType.class, this, CSMPackage.SCENARIO_TYPE__COMM_STEP_LIST);
		}
		return commStepList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceAcquireType> getResourceAcquireList() {
		if (resourceAcquireList == null) {
			resourceAcquireList = new EObjectContainmentEList<ResourceAcquireType>(ResourceAcquireType.class, this, CSMPackage.SCENARIO_TYPE__RESOURCE_ACQUIRE_LIST);
		}
		return resourceAcquireList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceReleaseType> getResourceReleaseList() {
		if (resourceReleaseList == null) {
			resourceReleaseList = new EObjectContainmentEList<ResourceReleaseType>(ResourceReleaseType.class, this, CSMPackage.SCENARIO_TYPE__RESOURCE_RELEASE_LIST);
		}
		return resourceReleaseList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourcePassType> getResourcePassList() {
		if (resourcePassList == null) {
			resourcePassList = new EObjectContainmentEList<ResourcePassType>(ResourcePassType.class, this, CSMPackage.SCENARIO_TYPE__RESOURCE_PASS_LIST);
		}
		return resourcePassList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AspectStepType> getAspectStepList() {
		if (aspectStepList == null) {
			aspectStepList = new EObjectContainmentEList<AspectStepType>(AspectStepType.class, this, CSMPackage.SCENARIO_TYPE__ASPECT_STEP_LIST);
		}
		return aspectStepList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StartType> getStartList() {
		if (startList == null) {
			startList = new EObjectContainmentEList<StartType>(StartType.class, this, CSMPackage.SCENARIO_TYPE__START_LIST);
		}
		return startList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndType> getEndList() {
		if (endList == null) {
			endList = new EObjectContainmentEList<EndType>(EndType.class, this, CSMPackage.SCENARIO_TYPE__END_LIST);
		}
		return endList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SequenceType> getSequenceList() {
		if (sequenceList == null) {
			sequenceList = new EObjectContainmentEList<SequenceType>(SequenceType.class, this, CSMPackage.SCENARIO_TYPE__SEQUENCE_LIST);
		}
		return sequenceList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BranchType> getBranchList() {
		if (branchList == null) {
			branchList = new EObjectContainmentEList<BranchType>(BranchType.class, this, CSMPackage.SCENARIO_TYPE__BRANCH_LIST);
		}
		return branchList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MergeType> getMergeList() {
		if (mergeList == null) {
			mergeList = new EObjectContainmentEList<MergeType>(MergeType.class, this, CSMPackage.SCENARIO_TYPE__MERGE_LIST);
		}
		return mergeList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForkType> getForkList() {
		if (forkList == null) {
			forkList = new EObjectContainmentEList<ForkType>(ForkType.class, this, CSMPackage.SCENARIO_TYPE__FORK_LIST);
		}
		return forkList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JoinType> getJoinList() {
		if (joinList == null) {
			joinList = new EObjectContainmentEList<JoinType>(JoinType.class, this, CSMPackage.SCENARIO_TYPE__JOIN_LIST);
		}
		return joinList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RefinementType> getParentRefinementList() {
		if (parentRefinementList == null) {
			parentRefinementList = new EObjectEList<RefinementType>(RefinementType.class, this, CSMPackage.SCENARIO_TYPE__PARENT_REFINEMENT_LIST);
		}
		return parentRefinementList;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CSMPackage.SCENARIO_TYPE__PROBABILITY, oldProbability, probability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CSMPackage.SCENARIO_TYPE__STEP_LIST:
				return ((InternalEList<?>)getStepList()).basicRemove(otherEnd, msgs);
			case CSMPackage.SCENARIO_TYPE__COMM_STEP_LIST:
				return ((InternalEList<?>)getCommStepList()).basicRemove(otherEnd, msgs);
			case CSMPackage.SCENARIO_TYPE__RESOURCE_ACQUIRE_LIST:
				return ((InternalEList<?>)getResourceAcquireList()).basicRemove(otherEnd, msgs);
			case CSMPackage.SCENARIO_TYPE__RESOURCE_RELEASE_LIST:
				return ((InternalEList<?>)getResourceReleaseList()).basicRemove(otherEnd, msgs);
			case CSMPackage.SCENARIO_TYPE__RESOURCE_PASS_LIST:
				return ((InternalEList<?>)getResourcePassList()).basicRemove(otherEnd, msgs);
			case CSMPackage.SCENARIO_TYPE__ASPECT_STEP_LIST:
				return ((InternalEList<?>)getAspectStepList()).basicRemove(otherEnd, msgs);
			case CSMPackage.SCENARIO_TYPE__START_LIST:
				return ((InternalEList<?>)getStartList()).basicRemove(otherEnd, msgs);
			case CSMPackage.SCENARIO_TYPE__END_LIST:
				return ((InternalEList<?>)getEndList()).basicRemove(otherEnd, msgs);
			case CSMPackage.SCENARIO_TYPE__SEQUENCE_LIST:
				return ((InternalEList<?>)getSequenceList()).basicRemove(otherEnd, msgs);
			case CSMPackage.SCENARIO_TYPE__BRANCH_LIST:
				return ((InternalEList<?>)getBranchList()).basicRemove(otherEnd, msgs);
			case CSMPackage.SCENARIO_TYPE__MERGE_LIST:
				return ((InternalEList<?>)getMergeList()).basicRemove(otherEnd, msgs);
			case CSMPackage.SCENARIO_TYPE__FORK_LIST:
				return ((InternalEList<?>)getForkList()).basicRemove(otherEnd, msgs);
			case CSMPackage.SCENARIO_TYPE__JOIN_LIST:
				return ((InternalEList<?>)getJoinList()).basicRemove(otherEnd, msgs);
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
			case CSMPackage.SCENARIO_TYPE__STEP_LIST:
				return getStepList();
			case CSMPackage.SCENARIO_TYPE__COMM_STEP_LIST:
				return getCommStepList();
			case CSMPackage.SCENARIO_TYPE__RESOURCE_ACQUIRE_LIST:
				return getResourceAcquireList();
			case CSMPackage.SCENARIO_TYPE__RESOURCE_RELEASE_LIST:
				return getResourceReleaseList();
			case CSMPackage.SCENARIO_TYPE__RESOURCE_PASS_LIST:
				return getResourcePassList();
			case CSMPackage.SCENARIO_TYPE__ASPECT_STEP_LIST:
				return getAspectStepList();
			case CSMPackage.SCENARIO_TYPE__START_LIST:
				return getStartList();
			case CSMPackage.SCENARIO_TYPE__END_LIST:
				return getEndList();
			case CSMPackage.SCENARIO_TYPE__SEQUENCE_LIST:
				return getSequenceList();
			case CSMPackage.SCENARIO_TYPE__BRANCH_LIST:
				return getBranchList();
			case CSMPackage.SCENARIO_TYPE__MERGE_LIST:
				return getMergeList();
			case CSMPackage.SCENARIO_TYPE__FORK_LIST:
				return getForkList();
			case CSMPackage.SCENARIO_TYPE__JOIN_LIST:
				return getJoinList();
			case CSMPackage.SCENARIO_TYPE__PARENT_REFINEMENT_LIST:
				return getParentRefinementList();
			case CSMPackage.SCENARIO_TYPE__PROBABILITY:
				return getProbability();
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
			case CSMPackage.SCENARIO_TYPE__STEP_LIST:
				getStepList().clear();
				getStepList().addAll((Collection<? extends StepType>)newValue);
				return;
			case CSMPackage.SCENARIO_TYPE__COMM_STEP_LIST:
				getCommStepList().clear();
				getCommStepList().addAll((Collection<? extends CommStepType>)newValue);
				return;
			case CSMPackage.SCENARIO_TYPE__RESOURCE_ACQUIRE_LIST:
				getResourceAcquireList().clear();
				getResourceAcquireList().addAll((Collection<? extends ResourceAcquireType>)newValue);
				return;
			case CSMPackage.SCENARIO_TYPE__RESOURCE_RELEASE_LIST:
				getResourceReleaseList().clear();
				getResourceReleaseList().addAll((Collection<? extends ResourceReleaseType>)newValue);
				return;
			case CSMPackage.SCENARIO_TYPE__RESOURCE_PASS_LIST:
				getResourcePassList().clear();
				getResourcePassList().addAll((Collection<? extends ResourcePassType>)newValue);
				return;
			case CSMPackage.SCENARIO_TYPE__ASPECT_STEP_LIST:
				getAspectStepList().clear();
				getAspectStepList().addAll((Collection<? extends AspectStepType>)newValue);
				return;
			case CSMPackage.SCENARIO_TYPE__START_LIST:
				getStartList().clear();
				getStartList().addAll((Collection<? extends StartType>)newValue);
				return;
			case CSMPackage.SCENARIO_TYPE__END_LIST:
				getEndList().clear();
				getEndList().addAll((Collection<? extends EndType>)newValue);
				return;
			case CSMPackage.SCENARIO_TYPE__SEQUENCE_LIST:
				getSequenceList().clear();
				getSequenceList().addAll((Collection<? extends SequenceType>)newValue);
				return;
			case CSMPackage.SCENARIO_TYPE__BRANCH_LIST:
				getBranchList().clear();
				getBranchList().addAll((Collection<? extends BranchType>)newValue);
				return;
			case CSMPackage.SCENARIO_TYPE__MERGE_LIST:
				getMergeList().clear();
				getMergeList().addAll((Collection<? extends MergeType>)newValue);
				return;
			case CSMPackage.SCENARIO_TYPE__FORK_LIST:
				getForkList().clear();
				getForkList().addAll((Collection<? extends ForkType>)newValue);
				return;
			case CSMPackage.SCENARIO_TYPE__JOIN_LIST:
				getJoinList().clear();
				getJoinList().addAll((Collection<? extends JoinType>)newValue);
				return;
			case CSMPackage.SCENARIO_TYPE__PARENT_REFINEMENT_LIST:
				getParentRefinementList().clear();
				getParentRefinementList().addAll((Collection<? extends RefinementType>)newValue);
				return;
			case CSMPackage.SCENARIO_TYPE__PROBABILITY:
				setProbability((String)newValue);
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
			case CSMPackage.SCENARIO_TYPE__STEP_LIST:
				getStepList().clear();
				return;
			case CSMPackage.SCENARIO_TYPE__COMM_STEP_LIST:
				getCommStepList().clear();
				return;
			case CSMPackage.SCENARIO_TYPE__RESOURCE_ACQUIRE_LIST:
				getResourceAcquireList().clear();
				return;
			case CSMPackage.SCENARIO_TYPE__RESOURCE_RELEASE_LIST:
				getResourceReleaseList().clear();
				return;
			case CSMPackage.SCENARIO_TYPE__RESOURCE_PASS_LIST:
				getResourcePassList().clear();
				return;
			case CSMPackage.SCENARIO_TYPE__ASPECT_STEP_LIST:
				getAspectStepList().clear();
				return;
			case CSMPackage.SCENARIO_TYPE__START_LIST:
				getStartList().clear();
				return;
			case CSMPackage.SCENARIO_TYPE__END_LIST:
				getEndList().clear();
				return;
			case CSMPackage.SCENARIO_TYPE__SEQUENCE_LIST:
				getSequenceList().clear();
				return;
			case CSMPackage.SCENARIO_TYPE__BRANCH_LIST:
				getBranchList().clear();
				return;
			case CSMPackage.SCENARIO_TYPE__MERGE_LIST:
				getMergeList().clear();
				return;
			case CSMPackage.SCENARIO_TYPE__FORK_LIST:
				getForkList().clear();
				return;
			case CSMPackage.SCENARIO_TYPE__JOIN_LIST:
				getJoinList().clear();
				return;
			case CSMPackage.SCENARIO_TYPE__PARENT_REFINEMENT_LIST:
				getParentRefinementList().clear();
				return;
			case CSMPackage.SCENARIO_TYPE__PROBABILITY:
				setProbability(PROBABILITY_EDEFAULT);
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
			case CSMPackage.SCENARIO_TYPE__STEP_LIST:
				return stepList != null && !stepList.isEmpty();
			case CSMPackage.SCENARIO_TYPE__COMM_STEP_LIST:
				return commStepList != null && !commStepList.isEmpty();
			case CSMPackage.SCENARIO_TYPE__RESOURCE_ACQUIRE_LIST:
				return resourceAcquireList != null && !resourceAcquireList.isEmpty();
			case CSMPackage.SCENARIO_TYPE__RESOURCE_RELEASE_LIST:
				return resourceReleaseList != null && !resourceReleaseList.isEmpty();
			case CSMPackage.SCENARIO_TYPE__RESOURCE_PASS_LIST:
				return resourcePassList != null && !resourcePassList.isEmpty();
			case CSMPackage.SCENARIO_TYPE__ASPECT_STEP_LIST:
				return aspectStepList != null && !aspectStepList.isEmpty();
			case CSMPackage.SCENARIO_TYPE__START_LIST:
				return startList != null && !startList.isEmpty();
			case CSMPackage.SCENARIO_TYPE__END_LIST:
				return endList != null && !endList.isEmpty();
			case CSMPackage.SCENARIO_TYPE__SEQUENCE_LIST:
				return sequenceList != null && !sequenceList.isEmpty();
			case CSMPackage.SCENARIO_TYPE__BRANCH_LIST:
				return branchList != null && !branchList.isEmpty();
			case CSMPackage.SCENARIO_TYPE__MERGE_LIST:
				return mergeList != null && !mergeList.isEmpty();
			case CSMPackage.SCENARIO_TYPE__FORK_LIST:
				return forkList != null && !forkList.isEmpty();
			case CSMPackage.SCENARIO_TYPE__JOIN_LIST:
				return joinList != null && !joinList.isEmpty();
			case CSMPackage.SCENARIO_TYPE__PARENT_REFINEMENT_LIST:
				return parentRefinementList != null && !parentRefinementList.isEmpty();
			case CSMPackage.SCENARIO_TYPE__PROBABILITY:
				return PROBABILITY_EDEFAULT == null ? probability != null : !PROBABILITY_EDEFAULT.equals(probability);
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
		result.append(" (probability: ");
		result.append(probability);
		result.append(')');
		return result.toString();
	}

} //ScenarioTypeImpl
