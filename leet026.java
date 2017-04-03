public class Solution {
    public int removeDuplicates(int[] nums) {
		if(nums.length < 2) {
			return nums.length;
		}
		int count = 1;
		for(int i = 1, j = 1; j < nums.length; j++) {
			if(nums[j] != nums[j-1]) {
				count++;
				nums[i] = nums [j];
				i++;
			}
		}
		return count;
	}
}