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
    public void dfs(TreeNode root, StringBuilder path, List<String> distances) {
        if(root.left == null && root.right == null) {
            distances.add(path.toString());
            return ;
        }
        if(root.left != null) {
            dfs(root.left, path.append("L"), distances);
            path.deleteCharAt(path.length()-1);
        }
        if(root.right != null) {
            dfs(root.right, path.append("R"), distances);
            path.deleteCharAt(path.length()-1);
        }
    }
    public int countPairs(TreeNode root, int distance) {
        List<String> distances = new ArrayList<String>();
        StringBuilder path = new StringBuilder();
        dfs(root, path, distances);
        int count = 0;
        int n = distances.size();
        for(int i=0; i<n-1; i++) {
            for(int j=i+1; j<n; j++) {
                int pre = 0;
                for(int k=0; k<Math.min(distances.get(i).length(), distances.get(j).length()); k++) {
                    if(distances.get(i).charAt(k) != distances.get(j).charAt(k)) break;
                    pre++;
                }
                if(distances.get(i).length() + distances.get(j).length() - pre*2 <= distance) {
                    count++;
                }
            }
        }
        return count;
    }
}