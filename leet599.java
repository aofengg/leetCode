import java.util.Hashtable;
public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Hashtable<String, Integer> hash1 = new Hashtable<>();
		List<String> keys= new ArrayList<>();
		List<Integer> values = new ArrayList<>();
		for(int i = 0; i < list1.length; i++) {
			hash1.put(list1[i], i);
		}
		for(int i = 0; i < list2.length; i++) {
			if(hash1.containsKey(list2[i])) {
				if(keys.isEmpty()  || (i + hash1.get(list2[i])) == values.get(0)) {
					keys.add(list2[i]);
					values.add(i + hash1.get(list2[i]));
				} else if((i + hash1.get(list2[i])) < values.get(0)) {
					keys.clear();
					values.clear();
					keys.add(list2[i]);
					values.add(i + hash1.get(list2[i]));
				}
			}
		}
		return keys.toArray(new String[keys.size()]);
    }
}