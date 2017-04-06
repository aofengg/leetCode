public class Solution {
    public int thirdMax(int[] nums) {
        if(nums.length == 1) return nums[0];
		Arrays.sort(nums);
		int count = 1;
		for(int i = nums.length - 2; i >= 0; i--) {
			if(nums[i] == nums[i + 1]) continue;
			count++;
			if(count == 3) return nums[i];
		}
		return nums[nums.length - 1];
    }
}