package de.dfki.s2m2;

import java.net.URI;
import java.net.URL;
import java.util.HashMap;

import de.dfki.s2m2.filter.Expression;

public class MatchingResult {

	/**
	 * @return the serviceOffer
	 */
	public URI getServiceOffer() {
		return serviceOffer;
	}

	/**
	 * @return the offerSource
	 */
	public URL getOfferSource() {
		return offerSource;
	}

	/**
	 * @return the serviceRequest
	 */
	public URI getServiceRequest() {
		return serviceRequest;
	}

	/**
	 * @return the requestSource
	 */
	public URL getRequestSource() {
		return requestSource;
	}

	protected URI									serviceOffer;
	
	protected URL									offerSource;
	
	protected URI									serviceRequest;
	
	protected URL									requestSource;
	
	protected HashMap<Expression<?, ?>, Object>		features = new HashMap<Expression<?, ?>, Object>();	
	
	protected MatchingResult(URI serviceRequest, URL requestSource,URI serviceOffer, URL offerSource) {
		this.serviceOffer	= serviceOffer;
		this.offerSource	= offerSource;
		this.serviceRequest	= serviceRequest;
		this.requestSource	= requestSource;
	}
	
	protected void addFeature(Expression<?, ?> expression, Object result) {
		features.put(expression, result);
	}
	
	public Object getFeature(Expression<?, ?> expression) {
		return features.get(expression);
	}

	public HashMap<Expression<?, ?>, Object> getFeatures() {
		return features;
	}
}
