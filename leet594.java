import java.util.Hashtable;

public class Solution {
    public int findLHS(int[] nums) {
        Hashtable<Integer, Integer> hash = new Hashtable<>();
		for(int n : nums) {
			hash.put(n, hash.getOrDefault(n, 0) + 1);
		}
		int result = 0;
		for(int key : hash.keySet()) {
			if(hash.containsKey(key + 1)) {
				result = Math.max(result, hash.get(key) + hash.get(key + 1));
			}
		}
		return result;
    }
}