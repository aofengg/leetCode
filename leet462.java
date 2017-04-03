public class Solution {
    public int minMoves2(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        while(i < j) {
            count += (nums[j] - nums[i]);
            i++;
            j--;
        }
        return count;
    }
}