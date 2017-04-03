public class Solution {
    public int myAtoi(String str) {
        if (str == null || str.trim().length() == 0) {
			return 0;
		}
		int res = 0;
		String s = str.trim();
		int sign = 1;
		int i;
		if (s.charAt(0) == '-') {
			i = 1;
			sign = -1;
		} else if (s.charAt(0) == '+') {
			i = 1;
		} else {
			i = 0;
		}
		for (; i < s.length(); i++) {
		    if(s.charAt(i) < '0' || s.charAt(i) > '9') {
				return res * sign;
			}
		    if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > 7)) {
		    	return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
		    }
			res = res * 10 + (s.charAt(i) - '0');
			System.out.println(res);
		}
		return res * sign;
    }
}