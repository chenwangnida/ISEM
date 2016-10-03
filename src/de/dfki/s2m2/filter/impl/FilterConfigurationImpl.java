/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.dfki.s2m2.filter.Expression;
import de.dfki.s2m2.filter.FilterConfiguration;
import de.dfki.s2m2.filter.FilterPackage;
import de.dfki.s2m2.filter.LiteralType;
import de.dfki.s2m2.filter.ParameterType;
import de.dfki.s2m2.filter.Resource;
import de.dfki.s2m2.filter.SpecificationType;
import de.dfki.s2m2.service.ServiceView;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.dfki.s2m2.filter.impl.FilterConfigurationImpl#getResource <em>Resource</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.impl.FilterConfigurationImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.impl.FilterConfigurationImpl#getUsedParameterTypes <em>Used Parameter Types</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.impl.FilterConfigurationImpl#getUsedLiteralTypes <em>Used Literal Types</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.impl.FilterConfigurationImpl#getUsedSpecificationTypes <em>Used Specification Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FilterConfigurationImpl extends EObjectImpl implements FilterConfiguration {
	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> resource;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression<ServiceView, ?>> filter;

	/**
	 * The cached setting delegate for the '{@link #getUsedParameterTypes() <em>Used Parameter Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedParameterTypes()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate USED_PARAMETER_TYPES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)FilterPackage.Literals.FILTER_CONFIGURATION__USED_PARAMETER_TYPES).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getUsedLiteralTypes() <em>Used Literal Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedLiteralTypes()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate USED_LITERAL_TYPES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)FilterPackage.Literals.FILTER_CONFIGURATION__USED_LITERAL_TYPES).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getUsedSpecificationTypes() <em>Used Specification Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedSpecificationTypes()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate USED_SPECIFICATION_TYPES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)FilterPackage.Literals.FILTER_CONFIGURATION__USED_SPECIFICATION_TYPES).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FilterPackage.Literals.FILTER_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getResource() {
		if (resource == null) {
			resource = new EObjectContainmentEList<Resource>(Resource.class, this, FilterPackage.FILTER_CONFIGURATION__RESOURCE);
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression<ServiceView, ?>> getFilter() {
		if (filter == null) {
			filter = new EObjectContainmentEList<Expression<ServiceView, ?>>(Expression.class, this, FilterPackage.FILTER_CONFIGURATION__FILTER);
		}
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ParameterType> getUsedParameterTypes() {
		return (EList<ParameterType>)USED_PARAMETER_TYPES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<LiteralType> getUsedLiteralTypes() {
		return (EList<LiteralType>)USED_LITERAL_TYPES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SpecificationType> getUsedSpecificationTypes() {
		return (EList<SpecificationType>)USED_SPECIFICATION_TYPES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FilterPackage.FILTER_CONFIGURATION__RESOURCE:
				return ((InternalEList<?>)getResource()).basicRemove(otherEnd, msgs);
			case FilterPackage.FILTER_CONFIGURATION__FILTER:
				return ((InternalEList<?>)getFilter()).basicRemove(otherEnd, msgs);
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
			case FilterPackage.FILTER_CONFIGURATION__RESOURCE:
				return getResource();
			case FilterPackage.FILTER_CONFIGURATION__FILTER:
				return getFilter();
			case FilterPackage.FILTER_CONFIGURATION__USED_PARAMETER_TYPES:
				return getUsedParameterTypes();
			case FilterPackage.FILTER_CONFIGURATION__USED_LITERAL_TYPES:
				return getUsedLiteralTypes();
			case FilterPackage.FILTER_CONFIGURATION__USED_SPECIFICATION_TYPES:
				return getUsedSpecificationTypes();
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
			case FilterPackage.FILTER_CONFIGURATION__RESOURCE:
				getResource().clear();
				getResource().addAll((Collection<? extends Resource>)newValue);
				return;
			case FilterPackage.FILTER_CONFIGURATION__FILTER:
				getFilter().clear();
				getFilter().addAll((Collection<? extends Expression<ServiceView, ?>>)newValue);
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
			case FilterPackage.FILTER_CONFIGURATION__RESOURCE:
				getResource().clear();
				return;
			case FilterPackage.FILTER_CONFIGURATION__FILTER:
				getFilter().clear();
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
			case FilterPackage.FILTER_CONFIGURATION__RESOURCE:
				return resource != null && !resource.isEmpty();
			case FilterPackage.FILTER_CONFIGURATION__FILTER:
				return filter != null && !filter.isEmpty();
			case FilterPackage.FILTER_CONFIGURATION__USED_PARAMETER_TYPES:
				return USED_PARAMETER_TYPES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case FilterPackage.FILTER_CONFIGURATION__USED_LITERAL_TYPES:
				return USED_LITERAL_TYPES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case FilterPackage.FILTER_CONFIGURATION__USED_SPECIFICATION_TYPES:
				return USED_SPECIFICATION_TYPES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //FilterConfigurationImpl
