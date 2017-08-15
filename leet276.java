public class Solution {
    public int numWays(int n, int k) {
		if (n == 0) {
			return 0;
		}
		if (n > 2 && k <= 1) {
			return 0;
		}
		int[][] p = new int[n][2];

		/*
		* p[x][0] means p[x] and p[x-1] have different color p[x][1] means
		* p[x] and p[x-1] have the same color
		*/

		// At the first position, there is no post before, its color can be any color
		p[0][0] = k; 
		p[0][1] = 0;
		for (int i = 1; i < n; i++) {
			// if p[x] wanted to be painted the same color as the previous post, there is only one choice
			p[i][1] = p[i - 1][0] * 1;
			// if p[x] wanted to be painted different color from previous post, there are k-1 choices. 
			// And there are two kinds of p[x-1] situation: same or different with previous post
			p[i][0] = (p[i - 1][1] + p[i - 1][0]) * (k - 1);
		}

		return p[n - 1][0] + p[n - 1][1];
	}
}