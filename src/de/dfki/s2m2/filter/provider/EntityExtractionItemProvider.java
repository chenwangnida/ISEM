/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.provider;


import de.dfki.s2m2.filter.EntityExtraction;
import de.dfki.s2m2.filter.FilterFactory;
import de.dfki.s2m2.filter.FilterPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
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
 * This is the item provider adapter for a {@link de.dfki.s2m2.filter.EntityExtraction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EntityExtractionItemProvider
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
	public EntityExtractionItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_Expression_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Expression_name_feature", "_UI_Expression_type"),
				 FilterPackage.Literals.EXPRESSION__NAME,
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
			childrenFeatures.add(FilterPackage.Literals.ENTITY_EXTRACTION__OPERAND);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EntityExtraction<?, ?, ?>)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_EntityExtraction_type") :
			getString("_UI_EntityExtraction_type") + " " + label;
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

		switch (notification.getFeatureID(EntityExtraction.class)) {
			case FilterPackage.ENTITY_EXTRACTION__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case FilterPackage.ENTITY_EXTRACTION__OPERAND:
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
				(FilterPackage.Literals.ENTITY_EXTRACTION__OPERAND,
				 FilterFactory.eINSTANCE.createFixedValue()));

		newChildDescriptors.add
			(createChildParameter
				(FilterPackage.Literals.ENTITY_EXTRACTION__OPERAND,
				 FilterFactory.eINSTANCE.createAverage()));

		newChildDescriptors.add
			(createChildParameter
				(FilterPackage.Literals.ENTITY_EXTRACTION__OPERAND,
				 FilterFactory.eINSTANCE.createInverse()));

		newChildDescriptors.add
			(createChildParameter
				(FilterPackage.Literals.ENTITY_EXTRACTION__OPERAND,
				 FilterFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(FilterPackage.Literals.ENTITY_EXTRACTION__OPERAND,
				 FilterFactory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(FilterPackage.Literals.ENTITY_EXTRACTION__OPERAND,
				 FilterFactory.eINSTANCE.createGreaterEquals()));

		newChildDescriptors.add
			(createChildParameter
				(FilterPackage.Literals.ENTITY_EXTRACTION__OPERAND,
				 FilterFactory.eINSTANCE.createForallExists()));

		newChildDescriptors.add
			(createChildParameter
				(FilterPackage.Literals.ENTITY_EXTRACTION__OPERAND,
				 FilterFactory.eINSTANCE.createConditional()));

		newChildDescriptors.add
			(createChildParameter
				(FilterPackage.Literals.ENTITY_EXTRACTION__OPERAND,
				 FilterFactory.eINSTANCE.createSemanticAnnotationEvaluation()));

		newChildDescriptors.add
			(createChildParameter
				(FilterPackage.Literals.ENTITY_EXTRACTION__OPERAND,
				 FilterFactory.eINSTANCE.createServiceLiteralEvaluation()));

		newChildDescriptors.add
			(createChildParameter
				(FilterPackage.Literals.ENTITY_EXTRACTION__OPERAND,
				 FilterFactory.eINSTANCE.createNegation()));

		newChildDescriptors.add
			(createChildParameter
				(FilterPackage.Literals.ENTITY_EXTRACTION__OPERAND,
				 FilterFactory.eINSTANCE.createMaximum()));

		newChildDescriptors.add
			(createChildParameter
				(FilterPackage.Literals.ENTITY_EXTRACTION__OPERAND,
				 FilterFactory.eINSTANCE.createTrue()));

		newChildDescriptors.add
			(createChildParameter
				(FilterPackage.Literals.ENTITY_EXTRACTION__OPERAND,
				 FilterFactory.eINSTANCE.createConcatenation()));

		newChildDescriptors.add
			(createChildParameter
				(FilterPackage.Literals.ENTITY_EXTRACTION__OPERAND,
				 FilterFactory.eINSTANCE.createBooleanAsDouble()));

		newChildDescriptors.add
			(createChildParameter
				(FilterPackage.Literals.ENTITY_EXTRACTION__OPERAND,
				 FilterFactory.eINSTANCE.createSpecificationAvailable()));

		newChildDescriptors.add
			(createChildParameter
				(FilterPackage.Literals.ENTITY_EXTRACTION__OPERAND,
				 FilterFactory.eINSTANCE.createSpecificationEvaluation()));

		newChildDescriptors.add
			(createChildParameter
				(FilterPackage.Literals.ENTITY_EXTRACTION__OPERAND,
				 FilterFactory.eINSTANCE.createBipartiteGraphMatching()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ((IChildCreationExtender)adapterFactory).getResourceLocator();
	}

}