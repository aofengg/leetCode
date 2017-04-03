public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
		if (n == 0)
			return new int[0][0];
		int left = 0, right = n - 1;
		int up = 0, down = n - 1;
		int count = 1;
		while (left <= right && up <= down) {
			for (int i = left; i <= right; i++) {
				matrix[up][i] = count;
				count++;
			}
			up++;
			for (int i = up; i <= down; i++) {
				matrix[i][right] = count;
				count++;
			}
			right--;
			if (up <= down) {
				for (int i = right; i >= left; i--) {
					matrix[down][i] = count;
					count++;
				}
				down--;
			}
			if (left <= right) {
				for (int i = down; i >= up; i--) {
					matrix[i][left] = count;
					count++;
				}
				left++;
			}
		}
		return matrix;
    }
}