public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if(nums.length == 0) {
            return res;
        }
        Arrays.sort(nums);
        if(nums[0] > 1) {
            for(int i = 1; i < nums[0]; i++) {
                res.add(i);
            }
        }
        for(int i = 1; i < nums.length; i++) {
            int diff = nums[i] - nums[i-1];
            if(diff > 1) {
                for(int j = 1; j < diff; j++) {
                    res.add(nums[i-1] + j);
                }
            }
        }
        if(nums[nums.length-1] < nums.length) {
            for(int i = nums[nums.length-1]+1; i <= nums.length; i++) {
                res.add(i);
            }
        }
        return res;
    }
}