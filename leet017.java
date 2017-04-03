public class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> res = new LinkedList<>();
        if(digits == null || digits.length() == 0) {
			return res;
		}
		String[] map = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		res.offer("");
		for(int i = 0; i < digits.length(); i++) {
			int x = digits.charAt(i) - '0';
			while(res.peek().length() == i) {
				String head = res.poll();
				for(char c : map[x].toCharArray()) {
					res.offer(head + c);
				}
			}
		}
		return res;
    }
}