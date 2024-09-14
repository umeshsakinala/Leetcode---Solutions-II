class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0;
        for(int i=0; i<nums.length; i++) {
            max = Math.max(nums[i], max);
        }
        int count = 0;
        int maxcount = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == max) {
                count++;
            }
            else {
                maxcount = Math.max(maxcount, count);
                count = 0;
            }
        }
        maxcount = Math.max(maxcount, count);
        return maxcount;
    }
}