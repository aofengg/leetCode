public class Solution {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        if(nums.length == 0) {
			return new int[0];
		}
		Map<Integer, Integer> map = new HashMap<>();
		int length = nums.length;
		for(int i = 0; i < length-1; i++) {
			int nextGreater = -1;
			for(int j = i+1; j < length; j++) {
				if (nums[j] > nums[i]) {
					nextGreater = nums[j];
					break;
				}
			}
			map.put(nums[i], nextGreater);
		}
		map.put(nums[length-1], -1);
		int[] res = new int[findNums.length];
		for(int i = 0; i < findNums.length; i++) {
			res[i] = map.get(findNums[i]);
		}
		return res;
    }
}