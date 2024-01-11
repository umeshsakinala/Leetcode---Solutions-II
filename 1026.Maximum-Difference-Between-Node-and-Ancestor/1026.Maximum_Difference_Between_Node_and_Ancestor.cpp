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
void difference(TreeNode* root, int Max, int Min, int &diff)
{
    if(!root)
    {
        return;
    }
    if(Max != INT_MIN)
    {
        diff = max(diff, abs(Max-root->val));
    }
    if(Min != INT_MAX)
    {
        diff = max(diff, abs(root->val-Min));
    }
    Max = max(Max, root->val);
    Min = min(Min, root->val);
    difference(root->left, Max, Min, diff);
    difference(root->right, Max, Min, diff);
}
    int maxAncestorDiff(TreeNode* root) {
        int diff = 0;
        int Max = INT_MIN;
        int Min = INT_MAX;
        difference(root, Max, Min, diff);
        return diff;
    }
};