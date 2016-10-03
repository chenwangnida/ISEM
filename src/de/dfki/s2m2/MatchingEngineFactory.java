package de.dfki.s2m2;

import java.util.ArrayList;
import java.util.HashSet;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ocl.ecore.delegate.OCLDelegateDomain;
import org.eclipse.ocl.ecore.delegate.OCLInvocationDelegateFactory;
import org.eclipse.ocl.ecore.delegate.OCLSettingDelegateFactory;
import org.eclipse.ocl.ecore.delegate.OCLValidationDelegateFactory;

import de.dfki.s2m2.filter.Expression;
import de.dfki.s2m2.filter.FilterConfiguration;
import de.dfki.s2m2.filter.FilterPackage;
import de.dfki.s2m2.filter.LiteralType;
import de.dfki.s2m2.filter.ParameterType;
import de.dfki.s2m2.filter.inference.InferencePackage;
import de.dfki.s2m2.filter.inference.dl.DLReasoner;
import de.dfki.s2m2.filter.inference.dl.DlPackage;
import de.dfki.s2m2.filter.inference.dl.pellet.PelletPackage;
import de.dfki.s2m2.filter.inference.theoremproving.TheoremprovingPackage;
import de.dfki.s2m2.filter.inference.theoremproving.thetasubsumption.ThetasubsumptionPackage;
import de.dfki.s2m2.filter.textsim.Index;
import de.dfki.s2m2.filter.textsim.TextsimPackage;
import de.dfki.s2m2.filter.textsim.lucene.LucenePackage;
import de.dfki.s2m2.filter.util.FilterResourceFactoryImpl;
import de.dfki.s2m2.ranking.CombinedRankingOrder;
import de.dfki.s2m2.ranking.RankDescending;
import de.dfki.s2m2.ranking.RankingOrder;
import de.dfki.s2m2.service.RegistryEventHandler;
import de.dfki.s2m2.service.ServiceRegistry;
import de.dfki.s2m2.service.ServiceRegistry.Event;
import de.dfki.s2m2.service.ServiceView;
import de.dfki.s2m2.service.handler.AddToIndexEventHandler;
import de.dfki.s2m2.service.handler.ProcessClassesEventHandler;
import de.dfki.s2m2.service.handler.RemoveFromIndexEventHandler;
import de.dfki.s2m2.service.owls.OWLSExtractor;
import de.dfki.s2m2.service.owls.OWLSRegistry;
import de.dfki.s2m2.service.owls.OWLSUnfoldedAnnotationsExtractor;

public class MatchingEngineFactory {
	
	protected static Logger		logger = Logger.getLogger(MatchingEngineFactory.class);

	@SuppressWarnings({ "unused", "unchecked" })
	public static MatchingEngine createMatchingEngine(URI filterSetupUri) {
		logger.info("Create matching engine from " + filterSetupUri.toString());
		
		// init OCL
		logger.debug("Initialize OCL delegates.");
		String oclDelegateURI = OCLDelegateDomain.OCL_DELEGATE_URI;
		EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE.put(oclDelegateURI,
			new OCLInvocationDelegateFactory.Global());
		EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE.put(oclDelegateURI,
			new OCLSettingDelegateFactory.Global());
		EValidator.ValidationDelegate.Registry.INSTANCE.put(oclDelegateURI,
			new OCLValidationDelegateFactory.Global());
		
		// init packages
		logger.debug("Initialize S2M2 filter packages.");
		FilterPackage filterPackage = FilterPackage.eINSTANCE;
		DlPackage dlPackage = DlPackage.eINSTANCE;
		InferencePackage inferencePackage = InferencePackage.eINSTANCE;
		PelletPackage pelletPackage = PelletPackage.eINSTANCE;
		TheoremprovingPackage tpPackage = TheoremprovingPackage.eINSTANCE;
		ThetasubsumptionPackage thetaPackage = ThetasubsumptionPackage.eINSTANCE;
		TextsimPackage textsimPackage = TextsimPackage.eINSTANCE;
		LucenePackage lucenePackage = LucenePackage.eINSTANCE;
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("filter",
				new FilterResourceFactoryImpl());
						
		ResourceSet rs = new ResourceSetImpl();
					
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("filter",
				new FilterResourceFactoryImpl());

		Resource res = rs.getResource(filterSetupUri, true);		
		FilterConfiguration config = (FilterConfiguration) res.getContents().get(0);
		
		HashSet<Expression<ServiceView, ?>> filters = new HashSet<Expression<ServiceView, ?>>();
		filters.addAll(config.getFilter());	
		logger.debug("Filter definitions added to matchmaker setup.");
		
		// initialize ranking procedure
		// TODO Optimized version of this! (category ranking, ...)
		ArrayList<RankingOrder> basicRankingOrders = new ArrayList<RankingOrder>();
		for(Expression<ServiceView, ?> filter : config.getFilter()) {
			Expression<ServiceView, Double> numericalFilter = (Expression<ServiceView, Double>) filter;
			basicRankingOrders.add(new RankDescending(numericalFilter));
		}		
		RankingOrder rankingOrder = new CombinedRankingOrder(basicRankingOrders);
		logger.debug("Ranking procedure initialized.");
		
		OWLSExtractor hybridViewExtractor = new OWLSUnfoldedAnnotationsExtractor();
		
		MatchingSetup setup = new MatchingSetup(hybridViewExtractor, filters, rankingOrder);
		
		// setup service registry and add event handlers depending on used resources
		// TODO Better (MDA) solution instead of type casting
		ServiceRegistry registry = new OWLSRegistry();
		logger.debug("Setup service registry.");
		int handlerID = 1;
		for(de.dfki.s2m2.filter.Resource resource : config.getResource()) {
			try {
				// resource is a DLReasoner
				DLReasoner reasoner = (DLReasoner) resource;
				if(reasoner.isPreprocessing()) {
					HashSet<String> sources = new HashSet<String>();
					for(ParameterType type : config.getUsedParameterTypes())
						sources.add(type.getLiteral());
					RegistryEventHandler eventHandler = new ProcessClassesEventHandler(registry, reasoner, hybridViewExtractor, sources);
					registry.addEventHandler("pre-process classes " + (++handlerID), eventHandler, Event.REGISTRATION);
					logger.debug("Service registration eventhandler \"pre-process classes\" added: " + eventHandler.toString());
				}
			}
			catch(ClassCastException e) {
				try {
					// resource is an Index
					Index index = (Index) resource;
					HashSet<String> sources = new HashSet<String>();
					for(LiteralType type : config.getUsedLiteralTypes())
						sources.add(type.getLiteral());
					
					RegistryEventHandler regEventHandler = new AddToIndexEventHandler(registry, index, hybridViewExtractor, sources);
					registry.addEventHandler("add document " + (++handlerID), regEventHandler, Event.REGISTRATION);
					logger.debug("Service registration eventhandler \"add document\" added: " + regEventHandler.toString());
					
					RegistryEventHandler deregEventHandler = new RemoveFromIndexEventHandler(index);
					registry.addEventHandler("remove document " + (++handlerID), deregEventHandler, Event.DEREGISTRATION);
					logger.debug("Service deregistration eventhandler \"remove document\" added: " + deregEventHandler.toString());
				}
				catch(ClassCastException e1) {
					// resource without special event handling in service registry
				}
			}
		}
				
		MatchingEngine engine = new MatchingEngine(registry, setup);
		
		return engine;
	}
	
	public static void main(String[] args) {
		createMatchingEngine(URI.createFileURI("C:\\Daten\\workspaces\\runtime-EclipseApplication\\OWLS-MX filters\\owls-m0.filter"));
	}
}
