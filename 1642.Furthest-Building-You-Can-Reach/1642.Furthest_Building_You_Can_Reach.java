class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((height_1, height_2) -> height_2 - height_1);
        int i = 0;
        for(i=0; i < heights.length-1; i++) {
            if(heights[i+1] - heights[i] <= 0) {
                continue;
            }
            bricks = bricks - (heights[i+1] - heights[i]);
            pq.offer(heights[i+1] - heights[i]);
            if(bricks < 0) {
                bricks = bricks + pq.poll();
                ladders--;
            }
            if(ladders < 0) {
                break;
            }
        }
        return i;
    }
}