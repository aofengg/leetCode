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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		List<Double> list = new ArrayList<>();
		while(!queue.isEmpty()) {
			double sum = 0;
			int count = 0;
			int size = queue.size();
			for(int i = 0; i < size; i++) {
				TreeNode element = queue.poll();
				if(element.left != null)
					queue.add(element.left);
				if(element.right != null)
					queue.add(element.right);
				sum += element.val;
				count++;
			}
			double average = sum / count;
			list.add(average);
		}
		return list;
    }
}