class Solution {
    public long maxPoints(int[][] points) {
        int n = points[0].length;
        long prev[] = new long[n];
        for(int i=0; i<n; i++) {
            prev[i] = points[0][i];
        }
        for(int i=0; i<points.length-1; i++) {
            long a[] = new long[n];
            long b[] = new long[n];
            long c[] = new long[n];
            a[0] = prev[0];
            for(int j=1; j<n; j++) {
                a[j] = Math.max(a[j-1]-1, prev[j]);
            }
            b[n-1] = prev[n-1];
            for(int j=n-2; j>=0; j--) {
                b[j] = Math.max(b[j+1]-1, prev[j]);
            }
            for(int j=0; j<n; j++) {
                c[j] = points[i+1][j] + Math.max(a[j], b[j]);
            }
            prev = c;
        }
        long max = 0;
        for(int i=0; i<n; i++) {
            max = Math.max(max, prev[i]);
        }
        return max;
    }
}