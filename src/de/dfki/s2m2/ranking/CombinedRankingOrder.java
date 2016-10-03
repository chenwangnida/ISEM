package de.dfki.s2m2.ranking;

import java.util.List;

import de.dfki.s2m2.MatchingResult;

public class CombinedRankingOrder implements RankingOrder {

	protected List<RankingOrder>	basicOrders;
	
	public CombinedRankingOrder(List<RankingOrder> basicOrders) {
		this.basicOrders = basicOrders;
	}
	
	@Override
	public int compare(MatchingResult result1, MatchingResult result2) {
		for(RankingOrder basicOrder : basicOrders) {
			int result = basicOrder.compare(result1, result2);
			if(result != 0)
				return result;
		}
		
		return 0;
	}

}
