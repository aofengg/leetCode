public class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0)
            return 0;
        if(nums.length == 1) {
            return nums[0];
        }
        int[] max = new int[nums.length + 1];
        max[0] = 0;
        max[1] = nums[0];
        for(int i = 2; i < nums.length + 1; i++) {
            max[i] = Math.max(max[i-1], max[i-2] + nums[i-1]);
        }
        return max[nums.length];
    }
}