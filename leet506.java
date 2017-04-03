public class Solution {
    public String[] findRelativeRanks(int[] nums) {
        List<String> res = new ArrayList<>();
        if(nums.length == 0) {
            return res.toArray(new String[0]);
        }
        HashMap<Integer, String> hash = new HashMap<>();
        int[] ordered = Arrays.copyOf(nums, nums.length);
        Arrays.sort(ordered);
        int[] reorder = new int[ordered.length];
        for(int i = 0; i < ordered.length; i++) {
        	reorder[i] = ordered[ordered.length-1-i];
        }

        for(int i = 0; i < reorder.length; i++) {
            if(i == 0) {
                hash.put(reorder[i], "Gold Medal");
            }
            else if(i == 1) {
                hash.put(reorder[i], "Silver Medal");
            }
            else if(i == 2) {
                hash.put(reorder[i], "Bronze Medal");
            } 
            else {
                hash.put(reorder[i], "" + (i+1));
            }
        }
        for(int i = 0; i < nums.length; i++) {
            res.add(hash.get(nums[i]));
        }
        return res.toArray(new String[nums.length]);
    }
}