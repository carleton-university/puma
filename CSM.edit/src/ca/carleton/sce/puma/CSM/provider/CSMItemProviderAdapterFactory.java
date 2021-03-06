/**
 */
package ca.carleton.sce.puma.CSM.provider;

import ca.carleton.sce.puma.CSM.util.CSMAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CSMItemProviderAdapterFactory extends CSMAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.carleton.sce.puma.CSM.ActiveResourceType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActiveResourceTypeItemProvider activeResourceTypeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.carleton.sce.puma.CSM.ActiveResourceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActiveResourceTypeAdapter() {
		if (activeResourceTypeItemProvider == null) {
			activeResourceTypeItemProvider = new ActiveResourceTypeItemProvider(this);
		}

		return activeResourceTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.carleton.sce.puma.CSM.AspectStepType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AspectStepTypeItemProvider aspectStepTypeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.carleton.sce.puma.CSM.AspectStepType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAspectStepTypeAdapter() {
		if (aspectStepTypeItemProvider == null) {
			aspectStepTypeItemProvider = new AspectStepTypeItemProvider(this);
		}

		return aspectStepTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.carleton.sce.puma.CSM.BranchType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BranchTypeItemProvider branchTypeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.carleton.sce.puma.CSM.BranchType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBranchTypeAdapter() {
		if (branchTypeItemProvider == null) {
			branchTypeItemProvider = new BranchTypeItemProvider(this);
		}

		return branchTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.carleton.sce.puma.CSM.ClosedWorkloadType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClosedWorkloadTypeItemProvider closedWorkloadTypeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.carleton.sce.puma.CSM.ClosedWorkloadType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClosedWorkloadTypeAdapter() {
		if (closedWorkloadTypeItemProvider == null) {
			closedWorkloadTypeItemProvider = new ClosedWorkloadTypeItemProvider(this);
		}

		return closedWorkloadTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.carleton.sce.puma.CSM.CommLinkType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommLinkTypeItemProvider commLinkTypeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.carleton.sce.puma.CSM.CommLinkType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommLinkTypeAdapter() {
		if (commLinkTypeItemProvider == null) {
			commLinkTypeItemProvider = new CommLinkTypeItemProvider(this);
		}

		return commLinkTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.carleton.sce.puma.CSM.CommStepType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommStepTypeItemProvider commStepTypeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.carleton.sce.puma.CSM.CommStepType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommStepTypeAdapter() {
		if (commStepTypeItemProvider == null) {
			commStepTypeItemProvider = new CommStepTypeItemProvider(this);
		}

		return commStepTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.carleton.sce.puma.CSM.ComponentType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentTypeItemProvider componentTypeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.carleton.sce.puma.CSM.ComponentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentTypeAdapter() {
		if (componentTypeItemProvider == null) {
			componentTypeItemProvider = new ComponentTypeItemProvider(this);
		}

		return componentTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.carleton.sce.puma.CSM.CSMType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSMTypeItemProvider csmTypeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.carleton.sce.puma.CSM.CSMType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCSMTypeAdapter() {
		if (csmTypeItemProvider == null) {
			csmTypeItemProvider = new CSMTypeItemProvider(this);
		}

		return csmTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.carleton.sce.puma.CSM.DocumentRoot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootItemProvider documentRootItemProvider;

	/**
	 * This creates an adapter for a {@link ca.carleton.sce.puma.CSM.DocumentRoot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDocumentRootAdapter() {
		if (documentRootItemProvider == null) {
			documentRootItemProvider = new DocumentRootItemProvider(this);
		}

		return documentRootItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.carleton.sce.puma.CSM.EndType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndTypeItemProvider endTypeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.carleton.sce.puma.CSM.EndType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEndTypeAdapter() {
		if (endTypeItemProvider == null) {
			endTypeItemProvider = new EndTypeItemProvider(this);
		}

		return endTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.carleton.sce.puma.CSM.ExternalDemandType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalDemandTypeItemProvider externalDemandTypeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.carleton.sce.puma.CSM.ExternalDemandType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalDemandTypeAdapter() {
		if (externalDemandTypeItemProvider == null) {
			externalDemandTypeItemProvider = new ExternalDemandTypeItemProvider(this);
		}

		return externalDemandTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.carleton.sce.puma.CSM.ForkType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForkTypeItemProvider forkTypeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.carleton.sce.puma.CSM.ForkType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createForkTypeAdapter() {
		if (forkTypeItemProvider == null) {
			forkTypeItemProvider = new ForkTypeItemProvider(this);
		}

		return forkTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.carleton.sce.puma.CSM.InBindingType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InBindingTypeItemProvider inBindingTypeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.carleton.sce.puma.CSM.InBindingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInBindingTypeAdapter() {
		if (inBindingTypeItemProvider == null) {
			inBindingTypeItemProvider = new InBindingTypeItemProvider(this);
		}

		return inBindingTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.carleton.sce.puma.CSM.JoinType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinTypeItemProvider joinTypeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.carleton.sce.puma.CSM.JoinType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createJoinTypeAdapter() {
		if (joinTypeItemProvider == null) {
			joinTypeItemProvider = new JoinTypeItemProvider(this);
		}

		return joinTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.carleton.sce.puma.CSM.LogicalResourceType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalResourceTypeItemProvider logicalResourceTypeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.carleton.sce.puma.CSM.LogicalResourceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLogicalResourceTypeAdapter() {
		if (logicalResourceTypeItemProvider == null) {
			logicalResourceTypeItemProvider = new LogicalResourceTypeItemProvider(this);
		}

		return logicalResourceTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.carleton.sce.puma.CSM.MergeType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MergeTypeItemProvider mergeTypeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.carleton.sce.puma.CSM.MergeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMergeTypeAdapter() {
		if (mergeTypeItemProvider == null) {
			mergeTypeItemProvider = new MergeTypeItemProvider(this);
		}

		return mergeTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.carleton.sce.puma.CSM.OpenWorkloadType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenWorkloadTypeItemProvider openWorkloadTypeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.carleton.sce.puma.CSM.OpenWorkloadType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOpenWorkloadTypeAdapter() {
		if (openWorkloadTypeItemProvider == null) {
			openWorkloadTypeItemProvider = new OpenWorkloadTypeItemProvider(this);
		}

		return openWorkloadTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.carleton.sce.puma.CSM.OutBindingType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutBindingTypeItemProvider outBindingTypeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.carleton.sce.puma.CSM.OutBindingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutBindingTypeAdapter() {
		if (outBindingTypeItemProvider == null) {
			outBindingTypeItemProvider = new OutBindingTypeItemProvider(this);
		}

		return outBindingTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.carleton.sce.puma.CSM.PerfMeasureType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerfMeasureTypeItemProvider perfMeasureTypeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.carleton.sce.puma.CSM.PerfMeasureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPerfMeasureTypeAdapter() {
		if (perfMeasureTypeItemProvider == null) {
			perfMeasureTypeItemProvider = new PerfMeasureTypeItemProvider(this);
		}

		return perfMeasureTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.carleton.sce.puma.CSM.PerfValueType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerfValueTypeItemProvider perfValueTypeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.carleton.sce.puma.CSM.PerfValueType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPerfValueTypeAdapter() {
		if (perfValueTypeItemProvider == null) {
			perfValueTypeItemProvider = new PerfValueTypeItemProvider(this);
		}

		return perfValueTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.carleton.sce.puma.CSM.ProcessingResourceType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessingResourceTypeItemProvider processingResourceTypeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.carleton.sce.puma.CSM.ProcessingResourceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProcessingResourceTypeAdapter() {
		if (processingResourceTypeItemProvider == null) {
			processingResourceTypeItemProvider = new ProcessingResourceTypeItemProvider(this);
		}

		return processingResourceTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.carleton.sce.puma.CSM.RefinementType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefinementTypeItemProvider refinementTypeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.carleton.sce.puma.CSM.RefinementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRefinementTypeAdapter() {
		if (refinementTypeItemProvider == null) {
			refinementTypeItemProvider = new RefinementTypeItemProvider(this);
		}

		return refinementTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.carleton.sce.puma.CSM.ResourceAcquireType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceAcquireTypeItemProvider resourceAcquireTypeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.carleton.sce.puma.CSM.ResourceAcquireType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceAcquireTypeAdapter() {
		if (resourceAcquireTypeItemProvider == null) {
			resourceAcquireTypeItemProvider = new ResourceAcquireTypeItemProvider(this);
		}

		return resourceAcquireTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.carleton.sce.puma.CSM.ResourcePassType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourcePassTypeItemProvider resourcePassTypeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.carleton.sce.puma.CSM.ResourcePassType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourcePassTypeAdapter() {
		if (resourcePassTypeItemProvider == null) {
			resourcePassTypeItemProvider = new ResourcePassTypeItemProvider(this);
		}

		return resourcePassTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.carleton.sce.puma.CSM.ResourceReleaseType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceReleaseTypeItemProvider resourceReleaseTypeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.carleton.sce.puma.CSM.ResourceReleaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceReleaseTypeAdapter() {
		if (resourceReleaseTypeItemProvider == null) {
			resourceReleaseTypeItemProvider = new ResourceReleaseTypeItemProvider(this);
		}

		return resourceReleaseTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.carleton.sce.puma.CSM.RoleBindingType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleBindingTypeItemProvider roleBindingTypeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.carleton.sce.puma.CSM.RoleBindingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRoleBindingTypeAdapter() {
		if (roleBindingTypeItemProvider == null) {
			roleBindingTypeItemProvider = new RoleBindingTypeItemProvider(this);
		}

		return roleBindingTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.carleton.sce.puma.CSM.ScenarioType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioTypeItemProvider scenarioTypeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.carleton.sce.puma.CSM.ScenarioType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createScenarioTypeAdapter() {
		if (scenarioTypeItemProvider == null) {
			scenarioTypeItemProvider = new ScenarioTypeItemProvider(this);
		}

		return scenarioTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.carleton.sce.puma.CSM.SequenceType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceTypeItemProvider sequenceTypeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.carleton.sce.puma.CSM.SequenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSequenceTypeAdapter() {
		if (sequenceTypeItemProvider == null) {
			sequenceTypeItemProvider = new SequenceTypeItemProvider(this);
		}

		return sequenceTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.carleton.sce.puma.CSM.StartType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StartTypeItemProvider startTypeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.carleton.sce.puma.CSM.StartType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStartTypeAdapter() {
		if (startTypeItemProvider == null) {
			startTypeItemProvider = new StartTypeItemProvider(this);
		}

		return startTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.carleton.sce.puma.CSM.StepType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepTypeItemProvider stepTypeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.carleton.sce.puma.CSM.StepType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStepTypeAdapter() {
		if (stepTypeItemProvider == null) {
			stepTypeItemProvider = new StepTypeItemProvider(this);
		}

		return stepTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link ca.carleton.sce.puma.CSM.VariableType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableTypeItemProvider variableTypeItemProvider;

	/**
	 * This creates an adapter for a {@link ca.carleton.sce.puma.CSM.VariableType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVariableTypeAdapter() {
		if (variableTypeItemProvider == null) {
			variableTypeItemProvider = new VariableTypeItemProvider(this);
		}

		return variableTypeItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (activeResourceTypeItemProvider != null) activeResourceTypeItemProvider.dispose();
		if (aspectStepTypeItemProvider != null) aspectStepTypeItemProvider.dispose();
		if (branchTypeItemProvider != null) branchTypeItemProvider.dispose();
		if (closedWorkloadTypeItemProvider != null) closedWorkloadTypeItemProvider.dispose();
		if (commLinkTypeItemProvider != null) commLinkTypeItemProvider.dispose();
		if (commStepTypeItemProvider != null) commStepTypeItemProvider.dispose();
		if (componentTypeItemProvider != null) componentTypeItemProvider.dispose();
		if (csmTypeItemProvider != null) csmTypeItemProvider.dispose();
		if (documentRootItemProvider != null) documentRootItemProvider.dispose();
		if (endTypeItemProvider != null) endTypeItemProvider.dispose();
		if (externalDemandTypeItemProvider != null) externalDemandTypeItemProvider.dispose();
		if (forkTypeItemProvider != null) forkTypeItemProvider.dispose();
		if (inBindingTypeItemProvider != null) inBindingTypeItemProvider.dispose();
		if (joinTypeItemProvider != null) joinTypeItemProvider.dispose();
		if (logicalResourceTypeItemProvider != null) logicalResourceTypeItemProvider.dispose();
		if (mergeTypeItemProvider != null) mergeTypeItemProvider.dispose();
		if (openWorkloadTypeItemProvider != null) openWorkloadTypeItemProvider.dispose();
		if (outBindingTypeItemProvider != null) outBindingTypeItemProvider.dispose();
		if (perfMeasureTypeItemProvider != null) perfMeasureTypeItemProvider.dispose();
		if (perfValueTypeItemProvider != null) perfValueTypeItemProvider.dispose();
		if (processingResourceTypeItemProvider != null) processingResourceTypeItemProvider.dispose();
		if (refinementTypeItemProvider != null) refinementTypeItemProvider.dispose();
		if (resourceAcquireTypeItemProvider != null) resourceAcquireTypeItemProvider.dispose();
		if (resourcePassTypeItemProvider != null) resourcePassTypeItemProvider.dispose();
		if (resourceReleaseTypeItemProvider != null) resourceReleaseTypeItemProvider.dispose();
		if (roleBindingTypeItemProvider != null) roleBindingTypeItemProvider.dispose();
		if (scenarioTypeItemProvider != null) scenarioTypeItemProvider.dispose();
		if (sequenceTypeItemProvider != null) sequenceTypeItemProvider.dispose();
		if (startTypeItemProvider != null) startTypeItemProvider.dispose();
		if (stepTypeItemProvider != null) stepTypeItemProvider.dispose();
		if (variableTypeItemProvider != null) variableTypeItemProvider.dispose();
	}

}
