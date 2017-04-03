public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) {
			return 0;
		}
		int start = 0, end = 0;
		int max = Integer.MIN_VALUE;
		HashSet<Character> set = new HashSet<>();
		while(end < s.length()) {
			if(!set.contains(s.charAt(end))) {
				set.add(s.charAt(end));
				if(max < end - start + 1) {
					max = end - start + 1;
				}
			} else {
				while(set.contains(s.charAt(end))) {
					set.remove(s.charAt(start));
					start++;
				}
				set.add(s.charAt(end));
			}
			end++;
		}
		return max;
    }
}