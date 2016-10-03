package de.dfki.s2m2;

import java.util.Set;

import de.dfki.s2m2.filter.Expression;
import de.dfki.s2m2.ranking.RankingOrder;
import de.dfki.s2m2.service.ServiceView;
import de.dfki.s2m2.service.ViewExtractor;

public class MatchingSetup {

	protected Set<? extends Expression<ServiceView, ?>>	featureSpace;

	protected RankingOrder						rankingOrder;

	protected ViewExtractor						viewExtractor;
	
	public MatchingSetup(ViewExtractor viewExtractor, Set<? extends Expression<ServiceView, ?>> featureSpace, RankingOrder rankingOrder) {
		this.viewExtractor	= viewExtractor;
		this.featureSpace	= featureSpace;
		this.rankingOrder	= rankingOrder;
	}

	public Set<? extends Expression<ServiceView, ?>> getFeatureSpace() {
		return featureSpace;
	}

	public RankingOrder getRankingOrder() {
		return rankingOrder;
	}

	public ViewExtractor getViewExtractor() {
		return viewExtractor;
	}
}
