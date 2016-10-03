/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import alice.tuprolog.InvalidTheoryException;
import alice.tuprolog.MalformedGoalException;
import alice.tuprolog.Prolog;
import alice.tuprolog.SolveInfo;
import alice.tuprolog.Theory;
import de.dfki.s2m2.filter.inference.InferenceException;
import de.dfki.s2m2.filter.inference.NotSupportedException;
import de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.ThetaSubsumption;
import de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.ThetasubsumptionPackage;
import de.dfki.s2m2.service.pddl.Atom;
import de.dfki.s2m2.service.pddl.Conjunction;
import de.dfki.s2m2.service.pddl.Negation;
import de.dfki.s2m2.service.pddl.PDDLExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Theta Subsumption</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.impl.ThetaSubsumptionImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.impl.ThetaSubsumptionImpl#isPreprocessing <em>Preprocessing</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.impl.ThetaSubsumptionImpl#getPrologTheoryLocation <em>Prolog Theory Location</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.impl.ThetaSubsumptionImpl#getPrologEngine <em>Prolog Engine</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThetaSubsumptionImpl extends EObjectImpl implements ThetaSubsumption {
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
	 * The default value of the '{@link #isPreprocessing() <em>Preprocessing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPreprocessing()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PREPROCESSING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPreprocessing() <em>Preprocessing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPreprocessing()
	 * @generated
	 * @ordered
	 */
	protected boolean preprocessing = PREPROCESSING_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrologTheoryLocation() <em>Prolog Theory Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrologTheoryLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String PROLOG_THEORY_LOCATION_EDEFAULT = "Prolog/plain_subsume.pl";

	/**
	 * The cached value of the '{@link #getPrologTheoryLocation() <em>Prolog Theory Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrologTheoryLocation()
	 * @generated
	 * @ordered
	 */
	protected String prologTheoryLocation = PROLOG_THEORY_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrologEngine() <em>Prolog Engine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrologEngine()
	 * @generated
	 * @ordered
	 */
	protected static final Prolog PROLOG_ENGINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrologEngine() <em>Prolog Engine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrologEngine()
	 * @generated
	 * @ordered
	 */
	protected Prolog prologEngine = PROLOG_ENGINE_EDEFAULT;

	/**
	 * This is true if the Prolog Engine attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean prologEngineESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ThetaSubsumptionImpl() {
		super();
		
		try {
			prologEngine = new Prolog();
			prologEngine.setTheory(new Theory(new FileInputStream(this.prologTheoryLocation)));
		}
		catch(InvalidTheoryException e) {
			// TODO
			e.printStackTrace();
		}
		catch(FileNotFoundException e) {
			// TODO
			e.printStackTrace();
		}
		catch(IOException e) {
			// TODO
			e.printStackTrace();
		}
		
		this.preprocessing = false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ThetasubsumptionPackage.Literals.THETA_SUBSUMPTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ThetasubsumptionPackage.THETA_SUBSUMPTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPreprocessing() {
		return preprocessing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreprocessing(boolean newPreprocessing) {
		boolean oldPreprocessing = preprocessing;
		preprocessing = newPreprocessing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThetasubsumptionPackage.THETA_SUBSUMPTION__PREPROCESSING, oldPreprocessing, preprocessing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrologTheoryLocation() {
		return prologTheoryLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrologTheoryLocation(String newPrologTheoryLocation) {
		String oldPrologTheoryLocation = prologTheoryLocation;
		prologTheoryLocation = newPrologTheoryLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThetasubsumptionPackage.THETA_SUBSUMPTION__PROLOG_THEORY_LOCATION, oldPrologTheoryLocation, prologTheoryLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prolog getPrologEngine() {
		return prologEngine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrologEngine() {
		return prologEngineESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean implies(PDDLExpression antecedent, PDDLExpression consequent) throws InferenceException, NotSupportedException {
		String prologAntecedent = "[" + pddlExpression2prologString(antecedent) + "]";
		String prologConsequent = "[" + pddlExpression2prologString(consequent) + "]"; 
		
		try {
			String prologProblem = String.format("plain_subsume(%s, %s).", prologConsequent, prologAntecedent);		
			SolveInfo answer = prologEngine.solve(prologProblem);
			return answer.isSuccess();
		}
		catch(MalformedGoalException e) {
			throw new InferenceException("Unable to check theta subsumption for: \"" + prologConsequent + " <= " + prologAntecedent + "\".", e);
		}
	}
	
	protected String pddlExpression2prologString(Atom atom) {
		Iterator<String> iter = atom.getParameters().iterator();
		
		// TODO improve this (prolog syntax!)
		
		// predicate in prolog syntax
		String predicate = atom.getPredicate();
		predicate = predicate.substring(predicate.lastIndexOf('#') + 1);
		predicate = predicate.toLowerCase();
		
		// variable in prolog syntax
		String variable = iter.next();
		variable = variable.substring(variable.lastIndexOf('#') + 1);
		variable = variable.substring(variable.indexOf('_') + 1);
		variable = variable.toUpperCase();
		
		String str = predicate + "(" + variable;
		while(iter.hasNext()) {
			// variable in prolog syntax
			variable = iter.next();
			variable = variable.substring(variable.lastIndexOf('#') + 1);
			variable = variable.substring(variable.indexOf('_') + 1);
			variable = variable.toUpperCase();
			
			str += "," + variable;
		}
		str += ")";
		return str;
	}
	
	protected String pddlExpression2prologString(Conjunction conj) throws InferenceException {
		Iterator<PDDLExpression> iter = conj.getBasicExpressions().iterator();
		String str = pddlExpression2prologString(iter.next());
		while(iter.hasNext()) {
			str += "," + pddlExpression2prologString(iter.next());
		}
		return str;
	}
	
	protected String pddlExpression2prologString(Negation neg) throws InferenceException {
		return "not " + pddlExpression2prologString(neg.getBasicExpression());
	}
	
	protected String pddlExpression2prologString(PDDLExpression expr) throws InferenceException {
		if(expr instanceof Atom)
			return pddlExpression2prologString((Atom) expr);
		if(expr instanceof Conjunction)
			return pddlExpression2prologString((Conjunction) expr);
		if(expr instanceof Negation)
			return pddlExpression2prologString((Negation) expr);
		
		throw new InferenceException("Unsupported PDDL expression: " + expr.toString());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void process(PDDLExpression entity) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ThetasubsumptionPackage.THETA_SUBSUMPTION__NAME:
				return getName();
			case ThetasubsumptionPackage.THETA_SUBSUMPTION__PREPROCESSING:
				return isPreprocessing();
			case ThetasubsumptionPackage.THETA_SUBSUMPTION__PROLOG_THEORY_LOCATION:
				return getPrologTheoryLocation();
			case ThetasubsumptionPackage.THETA_SUBSUMPTION__PROLOG_ENGINE:
				return getPrologEngine();
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
			case ThetasubsumptionPackage.THETA_SUBSUMPTION__NAME:
				setName((String)newValue);
				return;
			case ThetasubsumptionPackage.THETA_SUBSUMPTION__PREPROCESSING:
				setPreprocessing((Boolean)newValue);
				return;
			case ThetasubsumptionPackage.THETA_SUBSUMPTION__PROLOG_THEORY_LOCATION:
				setPrologTheoryLocation((String)newValue);
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
			case ThetasubsumptionPackage.THETA_SUBSUMPTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ThetasubsumptionPackage.THETA_SUBSUMPTION__PREPROCESSING:
				setPreprocessing(PREPROCESSING_EDEFAULT);
				return;
			case ThetasubsumptionPackage.THETA_SUBSUMPTION__PROLOG_THEORY_LOCATION:
				setPrologTheoryLocation(PROLOG_THEORY_LOCATION_EDEFAULT);
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
			case ThetasubsumptionPackage.THETA_SUBSUMPTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ThetasubsumptionPackage.THETA_SUBSUMPTION__PREPROCESSING:
				return preprocessing != PREPROCESSING_EDEFAULT;
			case ThetasubsumptionPackage.THETA_SUBSUMPTION__PROLOG_THEORY_LOCATION:
				return PROLOG_THEORY_LOCATION_EDEFAULT == null ? prologTheoryLocation != null : !PROLOG_THEORY_LOCATION_EDEFAULT.equals(prologTheoryLocation);
			case ThetasubsumptionPackage.THETA_SUBSUMPTION__PROLOG_ENGINE:
				return isSetPrologEngine();
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
		result.append(", preprocessing: ");
		result.append(preprocessing);
		result.append(", prologTheoryLocation: ");
		result.append(prologTheoryLocation);
		result.append(", prologEngine: ");
		if (prologEngineESet) result.append(prologEngine); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ThetaSubsumptionImpl
