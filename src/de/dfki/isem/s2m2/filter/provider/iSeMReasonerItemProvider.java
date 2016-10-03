/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.isem.s2m2.filter.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.dfki.isem.s2m2.filter.FilterPackage;
import de.dfki.isem.s2m2.filter.iSeMReasoner;
import de.dfki.s2m2.filter.inference.dl.pellet.provider.PelletReasonerItemProvider;

/**
 * This is the item provider adapter for a {@link de.dfki.isem.s2m2.filter.iSeMReasoner} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class iSeMReasonerItemProvider
	extends PelletReasonerItemProvider
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
	public iSeMReasonerItemProvider(AdapterFactory adapterFactory) {
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

			addLoggerPropertyDescriptor(object);
			addTEMP_CLASS_URIPropertyDescriptor(object);
			addLOCAL_ALN_ONTOLOGYPropertyDescriptor(object);
			addTEMP_ONTOLOGYPropertyDescriptor(object);
			addServiceRegistryPropertyDescriptor(object);
			addViewExtractorPropertyDescriptor(object);
			addMamasTngPropertyDescriptor(object);
			addAlnOntologyPropertyDescriptor(object);
			addProbabilitiesPropertyDescriptor(object);
			addProbabilityLowerBoundPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Logger feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLoggerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_iSeMReasoner_logger_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_iSeMReasoner_logger_feature", "_UI_iSeMReasoner_type"),
				 FilterPackage.Literals.ISE_MREASONER__LOGGER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the TEMP CLASS URI feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTEMP_CLASS_URIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_iSeMReasoner_TEMP_CLASS_URI_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_iSeMReasoner_TEMP_CLASS_URI_feature", "_UI_iSeMReasoner_type"),
				 FilterPackage.Literals.ISE_MREASONER__TEMP_CLASS_URI,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the LOCAL ALN ONTOLOGY feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLOCAL_ALN_ONTOLOGYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_iSeMReasoner_LOCAL_ALN_ONTOLOGY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_iSeMReasoner_LOCAL_ALN_ONTOLOGY_feature", "_UI_iSeMReasoner_type"),
				 FilterPackage.Literals.ISE_MREASONER__LOCAL_ALN_ONTOLOGY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the TEMP ONTOLOGY feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTEMP_ONTOLOGYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_iSeMReasoner_TEMP_ONTOLOGY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_iSeMReasoner_TEMP_ONTOLOGY_feature", "_UI_iSeMReasoner_type"),
				 FilterPackage.Literals.ISE_MREASONER__TEMP_ONTOLOGY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Service Registry feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServiceRegistryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_iSeMReasoner_serviceRegistry_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_iSeMReasoner_serviceRegistry_feature", "_UI_iSeMReasoner_type"),
				 FilterPackage.Literals.ISE_MREASONER__SERVICE_REGISTRY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the View Extractor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addViewExtractorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_iSeMReasoner_viewExtractor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_iSeMReasoner_viewExtractor_feature", "_UI_iSeMReasoner_type"),
				 FilterPackage.Literals.ISE_MREASONER__VIEW_EXTRACTOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Mamas Tng feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMamasTngPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_iSeMReasoner_mamasTng_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_iSeMReasoner_mamasTng_feature", "_UI_iSeMReasoner_type"),
				 FilterPackage.Literals.ISE_MREASONER__MAMAS_TNG,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Aln Ontology feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAlnOntologyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_iSeMReasoner_alnOntology_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_iSeMReasoner_alnOntology_feature", "_UI_iSeMReasoner_type"),
				 FilterPackage.Literals.ISE_MREASONER__ALN_ONTOLOGY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Probabilities feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProbabilitiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_iSeMReasoner_probabilities_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_iSeMReasoner_probabilities_feature", "_UI_iSeMReasoner_type"),
				 FilterPackage.Literals.ISE_MREASONER__PROBABILITIES,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Probability Lower Bound feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProbabilityLowerBoundPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_iSeMReasoner_probabilityLowerBound_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_iSeMReasoner_probabilityLowerBound_feature", "_UI_iSeMReasoner_type"),
				 FilterPackage.Literals.ISE_MREASONER__PROBABILITY_LOWER_BOUND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns iSeMReasoner.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/iSeMReasoner"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((iSeMReasoner)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_iSeMReasoner_type") :
			getString("_UI_iSeMReasoner_type") + " " + label;
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

		switch (notification.getFeatureID(iSeMReasoner.class)) {
			case FilterPackage.ISE_MREASONER__LOGGER:
			case FilterPackage.ISE_MREASONER__TEMP_CLASS_URI:
			case FilterPackage.ISE_MREASONER__LOCAL_ALN_ONTOLOGY:
			case FilterPackage.ISE_MREASONER__TEMP_ONTOLOGY:
			case FilterPackage.ISE_MREASONER__SERVICE_REGISTRY:
			case FilterPackage.ISE_MREASONER__VIEW_EXTRACTOR:
			case FilterPackage.ISE_MREASONER__MAMAS_TNG:
			case FilterPackage.ISE_MREASONER__ALN_ONTOLOGY:
			case FilterPackage.ISE_MREASONER__PROBABILITIES:
			case FilterPackage.ISE_MREASONER__PROBABILITY_LOWER_BOUND:
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

}
