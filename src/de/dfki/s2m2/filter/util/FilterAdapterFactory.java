/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.s2m2.filter.FilterPackage
 * @generated
 */
public class FilterAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FilterPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FilterPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterSwitch<Adapter> modelSwitch =
		new FilterSwitch<Adapter>() {
			@Override
			public Adapter caseFilterConfiguration(FilterConfiguration object) {
				return createFilterConfigurationAdapter();
			}
			@Override
			public <Domain, Range> Adapter caseExpression(Expression<Domain, Range> object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseTextSimilarityMeasure(TextSimilarityMeasure object) {
				return createTextSimilarityMeasureAdapter();
			}
			@Override
			public <Domain> Adapter caseFixedValue(FixedValue<Domain> object) {
				return createFixedValueAdapter();
			}
			@Override
			public <Domain> Adapter caseAverage(Average<Domain> object) {
				return createAverageAdapter();
			}
			@Override
			public <Domain, Range> Adapter caseInverse(Inverse<Domain, Range> object) {
				return createInverseAdapter();
			}
			@Override
			public <Domain> Adapter caseAnd(And<Domain> object) {
				return createAndAdapter();
			}
			@Override
			public <Domain> Adapter caseOr(Or<Domain> object) {
				return createOrAdapter();
			}
			@Override
			public <Domain> Adapter caseGreaterEquals(GreaterEquals<Domain> object) {
				return createGreaterEqualsAdapter();
			}
			@Override
			public <Domain> Adapter caseForallExists(ForallExists<Domain> object) {
				return createForallExistsAdapter();
			}
			@Override
			public Adapter caseConceptRelation(ConceptRelation object) {
				return createConceptRelationAdapter();
			}
			@Override
			public <Domain> Adapter caseBooleanExpression(BooleanExpression<Domain> object) {
				return createBooleanExpressionAdapter();
			}
			@Override
			public <Domain> Adapter caseNumericalExpression(NumericalExpression<Domain> object) {
				return createNumericalExpressionAdapter();
			}
			@Override
			public <Domain, Range> Adapter caseConditional(Conditional<Domain, Range> object) {
				return createConditionalAdapter();
			}
			@Override
			public <Focus, Domain, Range> Adapter caseEntityExtraction(EntityExtraction<Focus, Domain, Range> object) {
				return createEntityExtractionAdapter();
			}
			@Override
			public <Range> Adapter caseSemanticAnnotationEvaluation(SemanticAnnotationEvaluation<Range> object) {
				return createSemanticAnnotationEvaluationAdapter();
			}
			@Override
			public <Range> Adapter caseServiceLiteralEvaluation(ServiceLiteralEvaluation<Range> object) {
				return createServiceLiteralEvaluationAdapter();
			}
			@Override
			public <Domain> Adapter caseNegation(Negation<Domain> object) {
				return createNegationAdapter();
			}
			@Override
			public <Domain> Adapter caseMaximum(Maximum<Domain> object) {
				return createMaximumAdapter();
			}
			@Override
			public <Domain> Adapter caseTrue(True<Domain> object) {
				return createTrueAdapter();
			}
			@Override
			public <Range> Adapter caseConcatenation(Concatenation<Range> object) {
				return createConcatenationAdapter();
			}
			@Override
			public <Domain> Adapter caseBooleanAsDouble(BooleanAsDouble<Domain> object) {
				return createBooleanAsDoubleAdapter();
			}
			@Override
			public <Focus extends SpecificationExpression> Adapter caseSpecificationAvailable(SpecificationAvailable<Focus> object) {
				return createSpecificationAvailableAdapter();
			}
			@Override
			public <T extends SpecificationExpression, Range> Adapter caseSpecificationEvaluation(SpecificationEvaluation<T, Range> object) {
				return createSpecificationEvaluationAdapter();
			}
			@Override
			public <Domain> Adapter caseBipartiteGraphMatching(BipartiteGraphMatching<Domain> object) {
				return createBipartiteGraphMatchingAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.s2m2.filter.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.s2m2.filter.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.s2m2.filter.TextSimilarityMeasure <em>Text Similarity Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.s2m2.filter.TextSimilarityMeasure
	 * @generated
	 */
	public Adapter createTextSimilarityMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.s2m2.filter.FixedValue <em>Fixed Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.s2m2.filter.FixedValue
	 * @generated
	 */
	public Adapter createFixedValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.s2m2.filter.Average <em>Average</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.s2m2.filter.Average
	 * @generated
	 */
	public Adapter createAverageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.s2m2.filter.Inverse <em>Inverse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.s2m2.filter.Inverse
	 * @generated
	 */
	public Adapter createInverseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.s2m2.filter.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.s2m2.filter.And
	 * @generated
	 */
	public Adapter createAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.s2m2.filter.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.s2m2.filter.Or
	 * @generated
	 */
	public Adapter createOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.s2m2.filter.GreaterEquals <em>Greater Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.s2m2.filter.GreaterEquals
	 * @generated
	 */
	public Adapter createGreaterEqualsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.s2m2.filter.ForallExists <em>Forall Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.s2m2.filter.ForallExists
	 * @generated
	 */
	public Adapter createForallExistsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.s2m2.filter.ConceptRelation <em>Concept Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.s2m2.filter.ConceptRelation
	 * @generated
	 */
	public Adapter createConceptRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.s2m2.filter.BooleanExpression <em>Boolean Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.s2m2.filter.BooleanExpression
	 * @generated
	 */
	public Adapter createBooleanExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.s2m2.filter.NumericalExpression <em>Numerical Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.s2m2.filter.NumericalExpression
	 * @generated
	 */
	public Adapter createNumericalExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.s2m2.filter.Conditional <em>Conditional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.s2m2.filter.Conditional
	 * @generated
	 */
	public Adapter createConditionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.s2m2.filter.EntityExtraction <em>Entity Extraction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.s2m2.filter.EntityExtraction
	 * @generated
	 */
	public Adapter createEntityExtractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.s2m2.filter.SemanticAnnotationEvaluation <em>Semantic Annotation Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.s2m2.filter.SemanticAnnotationEvaluation
	 * @generated
	 */
	public Adapter createSemanticAnnotationEvaluationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.s2m2.filter.ServiceLiteralEvaluation <em>Service Literal Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.s2m2.filter.ServiceLiteralEvaluation
	 * @generated
	 */
	public Adapter createServiceLiteralEvaluationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.s2m2.filter.Negation <em>Negation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.s2m2.filter.Negation
	 * @generated
	 */
	public Adapter createNegationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.s2m2.filter.Maximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.s2m2.filter.Maximum
	 * @generated
	 */
	public Adapter createMaximumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.s2m2.filter.True <em>True</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.s2m2.filter.True
	 * @generated
	 */
	public Adapter createTrueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.s2m2.filter.Concatenation <em>Concatenation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.s2m2.filter.Concatenation
	 * @generated
	 */
	public Adapter createConcatenationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.s2m2.filter.BooleanAsDouble <em>Boolean As Double</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.s2m2.filter.BooleanAsDouble
	 * @generated
	 */
	public Adapter createBooleanAsDoubleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.s2m2.filter.SpecificationAvailable <em>Specification Available</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.s2m2.filter.SpecificationAvailable
	 * @generated
	 */
	public Adapter createSpecificationAvailableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.s2m2.filter.SpecificationEvaluation <em>Specification Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.s2m2.filter.SpecificationEvaluation
	 * @generated
	 */
	public Adapter createSpecificationEvaluationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.s2m2.filter.BipartiteGraphMatching <em>Bipartite Graph Matching</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.s2m2.filter.BipartiteGraphMatching
	 * @generated
	 */
	public Adapter createBipartiteGraphMatchingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.s2m2.filter.FilterConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.s2m2.filter.FilterConfiguration
	 * @generated
	 */
	public Adapter createFilterConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dfki.s2m2.filter.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dfki.s2m2.filter.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FilterAdapterFactory
