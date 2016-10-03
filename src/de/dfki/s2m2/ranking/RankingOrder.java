package de.dfki.s2m2.ranking;

import java.util.Comparator;

import de.dfki.s2m2.MatchingResult;

/**
 * Represents a ranking order by means of the <code>java.util.Comparator</code> interface. The ISeM matching engine orders accepted
 * (by <code>IMatchingFilter</code>) service offers (more specifically <code>MatchingResult</code> objects) using implementations of
 * this.
 * 
 * @author Patrick Kapahnke
 * @version 1.0 10/01/09
 */
public interface RankingOrder extends Comparator<MatchingResult> {

	/**
	 * Compares two matching results. The result values for this method are as specified for <code>compare</code> of the
	 * <code>java.util.Comparator</code> interface. A value below 0 represents the case where <code>result1</code> must appear in a
	 * numerically lower position in the ranking (meaning it should get a better ranking position). A value above 0 represents the
	 * inverse case. 
	 * 
	 * @param result1 Matching result to compare to another.
	 * @param result2 Matching result to compare to another.
	 * @return <code>int</code> indicating the relationship.
	 */
	@Override
	public int compare(MatchingResult result1, MatchingResult result2);
}
