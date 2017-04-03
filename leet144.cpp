/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    vector<int> preorderTraversal(TreeNode* root) {
        vector<int> result;
        if (root == NULL) {
            return result;
        }
        else {
            TreeNode* temp = root;
            stack<TreeNode*> s;
            while(temp != NULL || !s.empty()) {
                if (temp != NULL) {
                    result.push_back(temp->val);
                    s.push(temp);
                    temp = temp->left;
                }
                else {
                    temp = s.top();
                    s.pop();
                    temp = temp->right;
                } 
            }
            return result;
        }
    }
};