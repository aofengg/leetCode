public class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int i = m;
		int j = n;
		for(int index = 0; index < ops.length; index ++) {
			i = i < ops[index][0] ? i : ops[index][0];
			j = j < ops[index][1] ? j : ops[index][1];
		}
		return i * j;
    }
}