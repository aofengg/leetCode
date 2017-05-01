//My solution
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

//Solution 2
//Assume strs[0] is the result, and then cut strs[0] from the end by comparing each string
public String longestCommonPrefix(String[] strs) {
    if(strs == null || strs.length == 0)    return "";
    String pre = strs[0];
    int i = 1;
    while(i < strs.length){
        while(strs[i].indexOf(pre) != 0)
            pre = pre.substring(0,pre.length()-1);
        i++;
    }
    return pre;
}

//Solution 3
//Sort first, and then only compare the first and last string
public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        
        if (strs!= null && strs.length > 0){
        
            Arrays.sort(strs);
            
            char [] a = strs[0].toCharArray();
            char [] b = strs[strs.length-1].toCharArray();
            
            for (int i = 0; i < a.length; i ++){
                if (b.length > i && b[i] == a[i]){
                    result.append(b[i]);
                }
                else {
                    return result.toString();
                }
            }
        return result.toString();
    }