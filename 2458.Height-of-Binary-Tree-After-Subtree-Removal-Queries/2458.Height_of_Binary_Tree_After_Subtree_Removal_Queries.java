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
    static final int[] maxHeightAfterRemoval = new int[100001];
    int currentMaxHeight = 0;
    public int[] treeQueries(TreeNode root, int[] queries) {
        traverseLeftToRight(root, 0);
        currentMaxHeight = 0;
        traverseRightToLeft(root, 0);
        int queryCount = queries.length;
        int[] queryResults = new int[queryCount];
        for(int i = 0; i < queryCount; i++) {
            queryResults[i] = maxHeightAfterRemoval[queries[i]];
        }
        return queryResults;
    }
    public void traverseLeftToRight(TreeNode node, int currentHeight) {
        if(node == null) return;
        maxHeightAfterRemoval[node.val] = currentMaxHeight;
        currentMaxHeight = Math.max(currentMaxHeight, currentHeight);
        traverseLeftToRight(node.left, currentHeight + 1);
        traverseLeftToRight(node.right, currentHeight + 1);
    }

    public void traverseRightToLeft(TreeNode node, int currentHeight) {
        if(node == null) return;
        maxHeightAfterRemoval[node.val] = Math.max(
            maxHeightAfterRemoval[node.val],
            currentMaxHeight
        );
        currentMaxHeight = Math.max(currentHeight, currentMaxHeight);
        traverseRightToLeft(node.right, currentHeight + 1);
        traverseRightToLeft(node.left, currentHeight + 1);
    }
}