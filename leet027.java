public class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
		for(int i = 0, j = 0; j < nums.length; j++) {
			if(nums[j] != val) {
				count++;
				nums[i] = nums [j];
				i++;
			}
		}
		return count;
    }
}