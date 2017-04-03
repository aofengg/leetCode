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
    int count = 1;
	int max = 0;
	Integer prev = null;
	public int[] findMode(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		traverse(root, list);
		int[] res = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			res[i] = list.get(i);
		}
		return res;
	}
	
	public void traverse(TreeNode node, List<Integer> list) {
		if(node == null) return;
		traverse(node.left, list);
		if(prev != null) {
			if(node.val == prev) {
				count++;
			} else {
				count = 1;
			}
		}
		if(count > max) {
			max = count;
			list.clear();
			list.add(node.val);
		} else if(count == max) {
			list.add(node.val);
		}
		prev = node.val;
		traverse(node.right, list);
	}
}