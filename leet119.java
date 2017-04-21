public class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> res = new ArrayList<>();
		res.add(1);
		ArrayList<Integer> last = new ArrayList<>();
		last.add(1);
		for(int i = 1; i <= rowIndex; i++) {
			for(int j = 1; j < i; j++) {
				res.set(j, last.get(j-1) +last.get(j));
			}
			res.add(1);
			last.clear();
			last = new ArrayList<>(res);
		}
		return res;
    }
}