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
    public TreeNode deleteNodes(TreeNode root, int[] to_delete, List<TreeNode> tree) {
        if(root == null) return null;
        root.left = deleteNodes(root.left, to_delete, tree);
        root.right = deleteNodes(root.right, to_delete, tree);
        for(int i=0; i<to_delete.length; i++) {
            if(to_delete[i] == root.val) {
                if(root.left != null) tree.add(root.left);
                if(root.right != null) tree.add(root.right);
                return null;
            }
        }
        return root;
    }
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> tree = new ArrayList<TreeNode>();
        root = deleteNodes(root, to_delete, tree);
        if(root != null) tree.add(root);
        return tree;
    }
}