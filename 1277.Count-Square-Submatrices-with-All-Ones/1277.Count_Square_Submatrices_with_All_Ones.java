class Solution {
    public int count(int i, int j, int[][] matrix, int[][] dp) {
        if(i >= matrix.length || j >= matrix[0].length) return 0;
        if(matrix[i][j] == 0) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        int right = count(i, j+1, matrix, dp);
        int diagonal = count(i+1, j+1, matrix, dp);
        int down = count(i+1, j, matrix, dp);
        return dp[i][j] = 1 + Math.min(right, Math.min(diagonal, down));
    }
    public int countSquares(int[][] matrix) {
        int count = 0;
        int dp[][] = new int[matrix.length][matrix[0].length];
        for(int i=0; i<matrix.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                count = count + count(i, j, matrix, dp);
            }
        }
        return count;
    }
}