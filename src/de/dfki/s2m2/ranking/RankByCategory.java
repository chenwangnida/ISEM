package de.dfki.s2m2.ranking;

import java.util.List;

import de.dfki.s2m2.MatchingResult;
import de.dfki.s2m2.filter.Expression;
import de.dfki.s2m2.service.ServiceView;

public class RankByCategory implements RankingOrder {

	protected List<Expression<ServiceView, Boolean>>		categoryOrder;
	
	public RankByCategory(List<Expression<ServiceView, Boolean>> categoryOrder) {
		this.categoryOrder = categoryOrder;
	}
	
	@Override
	public int compare(MatchingResult result1, MatchingResult result2) {
		for(Expression<ServiceView, Boolean> category : categoryOrder) {
			Boolean expValue1 = (Boolean) result1.getFeature(category);
			Boolean expValue2 = (Boolean) result2.getFeature(category);
			
			if(expValue1 == null)
				return 1;
			if(expValue2 == null)
				return -1;

			if(expValue1) {
				if(expValue2)
					return 0;
				else
					return -1;
			}
			else {
				if(expValue2)
					return 1;
			}				
		}
		
		return 0;
	}
}
