public class Solution {
    public int uniquePaths(int m, int n) {
		if(m <= 1 || n <= 1) return 1;
		int[][] dp = new int[m][n];
		dp[0][1] = 1;
		dp[1][0] = 1;
		return dpf(m - 1, n - 1, dp);
	}
	
	private int dpf(int i, int j, int[][] dp) {
		if (i < 0 || j < 0)
			return 0;
		if (dp[i][j] == 0) {
			dp[i][j] = dpf(i - 1, j, dp) + dpf(i, j - 1, dp);
		}
		return dp[i][j];
	}
}