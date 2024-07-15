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
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer, TreeNode> map = new HashMap<>();
        HashSet<Integer> children = new HashSet<>();
        for(int[] i : descriptions) {
            int parent = i[0];
            int child = i[1];
            int isLeft = i[2];
            if(map.containsKey(parent) == false) {
                map.put(parent, new TreeNode(parent));
            }
            if(map.containsKey(child) == false) {
                map.put(child, new TreeNode(child));
            }
            if(isLeft == 1) map.get(parent).left = map.get(child);
            else map.get(parent).right = map.get(child);
            children.add(child);
        }
        for(TreeNode i : map.values()) {
            if(children.contains(i.val) == false) return i;
        }
        return null;
    }
}