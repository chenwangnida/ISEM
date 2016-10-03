/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import de.dfki.s2m2.filter.And;
import de.dfki.s2m2.filter.Average;
import de.dfki.s2m2.filter.BipartiteGraphMatching;
import de.dfki.s2m2.filter.BooleanAsDouble;
import de.dfki.s2m2.filter.BooleanExpression;
import de.dfki.s2m2.filter.Concatenation;
import de.dfki.s2m2.filter.ConceptRelation;
import de.dfki.s2m2.filter.Conditional;
import de.dfki.s2m2.filter.EntityExtraction;
import de.dfki.s2m2.filter.Expression;
import de.dfki.s2m2.filter.FilterConfiguration;
import de.dfki.s2m2.filter.FilterPackage;
import de.dfki.s2m2.filter.FixedValue;
import de.dfki.s2m2.filter.ForallExists;
import de.dfki.s2m2.filter.GreaterEquals;
import de.dfki.s2m2.filter.Inverse;
import de.dfki.s2m2.filter.Maximum;
import de.dfki.s2m2.filter.Negation;
import de.dfki.s2m2.filter.NumericalExpression;
import de.dfki.s2m2.filter.Or;
import de.dfki.s2m2.filter.Resource;
import de.dfki.s2m2.filter.SemanticAnnotationEvaluation;
import de.dfki.s2m2.filter.ServiceLiteralEvaluation;
import de.dfki.s2m2.filter.SpecificationAvailable;
import de.dfki.s2m2.filter.SpecificationEvaluation;
import de.dfki.s2m2.filter.TextSimilarityMeasure;
import de.dfki.s2m2.filter.True;
import de.dfki.s2m2.service.SpecificationExpression;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.dfki.s2m2.filter.FilterPackage
 * @generated
 */
public class FilterSwitch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FilterPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterSwitch() {
		if (modelPackage == null) {
			modelPackage = FilterPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T1 doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T1 doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FilterPackage.FILTER_CONFIGURATION: {
				FilterConfiguration filterConfiguration = (FilterConfiguration)theEObject;
				T1 result = caseFilterConfiguration(filterConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FilterPackage.EXPRESSION: {
				Expression<?, ?> expression = (Expression<?, ?>)theEObject;
				T1 result = caseExpression(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FilterPackage.TEXT_SIMILARITY_MEASURE: {
				TextSimilarityMeasure textSimilarityMeasure = (TextSimilarityMeasure)theEObject;
				T1 result = caseTextSimilarityMeasure(textSimilarityMeasure);
				if (result == null) result = caseNumericalExpression(textSimilarityMeasure);
				if (result == null) result = caseExpression(textSimilarityMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FilterPackage.FIXED_VALUE: {
				FixedValue<?> fixedValue = (FixedValue<?>)theEObject;
				T1 result = caseFixedValue(fixedValue);
				if (result == null) result = caseNumericalExpression(fixedValue);
				if (result == null) result = caseExpression(fixedValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FilterPackage.AVERAGE: {
				Average<?> average = (Average<?>)theEObject;
				T1 result = caseAverage(average);
				if (result == null) result = caseNumericalExpression(average);
				if (result == null) result = caseExpression(average);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FilterPackage.INVERSE: {
				Inverse<?, ?> inverse = (Inverse<?, ?>)theEObject;
				T1 result = caseInverse(inverse);
				if (result == null) result = caseExpression(inverse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FilterPackage.AND: {
				And<?> and = (And<?>)theEObject;
				T1 result = caseAnd(and);
				if (result == null) result = caseBooleanExpression(and);
				if (result == null) result = caseExpression(and);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FilterPackage.OR: {
				Or<?> or = (Or<?>)theEObject;
				T1 result = caseOr(or);
				if (result == null) result = caseBooleanExpression(or);
				if (result == null) result = caseExpression(or);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FilterPackage.GREATER_EQUALS: {
				GreaterEquals<?> greaterEquals = (GreaterEquals<?>)theEObject;
				T1 result = caseGreaterEquals(greaterEquals);
				if (result == null) result = caseBooleanExpression(greaterEquals);
				if (result == null) result = caseExpression(greaterEquals);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FilterPackage.FORALL_EXISTS: {
				ForallExists<?> forallExists = (ForallExists<?>)theEObject;
				T1 result = caseForallExists(forallExists);
				if (result == null) result = caseBooleanExpression(forallExists);
				if (result == null) result = caseExpression(forallExists);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FilterPackage.CONCEPT_RELATION: {
				ConceptRelation conceptRelation = (ConceptRelation)theEObject;
				T1 result = caseConceptRelation(conceptRelation);
				if (result == null) result = caseBooleanExpression(conceptRelation);
				if (result == null) result = caseExpression(conceptRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FilterPackage.BOOLEAN_EXPRESSION: {
				BooleanExpression<?> booleanExpression = (BooleanExpression<?>)theEObject;
				T1 result = caseBooleanExpression(booleanExpression);
				if (result == null) result = caseExpression(booleanExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FilterPackage.NUMERICAL_EXPRESSION: {
				NumericalExpression<?> numericalExpression = (NumericalExpression<?>)theEObject;
				T1 result = caseNumericalExpression(numericalExpression);
				if (result == null) result = caseExpression(numericalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FilterPackage.CONDITIONAL: {
				Conditional<?, ?> conditional = (Conditional<?, ?>)theEObject;
				T1 result = caseConditional(conditional);
				if (result == null) result = caseExpression(conditional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FilterPackage.ENTITY_EXTRACTION: {
				EntityExtraction<?, ?, ?> entityExtraction = (EntityExtraction<?, ?, ?>)theEObject;
				T1 result = caseEntityExtraction(entityExtraction);
				if (result == null) result = caseExpression(entityExtraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FilterPackage.SEMANTIC_ANNOTATION_EVALUATION: {
				SemanticAnnotationEvaluation<?> semanticAnnotationEvaluation = (SemanticAnnotationEvaluation<?>)theEObject;
				T1 result = caseSemanticAnnotationEvaluation(semanticAnnotationEvaluation);
				if (result == null) result = caseEntityExtraction(semanticAnnotationEvaluation);
				if (result == null) result = caseExpression(semanticAnnotationEvaluation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FilterPackage.SERVICE_LITERAL_EVALUATION: {
				ServiceLiteralEvaluation<?> serviceLiteralEvaluation = (ServiceLiteralEvaluation<?>)theEObject;
				T1 result = caseServiceLiteralEvaluation(serviceLiteralEvaluation);
				if (result == null) result = caseEntityExtraction(serviceLiteralEvaluation);
				if (result == null) result = caseExpression(serviceLiteralEvaluation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FilterPackage.NEGATION: {
				Negation<?> negation = (Negation<?>)theEObject;
				T1 result = caseNegation(negation);
				if (result == null) result = caseBooleanExpression(negation);
				if (result == null) result = caseExpression(negation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FilterPackage.MAXIMUM: {
				Maximum<?> maximum = (Maximum<?>)theEObject;
				T1 result = caseMaximum(maximum);
				if (result == null) result = caseNumericalExpression(maximum);
				if (result == null) result = caseExpression(maximum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FilterPackage.TRUE: {
				True<?> true_ = (True<?>)theEObject;
				T1 result = caseTrue(true_);
				if (result == null) result = caseBooleanExpression(true_);
				if (result == null) result = caseExpression(true_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FilterPackage.CONCATENATION: {
				Concatenation<?> concatenation = (Concatenation<?>)theEObject;
				T1 result = caseConcatenation(concatenation);
				if (result == null) result = caseExpression(concatenation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FilterPackage.BOOLEAN_AS_DOUBLE: {
				BooleanAsDouble<?> booleanAsDouble = (BooleanAsDouble<?>)theEObject;
				T1 result = caseBooleanAsDouble(booleanAsDouble);
				if (result == null) result = caseNumericalExpression(booleanAsDouble);
				if (result == null) result = caseExpression(booleanAsDouble);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FilterPackage.SPECIFICATION_AVAILABLE: {
				SpecificationAvailable<?> specificationAvailable = (SpecificationAvailable<?>)theEObject;
				T1 result = caseSpecificationAvailable(specificationAvailable);
				if (result == null) result = caseBooleanExpression(specificationAvailable);
				if (result == null) result = caseExpression(specificationAvailable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FilterPackage.SPECIFICATION_EVALUATION: {
				SpecificationEvaluation<?, ?> specificationEvaluation = (SpecificationEvaluation<?, ?>)theEObject;
				T1 result = caseSpecificationEvaluation(specificationEvaluation);
				if (result == null) result = caseEntityExtraction(specificationEvaluation);
				if (result == null) result = caseExpression(specificationEvaluation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FilterPackage.BIPARTITE_GRAPH_MATCHING: {
				BipartiteGraphMatching<?> bipartiteGraphMatching = (BipartiteGraphMatching<?>)theEObject;
				T1 result = caseBipartiteGraphMatching(bipartiteGraphMatching);
				if (result == null) result = caseNumericalExpression(bipartiteGraphMatching);
				if (result == null) result = caseExpression(bipartiteGraphMatching);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FilterPackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T1 result = caseResource(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <Domain, Range> T1 caseExpression(Expression<Domain, Range> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Similarity Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Similarity Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTextSimilarityMeasure(TextSimilarityMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <Domain> T1 caseFixedValue(FixedValue<Domain> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Average</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Average</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <Domain> T1 caseAverage(Average<Domain> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inverse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inverse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <Domain, Range> T1 caseInverse(Inverse<Domain, Range> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <Domain> T1 caseAnd(And<Domain> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <Domain> T1 caseOr(Or<Domain> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater Equals</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater Equals</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <Domain> T1 caseGreaterEquals(GreaterEquals<Domain> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Forall Exists</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Forall Exists</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <Domain> T1 caseForallExists(ForallExists<Domain> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseConceptRelation(ConceptRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <Domain> T1 caseBooleanExpression(BooleanExpression<Domain> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numerical Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numerical Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <Domain> T1 caseNumericalExpression(NumericalExpression<Domain> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <Domain, Range> T1 caseConditional(Conditional<Domain, Range> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Extraction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Extraction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <Focus, Domain, Range> T1 caseEntityExtraction(EntityExtraction<Focus, Domain, Range> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semantic Annotation Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semantic Annotation Evaluation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <Range> T1 caseSemanticAnnotationEvaluation(SemanticAnnotationEvaluation<Range> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Literal Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Literal Evaluation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <Range> T1 caseServiceLiteralEvaluation(ServiceLiteralEvaluation<Range> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <Domain> T1 caseNegation(Negation<Domain> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maximum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maximum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <Domain> T1 caseMaximum(Maximum<Domain> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>True</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>True</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <Domain> T1 caseTrue(True<Domain> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concatenation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concatenation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <Range> T1 caseConcatenation(Concatenation<Range> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean As Double</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean As Double</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <Domain> T1 caseBooleanAsDouble(BooleanAsDouble<Domain> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specification Available</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specification Available</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <Focus extends SpecificationExpression> T1 caseSpecificationAvailable(SpecificationAvailable<Focus> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specification Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specification Evaluation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends SpecificationExpression, Range> T1 caseSpecificationEvaluation(SpecificationEvaluation<T, Range> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bipartite Graph Matching</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bipartite Graph Matching</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <Domain> T1 caseBipartiteGraphMatching(BipartiteGraphMatching<Domain> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFilterConfiguration(FilterConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T1 defaultCase(EObject object) {
		return null;
	}

} //FilterSwitch
