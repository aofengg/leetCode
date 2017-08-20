class Solution {
    public int maxA(int N) {
        if (N <= 3) {
			return N;
		}
		int[] res = new int[N + 1];
		res[0] = 0;
		res[1] = 1;
		res[2] = 2;
		res[3] = 3;
		for (int i = 4; i <= N; i++) {
            res[i] = res[i-1] + 1;
			for (int j = 0; j <= i - 3; j++) {
				res[i] = Math.max(res[i], res[j] * (i - j - 1));
			}
		}
		return res[N];
    }
}