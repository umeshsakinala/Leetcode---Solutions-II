class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] answer = new int[nums.length];
        int pos = 0;
        int neg = 1;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] < 0) {
                answer[neg] = nums[i];
                neg = neg + 2;
            }
            if(nums[i] >= 0) {
                answer[pos] = nums[i];
                pos = pos + 2;
            }
        }
        return answer;
    }
}