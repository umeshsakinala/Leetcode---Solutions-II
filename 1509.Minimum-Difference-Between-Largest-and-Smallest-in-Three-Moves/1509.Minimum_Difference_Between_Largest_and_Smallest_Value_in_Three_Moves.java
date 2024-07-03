class Solution {
    public int minDifference(int[] nums) {
        if(nums.length <= 4) return 0;
        Arrays.sort(nums);
        int n = nums.length-3;
        int ans = nums[nums.length-1] - nums[0];
        for(int i=n-1; i<nums.length; i++) {
            ans = Math.min(ans, nums[i] - nums[i-n+1]);
        }
        return ans;
    }
}