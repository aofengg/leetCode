import java.util.Map.Entry;

public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
		for(int i : nums) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return o2.getValue() - o1.getValue();
			}
		});
		List<Integer> res = new ArrayList<>();
		for(int i = 0; i < k; i++) {
			res.add(list.get(i).getKey());
		}
		return res;
    }
}