import java.util.Map.Entry;
 class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> hash = new HashMap<>(); 
		for(int i = 0; i < s.length(); i++) {
			if(!hash.containsKey(s.charAt(i))) {
				hash.put(s.charAt(i), 1);
			} else {
				Integer temp = hash.get(s.charAt(i)) + 1;
				hash.put(s.charAt(i), temp);
			}
		}
		List<Map.Entry<Character, Integer>> list = new ArrayList<>(hash.entrySet());
		Collections.sort(list,new Comparator<Map.Entry<Character, Integer>>(){
			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				return o2.getValue() - o1.getValue();
			}
			
		});
		StringBuilder sb = new StringBuilder();
		for(Map.Entry<Character, Integer> entry : list) {
			for(int i = 0; i < entry.getValue(); i++) {
				sb.append(entry.getKey());
			}
		}
		return sb.toString();
    }
}