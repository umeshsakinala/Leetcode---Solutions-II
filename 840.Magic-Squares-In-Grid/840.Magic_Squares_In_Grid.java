class Solution {
    int count = 0;
    public void isMagic(int[][] grid, int a, int b) {
        int rowsum[] = new int[3];
        int colsum[] = new int[3];
        boolean arr[] = new boolean[10];
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                rowsum[i] = rowsum[i] + grid[a+i][b+j];
                colsum[j] = colsum[j] + grid[a+i][b+j];
                if(grid[a+i][b+j] > 9 || grid[a+i][b+j] == 0 || arr[grid[a+i][b+j]] == true) {
                    return;
                }
                arr[grid[a+i][b+j]] = true;
            }
        }
        for(int i=1; i<3; i++) {
            if(rowsum[i] != rowsum[i-1] || rowsum[i] != colsum[i] || colsum[i] != colsum[i-1]) return ;
        }
        int diagonal = grid[a][b] + grid[a+1][b+1] + grid[a+2][b+2];
        if(diagonal != (grid[a][b+2] + grid[a+1][b+1] + grid[a+2][b]) || diagonal != rowsum[0]) return ;
        count++;
    }
    public int numMagicSquaresInside(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        if(m < 3 || n < 3) return 0;
        else {
            for(int i=0; i<=m-3; i++) {
                for(int j=0; j<=n-3; j++) {
                    isMagic(grid, i , j);
                }
            }
        }
        return count;
    }
}