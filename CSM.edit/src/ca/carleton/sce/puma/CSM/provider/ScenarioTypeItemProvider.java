/**
 */
package ca.carleton.sce.puma.CSM.provider;


import ca.carleton.sce.puma.CSM.CSMFactory;
import ca.carleton.sce.puma.CSM.CSMPackage;
import ca.carleton.sce.puma.CSM.ScenarioType;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ca.carleton.sce.puma.CSM.ScenarioType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ScenarioTypeItemProvider
	extends CSMElementTypeItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addParentRefinementListPropertyDescriptor(object);
			addProbabilityPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Parent Refinement List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentRefinementListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScenarioType_parentRefinementList_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScenarioType_parentRefinementList_feature", "_UI_ScenarioType_type"),
				 CSMPackage.Literals.SCENARIO_TYPE__PARENT_REFINEMENT_LIST,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Probability feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProbabilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ScenarioType_probability_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ScenarioType_probability_feature", "_UI_ScenarioType_type"),
				 CSMPackage.Literals.SCENARIO_TYPE__PROBABILITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CSMPackage.Literals.SCENARIO_TYPE__STEP_LIST);
			childrenFeatures.add(CSMPackage.Literals.SCENARIO_TYPE__COMM_STEP_LIST);
			childrenFeatures.add(CSMPackage.Literals.SCENARIO_TYPE__RESOURCE_ACQUIRE_LIST);
			childrenFeatures.add(CSMPackage.Literals.SCENARIO_TYPE__RESOURCE_RELEASE_LIST);
			childrenFeatures.add(CSMPackage.Literals.SCENARIO_TYPE__RESOURCE_PASS_LIST);
			childrenFeatures.add(CSMPackage.Literals.SCENARIO_TYPE__ASPECT_STEP_LIST);
			childrenFeatures.add(CSMPackage.Literals.SCENARIO_TYPE__START_LIST);
			childrenFeatures.add(CSMPackage.Literals.SCENARIO_TYPE__END_LIST);
			childrenFeatures.add(CSMPackage.Literals.SCENARIO_TYPE__SEQUENCE_LIST);
			childrenFeatures.add(CSMPackage.Literals.SCENARIO_TYPE__BRANCH_LIST);
			childrenFeatures.add(CSMPackage.Literals.SCENARIO_TYPE__MERGE_LIST);
			childrenFeatures.add(CSMPackage.Literals.SCENARIO_TYPE__FORK_LIST);
			childrenFeatures.add(CSMPackage.Literals.SCENARIO_TYPE__JOIN_LIST);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ScenarioType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ScenarioType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ScenarioType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ScenarioType_type") :
			getString("_UI_ScenarioType_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ScenarioType.class)) {
			case CSMPackage.SCENARIO_TYPE__PROBABILITY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CSMPackage.SCENARIO_TYPE__STEP_LIST:
			case CSMPackage.SCENARIO_TYPE__COMM_STEP_LIST:
			case CSMPackage.SCENARIO_TYPE__RESOURCE_ACQUIRE_LIST:
			case CSMPackage.SCENARIO_TYPE__RESOURCE_RELEASE_LIST:
			case CSMPackage.SCENARIO_TYPE__RESOURCE_PASS_LIST:
			case CSMPackage.SCENARIO_TYPE__ASPECT_STEP_LIST:
			case CSMPackage.SCENARIO_TYPE__START_LIST:
			case CSMPackage.SCENARIO_TYPE__END_LIST:
			case CSMPackage.SCENARIO_TYPE__SEQUENCE_LIST:
			case CSMPackage.SCENARIO_TYPE__BRANCH_LIST:
			case CSMPackage.SCENARIO_TYPE__MERGE_LIST:
			case CSMPackage.SCENARIO_TYPE__FORK_LIST:
			case CSMPackage.SCENARIO_TYPE__JOIN_LIST:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.SCENARIO_TYPE__STEP_LIST,
				 CSMFactory.eINSTANCE.createStepType()));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.SCENARIO_TYPE__STEP_LIST,
				 CSMFactory.eINSTANCE.createAspectStepType()));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.SCENARIO_TYPE__STEP_LIST,
				 CSMFactory.eINSTANCE.createCommStepType()));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.SCENARIO_TYPE__STEP_LIST,
				 CSMFactory.eINSTANCE.createResourceAcquireType()));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.SCENARIO_TYPE__STEP_LIST,
				 CSMFactory.eINSTANCE.createResourcePassType()));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.SCENARIO_TYPE__STEP_LIST,
				 CSMFactory.eINSTANCE.createResourceReleaseType()));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.SCENARIO_TYPE__COMM_STEP_LIST,
				 CSMFactory.eINSTANCE.createCommStepType()));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.SCENARIO_TYPE__RESOURCE_ACQUIRE_LIST,
				 CSMFactory.eINSTANCE.createResourceAcquireType()));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.SCENARIO_TYPE__RESOURCE_RELEASE_LIST,
				 CSMFactory.eINSTANCE.createResourceReleaseType()));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.SCENARIO_TYPE__RESOURCE_PASS_LIST,
				 CSMFactory.eINSTANCE.createResourcePassType()));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.SCENARIO_TYPE__ASPECT_STEP_LIST,
				 CSMFactory.eINSTANCE.createAspectStepType()));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.SCENARIO_TYPE__START_LIST,
				 CSMFactory.eINSTANCE.createStartType()));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.SCENARIO_TYPE__END_LIST,
				 CSMFactory.eINSTANCE.createEndType()));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.SCENARIO_TYPE__SEQUENCE_LIST,
				 CSMFactory.eINSTANCE.createSequenceType()));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.SCENARIO_TYPE__BRANCH_LIST,
				 CSMFactory.eINSTANCE.createBranchType()));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.SCENARIO_TYPE__MERGE_LIST,
				 CSMFactory.eINSTANCE.createMergeType()));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.SCENARIO_TYPE__FORK_LIST,
				 CSMFactory.eINSTANCE.createForkType()));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.SCENARIO_TYPE__JOIN_LIST,
				 CSMFactory.eINSTANCE.createJoinType()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == CSMPackage.Literals.SCENARIO_TYPE__STEP_LIST ||
			childFeature == CSMPackage.Literals.SCENARIO_TYPE__ASPECT_STEP_LIST ||
			childFeature == CSMPackage.Literals.SCENARIO_TYPE__COMM_STEP_LIST ||
			childFeature == CSMPackage.Literals.SCENARIO_TYPE__RESOURCE_ACQUIRE_LIST ||
			childFeature == CSMPackage.Literals.SCENARIO_TYPE__RESOURCE_PASS_LIST ||
			childFeature == CSMPackage.Literals.SCENARIO_TYPE__RESOURCE_RELEASE_LIST;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
