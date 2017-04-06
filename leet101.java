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
    public boolean isSymmetric(TreeNode root) {
		if(root == null) return true;
		return recurrence(root.left, root.right);
	}

	private boolean recurrence(TreeNode left, TreeNode right) {
		if(left == null && right == null) return true;
		if(left != null && right != null && left.val == right.val) {
			return recurrence(left.left, right.right) && recurrence(left.right, right.left);
		}
		return false;
	}
}