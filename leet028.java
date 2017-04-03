public class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length() < needle.length()) {
			return -1;
		}
		if(haystack == "" || haystack == null) {
			return -1;
		}
		for(int i = 0; i < haystack.length() - needle.length() + 1; i++) {
			int h1 = i, h2 = i + needle.length() - 1;
			int n1 = 0, n2 = needle.length() - 1;
			while(n1 <= n2) {
				if(haystack.charAt(h1) != needle.charAt(n1) || haystack.charAt(h2) != needle.charAt(n2)) {
					break;
				} else {
					h1++;
					n1++;
					h2--;
					n2--;
				}
			}
			if(n1 > n2) {
			    return i;
			}
		}
		return -1;
    }
}