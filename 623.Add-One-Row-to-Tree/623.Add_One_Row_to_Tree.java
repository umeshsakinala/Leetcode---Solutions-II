/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1) {
            TreeNode ptr = new TreeNode(val, root, null);
            return ptr;
        }
        addRow(root, val, depth-1);
        return root;
    }
    void addRow(TreeNode parent, int val, int depth) {
        if(parent == null) return ;
        if(depth == 1) {
            TreeNode temp = parent.left;
            parent.left = new TreeNode(val);
            parent.left.left = temp;
            temp = parent.right;
            parent.right = new TreeNode(val);
            parent.right.right = temp;
        }
        else {
            addRow(parent.left, val, depth-1);
            addRow(parent.right, val, depth-1);
        }
    }
}