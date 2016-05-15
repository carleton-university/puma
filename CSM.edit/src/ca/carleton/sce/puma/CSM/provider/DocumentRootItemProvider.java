/**
 */
package ca.carleton.sce.puma.CSM.provider;


import ca.carleton.sce.puma.CSM.CSMFactory;
import ca.carleton.sce.puma.CSM.CSMPackage;
import ca.carleton.sce.puma.CSM.DocumentRoot;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ca.carleton.sce.puma.CSM.DocumentRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentRootItemProvider
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
	public DocumentRootItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(CSMPackage.Literals.DOCUMENT_ROOT__MIXED);
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
	 * This returns DocumentRoot.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DocumentRoot"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_DocumentRoot_type");
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

		switch (notification.getFeatureID(DocumentRoot.class)) {
			case CSMPackage.DOCUMENT_ROOT__MIXED:
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
				(CSMPackage.Literals.DOCUMENT_ROOT__MIXED,
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__COMMENT,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.DOCUMENT_ROOT__MIXED,
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__TEXT,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.DOCUMENT_ROOT__MIXED,
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__PROCESSING_INSTRUCTION,
					 XMLTypeFactory.eINSTANCE.createProcessingInstruction())));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.DOCUMENT_ROOT__MIXED,
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__CDATA,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.DOCUMENT_ROOT__MIXED,
				 FeatureMapUtil.createEntry
					(CSMPackage.Literals.DOCUMENT_ROOT__CSM,
					 CSMFactory.eINSTANCE.createActiveResourceType())));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.DOCUMENT_ROOT__MIXED,
				 FeatureMapUtil.createEntry
					(CSMPackage.Literals.DOCUMENT_ROOT__CSM,
					 CSMFactory.eINSTANCE.createStepType())));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.DOCUMENT_ROOT__MIXED,
				 FeatureMapUtil.createEntry
					(CSMPackage.Literals.DOCUMENT_ROOT__CSM,
					 CSMFactory.eINSTANCE.createAspectStepType())));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.DOCUMENT_ROOT__MIXED,
				 FeatureMapUtil.createEntry
					(CSMPackage.Literals.DOCUMENT_ROOT__CSM,
					 CSMFactory.eINSTANCE.createBranchType())));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.DOCUMENT_ROOT__MIXED,
				 FeatureMapUtil.createEntry
					(CSMPackage.Literals.DOCUMENT_ROOT__CSM,
					 CSMFactory.eINSTANCE.createClosedWorkloadType())));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.DOCUMENT_ROOT__MIXED,
				 FeatureMapUtil.createEntry
					(CSMPackage.Literals.DOCUMENT_ROOT__CSM,
					 CSMFactory.eINSTANCE.createLogicalResourceType())));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.DOCUMENT_ROOT__MIXED,
				 FeatureMapUtil.createEntry
					(CSMPackage.Literals.DOCUMENT_ROOT__CSM,
					 CSMFactory.eINSTANCE.createComponentType())));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.DOCUMENT_ROOT__MIXED,
				 FeatureMapUtil.createEntry
					(CSMPackage.Literals.DOCUMENT_ROOT__CSM,
					 CSMFactory.eINSTANCE.createCommLinkType())));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.DOCUMENT_ROOT__MIXED,
				 FeatureMapUtil.createEntry
					(CSMPackage.Literals.DOCUMENT_ROOT__CSM,
					 CSMFactory.eINSTANCE.createCommStepType())));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.DOCUMENT_ROOT__MIXED,
				 FeatureMapUtil.createEntry
					(CSMPackage.Literals.DOCUMENT_ROOT__CSM,
					 CSMFactory.eINSTANCE.createCSMType())));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.DOCUMENT_ROOT__MIXED,
				 FeatureMapUtil.createEntry
					(CSMPackage.Literals.DOCUMENT_ROOT__CSM,
					 CSMFactory.eINSTANCE.createDocumentRoot())));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.DOCUMENT_ROOT__MIXED,
				 FeatureMapUtil.createEntry
					(CSMPackage.Literals.DOCUMENT_ROOT__CSM,
					 CSMFactory.eINSTANCE.createEndType())));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.DOCUMENT_ROOT__MIXED,
				 FeatureMapUtil.createEntry
					(CSMPackage.Literals.DOCUMENT_ROOT__CSM,
					 CSMFactory.eINSTANCE.createExternalDemandType())));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.DOCUMENT_ROOT__MIXED,
				 FeatureMapUtil.createEntry
					(CSMPackage.Literals.DOCUMENT_ROOT__CSM,
					 CSMFactory.eINSTANCE.createForkType())));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.DOCUMENT_ROOT__MIXED,
				 FeatureMapUtil.createEntry
					(CSMPackage.Literals.DOCUMENT_ROOT__CSM,
					 CSMFactory.eINSTANCE.createInBindingType())));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.DOCUMENT_ROOT__MIXED,
				 FeatureMapUtil.createEntry
					(CSMPackage.Literals.DOCUMENT_ROOT__CSM,
					 CSMFactory.eINSTANCE.createJoinType())));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.DOCUMENT_ROOT__MIXED,
				 FeatureMapUtil.createEntry
					(CSMPackage.Literals.DOCUMENT_ROOT__CSM,
					 CSMFactory.eINSTANCE.createMergeType())));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.DOCUMENT_ROOT__MIXED,
				 FeatureMapUtil.createEntry
					(CSMPackage.Literals.DOCUMENT_ROOT__CSM,
					 CSMFactory.eINSTANCE.createOpenWorkloadType())));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.DOCUMENT_ROOT__MIXED,
				 FeatureMapUtil.createEntry
					(CSMPackage.Literals.DOCUMENT_ROOT__CSM,
					 CSMFactory.eINSTANCE.createOutBindingType())));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.DOCUMENT_ROOT__MIXED,
				 FeatureMapUtil.createEntry
					(CSMPackage.Literals.DOCUMENT_ROOT__CSM,
					 CSMFactory.eINSTANCE.createPerfMeasureType())));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.DOCUMENT_ROOT__MIXED,
				 FeatureMapUtil.createEntry
					(CSMPackage.Literals.DOCUMENT_ROOT__CSM,
					 CSMFactory.eINSTANCE.createPerfValueType())));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.DOCUMENT_ROOT__MIXED,
				 FeatureMapUtil.createEntry
					(CSMPackage.Literals.DOCUMENT_ROOT__CSM,
					 CSMFactory.eINSTANCE.createProcessingResourceType())));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.DOCUMENT_ROOT__MIXED,
				 FeatureMapUtil.createEntry
					(CSMPackage.Literals.DOCUMENT_ROOT__CSM,
					 CSMFactory.eINSTANCE.createRefinementType())));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.DOCUMENT_ROOT__MIXED,
				 FeatureMapUtil.createEntry
					(CSMPackage.Literals.DOCUMENT_ROOT__CSM,
					 CSMFactory.eINSTANCE.createResourceAcquireType())));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.DOCUMENT_ROOT__MIXED,
				 FeatureMapUtil.createEntry
					(CSMPackage.Literals.DOCUMENT_ROOT__CSM,
					 CSMFactory.eINSTANCE.createResourcePassType())));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.DOCUMENT_ROOT__MIXED,
				 FeatureMapUtil.createEntry
					(CSMPackage.Literals.DOCUMENT_ROOT__CSM,
					 CSMFactory.eINSTANCE.createResourceReleaseType())));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.DOCUMENT_ROOT__MIXED,
				 FeatureMapUtil.createEntry
					(CSMPackage.Literals.DOCUMENT_ROOT__CSM,
					 CSMFactory.eINSTANCE.createRoleBindingType())));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.DOCUMENT_ROOT__MIXED,
				 FeatureMapUtil.createEntry
					(CSMPackage.Literals.DOCUMENT_ROOT__CSM,
					 CSMFactory.eINSTANCE.createScenarioType())));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.DOCUMENT_ROOT__MIXED,
				 FeatureMapUtil.createEntry
					(CSMPackage.Literals.DOCUMENT_ROOT__CSM,
					 CSMFactory.eINSTANCE.createSequenceType())));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.DOCUMENT_ROOT__MIXED,
				 FeatureMapUtil.createEntry
					(CSMPackage.Literals.DOCUMENT_ROOT__CSM,
					 CSMFactory.eINSTANCE.createStartType())));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.DOCUMENT_ROOT__MIXED,
				 FeatureMapUtil.createEntry
					(CSMPackage.Literals.DOCUMENT_ROOT__CSM,
					 CSMFactory.eINSTANCE.createVariableType())));

		newChildDescriptors.add
			(createChildParameter
				(CSMPackage.Literals.DOCUMENT_ROOT__MIXED,
				 FeatureMapUtil.createEntry
					(CSMPackage.Literals.DOCUMENT_ROOT__CSM,
					 XMLTypeFactory.eINSTANCE.createAnyType())));
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
