class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points == null) return 0;
        int count = 1;
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int arrow = points[0][1];
        for(int i=0; i<points.length; i++) {
            if(arrow < points[i][0]) {
                count++;
                arrow = points[i][1];
            }
        }
        return count;
    }
}