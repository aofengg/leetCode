class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int res = 0;
		int min = arrays.get(0).get(0);
		int max = arrays.get(0).get(arrays.get(0).size() - 1);
		int mark = 0;
		for (List<Integer> array : arrays) {
			if (mark == 0) {
				mark = 1;
				continue;
			} else {
				res = Math.max(res, Math.max(Math.abs(array.get(array.size() - 1) - min), Math.abs(max - array.get(0))));
				max = Math.max(max, array.get(array.size() - 1));
				min = Math.min(min, array.get(0));
			}
		}
		return res;
    }
}