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
    HashMap<Integer, Integer> map = new HashMap<>();
    
    public int[] findFrequentTreeSum(TreeNode root) {
        if(root == null) {
            return new int[0];
        }
        
		List<Integer> list = new ArrayList<>(); 
		findSum(root);
		int max = 0;
		for(Integer value: map.values()) {
			if(max < value) {
				max = value;
			}
		}
		for(Integer key : map.keySet()) {
			if(map.get(key) == max) {
				list.add(key);
			}
		}
		int[] array = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			array[i] = list.get(i);
		}
		return array;
	}

	public int findSum(TreeNode node) {
		if(node.left == null && node.right == null) {
			int sum = node.val;
			if(map.containsKey(sum)) {
				map.put(sum, map.get(sum) + 1);
			} else {
				map.put(sum, 1);
			}
			return node.val;
		}
		int sum = node.val;
		if (node.left != null) {
			sum += findSum(node.left);
		}
		if(node.right != null) {
			sum += findSum(node.right);
		}
		
		if(map.containsKey(sum)) {
			map.put(sum, map.get(sum) + 1);
		} else {
			map.put(sum, 1);
		}
		return sum;
	}
}