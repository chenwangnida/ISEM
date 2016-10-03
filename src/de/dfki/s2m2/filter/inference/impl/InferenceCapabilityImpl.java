/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.inference.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import de.dfki.s2m2.filter.ExpressionEvaluationException;
import de.dfki.s2m2.filter.inference.InferenceCapability;
import de.dfki.s2m2.filter.inference.InferenceEngine;
import de.dfki.s2m2.filter.inference.InferenceException;
import de.dfki.s2m2.filter.inference.InferencePackage;
import de.dfki.s2m2.filter.inference.NotSupportedException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.dfki.s2m2.filter.inference.impl.InferenceCapabilityImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.inference.impl.InferenceCapabilityImpl#getEngine <em>Engine</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class InferenceCapabilityImpl<Domain, Range> extends EObjectImpl implements InferenceCapability<Domain, Range> {
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
	 * The cached value of the '{@link #getEngine() <em>Engine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngine()
	 * @generated
	 * @ordered
	 */
	protected InferenceEngine<Domain> engine;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InferenceCapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InferencePackage.Literals.INFERENCE_CAPABILITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, InferencePackage.INFERENCE_CAPABILITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public InferenceEngine<Domain> getEngine() {
		if (engine != null && engine.eIsProxy()) {
			InternalEObject oldEngine = (InternalEObject)engine;
			engine = (InferenceEngine<Domain>)eResolveProxy(oldEngine);
			if (engine != oldEngine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InferencePackage.INFERENCE_CAPABILITY__ENGINE, oldEngine, engine));
			}
		}
		return engine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InferenceEngine<Domain> basicGetEngine() {
		return engine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEngine(InferenceEngine<Domain> newEngine) {
		InferenceEngine<Domain> oldEngine = engine;
		engine = newEngine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InferencePackage.INFERENCE_CAPABILITY__ENGINE, oldEngine, engine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range reason(EList<Domain> entities) throws InferenceException, NotSupportedException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Range evaluate(Domain param1, Domain param2) throws ExpressionEvaluationException {
		EList<Domain> entities = new BasicEList<Domain>();
		
		entities.add(param1);
		entities.add(param2);
		
		try {
			return reason(entities);
		} catch (InferenceException e) {
			throw new ExpressionEvaluationException("Inference error.", e);
		} catch (NotSupportedException e) {
			throw new ExpressionEvaluationException("Inference capability not supported by " + engine.getName() + ".", e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InferencePackage.INFERENCE_CAPABILITY__NAME:
				return getName();
			case InferencePackage.INFERENCE_CAPABILITY__ENGINE:
				if (resolve) return getEngine();
				return basicGetEngine();
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
			case InferencePackage.INFERENCE_CAPABILITY__NAME:
				setName((String)newValue);
				return;
			case InferencePackage.INFERENCE_CAPABILITY__ENGINE:
				setEngine((InferenceEngine<Domain>)newValue);
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
			case InferencePackage.INFERENCE_CAPABILITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case InferencePackage.INFERENCE_CAPABILITY__ENGINE:
				setEngine((InferenceEngine<Domain>)null);
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
			case InferencePackage.INFERENCE_CAPABILITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case InferencePackage.INFERENCE_CAPABILITY__ENGINE:
				return engine != null;
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
		result.append(')');
		return result.toString();
	}

} //InferenceCapabilityImpl
