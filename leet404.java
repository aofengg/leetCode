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
    int sum = 0;

	public int sumOfLeftLeaves(TreeNode root) {
		if(root == null) {
			return 0;
		}
		if(root.left == null && root.right == null) {
			return 0;
		}
		if(root.left != null) {
			def(root.left, 1);
		}
		if(root.right != null) {
			def(root.right, 2);
		}
		return sum;
	}

	public void def(TreeNode node, int sign) {
		if(node.left == null && node.right == null) {
			if(sign == 1) {
				sum += node.val;
			}
		}
		if(node.left != null) {
			def(node.left, 1);
		}
		if(node.right != null) {
			def(node.right, 2);
		}

	}
}