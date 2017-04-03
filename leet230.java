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
    public int kthSmallest(TreeNode root, int k) {
		int count = countNode(root.left);
		if(k <= count) {
			return kthSmallest(root.left, k);
		} else if (k > count + 1){
			return kthSmallest(root.right, k - 1 - count);
		}
		return root.val;
	}
	
	public int countNode(TreeNode node) {
		if(node == null) {
			return 0;
		}
		return 1 + countNode(node.left) + countNode(node.right);
	}
}