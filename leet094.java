/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *  
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        // if(root == null){
        //     return root;
        // }
        while(root!=null || !stack.isEmpty()){
            if(root !=null){
                stack.push(root);
                root = root.left;
                
            }
            else{
                TreeNode temp = stack.pop();
                list.add(temp.val);
                root = temp.right;
                
            }
        }
        return list;
    }
}