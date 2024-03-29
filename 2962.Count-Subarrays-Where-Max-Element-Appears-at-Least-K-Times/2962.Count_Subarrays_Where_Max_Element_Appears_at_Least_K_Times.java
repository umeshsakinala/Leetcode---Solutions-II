class Solution {
    public long countSubarrays(int[] nums, int k) {
        int left = 0;
        int right = 0;
        long count = 0;
        int maxi = Arrays.stream(nums).max().getAsInt();
        while(right < nums.length) {
            if(nums[right] == maxi) {
                k--;
            }
            right++;
            while(k == 0) {
                if(nums[left] == maxi) {
                    k++;
                }
                left++;
            }
            count = count + left;
        }
        return count;
    }
}
