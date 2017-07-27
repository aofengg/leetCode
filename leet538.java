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
	public TreeNode convertBST(TreeNode root) {
		if(root == null) 
			return null;
		helper(root);
		return root;
	}

	private void helper(TreeNode root) {
		if(root == null)
			return;
		helper(root.right);
		int temp = root.val;
		root.val += sum;
		sum += temp;
		helper(root.left);
	}

}