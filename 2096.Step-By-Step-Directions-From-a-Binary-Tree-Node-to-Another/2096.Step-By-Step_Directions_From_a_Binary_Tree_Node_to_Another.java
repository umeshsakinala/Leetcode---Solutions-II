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
    public boolean getAncestor(TreeNode root, int target, List<String> path) {
        if(root == null) return false;
        if(root.val == target) return true;
        path.add("L");
        if(getAncestor(root.left, target, path) == true) return true;
        path.remove(path.size()-1);
        path.add("R");
        if(getAncestor(root.right, target, path) == true) return true;
        path.remove(path.size()-1);
        return false;
    }
    public String getDirections(TreeNode root, int startValue, int destValue) {
        List<String> start = new ArrayList<String>();
        List<String> dest = new ArrayList<String>();
        getAncestor(root, startValue, start);
        getAncestor(root, destValue, dest);
        int common = 0;
        while(common < start.size() && common < dest.size() && start.get(common).equals(dest.get(common))) {
            common++;
        }
        List<String> res = new ArrayList<>();
        for(int i=0; i<start.size()-common; i++) {
            res.add("U");
        }
        res.addAll(dest.subList(common, dest.size()));
        return String.join("", res);
    }
}