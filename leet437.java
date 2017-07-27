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
    int res = 0;
	public int pathSum(TreeNode root, int sum) {
		Map<Integer, Integer> map = new HashMap<>();
		helper(root, sum, map);
		return res;
	}

	private void helper(TreeNode root, int sum, Map<Integer, Integer> map) {
		if(root == null)
			return;
		if(map.containsKey(sum - root.val)) {
			res += map.get(sum - root.val);
		}
		if(sum == root.val) {
			res++;
		}
		Map<Integer, Integer> newMap = new HashMap<>();
		for(Integer d : map.keySet()) {
			newMap.put(d + root.val, map.get(d));
		}
		newMap.put(root.val, newMap.getOrDefault(root.val, 0) + 1);
		helper(root.left, sum, newMap);
		helper(root.right, sum, newMap);
	}
}

//Another solution

public int pathSum(TreeNode root, int sum) {
        if(root == null)
            return 0;
        return dfs(root, sum)+pathSum(root.left, sum)+pathSum(root.right, sum);
    }

private int dfs(TreeNode root, int sum){
    int res = 0;
    if(root == null)
        return res;
    if(sum == root.val)
        res++;
    res+=dfs(root.left,sum - root.val);
    res+=dfs(root.right,sum - root.val);
    return res;
}