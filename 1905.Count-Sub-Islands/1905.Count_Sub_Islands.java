class Pair {
    int first;
    int second;
    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public int isSubIsland(int i, int j, int grid1[][], int grid2[][], int visited[][]) {
        int m = grid1.length;
        int n = grid1[0].length;
        int subisland = 1;
        Queue<Pair> qu = new LinkedList<Pair>();
        qu.add(new Pair(i, j));
        visited[i][j] = 1;
        int rows[] = {-1, 0, 1, 0};
        int cols[] = {0, 1, 0, -1};
        while(qu.size() > 0) {
            Pair p = qu.poll();
            int x = p.first;
            int y = p.second;
            if(grid1[x][y] == 0) subisland = 0;
            for(int a=0; a<4; a++) {
                int row = x + rows[a];
                int col = y + cols[a];
                if(row >= 0 && row < m && col >= 0 && col < n && visited[row][col] == 0 && grid2[row][col] == 1) {
                    qu.add(new Pair(row, col));
                    visited[row][col] = 1;
                }
            }
        }
        return subisland;
    }
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int m = grid1.length;
        int n = grid1[0].length;
        int visited[][] = new int[m][n];
        int subislands = 0;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(visited[i][j] == 0 && grid2[i][j] == 1 && isSubIsland(i, j, grid1, grid2, visited) == 1) {
                    subislands++;
                }
            }
        }
        return subislands;
    }
}