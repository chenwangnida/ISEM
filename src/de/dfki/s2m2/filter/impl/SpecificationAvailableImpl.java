/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import de.dfki.s2m2.filter.ExpressionEvaluationException;
import de.dfki.s2m2.filter.FilterPackage;
import de.dfki.s2m2.filter.SpecificationAvailable;
import de.dfki.s2m2.filter.SpecificationType;
import de.dfki.s2m2.service.ServiceComponent;
import de.dfki.s2m2.service.ServiceView;
import de.dfki.s2m2.service.Specification;
import de.dfki.s2m2.service.SpecificationExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification Available</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.dfki.s2m2.filter.impl.SpecificationAvailableImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.impl.SpecificationAvailableImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecificationAvailableImpl<Focus extends SpecificationExpression> extends EObjectImpl implements SpecificationAvailable<Focus> {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final SpecificationType TYPE_EDEFAULT = SpecificationType.PRECONDITION;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected SpecificationType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificationAvailableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FilterPackage.Literals.SPECIFICATION_AVAILABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FilterPackage.SPECIFICATION_AVAILABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificationType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(SpecificationType newType) {
		SpecificationType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FilterPackage.SPECIFICATION_AVAILABLE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	public Boolean evaluate(ServiceView param1, ServiceView param2) throws ExpressionEvaluationException {
		Collection<ServiceComponent> components1 = param1.getComponents(type.getLiteral());
		Collection<ServiceComponent> components2 = param2.getComponents(type.getLiteral());
		
		Focus expression1 = null;
		Focus expression2 = null;
		
		try {
			expression1 = components1.isEmpty() ? null : ((Specification<Focus>) (components1.iterator().next())).getExpression();
		}
		catch(ClassCastException e) {
			throw new ExpressionEvaluationException("Unable to extract \"" + type.getLiteral() + "\" condition expression in " + param1.getServiceUri() + ".", e);
		}
		
		try {
			expression2 = components2.isEmpty() ? null : ((Specification<Focus>) (components2.iterator().next())).getExpression();
		}
		catch(ClassCastException e) {
			throw new ExpressionEvaluationException("Unable to extract \"" + type.getLiteral() + "\" condition expression in " + param2.getServiceUri() + ".", e);
		}
		
		if(expression1 == null && expression2 == null)
			return false;
		else
			return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FilterPackage.SPECIFICATION_AVAILABLE__NAME:
				return getName();
			case FilterPackage.SPECIFICATION_AVAILABLE__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FilterPackage.SPECIFICATION_AVAILABLE__NAME:
				setName((String)newValue);
				return;
			case FilterPackage.SPECIFICATION_AVAILABLE__TYPE:
				setType((SpecificationType)newValue);
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
			case FilterPackage.SPECIFICATION_AVAILABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FilterPackage.SPECIFICATION_AVAILABLE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case FilterPackage.SPECIFICATION_AVAILABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FilterPackage.SPECIFICATION_AVAILABLE__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //SpecificationAvailableImpl
