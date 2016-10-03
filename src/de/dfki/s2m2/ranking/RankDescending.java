package de.dfki.s2m2.ranking;

import de.dfki.s2m2.MatchingResult;
import de.dfki.s2m2.filter.Expression;
import de.dfki.s2m2.service.ServiceView;

public class RankDescending implements RankingOrder {

	protected Expression<ServiceView, Double>	feature;
	
	public RankDescending(Expression<ServiceView, Double> feature) {
		this.feature = feature;
	}
	
	@Override
	public int compare(MatchingResult result1, MatchingResult result2) {
		try {
			return -((Double) result1.getFeature(feature)).compareTo((Double) result2.getFeature(feature));
		}
		catch(NullPointerException e) {
			// matching problem -> results not comparable
			return 0;
		}
	}
}
