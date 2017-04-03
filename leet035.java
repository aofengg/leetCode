public class Solution {
    public int searchInsert(int[] nums, int target) {
        int res = 0;
		if(nums.length < 1) {
			return res;
		}
		if(nums[nums.length - 1] < target)
			return nums.length;
		int i = 0, j = nums.length - 1;
		while(i < j) {
			int mid = (i + j) / 2;
			if (nums[mid] < target)
				i = mid + 1;
			else
				j = mid;
		}
		return i;
    }
}