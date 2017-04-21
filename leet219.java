import java.util.Hashtable;
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length < 2) return false;
		Hashtable<Integer, Integer> hash = new Hashtable<>();
		for(int i = 0; i < nums.length; i++) {
			if(hash.containsKey(nums[i])) {
				if(i - hash.get(nums[i]) <= k) {
					return true;
				} else {
					hash.put(nums[i], i);
				}
			} else{
				hash.put(nums[i], i);
			}
		}
		return false;
    }
}