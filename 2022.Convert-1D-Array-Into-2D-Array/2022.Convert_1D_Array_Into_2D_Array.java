class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(original.length != m*n) return new int[][]{};
        int original2D[][] = new int[m][n];
        for(int i=0; i<m; i++) {
            original2D[i] = Arrays.copyOfRange(original, i*n, i*n+n);
        }
        return original2D;
    }
}