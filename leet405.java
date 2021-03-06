public class Solution {
    public String toHex(int sum) {
		if(sum == 0)	return "0";
		char[] map = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
		String result = "";
		while(sum != 0) {
			result = map[sum & 15] + result;
			sum = (sum >>> 4);
		}
		return result;
	}
}