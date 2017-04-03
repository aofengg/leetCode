public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
		if(s.length() < p.length() || s == null || p == null) {
			return res;
		}
		int[] chars = new int[26];
		for(char c : p.toCharArray()) {
			chars[c - 'a']++;
		}
		int start = 0, end = 0, count = p.length();
		while(end < s.length()) {
			if(chars[s.charAt(end) - 'a'] > 0) {
				count--;
			}
			chars[s.charAt(end) - 'a']--;
			end++;
			if(count == 0) {
				res.add(start);
			}
			if(end - start == p.length()) {
				if(chars[s.charAt(start) - 'a'] >= 0) {
					count++;
				}
				chars[s.charAt(start) - 'a']++;
				start++;
			}
		}
		return res;
    }
}