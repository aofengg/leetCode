public class Solution {
    public int totalHammingDistance(int[] nums) {
        if(nums.length == 0) return 0;
		if(nums.length == 1) return 0;
		int res = 0;
		int n = nums.length;
		for(int j = 0; j < 32; j++) {
			int bitCount = 0;
			for(int i = 0; i < n; i++) {
				bitCount += (nums[i] >> j) & 1;
			}
			res += bitCount * (n - bitCount);
		}
		return res;
    }
}