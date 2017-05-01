public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
		if(strs.length == 0) return new ArrayList<List<String>>();
		Map<String, List<String>> map = new HashMap<>();
		for(String s : strs) {
			char[] ch = s.toCharArray();
			Arrays.sort(ch);
			String keys = String.valueOf(ch);
			if(!map.containsKey(keys)) {
				map.put(keys, new ArrayList<String>());
			}
			map.get(keys).add(s);
		}
		return new ArrayList<List<String>>(map.values());
	}
}