class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            Comparator.comparingInt(a -> a[0])
        );
        int max = Integer.MIN_VALUE;
        int left = 0;
        int right = Integer.MAX_VALUE;
        for(int i=0; i<nums.size(); i++) {
            pq.add(new int[]{nums.get(i).get(0), i, 0});
            max = Math.max(max, nums.get(i).get(0));
        }
        while(pq.size() == nums.size()) {
            int data[] = pq.poll();
            int min = data[0];
            int i = data[1];
            int j = data[2];
            if(max - min < right - left) {
                left = min;
                right = max;
            }
            if(j+1 < nums.get(i).size()) {
                int next = nums.get(i).get(j+1);
                pq.add(new int[]{next, i, j+1});
                max = Math.max(max, next);
            }
        }
        return new int[]{left, right};
    }
}