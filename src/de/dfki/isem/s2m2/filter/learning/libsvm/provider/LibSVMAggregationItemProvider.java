/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.isem.s2m2.filter.learning.libsvm.provider;


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

import de.dfki.isem.s2m2.filter.FilterFactory;
import de.dfki.isem.s2m2.filter.learning.LearningPackage;
import de.dfki.isem.s2m2.filter.learning.libsvm.LibSVMAggregation;
import de.dfki.isem.s2m2.filter.learning.libsvm.LibsvmFactory;
import de.dfki.isem.s2m2.filter.learning.libsvm.LibsvmPackage;
import de.dfki.isem.s2m2.filter.provider.IsemEditPlugin;
import de.dfki.s2m2.filter.FilterPackage;
import de.dfki.s2m2.filter.inference.dl.DlFactory;
import de.dfki.s2m2.filter.inference.theoremproving.TheoremprovingFactory;

/**
 * This is the item provider adapter for a {@link de.dfki.isem.s2m2.filter.learning.libsvm.LibSVMAggregation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LibSVMAggregationItemProvider
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
	public LibSVMAggregationItemProvider(AdapterFactory adapterFactory) {
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
			addOnlinePropertyDescriptor(object);
			addLoggerPropertyDescriptor(object);
			addCoarseGridStepSizePropertyDescriptor(object);
			addFineGridStepSizePropertyDescriptor(object);
			addFoldsPropertyDescriptor(object);
			addSeedPropertyDescriptor(object);
			addSvmPropertyDescriptor(object);
			addTrainedPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Online feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnlinePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AggregationLearner_online_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AggregationLearner_online_feature", "_UI_AggregationLearner_type"),
				 LearningPackage.Literals.AGGREGATION_LEARNER__ONLINE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_LibSVMAggregation_logger_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LibSVMAggregation_logger_feature", "_UI_LibSVMAggregation_type"),
				 LibsvmPackage.Literals.LIB_SVM_AGGREGATION__LOGGER,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Coarse Grid Step Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCoarseGridStepSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LibSVMAggregation_coarseGridStepSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LibSVMAggregation_coarseGridStepSize_feature", "_UI_LibSVMAggregation_type"),
				 LibsvmPackage.Literals.LIB_SVM_AGGREGATION__COARSE_GRID_STEP_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fine Grid Step Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFineGridStepSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LibSVMAggregation_fineGridStepSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LibSVMAggregation_fineGridStepSize_feature", "_UI_LibSVMAggregation_type"),
				 LibsvmPackage.Literals.LIB_SVM_AGGREGATION__FINE_GRID_STEP_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Folds feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFoldsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LibSVMAggregation_folds_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LibSVMAggregation_folds_feature", "_UI_LibSVMAggregation_type"),
				 LibsvmPackage.Literals.LIB_SVM_AGGREGATION__FOLDS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Seed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSeedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LibSVMAggregation_seed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LibSVMAggregation_seed_feature", "_UI_LibSVMAggregation_type"),
				 LibsvmPackage.Literals.LIB_SVM_AGGREGATION__SEED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Svm feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSvmPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LibSVMAggregation_svm_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LibSVMAggregation_svm_feature", "_UI_LibSVMAggregation_type"),
				 LibsvmPackage.Literals.LIB_SVM_AGGREGATION__SVM,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Trained feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTrainedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LibSVMAggregation_trained_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LibSVMAggregation_trained_feature", "_UI_LibSVMAggregation_type"),
				 LibsvmPackage.Literals.LIB_SVM_AGGREGATION__TRAINED,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(LearningPackage.Literals.AGGREGATION_LEARNER__FEATURE_SPACE);
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
	 * This returns LibSVMAggregation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LibSVMAggregation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((LibSVMAggregation)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_LibSVMAggregation_type") :
			getString("_UI_LibSVMAggregation_type") + " " + label;
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

		switch (notification.getFeatureID(LibSVMAggregation.class)) {
			case LibsvmPackage.LIB_SVM_AGGREGATION__NAME:
			case LibsvmPackage.LIB_SVM_AGGREGATION__ONLINE:
			case LibsvmPackage.LIB_SVM_AGGREGATION__LOGGER:
			case LibsvmPackage.LIB_SVM_AGGREGATION__COARSE_GRID_STEP_SIZE:
			case LibsvmPackage.LIB_SVM_AGGREGATION__FINE_GRID_STEP_SIZE:
			case LibsvmPackage.LIB_SVM_AGGREGATION__FOLDS:
			case LibsvmPackage.LIB_SVM_AGGREGATION__SEED:
			case LibsvmPackage.LIB_SVM_AGGREGATION__SVM:
			case LibsvmPackage.LIB_SVM_AGGREGATION__TRAINED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LibsvmPackage.LIB_SVM_AGGREGATION__FEATURE_SPACE:
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
				(LearningPackage.Literals.AGGREGATION_LEARNER__FEATURE_SPACE,
				 LibsvmFactory.eINSTANCE.createLibSVMAggregation()));

		newChildDescriptors.add
			(createChildParameter
				(LearningPackage.Literals.AGGREGATION_LEARNER__FEATURE_SPACE,
				 FilterFactory.eINSTANCE.createApproximatedSubsumption()));

		newChildDescriptors.add
			(createChildParameter
				(LearningPackage.Literals.AGGREGATION_LEARNER__FEATURE_SPACE,
				 FilterFactory.eINSTANCE.createDirectCommonSubsumers()));

		newChildDescriptors.add
			(createChildParameter
				(LearningPackage.Literals.AGGREGATION_LEARNER__FEATURE_SPACE,
				 FilterFactory.eINSTANCE.createStructuralSimilarity()));

		newChildDescriptors.add
			(createChildParameter
				(LearningPackage.Literals.AGGREGATION_LEARNER__FEATURE_SPACE,
				 de.dfki.s2m2.filter.FilterFactory.eINSTANCE.createFixedValue()));

		newChildDescriptors.add
			(createChildParameter
				(LearningPackage.Literals.AGGREGATION_LEARNER__FEATURE_SPACE,
				 de.dfki.s2m2.filter.FilterFactory.eINSTANCE.createAverage()));

		newChildDescriptors.add
			(createChildParameter
				(LearningPackage.Literals.AGGREGATION_LEARNER__FEATURE_SPACE,
				 de.dfki.s2m2.filter.FilterFactory.eINSTANCE.createInverse()));

		newChildDescriptors.add
			(createChildParameter
				(LearningPackage.Literals.AGGREGATION_LEARNER__FEATURE_SPACE,
				 de.dfki.s2m2.filter.FilterFactory.eINSTANCE.createAnd()));

		newChildDescriptors.add
			(createChildParameter
				(LearningPackage.Literals.AGGREGATION_LEARNER__FEATURE_SPACE,
				 de.dfki.s2m2.filter.FilterFactory.eINSTANCE.createOr()));

		newChildDescriptors.add
			(createChildParameter
				(LearningPackage.Literals.AGGREGATION_LEARNER__FEATURE_SPACE,
				 de.dfki.s2m2.filter.FilterFactory.eINSTANCE.createGreaterEquals()));

		newChildDescriptors.add
			(createChildParameter
				(LearningPackage.Literals.AGGREGATION_LEARNER__FEATURE_SPACE,
				 de.dfki.s2m2.filter.FilterFactory.eINSTANCE.createForallExists()));

		newChildDescriptors.add
			(createChildParameter
				(LearningPackage.Literals.AGGREGATION_LEARNER__FEATURE_SPACE,
				 de.dfki.s2m2.filter.FilterFactory.eINSTANCE.createConditional()));

		newChildDescriptors.add
			(createChildParameter
				(LearningPackage.Literals.AGGREGATION_LEARNER__FEATURE_SPACE,
				 de.dfki.s2m2.filter.FilterFactory.eINSTANCE.createSemanticAnnotationEvaluation()));

		newChildDescriptors.add
			(createChildParameter
				(LearningPackage.Literals.AGGREGATION_LEARNER__FEATURE_SPACE,
				 de.dfki.s2m2.filter.FilterFactory.eINSTANCE.createServiceLiteralEvaluation()));

		newChildDescriptors.add
			(createChildParameter
				(LearningPackage.Literals.AGGREGATION_LEARNER__FEATURE_SPACE,
				 de.dfki.s2m2.filter.FilterFactory.eINSTANCE.createNegation()));

		newChildDescriptors.add
			(createChildParameter
				(LearningPackage.Literals.AGGREGATION_LEARNER__FEATURE_SPACE,
				 de.dfki.s2m2.filter.FilterFactory.eINSTANCE.createMaximum()));

		newChildDescriptors.add
			(createChildParameter
				(LearningPackage.Literals.AGGREGATION_LEARNER__FEATURE_SPACE,
				 de.dfki.s2m2.filter.FilterFactory.eINSTANCE.createTrue()));

		newChildDescriptors.add
			(createChildParameter
				(LearningPackage.Literals.AGGREGATION_LEARNER__FEATURE_SPACE,
				 de.dfki.s2m2.filter.FilterFactory.eINSTANCE.createConcatenation()));

		newChildDescriptors.add
			(createChildParameter
				(LearningPackage.Literals.AGGREGATION_LEARNER__FEATURE_SPACE,
				 de.dfki.s2m2.filter.FilterFactory.eINSTANCE.createBooleanAsDouble()));

		newChildDescriptors.add
			(createChildParameter
				(LearningPackage.Literals.AGGREGATION_LEARNER__FEATURE_SPACE,
				 de.dfki.s2m2.filter.FilterFactory.eINSTANCE.createSpecificationAvailable()));

		newChildDescriptors.add
			(createChildParameter
				(LearningPackage.Literals.AGGREGATION_LEARNER__FEATURE_SPACE,
				 de.dfki.s2m2.filter.FilterFactory.eINSTANCE.createSpecificationEvaluation()));

		newChildDescriptors.add
			(createChildParameter
				(LearningPackage.Literals.AGGREGATION_LEARNER__FEATURE_SPACE,
				 de.dfki.s2m2.filter.FilterFactory.eINSTANCE.createBipartiteGraphMatching()));

		newChildDescriptors.add
			(createChildParameter
				(LearningPackage.Literals.AGGREGATION_LEARNER__FEATURE_SPACE,
				 DlFactory.eINSTANCE.createEquivalence()));

		newChildDescriptors.add
			(createChildParameter
				(LearningPackage.Literals.AGGREGATION_LEARNER__FEATURE_SPACE,
				 DlFactory.eINSTANCE.createSubsumption()));

		newChildDescriptors.add
			(createChildParameter
				(LearningPackage.Literals.AGGREGATION_LEARNER__FEATURE_SPACE,
				 DlFactory.eINSTANCE.createLeastGenericConcept()));

		newChildDescriptors.add
			(createChildParameter
				(LearningPackage.Literals.AGGREGATION_LEARNER__FEATURE_SPACE,
				 TheoremprovingFactory.eINSTANCE.createImplication()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return IsemEditPlugin.INSTANCE;
	}

}
