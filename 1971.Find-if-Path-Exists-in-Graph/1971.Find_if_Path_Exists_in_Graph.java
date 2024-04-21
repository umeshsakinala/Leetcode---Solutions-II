class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for(int edge[] : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.computeIfAbsent(u, k->new ArrayList<>()).add(v);
            graph.computeIfAbsent(v, k->new ArrayList<>()).add(u);
        }
        Set<Integer> visited = new HashSet<>();
        return isValid(source, destination, graph, visited);
    }
    public boolean isValid(int source, int destination, Map<Integer, List<Integer>> graph, Set<Integer> visited) {
        if(source == destination) return true;
        visited.add(source);
        for(int i:graph.getOrDefault(source, new ArrayList<>())) {
            if(visited.contains(i) == false) {
                if(isValid(i, destination, graph, visited)) return true;
            }
        }
        return false;
    }
}