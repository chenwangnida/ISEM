/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cached Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.dfki.s2m2.filter.CachedExpression#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.CachedExpression#getCachedValue <em>Cached Value</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.CachedExpression#getCachedParam1 <em>Cached Param1</em>}</li>
 *   <li>{@link de.dfki.s2m2.filter.CachedExpression#getCachedParam2 <em>Cached Param2</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.dfki.s2m2.filter.FilterPackage#getCachedExpression()
 * @model
 * @generated
 */
public interface CachedExpression<Domain, Range> extends Expression<Domain, Range> {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see de.dfki.s2m2.filter.FilterPackage#getCachedExpression_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression<Domain, Range> getExpression();

	/**
	 * Sets the value of the '{@link de.dfki.s2m2.filter.CachedExpression#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression<Domain, Range> value);

	/**
	 * Returns the value of the '<em><b>Cached Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cached Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cached Value</em>' attribute.
	 * @see #isSetCachedValue()
	 * @see #unsetCachedValue()
	 * @see #setCachedValue(Object)
	 * @see de.dfki.s2m2.filter.FilterPackage#getCachedExpression_CachedValue()
	 * @model unsettable="true"
	 * @generated
	 */
	Range getCachedValue();

	/**
	 * Sets the value of the '{@link de.dfki.s2m2.filter.CachedExpression#getCachedValue <em>Cached Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cached Value</em>' attribute.
	 * @see #isSetCachedValue()
	 * @see #unsetCachedValue()
	 * @see #getCachedValue()
	 * @generated
	 */
	void setCachedValue(Range value);

	/**
	 * Unsets the value of the '{@link de.dfki.s2m2.filter.CachedExpression#getCachedValue <em>Cached Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCachedValue()
	 * @see #getCachedValue()
	 * @see #setCachedValue(Object)
	 * @generated
	 */
	void unsetCachedValue();

	/**
	 * Returns whether the value of the '{@link de.dfki.s2m2.filter.CachedExpression#getCachedValue <em>Cached Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cached Value</em>' attribute is set.
	 * @see #unsetCachedValue()
	 * @see #getCachedValue()
	 * @see #setCachedValue(Object)
	 * @generated
	 */
	boolean isSetCachedValue();

	/**
	 * Returns the value of the '<em><b>Cached Param1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cached Param1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cached Param1</em>' attribute.
	 * @see #isSetCachedParam1()
	 * @see #unsetCachedParam1()
	 * @see #setCachedParam1(Object)
	 * @see de.dfki.s2m2.filter.FilterPackage#getCachedExpression_CachedParam1()
	 * @model unsettable="true"
	 * @generated
	 */
	Domain getCachedParam1();

	/**
	 * Sets the value of the '{@link de.dfki.s2m2.filter.CachedExpression#getCachedParam1 <em>Cached Param1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cached Param1</em>' attribute.
	 * @see #isSetCachedParam1()
	 * @see #unsetCachedParam1()
	 * @see #getCachedParam1()
	 * @generated
	 */
	void setCachedParam1(Domain value);

	/**
	 * Unsets the value of the '{@link de.dfki.s2m2.filter.CachedExpression#getCachedParam1 <em>Cached Param1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCachedParam1()
	 * @see #getCachedParam1()
	 * @see #setCachedParam1(Object)
	 * @generated
	 */
	void unsetCachedParam1();

	/**
	 * Returns whether the value of the '{@link de.dfki.s2m2.filter.CachedExpression#getCachedParam1 <em>Cached Param1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cached Param1</em>' attribute is set.
	 * @see #unsetCachedParam1()
	 * @see #getCachedParam1()
	 * @see #setCachedParam1(Object)
	 * @generated
	 */
	boolean isSetCachedParam1();

	/**
	 * Returns the value of the '<em><b>Cached Param2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cached Param2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cached Param2</em>' attribute.
	 * @see #isSetCachedParam2()
	 * @see #unsetCachedParam2()
	 * @see #setCachedParam2(Object)
	 * @see de.dfki.s2m2.filter.FilterPackage#getCachedExpression_CachedParam2()
	 * @model unsettable="true"
	 * @generated
	 */
	Domain getCachedParam2();

	/**
	 * Sets the value of the '{@link de.dfki.s2m2.filter.CachedExpression#getCachedParam2 <em>Cached Param2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cached Param2</em>' attribute.
	 * @see #isSetCachedParam2()
	 * @see #unsetCachedParam2()
	 * @see #getCachedParam2()
	 * @generated
	 */
	void setCachedParam2(Domain value);

	/**
	 * Unsets the value of the '{@link de.dfki.s2m2.filter.CachedExpression#getCachedParam2 <em>Cached Param2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCachedParam2()
	 * @see #getCachedParam2()
	 * @see #setCachedParam2(Object)
	 * @generated
	 */
	void unsetCachedParam2();

	/**
	 * Returns whether the value of the '{@link de.dfki.s2m2.filter.CachedExpression#getCachedParam2 <em>Cached Param2</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cached Param2</em>' attribute is set.
	 * @see #unsetCachedParam2()
	 * @see #getCachedParam2()
	 * @see #setCachedParam2(Object)
	 * @generated
	 */
	boolean isSetCachedParam2();

} // CachedExpression
