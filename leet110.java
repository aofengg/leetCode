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
    public boolean isBalanced(TreeNode root) {
		return dfs(root) != -1;
	}

	private int dfs(TreeNode node) {
		if(node == null) return 0;
		int leftHeight = dfs(node.left);
		int rightHeight = dfs(node.right);
		if(leftHeight == -1 || rightHeight == -1)
			return -1;
		if(Math.abs(leftHeight - rightHeight) > 1)
			return -1;
		return Math.max(leftHeight, rightHeight) + 1;
	}
}