public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int min = Integer.MAX_VALUE;
		int res = 0;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {
			int j = i + 1, k = nums.length - 1;
			while (j < k) {
				int sum = nums[i] + nums[j] + nums[k];
				int diff = target - sum;
				if (min > Math.abs(diff)) {
					min = Math.abs(diff);
					res = sum;
				}
				if (diff > 0) {
					j++;
				} else {
					k--;
				}

			}
		}
		return res;
    }
}