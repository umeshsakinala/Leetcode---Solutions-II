class Solution {
    public int[][] largestLocal(int[][] grid) {
        int res[][] = new int[grid.length-2][grid.length-2];
        int a = 0;
        int b = 0;
        for(int i=0; i<grid.length-2; i++) {
            for(int j=0; j<grid[0].length-2; j++) {
                int maxi = grid[i][j];
                for(int k=i; k<i+3; k++) {
                    for(int l=j; l<j+3; l++) {
                        maxi = Math.max(maxi, grid[k][l]);
                    }
                }
                res[i][j] = maxi;
            }
        }
        return res;
    }
}