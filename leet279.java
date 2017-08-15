public class Solution {
    public static int numSquares(int n) {
		if(isSquare((double) n)) {
			return 1;
		}
		int[] array = new int[n + 1];
		for(int i = 0; i < array.length; i++) {
			array[i] = Integer.MAX_VALUE;
		}
		count(n, array);
		return array[n];
	}

	public static void count(int n, int[] array) {
		for (int i = 1; i <= n; i++) {
			if(isSquare((double) i)) {
				array[i] = 1;
			} else {
				int temp = Integer.MAX_VALUE;
				for(int j = 1; j < i; j++) {
					temp = Math.min(temp, array[j] + array[i-j]);
				}
				array[i] = temp;
			}
		}
	}

	public static boolean isSquare(Double d) {
		return Math.sqrt(d) % 1 == 0;
	}
}



public int numSquares(int n) {
	int[] dp = new int[n + 1];
	Arrays.fill(dp, Integer.MAX_VALUE);
	dp[0] = 0;
	for(int i = 1; i <= n; ++i) {
		int min = Integer.MAX_VALUE;
		int j = 1;
		while(i - j*j >= 0) {
			min = Math.min(min, dp[i - j*j] + 1);
			++j;
		}
		dp[i] = min;
	}		
	return dp[n];
}