public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
		List<List<Integer>> res = new ArrayList<>();
		backtrack(res, new ArrayList<>(), 1, k, n);
		return res;
	}

	private void backtrack(List<List<Integer>> res, ArrayList<Integer> tempList, int start, int k, int remain) {
		if(remain < 0) return;
		else if(remain > 0 && k == 0) {
			return;
		}
		else if(remain == 0 && k == 0) {
			res.add(new ArrayList<Integer>(tempList));
		}
		else {
			for(int i = start; i <= 9; i++) {
				tempList.add(i);
				backtrack(res, tempList, i + 1, k - 1, remain - i);
				tempList.remove(tempList.size() - 1);
			}
		}
		
	}
}