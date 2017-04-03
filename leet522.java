public class Solution {
    public int findLUSlength(String[] strs) {
		if (strs.length == 0)
			return -1;
		if (strs.length == 1)
			return strs[0].length();
		Map<String, Integer> map = new HashMap<>();
		for (String s : strs) {
			map.put(s, map.getOrDefault(s, 0) + 1);
		}
		List<String> list = new ArrayList<>();
		for (String s : map.keySet()) {
			list.add(s);
		}
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s2.length() - s1.length();
			}
		});
		for (int i = 0; i < list.size(); i++) {
			if (i == 0) {
				if (map.get(list.get(i)) == 1) {
					return list.get(i).length();
				}
			} else {
				if (map.get(list.get(i)) == 1) {
					int sign = 0;
					for(int j = 0; j < i; j++) {
						if(contains(list.get(j), list.get(i))) {
							sign = 1;	
						}
					}
					if(sign == 0) {
						return list.get(i).length();
					}
				}
			}
		}
		return -1;
	}
	public boolean contains(String s1, String s2) {
		int i = 0, j = 0;
		while(j < s2.length()) {
			int sign = 0;
			while(i < s1.length()) {
				if(s1.charAt(i) != s2.charAt(j)) {
					i++;
					continue;
				} else {
					i++;
					sign = 1;
					break;
				}
			}
			if(i >= s1.length() && j < s2.length() && sign == 0) {
				return false;
			}
			j++;
		}
		return true;
	}
}