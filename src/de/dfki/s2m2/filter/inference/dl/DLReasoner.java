/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.inference.dl;

import java.net.URI;

import org.eclipse.emf.common.util.EList;

import de.dfki.s2m2.filter.inference.InferenceEngine;
import de.dfki.s2m2.filter.inference.InferenceException;
import de.dfki.s2m2.filter.inference.NotSupportedException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DL Reasoner</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.dfki.s2m2.filter.inference.dl.DlPackage#getDLReasoner()
 * @model interface="true" abstract="true" superTypes="de.dfki.s2m2.filter.inference.InferenceEngine<de.dfki.s2m2.filter.URI>"
 * @generated
 */
public interface DLReasoner extends InferenceEngine<URI> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.dfki.s2m2.filter.inference.InferenceException de.dfki.s2m2.filter.inference.NotSupportedException" conceptsRequired="true" conceptsMany="false"
	 * @generated
	 */
	boolean equivalent(EList<URI> concepts) throws InferenceException, NotSupportedException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.dfki.s2m2.filter.inference.InferenceException de.dfki.s2m2.filter.inference.NotSupportedException" subsumerDataType="de.dfki.s2m2.filter.URI" subsumerRequired="true" subsumedDataType="de.dfki.s2m2.filter.URI" subsumedRequired="true"
	 * @generated
	 */
	boolean subsumes(URI subsumer, URI subsumed) throws InferenceException, NotSupportedException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="de.dfki.s2m2.filter.inference.InferenceException de.dfki.s2m2.filter.inference.NotSupportedException" parentDataType="de.dfki.s2m2.filter.URI" parentRequired="true" childDataType="de.dfki.s2m2.filter.URI" childRequired="true"
	 * @generated
	 */
	boolean leastGeneric(URI parent, URI child) throws InferenceException, NotSupportedException;

} // DLReasoner
