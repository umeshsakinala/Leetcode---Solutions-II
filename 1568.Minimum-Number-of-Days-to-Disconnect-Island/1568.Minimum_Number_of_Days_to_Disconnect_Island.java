class Solution {
    int rows[] = {-1, 0, 1, 0};
    int cols[] = {0, 1, 0, -1};
    public void explore(int[][] grid, int row, int col, int[][] visited) {
        visited[row][col] = 1;
        for(int i=0; i<4; i++) {
            int newrow = row + rows[i];
            int newcol = col + cols[i];
            if(newrow >= 0 && newcol >= 0 && newrow < grid.length && newcol < grid[0].length && grid[newrow][newcol] == 1 && visited[newrow][newcol] == 0) {
                explore(grid, newrow, newcol, visited);
            }
        }
    }
    public int countIslands(int[][] grid, int m, int n) {
        int visited[][] = new int[m][n];
        int count = 0;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(visited[i][j] == 0 && grid[i][j] == 1) {
                    explore(grid, i, j, visited);
                    count++;
                }
            }
        }
        return count;
    }
    public int minDays(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int lands = countIslands(grid, m, n);
        if(lands != 1) return 0;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(grid[i][j] == 0) continue;
                grid[i][j] = 0;
                int land = countIslands(grid, m, n);
                if(land != 1) return 1;
                grid[i][j] = 1;
            }
        }
        return 2;
    }
}