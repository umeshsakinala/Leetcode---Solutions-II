class Solution {
    public int gridmoves(int grid[][], int dp[][], int i, int j) {
        if (i < 0 || i >= grid.length || j >= grid[0].length) return 0;
        if (dp[i][j] != -1) return dp[i][j];

        int ne = 0, e = 0, se = 0;
        if (i > 0 && j < grid[0].length - 1 && grid[i - 1][j + 1] > grid[i][j]) 
            ne = 1 + gridmoves(grid, dp, i - 1, j + 1);
        if (j < grid[0].length - 1 && grid[i][j + 1] > grid[i][j]) 
            e = 1 + gridmoves(grid, dp, i, j + 1);
        if (i < grid.length - 1 && j < grid[0].length - 1 && grid[i + 1][j + 1] > grid[i][j]) 
            se = 1 + gridmoves(grid, dp, i + 1, j + 1);

        dp[i][j] = Math.max(ne, Math.max(e, se));
        return dp[i][j];
    }

    public int maxMoves(int[][] grid) {
        int dp[][] = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            int moves = gridmoves(grid, dp, i, 0);
            count = Math.max(count, moves);
        }
        return count;
    }
}