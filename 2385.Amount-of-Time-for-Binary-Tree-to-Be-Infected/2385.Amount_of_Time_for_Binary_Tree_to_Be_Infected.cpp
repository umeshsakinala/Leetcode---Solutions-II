/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int ans = 0;

    tuple<int, bool> explore(TreeNode* root, int start){
        if(root==NULL){
            return tuple<int, bool> {0, false};
        }
        tuple<int, bool> left = explore(root->left, start);
        tuple<int, bool> right = explore(root->right, start);
        if(root->val==start){
            ans = max(ans, max(get<0>(left), get<0>(right)));
            return tuple<int, bool> {0, true};
        }
        if(get<1>(left)){
            ans = max(ans, get<0>(left)+get<0>(right)+1);
            return tuple<int, bool> {get<0>(left)+1, true};
        }
        if(get<1>(right)){
            ans = max(ans, get<0>(left)+get<0>(right)+1);
            return tuple<int, bool> {get<0>(right)+1, true};
        }
        return tuple<int, bool> {max(get<0>(left), get<0>(right))+1, false};
    }

    int amountOfTime(TreeNode* root, int start) {
        explore(root, start);
        return ans;      
    }
};