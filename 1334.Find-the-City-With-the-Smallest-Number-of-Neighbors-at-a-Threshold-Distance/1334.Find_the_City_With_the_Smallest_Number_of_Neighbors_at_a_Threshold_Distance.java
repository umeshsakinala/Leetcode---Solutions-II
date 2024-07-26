class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int adj[][] = new int[n][n];
        for(int i=0; i<n; i++) {
            Arrays.fill(adj[i], (int)1e9);
        }
        for(int i=0; i<edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            int w = edges[i][2];
            adj[u][v] = w;
            adj[v][u] = w;
        }
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                for(int k=0; k<n; k++) {
                    if(j == k) {
                        adj[j][k] = 0;
                    }
                    else {
                        adj[j][k] = Math.min(adj[j][k], adj[j][i] + adj[i][k]);
                    }
                }
            }
        }
        int ans = Integer.MAX_VALUE;
        int city = 0;
        for(int i=0; i<adj.length; i++) {
            int flag = 0;
            for(int j=0; j<adj.length; j++) {
                if(adj[i][j] <= distanceThreshold) {
                    flag++;
                }
            }
            if(flag <= ans) {
                ans = flag;
                city = i;
            }
        }
        return city;
    }
}