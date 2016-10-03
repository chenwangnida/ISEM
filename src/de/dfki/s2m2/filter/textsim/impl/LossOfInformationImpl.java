/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.textsim.impl;

import java.util.HashSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.tartarus.stemmer.Stemmer;

import de.dfki.s2m2.filter.ExpressionEvaluationException;
import de.dfki.s2m2.filter.textsim.LossOfInformation;
import de.dfki.s2m2.filter.textsim.StopWordRemover;
import de.dfki.s2m2.filter.textsim.TextsimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loss Of Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.dfki.s2m2.filter.textsim.impl.LossOfInformationImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LossOfInformationImpl extends EObjectImpl implements LossOfInformation {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LossOfInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextsimPackage.Literals.LOSS_OF_INFORMATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextsimPackage.LOSS_OF_INFORMATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Double evaluate(String param1, String param2) throws ExpressionEvaluationException {
		String[] requestTerms	= StopWordRemover.removeStopWords(param1).split(" ");
		String[] offerTerms		= StopWordRemover.removeStopWords(param2).split(" ");
		
		// stem all terms and create sets for LOI computation
		HashSet<String> requestSet	= new HashSet<String>();
		HashSet<String> offerSet	= new HashSet<String>();
		Stemmer stemmer;
		for(int i = 0; i < requestTerms.length ; i++) {
			stemmer = new Stemmer();
			stemmer.add(requestTerms[i].toCharArray(), requestTerms[i].length());
			stemmer.stem();
			requestSet.add(stemmer.toString());
		}
		for(int i = 0; i < offerTerms.length ; i++) {
			stemmer = new Stemmer();
			stemmer.add(offerTerms[i].toCharArray(), offerTerms[i].length());
			stemmer.stem();
			offerSet.add(stemmer.toString());
		}
				
		// compute LOI
		int unionSize = requestSet.size();
		int intersectionSize = 0;
		for(String term : offerSet) {
			if(requestSet.contains(term))
				intersectionSize++;
			else
				unionSize++;
		}
		
		// TODO Is it a similarity measure or a dissimilarity measure?!
		return 1.0 - ((double)(unionSize - intersectionSize)/(requestSet.size() + offerSet.size()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TextsimPackage.LOSS_OF_INFORMATION__NAME:
				return getName();
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
			case TextsimPackage.LOSS_OF_INFORMATION__NAME:
				setName((String)newValue);
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
			case TextsimPackage.LOSS_OF_INFORMATION__NAME:
				setName(NAME_EDEFAULT);
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
			case TextsimPackage.LOSS_OF_INFORMATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //LossOfInformationImpl
