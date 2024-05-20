class Solution {
    public int subsetXORSum(int[] nums) {
        int sum = 0;
        for(int i=1; i<(1 << nums.length); i++) {
            int tempsum = 0;
            for(int j=0; j<nums.length; j++) {
                if((i & (1 << j)) != 0) {
                    tempsum = tempsum ^ nums[j];
                }
            }
            sum = sum + tempsum;
        }
        return sum;
    }
}