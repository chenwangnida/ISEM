/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.impl;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import de.dfki.s2m2.filter.FilterPackage;
import de.dfki.s2m2.filter.LiteralType;
import de.dfki.s2m2.filter.ServiceLiteralEvaluation;
import de.dfki.s2m2.service.PlainTextContent;
import de.dfki.s2m2.service.ServiceComponent;
import de.dfki.s2m2.service.ServiceView;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Literal Evaluation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.dfki.s2m2.filter.impl.ServiceLiteralEvaluationImpl#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceLiteralEvaluationImpl<Range> extends EntityExtractionImpl<String, ServiceView, Range> implements ServiceLiteralEvaluation<Range> {
	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<LiteralType> types;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceLiteralEvaluationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FilterPackage.Literals.SERVICE_LITERAL_EVALUATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LiteralType> getTypes() {
		if (types == null) {
			types = new EDataTypeUniqueEList<LiteralType>(LiteralType.class, this, FilterPackage.SERVICE_LITERAL_EVALUATION__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FilterPackage.SERVICE_LITERAL_EVALUATION__TYPES:
				return getTypes();
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
			case FilterPackage.SERVICE_LITERAL_EVALUATION__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends LiteralType>)newValue);
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
			case FilterPackage.SERVICE_LITERAL_EVALUATION__TYPES:
				getTypes().clear();
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
			case FilterPackage.SERVICE_LITERAL_EVALUATION__TYPES:
				return types != null && !types.isEmpty();
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
		result.append(" (types: ");
		result.append(types);
		result.append(')');
		return result.toString();
	}
	
	@Override
	public Collection<String> getEntities(ServiceView upper) {
		LinkedList<ServiceComponent> concepts = new LinkedList<ServiceComponent>();
		for(LiteralType conceptsType : types) {
			concepts.addAll(upper.getComponents(conceptsType.getLiteral()));
		}
		
		LinkedList<String> resultSet = new LinkedList<String>();
		for(ServiceComponent concept : concepts)
			resultSet.add(((PlainTextContent) concept).toString());
		
		return resultSet;
	}

} //ServiceLiteralEvaluationImpl
