class Solution {
    public int matrixScore(int[][] grid) {
        int count = (1 << (grid[0].length - 1)) * grid.length;
        for(int i=1; i<grid[0].length; i++) {
            int value = (1 << (grid[0].length - 1 - i));
            int set = 0;
            for(int j=0; j<grid.length; j++) {
                if(grid[j][i] == grid[j][0]) set++;
            }
            count = count + Math.max(set, grid.length - set) * value;
        }
        return count;
    }
}