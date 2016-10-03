package de.dfki.s2m2.filter.bpg;

/**
 * Assignment Problem by Hungarian Algorithm
 * 
 * based on: http://www.arcavia.com/kyle/BLOG/arc20060101.htm#BlogID25
 * http://www.public.iastate.edu/~ddoty/HungarianAlgorithm.html
 * 
 * more on Hungarian Algorithm:
 * 
 * 
 */

public final class BestAssignmentSolver {

	public static void main(String[] param) {

//		double[][] test={{2, 5, 3}, {3, 1, 4}, {6, 3, 10}};
//		 double[][] test={{1, 2, 3, 4}, {2, 4, 6, 8}, {3, 6, 9, 12}, {4, 8,
//		 12, 16}};

		double[][] test={{2, 5}, {3, 1}, {6, 3}};

		byte[][] solution = new BestAssignmentSolver(test).munkres();
//		System.out.println(solution.toString());
		
		for(int i = 0; i < solution.length; i++) {
			for(int j = 0; j < solution[i].length; j++) {
				System.out.print(solution[i][j] + " ");
			}
			System.out.println();
		}

	}// method

	double[][] cost; // COST MATRIX

	int numCol;

	int numRow;

	public BestAssignmentSolver(double[][] cost) {
		numCol = cost[0].length;
		numRow = cost.length;
		if (numRow > numCol)
			throw new IllegalArgumentException(
					"Expecting more rows than columns");
		this.cost = cost;
	}// method

	public byte[][] munkres() {
		munkres m = new munkres();
		return m.solve();

	}// method

	/**
	 * 
	 * @return list of matched rows
	 */
	public int[] solve() {
		byte[][] marks = munkres();
		int[] matchedRows = new int[marks.length];

		for (int i = 0; i < marks.length; i++) {
			for (int j = 0; j < marks[i].length; j++)
				if (marks[i][j] == 1) {
					matchedRows[i] = j;
					break;
				}
		}
		return matchedRows;

	}// method

	// MUNKRES MARKINGS
	private static byte NOT_MARKED = 0;

	private static byte STARRED_ZERO = 1;

	private static byte PRIMED_ZERO = 2;

	public class munkres {
		byte[][] mark; // MARK ZEROS

		int[] rowIsCovered;

		int[] colIsCovered;

		public byte[][] solve() {
			// MAKE THE MARKING ARRAY
			mark = new byte[numRow][];
			for (int i = 0; i < numRow; i++) {
				mark[i] = new byte[numCol];
			}// for

			rowIsCovered = new int[numRow];
			colIsCovered = new int[numCol];

			reduceRows();
			starSomeZeros();
			while (true) {
				if (isDone())
					break;
				;
				pair p = findAndPrimeUncoveredZero();
				new step5().main(p);
			}// loop

			return mark;
		}// method

		public void reduceRows() {
			double minval;

			for (int i = 0; i < numRow; i++) {
				minval = cost[i][0];
				for (int j = 1; j < numCol; j++) {
					if (minval > cost[i][j]) {
						minval = cost[i][j];
					}// if;
				}// for

				for (int j = 0; j < numCol; j++) {
					cost[i][j] -= minval;
				}// for

			}// for
		}// stepone;

		public void starSomeZeros() {
			// ONLY ONE STAR ALLOWED PER ROW AND ONE PER COLUMN
			boolean[] colIsCovered = new boolean[numCol];

			A: for (int i = 0; i < numRow; i++) {
				for (int j = 0; j < numCol; j++) {
					if (!colIsCovered[j] && cost[i][j] == 0) {
						mark[i][j] = STARRED_ZERO;
						colIsCovered[j] = true;
						continue A; // DO NOT FINISH THIS ROW
					}// if;
				}// for
			}// for
		}// steptwo;

		public boolean isDone() {
			// RETURN true IF DONE
			// ALSO COVER ROWS AND COLUMNS IF NOT DONE
			int count = 0;
			for (int j = 0; j < numCol; j++) {
				for (int i = 0; i < numRow; i++) {
					if (mark[i][j] == STARRED_ZERO) {
						colIsCovered[j] = 1;
						count++;
						break;
					}// if;
				}// loop;
			}// loop;

			if (count >= numRow)
				return true;
			return false;
		}// stepthree;

		public pair findAndPrimeUncoveredZero() {
			// FIND A UNCOVERED ZERO AND PRIME IT
			s4: while (true) {
				pair p = findUncoveredZero();
				if (p == null) {
					// CAN'T FIND A ZERO
					makeSomeZeros(); // MAKE IT
					continue s4; // TRY AGAIN
				}// endif

				mark[p.row][p.col] = PRIMED_ZERO;

				// find_star_in_row
				for (int j = 0; j < numCol; j++) {
					if (mark[p.row][j] == STARRED_ZERO) {
						rowIsCovered[p.row] = 1;
						colIsCovered[j] = 0;
						continue s4;
					}// if;
				}// for

				return p;
			}// for
		}// stepfour;

		public pair findUncoveredZero() {
			for (int i = 0; i < numRow; i++) {
				for (int j = 0; j < numCol; j++) {
					if (cost[i][j] == 0 && rowIsCovered[i] == 0
							&& colIsCovered[j] == 0) {
						return new pair(i, j);
					}// if;
				}// for
			}// for
			return null;
		}// method

		public void makeSomeZeros() {
			// find_smallest
			double minval = Float.MAX_VALUE;
			for (int i = 0; i < numRow; i++) {
				if (rowIsCovered[i] == 1)
					continue;
				for (int j = 0; j < numCol; j++) {
					if (colIsCovered[j] == 0) {
						if (minval > cost[i][j])
							minval = cost[i][j];
					}// if;
				}// for
			}// for

			for (int i = 0; i < numRow; i++) {
				for (int j = 0; j < numCol; j++) {
					if (rowIsCovered[i] == 1)
						cost[i][j] += minval;
					if (colIsCovered[j] == 0)
						cost[i][j] -= minval;
				}// for
			}// for
		}// method

		class step5 {
			// Construct a series of alternating primed and starred zeros as
			// follows.

			pair[] path = new pair[numRow * 2];

			public int find_star_in_col(int c) {
				for (int i = 0; i < numRow; i++) {
					if (mark[i][c] == STARRED_ZERO) {
						return i;
					}// if;
				}// for
				return -1;
			}// find_star_in_col;

			public int find_prime_in_row(int r) {
				for (int j = 0; j < numCol; j++) {
					if (mark[r][j] == PRIMED_ZERO) {
						return j;
					}// if;
				}// for
				return -1;
			}// find_prime_in_row;

			public void clear_covers() {
				for (int i = 0; i < numRow; i++) {
					rowIsCovered[i] = 0;
					colIsCovered[i] = 0; // SQUARE ASSUMPTION MADE HERE
				}// for
			}// clear_covers;

			public void clear_primes() {
				for (int i = 0; i < numRow; i++) {
					for (int j = 0; j < numCol; j++) {
						if (mark[i][j] == PRIMED_ZERO) {
							mark[i][j] = NOT_MARKED;
						}// if;
					}// for
				}// for
			}// erase_primes;

			public void main(pair p) {
				int count = 0;
				path[count] = p;

				while (true) {
					int r = find_star_in_col(path[count].col);
					if (r == -1)
						break;

					count++;
					path[count] = new pair(r, path[count - 1].col);

					int c = find_prime_in_row(path[count].row);

					count++;
					path[count] = new pair(path[count - 1].row, c);
				}// for

				// convert_path(){
				for (int i = 0; i <= count; i++) {
					if (mark[path[i].row][path[i].col] == STARRED_ZERO) {
						mark[path[i].row][path[i].col] = NOT_MARKED;
					} else {
						mark[path[i].row][path[i].col] = STARRED_ZERO;
					}// if;
				}// for

				clear_covers();
				clear_primes();
			}// stepfive;

		}// class

		@Override
		public String toString() {
			StringBuffer output = new StringBuffer();

			for (int j = 0; j < numCol; j++) {
				output.append("\t").append(colIsCovered[j]);
			}// for
			output.append("\n");

			for (int i = 0; i < numRow; i++) {
				output.append(rowIsCovered[i]);
				for (int j = 0; j < numCol; j++) {
					output.append("\t").append(cost[i][j]);
					if (mark[i][j] == STARRED_ZERO) {
						output.append("*");
					} else if (mark[i][j] == PRIMED_ZERO) {
						output.append("'");
					}// endif
				}// for
				output.append("\n");
			}// for
			return output.toString();

		}// method
	}// class

}// class

class pair {
	int row;

	int col;

	public pair(int row, int col) {
		this.row = row;
		this.col = col;
	}// method
}// class
