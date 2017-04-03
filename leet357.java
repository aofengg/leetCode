public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
		if (n == 0)
			return 1;
		if (n == 1)
			return 10;
		if (n > 10)
			return countNumbersWithUniqueDigits(10);
		int[] f = new int[11];
		f[1] = 10;
		f[2] = 81;
		for (int i = 3; i <= 10; i++) {
			f[i] = f[i - 1] * (9 - i + 2);
		}
		return count(n, f);
	}

	private int count(int n, int[] f) {
		int[] r = new int[n + 1];
		r[1] = 10;
		for (int i = 2; i <= n; i++) {
			r[i] = f[i] + r[i - 1];
		}
		return r[n];
	}
}