class Disjoint {
    List<Integer> parent = new ArrayList<Integer>();
    List<Integer> rank = new ArrayList<Integer>();
    Disjoint(int n) {
        for(int i=0; i<=n; i++) {
            parent.add(i);
            rank.add(0);
        }
    }
    public int findParent(int node) {
        if(node == parent.get(node)) return node;
        else {
            int x = findParent(parent.get(node));
            // parent.set(node, x);
            return x;
            // return parent.get(node);
        }
    }
    public void Union(int u, int v) {
        int x = findParent(u);
        int y = findParent(v);
        if(x == y) return ;
        if(rank.get(x) > rank.get(y)) {
            parent.set(y, x);
        }
        else if(rank.get(y) > rank.get(x)) {
            parent.set(x, y);
        }
        else {
            parent.set(y, x);
            int newrank = rank.get(x);
            rank.set(x, newrank+1);
        }
    }
}
class Solution {
    public int removeStones(int[][] stones) {
        List<Integer> li = new ArrayList<Integer>();
        int maxrow = 0;
        int maxcol = 0;
        for(int i=0; i<stones.length; i++) {
            maxrow = Math.max(maxrow, stones[i][0]);
            maxcol = Math.max(maxcol, stones[i][1]);
        }
        Disjoint ds = new Disjoint(maxrow + maxcol + 1);
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for(int i=0; i<stones.length; i++) {
            int rownode = stones[i][0];
            int colnode = stones[i][1] + maxrow + 1;
            ds.Union(rownode, colnode);
            mp.put(rownode, 1);
            mp.put(colnode, 1);
        }
        int count = 0;
        for(Map.Entry<Integer, Integer> it : mp.entrySet()) {
            if (ds.findParent(it.getKey()) == it.getKey()) {
                count++;
            }
        }
        return stones.length - count;
    }
}