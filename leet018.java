public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
		if(nums.length < 4) {
			return res;
		}
		Arrays.sort(nums);
		for(int a = 0; a <= nums.length-4; a++) {
			if(a > 0 && nums[a] == nums[a-1]) {
				continue;
			}
			int sum = target - nums[a];
			for(int b = a + 1; b <= nums.length - 3; b++) {
				if(b > a + 1 && nums[b] == nums[b-1]) {
					continue;
				}
				int c = b + 1, d = nums.length - 1;
				while(c < d) {
					if(sum == nums[b] + nums[c] + nums[d]) {
						List<Integer> list = new ArrayList<>();
						list.add(nums[a]);
						list.add(nums[b]);
						list.add(nums[c]);
						list.add(nums[d]);
						res.add(list);
						while(nums[d] == nums[d-1] && d > 1) {
							d--;
						}
						while(nums[c] == nums[c+1] && c < nums.length - 2) {
							c++;
						}
						d--;
						
					} else if((nums[b] + nums[c] + nums[d] > sum)) {
						d--;
					} else {
						c++;
					}
				}
			}
		}
		return res;
    }
}