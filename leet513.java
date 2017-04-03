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
    int answer = 0;
    int h = 0;
    
    public int findBottomLeftValue(TreeNode root) {
        findLeftMost(root, 1);
        return answer;
    }
    
    public void findLeftMost(TreeNode root, int depth) {
        if(h < depth) {
            answer = root.val;
            h = depth;
        }
        if(root.left != null) {
            findLeftMost(root.left, depth + 1);
        }
        if(root.right != null) {
            findLeftMost(root.right, depth + 1);
        }
    }
}