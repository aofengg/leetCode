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
    int max = 0;

	public int diameterOfBinaryTree(TreeNode root) {
		if (root == null)
			return 0;
		dfs(root);
		return max;
	}
	
	private void dfs(TreeNode node) {
		if(node == null) return;
		max = Math.max(path(node), max);
		dfs(node.left);
		dfs(node.right);
	}

	private int path(TreeNode node) {
		if(node == null) return -1;
		return deep(node.left) + deep(node.right) + 2;
	}
	
	private int deep(TreeNode node) {
		if(node == null) return -1;
		return Math.max(deep(node.left), deep(node.right)) + 1;
	}
}