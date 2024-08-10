class Pair {
    int row;
    int col;
    Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }
}
class Solution {
    public int regionsBySlashes(String[] grid) {
        int n = grid.length;
        int newgrid[][] = new int[n*3][n*3];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                int row = i*3;
                int col = j*3;
                if(grid[i].charAt(j) == '\\') {
                    newgrid[row][col] = 1;
                    newgrid[row+1][col+1] = 1;
                    newgrid[row+2][col+2] = 1;
                }
                else if(grid[i].charAt(j) == '/') {
                    newgrid[row][col+2] = 1;
                    newgrid[row+1][col+1] = 1;
                    newgrid[row+2][col] = 1;
                }
            }
        }
        int regions = 0;
        int rows[] = {-1, 0, 1, 0};
        int cols[] = {0, 1, 0, -1};
        for(int i=0; i<n*3; i++) {
            for(int j=0; j<n*3; j++) {
                if(newgrid[i][j] == 0) {
                    Queue<Pair> qu = new LinkedList<Pair>();
                    newgrid[i][j] = 1;
                    qu.add(new Pair(i, j));
                    while(qu.size() > 0) {
                        Pair p = qu.poll();
                        int row = p.row;
                        int col = p.col;
                        for(int k=0; k<4; k++) {
                            int newrow = rows[k] + row;
                            int newcol = cols[k] + col;
                            if(newrow >= 0 && newrow < newgrid.length && newcol >= 0 && newcol < newgrid.length && newgrid[newrow][newcol] == 0) {
                                newgrid[newrow][newcol] = 1;
                                qu.add(new Pair(newrow, newcol));
                            }
                        }
                    }
                    regions++;
                }
            }
        }
        return regions;
    }
}