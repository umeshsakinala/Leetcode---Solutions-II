class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int dir[][] = new int[][] {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int traversed[][] = new int[rows*cols][2];
        int index = 0;
        for(int a=1, b=0; index<rows*cols;) {
            for(int i=0; i<2; i++) {
                for(int j=0; j<a; j++) {
                    if(rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) {
                        traversed[index][0] = rStart;
                        traversed[index++][1] = cStart;
                    }
                    rStart = rStart + dir[b][0];
                    cStart = cStart + dir[b][1];
                }
                b = (b+1)%4;
            }
            a++;
        }
        return traversed;
    }
}