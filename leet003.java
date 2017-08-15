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

//用map优化
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }
        int start = 0, end = 0;
        int max = Integer.MIN_VALUE;
        Map<Character, Integer> map = new HashMap<>();
        while(end < s.length()) {
            char c = s.charAt(end);
            if(map.containsKey(c)) {
                int index = map.get(c) + 1;
                start = Math.max(index, start);
                //start = start > index ? start : index;   好像这样速度更快一点？
            }
            map.put(c, end);
            int length = end - start + 1;
            max = Math.max(max, length);

            end++;
        }
        return max;
        
    }
}