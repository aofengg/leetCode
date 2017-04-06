/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		dfs(root, sum, list, res);
		return res;
	}

	private void dfs(TreeNode node, int sum, List<Integer> list, List<List<Integer>> res) {
		if(node == null) return;
		list.add(node.val);
		if(node.left == null && node.right == null && node.val == sum) {
			res.add(new ArrayList<>(list));
			list.remove(list.size() - 1);
			return;
		} else {
			dfs(node.left, sum - node.val, list, res);
			dfs(node.right, sum - node.val, list, res);
		}
		list.remove(list.size() - 1);
	}
}