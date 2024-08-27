class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        double dist[] = new double[n];
        dist[start_node] = 1.0;
        for(int i=0; i<n-1; i++) {
            int temp = 0;
            for(int j=0; j<edges.length; j++) {
                int u = edges[j][0];
                int v = edges[j][1];
                double prob = succProb[j];
                if(dist[u]*prob > dist[v]) {
                    dist[v] = dist[u]*prob;
                    temp = 1;
                }
                if(dist[v]*prob > dist[u]) {
                    dist[u] = dist[v]*prob;
                    temp = 1;
                }
            }
            if(temp == 0) break;
        }
        return dist[end_node];
    }
}