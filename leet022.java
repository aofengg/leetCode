public class Solution {
    public List<String> generateParenthesis(int n) {
		List<String> list = new ArrayList<>();
		backtrack(list, "", n, n);
		return list;
	}
	
	public void backtrack(List<String> list, String str, int open, int close) {
		if(open == 0 && close == 0) {
			list.add(str);
			return;
		}
		if(open > 0) {
			backtrack(list, str + "(", open-1, close);
		}
		if(open < close) {
			backtrack(list, str + ")", open, close - 1);
		}
	}
}