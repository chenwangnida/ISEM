/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.dfki.s2m2.filter.textsim.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Vector;

import org.eclipse.emf.ecore.EClass;

import de.dfki.s2m2.filter.ExpressionEvaluationException;
import de.dfki.s2m2.filter.textsim.Cosine;
import de.dfki.s2m2.filter.textsim.IndexException;
import de.dfki.s2m2.filter.textsim.TextsimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cosine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CosineImpl extends IndexBasedTextSimilarityMeasureImpl implements Cosine {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CosineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextsimPackage.Literals.COSINE;
	}
	
	@Override
	public Double evaluate(String param1, String param2)
			throws ExpressionEvaluationException {
		try {	
			// tokenize both strings
			Vector<String> terms1	= index.tokenize(param1);
			Vector<String> terms2	= index.tokenize(param2);
			
			// handling of special cases (empty term vectors)
			if(terms1.isEmpty() && terms2.isEmpty())
				return 1.0;
			if(terms1.isEmpty() || terms2.isEmpty())
				return 0.0;
			
			// compute absolute TF values and maximum absolute TF value
			HashMap<String, Integer> aTF1 = new HashMap<String, Integer>();
			for(String term : terms1) {
				if(!aTF1.containsKey(term))
					aTF1.put(term, 1);
				else
					aTF1.put(term, aTF1.get(term) + 1);
			}
			double maxATF1 = Collections.max(aTF1.values());
			
			HashMap<String, Integer> aTF2 = new HashMap<String, Integer>();
			for(String term : terms2) {
				if(!aTF2.containsKey(term))
					aTF2.put(term, 2);
				else
					aTF2.put(term, aTF2.get(term) + 2);
			}
			double maxATF2 = Collections.max(aTF2.values());
			
			// number of documents in the index structure
			double N = index.getNumberOfDocuments();
			
			// compute TFIDF values
			HashMap<String, Double> TFIDF1 = new HashMap<String, Double>();
			for(Entry<String, Integer> entry : aTF1.entrySet()) {
				String term = entry.getKey();
				double tf = entry.getValue()/maxATF1;
				double idf = Math.log(N/index.getDocumentFrequency(term));
				TFIDF1.put(term, tf*idf);
			}
			
			// compute TFIDF values
			HashMap<String, Double> TFIDF2 = new HashMap<String, Double>();
			for(Entry<String, Integer> entry : aTF2.entrySet()) {
				String term = entry.getKey();
				double tf = entry.getValue()/maxATF2;
				double idf = Math.log(N/index.getDocumentFrequency(term));
				TFIDF2.put(term, tf*idf);
			}

			// compute cosine measure
			double dot = 0.0;
			for(Entry<String, Double> entry : TFIDF1.entrySet()) {
				Double tfidf2 = TFIDF2.get(entry.getKey());
				// multiply with 0
				if(tfidf2 == null)
					continue;
				dot += entry.getValue()*tfidf2;
			}
			
			double mag1 = 0.0;
			for(Entry<String, Double> entry : TFIDF1.entrySet()) {
				double tfidf1 = entry.getValue();
				mag1 += tfidf1*tfidf1;
			}
			mag1 = Math.sqrt(mag1);
			
			double mag2 = 0.0;
			for(Entry<String, Double> entry : TFIDF2.entrySet()) {
				double tfidf2 = entry.getValue();
				mag2 += tfidf2*tfidf2;
			}
			mag2 = Math.sqrt(mag2);
			
			return dot/(mag1*mag2);
		}
		catch(IndexException e) {
			// TODO error handling
			throw new ExpressionEvaluationException("Unable to compute cosine similarity.", e);
		}
	}

} //CosineImpl
