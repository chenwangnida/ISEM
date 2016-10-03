/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter;

import org.eclipse.emf.ecore.EFactory;

import de.dfki.s2m2.service.SpecificationExpression;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dfki.s2m2.filter.FilterPackage
 * @generated
 */
public interface FilterFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FilterFactory eINSTANCE = de.dfki.s2m2.filter.impl.FilterFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Fixed Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fixed Value</em>'.
	 * @generated
	 */
	<Domain> FixedValue<Domain> createFixedValue();

	/**
	 * Returns a new object of class '<em>Average</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Average</em>'.
	 * @generated
	 */
	<Domain> Average<Domain> createAverage();

	/**
	 * Returns a new object of class '<em>Inverse</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inverse</em>'.
	 * @generated
	 */
	<Domain, Range> Inverse<Domain, Range> createInverse();

	/**
	 * Returns a new object of class '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And</em>'.
	 * @generated
	 */
	<Domain> And<Domain> createAnd();

	/**
	 * Returns a new object of class '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or</em>'.
	 * @generated
	 */
	<Domain> Or<Domain> createOr();

	/**
	 * Returns a new object of class '<em>Greater Equals</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Greater Equals</em>'.
	 * @generated
	 */
	<Domain> GreaterEquals<Domain> createGreaterEquals();

	/**
	 * Returns a new object of class '<em>Forall Exists</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Forall Exists</em>'.
	 * @generated
	 */
	<Domain> ForallExists<Domain> createForallExists();

	/**
	 * Returns a new object of class '<em>Conditional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional</em>'.
	 * @generated
	 */
	<Domain, Range> Conditional<Domain, Range> createConditional();

	/**
	 * Returns a new object of class '<em>Semantic Annotation Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Semantic Annotation Evaluation</em>'.
	 * @generated
	 */
	<Range> SemanticAnnotationEvaluation<Range> createSemanticAnnotationEvaluation();

	/**
	 * Returns a new object of class '<em>Service Literal Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Literal Evaluation</em>'.
	 * @generated
	 */
	<Range> ServiceLiteralEvaluation<Range> createServiceLiteralEvaluation();

	/**
	 * Returns a new object of class '<em>Negation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Negation</em>'.
	 * @generated
	 */
	<Domain> Negation<Domain> createNegation();

	/**
	 * Returns a new object of class '<em>Maximum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Maximum</em>'.
	 * @generated
	 */
	<Domain> Maximum<Domain> createMaximum();

	/**
	 * Returns a new object of class '<em>True</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>True</em>'.
	 * @generated
	 */
	<Domain> True<Domain> createTrue();

	/**
	 * Returns a new object of class '<em>Concatenation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concatenation</em>'.
	 * @generated
	 */
	<Range> Concatenation<Range> createConcatenation();

	/**
	 * Returns a new object of class '<em>Boolean As Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean As Double</em>'.
	 * @generated
	 */
	<Domain> BooleanAsDouble<Domain> createBooleanAsDouble();

	/**
	 * Returns a new object of class '<em>Specification Available</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specification Available</em>'.
	 * @generated
	 */
	<Focus extends SpecificationExpression> SpecificationAvailable<Focus> createSpecificationAvailable();

	/**
	 * Returns a new object of class '<em>Specification Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specification Evaluation</em>'.
	 * @generated
	 */
	<T extends SpecificationExpression, Range> SpecificationEvaluation<T, Range> createSpecificationEvaluation();

	/**
	 * Returns a new object of class '<em>Bipartite Graph Matching</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bipartite Graph Matching</em>'.
	 * @generated
	 */
	<Domain> BipartiteGraphMatching<Domain> createBipartiteGraphMatching();

	/**
	 * Returns a new object of class '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration</em>'.
	 * @generated
	 */
	FilterConfiguration createFilterConfiguration();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FilterPackage getFilterPackage();

} //FilterFactory
