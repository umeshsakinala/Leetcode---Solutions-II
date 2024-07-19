class Solution {
    public boolean isLucky(int[][] matrix, int i, int j, int n, int m) {
        boolean row = false;
        boolean col = false;
        int ele = matrix[i][j];
        for(int a=0; a<m; a++) {
            if(matrix[i][a] < ele) return false;
            else row = true;
        }
        for(int b=0; b<n; b++) {
            if(matrix[b][j] > ele) return false;
            else col = true;
        }
        return row&&col;
    }
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> li = new ArrayList<Integer>();
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(isLucky(matrix, i, j, n, m) == true) li.add(matrix[i][j]);
            }
        }
        return li;
    }
}