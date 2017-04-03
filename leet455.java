public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(g.length < 1 || s.length < 1) {
			return 0;
		}
		int count = 0;
		int i = 0;
		int j = 0;
		Arrays.sort(g);
		Arrays.sort(s);
		while(i < g.length) {
			while(j < s.length) {
				if(s[j] >= g[i]) {
					count++;
					i++;
					j++;
					break;
				} else{
					j++;
				}
			}
			if(j == s.length || i == g.length) {
				break;
			}
		}
		return count;
    }
}