/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public void postorder(List<Integer> li, Node root) {
        if(root == null) return ;
        for(int i=0; i<root.children.size(); i++) {
            postorder(li, root.children.get(i));
        }
        li.add(root.val);
    }
    public List<Integer> postorder(Node root) {
        List<Integer> li = new ArrayList<Integer>();
        postorder(li, root);
        return li;
    }
}