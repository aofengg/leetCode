import java.util.Hashtable;

public class Solution {
    public static int longestPalindrome(String s) {
		Hashtable<Character, Integer> hash = new Hashtable<>();
		for(int i = 0; i < s.length(); i++) {
			if(hash.containsKey(s.charAt(i))) {
				hash.put(s.charAt(i), hash.get(s.charAt(i)) + 1);
			} else {
				hash.put(s.charAt(i), 1);
			}
		}
		int sum = 0;
		for(Integer value : hash.values()) {
			if(value % 2 == 0) {
				sum += value;
			} else {
				sum += value - 1;
			}
		}
		if(sum < s.length()) {
			return sum + 1;
		} else {
			return sum;
		}
	}
}