class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int a = 0;
        int b = 0;
        for(int i=0; i<nums.length; i++) {
            a = Math.max(a, nums[i]);
            b = b + (a-nums[i]);
            a++;
        }
        return b;
    }
}