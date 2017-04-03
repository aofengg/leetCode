public class Solution {
    public String convertToBase7(int num) {
        if (num == 0)
			return "0";
		String res = "";
		if (num > 0) {
			int divident = num;
			int remainder = 0;
			while (divident != 0) {
				remainder = divident % 7;
				divident /= 7;
				res = remainder + res;
			}
			return res;
		} else {
			int divident = num * (-1);
			int remainder = 0;
			while (divident != 0) {
				remainder = divident % 7;
				divident /= 7;
				res = remainder + res;
			}
			return "-" + res;
		}
    }
}