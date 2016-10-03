/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.textsim.lucene.provider;


import de.dfki.s2m2.filter.textsim.lucene.LuceneMemoryIndex;
import de.dfki.s2m2.filter.textsim.lucene.LucenePackage;

import de.dfki.s2m2.filter.textsim.provider.IndexItemProvider;
import de.dfki.s2m2.filter.textsim.provider.S2m2_textsimEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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
 * This is the item provider adapter for a {@link de.dfki.s2m2.filter.textsim.lucene.LuceneMemoryIndex} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LuceneMemoryIndexItemProvider
	extends IndexItemProvider
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
	public LuceneMemoryIndexItemProvider(AdapterFactory adapterFactory) {
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

			addIDPropertyDescriptor(object);
			addCONTENTPropertyDescriptor(object);
			addLuceneIndexPropertyDescriptor(object);
			addLuceneReaderPropertyDescriptor(object);
			addRamDirectoryPropertyDescriptor(object);
			addAnalyzerPropertyDescriptor(object);
			addIdTermTemplatePropertyDescriptor(object);
			addContentTermTemplatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LuceneMemoryIndex_ID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LuceneMemoryIndex_ID_feature", "_UI_LuceneMemoryIndex_type"),
				 LucenePackage.Literals.LUCENE_MEMORY_INDEX__ID,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the CONTENT feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCONTENTPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LuceneMemoryIndex_CONTENT_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LuceneMemoryIndex_CONTENT_feature", "_UI_LuceneMemoryIndex_type"),
				 LucenePackage.Literals.LUCENE_MEMORY_INDEX__CONTENT,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lucene Index feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLuceneIndexPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LuceneMemoryIndex_luceneIndex_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LuceneMemoryIndex_luceneIndex_feature", "_UI_LuceneMemoryIndex_type"),
				 LucenePackage.Literals.LUCENE_MEMORY_INDEX__LUCENE_INDEX,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lucene Reader feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLuceneReaderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LuceneMemoryIndex_luceneReader_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LuceneMemoryIndex_luceneReader_feature", "_UI_LuceneMemoryIndex_type"),
				 LucenePackage.Literals.LUCENE_MEMORY_INDEX__LUCENE_READER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ram Directory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRamDirectoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LuceneMemoryIndex_ramDirectory_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LuceneMemoryIndex_ramDirectory_feature", "_UI_LuceneMemoryIndex_type"),
				 LucenePackage.Literals.LUCENE_MEMORY_INDEX__RAM_DIRECTORY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Analyzer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAnalyzerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LuceneMemoryIndex_analyzer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LuceneMemoryIndex_analyzer_feature", "_UI_LuceneMemoryIndex_type"),
				 LucenePackage.Literals.LUCENE_MEMORY_INDEX__ANALYZER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id Term Template feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdTermTemplatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LuceneMemoryIndex_idTermTemplate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LuceneMemoryIndex_idTermTemplate_feature", "_UI_LuceneMemoryIndex_type"),
				 LucenePackage.Literals.LUCENE_MEMORY_INDEX__ID_TERM_TEMPLATE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Content Term Template feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContentTermTemplatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LuceneMemoryIndex_contentTermTemplate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LuceneMemoryIndex_contentTermTemplate_feature", "_UI_LuceneMemoryIndex_type"),
				 LucenePackage.Literals.LUCENE_MEMORY_INDEX__CONTENT_TERM_TEMPLATE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns LuceneMemoryIndex.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LuceneMemoryIndex"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((LuceneMemoryIndex)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_LuceneMemoryIndex_type") :
			getString("_UI_LuceneMemoryIndex_type") + " " + label;
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

		switch (notification.getFeatureID(LuceneMemoryIndex.class)) {
			case LucenePackage.LUCENE_MEMORY_INDEX__ID:
			case LucenePackage.LUCENE_MEMORY_INDEX__CONTENT:
			case LucenePackage.LUCENE_MEMORY_INDEX__LUCENE_INDEX:
			case LucenePackage.LUCENE_MEMORY_INDEX__LUCENE_READER:
			case LucenePackage.LUCENE_MEMORY_INDEX__RAM_DIRECTORY:
			case LucenePackage.LUCENE_MEMORY_INDEX__ANALYZER:
			case LucenePackage.LUCENE_MEMORY_INDEX__ID_TERM_TEMPLATE:
			case LucenePackage.LUCENE_MEMORY_INDEX__CONTENT_TERM_TEMPLATE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return S2m2_textsimEditPlugin.INSTANCE;
	}

}
