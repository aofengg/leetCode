public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
		if(triangle.size() == 0) return 0;
		if(triangle.size() == 1) return triangle.get(0).get(0);
		int m = triangle.size();
		int n = triangle.get(m-1).size();
		int[][] dp = new int[m+1][n+1];
		dp[1][1] = triangle.get(0).get(0);
		for(int i = 2; i <= m; i++) {
			for(int j = 1; j <= triangle.get(i-1).size(); j++) {
				dp[i][j] = triangle.get(i-1).get(j-1);
				if(j-1 == 0)
					dp[i][j] += dp[i-1][j];
				else if(i == j)
					dp[i][j] += dp[i-1][j-1];
				else
					dp[i][j] += Math.min(dp[i-1][j], dp[i-1][j-1]);
			}
		}
		int minisum = Integer.MAX_VALUE;
		for(int i = 1; i <= n; i++) {
			if(minisum > dp[m][i])
				minisum = dp[m][i];
		}
		return minisum;
	}
}