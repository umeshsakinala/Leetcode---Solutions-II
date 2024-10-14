class Solution {
    public long maxKelements(int[] nums, int k) {
        long ans = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<nums.length; i++) {
            pq.add(nums[i]);
        }
        while(k-- > 0) {
            int max = pq.poll();
            ans = ans + max;
            pq.add((int)Math.ceil(max/3.0));
        }
        return ans;
    }
}