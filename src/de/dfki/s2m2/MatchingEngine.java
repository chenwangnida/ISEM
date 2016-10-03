package de.dfki.s2m2;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.Collections;
import java.util.Set;
import java.util.Vector;

import de.dfki.s2m2.filter.Expression;
import de.dfki.s2m2.filter.ExpressionEvaluationException;
import de.dfki.s2m2.service.ServiceRegistry;
import de.dfki.s2m2.service.ServiceView;

public class MatchingEngine {

	protected ServiceRegistry								serviceRegistry = null;
		
	protected MatchingSetup									setup = null;
	
	private ServiceRegistry									requestRegistry = null;
	
	protected MatchingEngine() {
		
	}
	
	public MatchingEngine(ServiceRegistry serviceRegistry, MatchingSetup setup) {
		this.serviceRegistry		= serviceRegistry;
		this.setup					= setup;
		
		try {
			requestRegistry				= serviceRegistry.getClass().newInstance();
		}
		catch(InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public MatchingSetup getSetup() {
		return setup;
	}
	
	public Vector<MatchingResult> match(URL requestDocument) throws MatchingException {
		// get all registered services from the registry (service offers)
		Set<URI> serviceOffers = serviceRegistry.getRegisteredServices();
		
		try {
			// temporary register service request
			//Set<URI> serviceRequests = serviceRegistry.registerServices(requestDocument);
			Set<URI> serviceRequests = requestRegistry.registerServices(requestDocument);
			
			Vector<MatchingResult> resultRanking = new Vector<MatchingResult>();
			// consider each request service, if more than one is contained
			for(URI request : serviceRequests) {
				for(URI offer : serviceOffers) {
					MatchingResult matchingResult = new MatchingResult(request, requestDocument, offer, serviceRegistry.getSource(offer));
					// apply all matching expressions
					try {
						//ServiceView requestView = serviceRegistry.getViewOnService(request, viewExtractor);
						ServiceView requestView = requestRegistry.getViewOnService(request, setup.viewExtractor);
						ServiceView offerView = serviceRegistry.getViewOnService(offer, setup.viewExtractor);
						for(Expression<ServiceView, ?> expression : setup.featureSpace) {
							matchingResult.addFeature(expression, expression.evaluate(requestView, offerView));
						}
					}
					catch(ExpressionEvaluationException e) {
						// TODO Error handling: ignore this request/offer pair, but log (WARN).
						e.printStackTrace();
					}
					// catch all other exceptions as well to proceed with the matching
					catch(Exception e) {
						// TODO Error handling
						e.printStackTrace();
					}
					resultRanking.add(matchingResult);
				}
			}
			
			// unregister all requests again
			for(URI serviceUri : serviceRequests) {
				//serviceRegistry.deregisterService(serviceUri);
				requestRegistry.deregisterService(serviceUri);
			}
			
			// sort the results (= create ranking)
			Collections.sort(resultRanking, setup.rankingOrder);
			
			return resultRanking;
		}
		catch(IOException e) {
			throw new MatchingException("Unable to parse request document", e);
		}
	}
	
	/**
	 * @return the serviceRegistry
	 */
	public ServiceRegistry getServiceRegistry() {
		return serviceRegistry;
	}
}
