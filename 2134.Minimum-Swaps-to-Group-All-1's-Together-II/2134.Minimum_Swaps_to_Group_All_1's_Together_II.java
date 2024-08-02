class Solution {
    public int minSwaps(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int count = 0;
        for(int i=0; i<sum; i++) {
            count = count + nums[i];
        }
        int max = count;
        for(int i=sum; i<nums.length + sum; i++) {
            count = count + nums[i%nums.length] - nums[(i-sum+nums.length)%nums.length];
            max = Math.max(max, count);
        }
        return sum - max;
    }
}