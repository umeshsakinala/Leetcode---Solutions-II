class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while(k-- > 0) {
            int min = nums[0];
            for(int i=0; i<nums.length; i++) {
                min = Math.min(min, nums[i]);
            }
            for(int i=0; i<nums.length; i++) {
                if(nums[i] == min) {
                    nums[i] = nums[i]*multiplier;
                    break;
                }
                
            }
        }
        return nums;
    }
}