public class Solution {
    public double findMaxAverage(int[] nums, int k) {
		double sum = 0;
		for(int i = 0; i < k; i++) {
			sum += nums[i];
		}
        double max = sum;
		for(int i = 0; (i + k) < nums.length; i++) {
			sum = sum - nums[i] + nums[i+k];
			max = sum > max ? sum : max;
		}
		return max / k;
    }
}