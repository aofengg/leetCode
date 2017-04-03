public class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
		for(char c : s.toCharArray()) {
			map.put(c, 0);
		}
		for(char c : t.toCharArray()) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				return "";
			}
		}
		
		int start = 0, end = 0, minStart = 0, minLen = Integer.MAX_VALUE, count = t.length();
		while(end < s.length()) {
			char endIndex = s.charAt(end);
			if(map.get(endIndex) > 0) {
				count--;
			}
			map.put(endIndex, map.get(endIndex) - 1);
			end++;
			while(count == 0) {
				if(minLen > end - start) {
					minLen = end - start;
					minStart = start;
				}
				char startIndex = s.charAt(start);
				map.put(startIndex, map.get(startIndex) + 1);
				if(map.get(startIndex) > 0) {
					count++;
				}
				start++;
			}
		}
		return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}