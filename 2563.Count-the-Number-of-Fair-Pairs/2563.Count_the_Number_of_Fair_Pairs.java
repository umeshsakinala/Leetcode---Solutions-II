class Solution {
    public long fairpairs(int[] nums, int num) {
        int left = 0;
        int right = nums.length - 1;
        long answer = 0;
        while(left <= right) {
            int sum = nums[left] + nums[right];
            if(sum < num) {
                answer = answer + (right-left);
                left++;
            }
            else right--;
        }
        return answer;
    }
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long ans = fairpairs(nums, upper+1) - fairpairs(nums, lower);
        return ans;
    }
}