public class Solution {
    public String convert(String s, int numRows) {
        if(numRows <= 1) {
			return s;
		}
		String[] rows = new String[numRows];
		for(int i = 0; i < rows.length; i++) {
			rows[i] = "";
		}
		int divisor = 2 * numRows - 2;
		for(int i = 0; i < s.length(); i++) {
			int remainder = i % divisor;
			if(remainder < numRows) {
				rows[remainder] += s.charAt(i);
			} else {
				rows[divisor - remainder] += s.charAt(i);
			}
		}
		for(int i = 1; i < rows.length; i++) {
			rows[0] += rows[i];
		}
		return rows[0];
    }
}