public class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
		int[] sum = new int[n + 1];
		for (int i = 0; i < n; i++) {
			sum[i + 1] = sum[i] + nums[i];
		}
		Map<Integer, Integer> map = new HashMap<>();
		int ret = 0;
		for (int i = 0; i <= n; i++) {
			Integer history_sum = map.get(sum[i] - k);
			if (history_sum != null) {
				ret += history_sum;
			}
			if (map.containsKey(sum[i])) {
				map.put(sum[i], map.get(sum[i]) + 1);
			} else {
				map.put(sum[i], 1);
			}
		}
		return ret;
    }
}