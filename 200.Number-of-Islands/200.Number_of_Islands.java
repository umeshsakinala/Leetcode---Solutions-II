class Solution {
    public void solve(int row, int col, char[][] grid, boolean[][] vis) {
        vis[row][col] = true;
        int up_down[] = {1, -1, 0, 0};
        int left_ri[] = {0, 0, -1, 1};
        for(int i=0; i<4; i++) {
            int temprow = up_down[i] + row;
            int tempcol = left_ri[i] + col;
            if(temprow >= 0 && temprow < grid.length && tempcol >= 0 && tempcol < grid[0].length && vis[temprow][tempcol] == false && grid[temprow][tempcol] == '1') {
                solve(temprow, tempcol, grid, vis);
            }
        }
    }
    public int numIslands(char[][] grid) {
        int count = 0;
        boolean[][] vis = new boolean[grid.length][grid[0].length];
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j] == '1' && vis[i][j] == false) {
                    solve(i, j, grid, vis);
                    count++;
                }
            }
        }
        return count;
    }
}