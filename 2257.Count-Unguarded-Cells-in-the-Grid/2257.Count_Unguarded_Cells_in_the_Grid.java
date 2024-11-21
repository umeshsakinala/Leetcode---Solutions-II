class Pair {
    int first;
    int second;
    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int count = (m*n) - walls.length - guards.length;
        int[][] grid = new int[m][n];
        for(int[] wall : walls) {
            grid[wall[0]][wall[1]] = 2;
        }
        for(int[] guard : guards) {
            grid[guard[0]][guard[1]] = 1;
        }
        int[] xdir = {-1, 0, 1, 0};
        int[] ydir = {0, 1, 0, -1};
        for(int[] guard : guards) {
            int gx = guard[0];
            int gy = guard[1];
            for(int d = 0; d < 4; d++) {
                int x = gx;
                int y = gy;
                while(true) {
                    x += xdir[d];
                    y += ydir[d];
                    if(x < 0 || y < 0 || x >= m || y >= n) break;
                    if(grid[x][y] == 1 || grid[x][y] == 2) break;
                    if(grid[x][y] == 0) {
                        grid[x][y] = 3;
                        count--;
                    }
                }
            }
        }
        return count;
    }
}