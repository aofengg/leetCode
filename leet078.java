//Solution 1
public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> temp = new ArrayList<>();
		res.add(temp);
		if (nums.length == 0)
			return res;
		help(res, temp, nums, 0);
		return res;
	}

	private void help(List<List<Integer>> res, List<Integer> list, int[] nums, int start) {
		if (list.size() >= nums.length || start >= nums.length)
			return;
		for (int i = start; i < nums.length; i++) {
			List<Integer> temp = new ArrayList<>(list);
			temp.add(nums[i]);
			res.add(temp);
			help(res, temp, nums, i + 1);
		}
	}
}


//Solution 2
public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(nums);
    backtrack(list, new ArrayList<>(), nums, 0);
    return list;
}

private void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
    list.add(new ArrayList<>(tempList));
    for(int i = start; i < nums.length; i++){
        tempList.add(nums[i]);
        backtrack(list, tempList, nums, i + 1);
        tempList.remove(tempList.size() - 1);
        //这里之所以需要remove，是因为传递的参数是可变的templist，而他的复制是在下一个递归里面
        //而Solution 1是在本地进行先复制，所以templist一直没有改变，就不需要remove了
    }
}