public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s == null && t == null) return true;
		if(s.length() != t.length()) return false;
		Map<Character, Character> hash = new HashMap<>();
		for(int i = 0; i < s.length(); i++) {
			if(hash.containsKey(s.charAt(i)) && hash.get(s.charAt(i)) != t.charAt(i) ) {
				return false;
			}
			if(!hash.containsKey(s.charAt(i))) {
				if(hash.containsValue(t.charAt(i)))
					return false;
				else
					hash.put(s.charAt(i), t.charAt(i));
			}
		}
		return true;
    }
}