public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(numRows == 0) return res;
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		res.add(new ArrayList<>(list));
		for(int i = 1; i < numRows; i++) {
			ArrayList<Integer> temp = (ArrayList<Integer>) res.get(res.size()-1);
			for(int j = 1; j < i; j++) {
				list.set(j, temp.get(j-1) +temp.get(j));
			}
			list.add(1);
			res.add(new ArrayList<>(list));
		}
		return res;
    }
}