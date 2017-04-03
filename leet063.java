public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid.length == 0)
            return 0;
        if(obstacleGrid.length == 1 && obstacleGrid[0].length == 1)
            return 1 - obstacleGrid[0][0];
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        if(obstacleGrid[m-1][n-1] == 1 || obstacleGrid[0][0] == 1)
            return 0;
		if (obstacleGrid.length <= 1)
			return 1;
		if (obstacleGrid[0].length <= 1)
			return 1;
		int[][] dp = new int[m][n];
		dp[0][1] = 1 - obstacleGrid[0][1];
		dp[1][0] = 1 - obstacleGrid[1][0];
		return dpf(m - 1, n - 1, dp, obstacleGrid);
	}

	private int dpf(int i, int j, int[][] dp, int[][] obstacleGrid) {
		if (i < 0 || j < 0)
			return 0;
		if(obstacleGrid[i][j] == 1)
			return 0;
		if (dp[i][j] == 0) {
			dp[i][j] = dpf(i - 1, j, dp, obstacleGrid) + dpf(i, j - 1, dp, obstacleGrid);
		}
		return dp[i][j];
	}
}