/**
 */
package ca.carleton.sce.puma.CSM.provider;


import ca.carleton.sce.puma.CSM.CSMFactory;
import ca.carleton.sce.puma.CSM.CSMPackage;
import ca.carleton.sce.puma.CSM.CSMType;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ca.carleton.sce.puma.CSM.CSMType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CSMTypeItemProvider
	extends ItemProviderAdapter
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
	public CSMTypeItemProvider(AdapterFactory adapterFactory) {
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

			addAuthorPropertyDescriptor(object);
			addCreatedPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addModifiedPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addTraceabilityLinkPropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Author feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAuthorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CSMType_author_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CSMType_author_feature", "_UI_CSMType_type"),
				 CSMPackage.Literals.CSM_TYPE__AUTHOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Created feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreatedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CSMType_created_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CSMType_created_feature", "_UI_CSMType_type"),
				 CSMPackage.Literals.CSM_TYPE__CREATED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CSMType_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CSMType_description_feature", "_UI_CSMType_type"),
				 CSMPackage.Literals.CSM_TYPE__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Modified feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModifiedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CSMType_modified_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CSMType_modified_feature", "_UI_CSMType_type"),
				 CSMPackage.Literals.CSM_TYPE__MODIFIED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CSMType_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CSMType_name_feature", "_UI_CSMType_type"),
				 CSMPackage.Literals.CSM_TYPE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Traceability Link feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTraceabilityLinkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CSMType_traceabilityLink_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CSMType_traceabilityLink_feature", "_UI_CSMType_type"),
				 CSMPackage.Literals.CSM_TYPE__TRACEABILITY_LINK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CSMType_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CSMType_version_feature", "_UI_CSMType_type"),
				 CSMPackage.Literals.CSM_TYPE__VERSION,
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
			childrenFeatures.add(CSMPackage.Literals.CSM_TYPE__SCENARIO_LIST);
			childrenFeatures.add(CSMPackage.Literals.CSM_TYPE__COMPONENT_LIST);
			childrenFeatures.add(CSMPackage.Literals.CSM_TYPE__COMM_LINK_LIST);
			childrenFeatures.add(CSMPackage.Literals.CSM_TYPE__PROCESSING_RESOURCE_LIST);
			childrenFeatures.add(CSMPackage.Literals.CSM_TYPE__LOGICAL_RESOURCE_LIST);
			childrenFeatures.add(CSMPackage.Literals.CSM_TYPE__VARIABLE_LIST);
			childrenFeatures.add(CSMPackage.Literals.CSM_TYPE__PERF_MEASURE_LIST);
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
	 * This returns CSMType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CSMType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CSMType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CSMType_type") :
			getString("_UI_CSMType_type") + " " + label;
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

		switch (notification.getFeatureID(CSMType.class)) {
			case CSMPackage.CSM_TYPE__AUTHOR:
			case CSMPackage.CSM_TYPE__CREATED:
			case CSMPackage.CSM_TYPE__DESCRIPTION:
			case CSMPackage.CSM_TYPE__MODIFIED:
			case CSMPackage.CSM_TYPE__NAME:
			case CSMPackage.CSM_TYPE__TRACEABILITY_LINK:
			case CSMPackage.CSM_TYPE__VERSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CSMPackage.CSM_TYPE__SCENARIO_LIST:
			case CSMPackage.CSM_TYPE__COMPONENT_LIST:
			case CSMPackage.CSM_TYPE__COMM_LINK_LIST:
			case CSMPackage.CSM_TYPE__PROCESSING_RESOURCE_LIST:
			case CSMPackage.CSM_TYPE__LOGICAL_RESOURCE_LIST:
			case CSMPackage.CSM_TYPE__VARIABLE_LIST:
			case CSMPackage.CSM_TYPE__PERF_MEASURE_LIST:
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
				(CSMPackage.Literals.CSM_TYPE__SCENARIO_LIST,
				 CSMFactory.eINSTANCE.createScenarioType()));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.CSM_TYPE__COMPONENT_LIST,
				 CSMFactory.eINSTANCE.createComponentType()));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.CSM_TYPE__COMPONENT_LIST,
				 CSMFactory.eINSTANCE.createCommLinkType()));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.CSM_TYPE__COMM_LINK_LIST,
				 CSMFactory.eINSTANCE.createCommLinkType()));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.CSM_TYPE__PROCESSING_RESOURCE_LIST,
				 CSMFactory.eINSTANCE.createProcessingResourceType()));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.CSM_TYPE__LOGICAL_RESOURCE_LIST,
				 CSMFactory.eINSTANCE.createLogicalResourceType()));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.CSM_TYPE__LOGICAL_RESOURCE_LIST,
				 CSMFactory.eINSTANCE.createComponentType()));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.CSM_TYPE__LOGICAL_RESOURCE_LIST,
				 CSMFactory.eINSTANCE.createCommLinkType()));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.CSM_TYPE__VARIABLE_LIST,
				 CSMFactory.eINSTANCE.createVariableType()));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.CSM_TYPE__PERF_MEASURE_LIST,
				 CSMFactory.eINSTANCE.createPerfMeasureType()));
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
			childFeature == CSMPackage.Literals.CSM_TYPE__COMPONENT_LIST ||
			childFeature == CSMPackage.Literals.CSM_TYPE__LOGICAL_RESOURCE_LIST ||
			childFeature == CSMPackage.Literals.CSM_TYPE__COMM_LINK_LIST;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CSMEditPlugin.INSTANCE;
	}

}
