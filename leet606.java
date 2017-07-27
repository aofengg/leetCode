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
    public String tree2str(TreeNode t) {
		if(t == null) return "";
		StringBuilder sb = new StringBuilder("" + t.val);
		preorder(t, sb);
		return sb.toString();
	}

	private void preorder(TreeNode t, StringBuilder sb) {		
		if (t.left == null && t.right == null)
			return;

		sb.append('(');
		if (t.left != null) {
			sb.append(t.left.val);
			preorder(t.left, sb);
		}
		sb.append(')');
		if (t.right != null) {
			sb.append('(');
			sb.append(t.right.val);
			preorder(t.right, sb);
			sb.append(')');
		}
	}
}