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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if(t1 == null && t2 == null) 
			return null;
		if(t1 == null && t2 != null) 
		    t1 = new TreeNode(0);
		merge(t1, t2);
		return t1;
	}

	private void merge(TreeNode t1, TreeNode t2) {
		if(t1 == null && t2 == null) {
		    
		} else {
    		if(t2 == null)
    			t2 = new TreeNode(0);
    		t1.val = add(t1, t2);
    		if(t1.left == null && t2.left != null) 
		        t1.left = new TreeNode(0);
		    if(t1.right == null && t2.right != null) 
		        t1.right = new TreeNode(0);
    		merge(t1.left, t2.left);
		    merge(t1.right, t2.right);
		}
	}
	
	private int add(TreeNode t1, TreeNode t2) {
		return t1.val + t2.val;
	}
}