class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int count = 0;
        int maxOr = 0;
        for(int i=0; i<nums.length; i++) {
            maxOr = (maxOr | nums[i]);
        }
        // (1 << nums.length) is the total count of the subsets
        // Total subsets = 2^n - 1
        // here we are doing left shift for each loop such that it will end when it reaches
        // 2^n - 1
        for(int i=0; i<(1<<nums.length); i++) {
            int temp = 0;
            for(int j=0; j<nums.length; j++) {
                if((i&(1 << j)) != 0) {
                    temp = (temp | nums[j]);
                }
            }
            if(temp == maxOr) count++;
        }
        return count;
    }
}