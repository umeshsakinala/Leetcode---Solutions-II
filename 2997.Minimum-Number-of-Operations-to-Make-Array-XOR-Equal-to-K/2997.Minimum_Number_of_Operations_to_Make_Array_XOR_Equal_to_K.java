class Solution {
    public int minOperations(int[] nums, int k) {
        int count = 0;
        int K = k;
        for(int i=0; i<nums.length; i++) {
            K = K^nums[i];
        }
        while(K != 0) {
            count = count + (K&1);
            K = K >> 1;
        }
        return count;
    }
}