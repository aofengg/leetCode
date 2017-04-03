public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) {
			return "";
		}
		String res = "";
		int count = 0;
		while (count < strs[0].length()) {
			String sub = strs[0].substring(count, count + 1);
			for (int i = 1; i < strs.length; i++) {
				if(count == strs[i].length()) {
					return res;
				}
				if(!sub.equals(strs[i].substring(count, count+1))) {
					return res;
				}
			}
			res += sub;
			
			count++;
		}
		return res;
    }
}