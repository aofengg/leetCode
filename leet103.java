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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
		if(root == null) return res;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		int sign = 1;
		while(!queue.isEmpty()) {
			int length = queue.size();
			List<Integer> list = new ArrayList<>();
			for(int i = 0; i < length; i++) {
				TreeNode node = queue.poll();
				if(sign == 1) list.add(node.val);
				if(sign == -1) list.add(0, node.val);
				if(node.left != null) queue.add(node.left);
				if(node.right != null) queue.add(node.right);
			}
			res.add(list);
			sign *= -1;
		}
		
		return res;
    }
}