class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int rows[] = {0, 1, 0, -1};
        int cols[] = {1, 0, -1, 0};
        int x = 0;
        int y = 0;
        int dist = 0;
        int distance = 0;
        Set<String> set = new HashSet<String>();
        for(int i[]: obstacles) {
            set.add(i[0] + "," + i[1]);
        }
        for(int c: commands) {
            if(c == -1) dist = (dist+1)%4;
            else if(c == -2) dist = (dist+3)%4;
            else {
                for(int i=0; i<c; i++) {
                    int row = rows[dist] + x;
                    int col = cols[dist] + y;
                    if(set.contains(row + "," + col)) {
                        break;
                    }
                    x = row;
                    y = col;
                    distance = Math.max(distance, x*x+y*y);
                }
            }
        }
        return distance;
    }
}