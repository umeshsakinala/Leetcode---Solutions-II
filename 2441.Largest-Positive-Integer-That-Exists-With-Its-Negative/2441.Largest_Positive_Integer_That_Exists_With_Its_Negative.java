class Solution {
    public boolean search(int[] nums, int target) {
        int p = 0;
        int q = nums.length-1;
        while(p <= q) {
            int mid = p + (q-p)/2;
            if(nums[mid] == target) return true;
            if(target > nums[p]) p++;
            else q--;
        }
        return false;
    }
    public int findMaxK(int[] nums) {
        int ans = -1;
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++) {
            if(search(nums, -nums[i]) == true) {
                ans = Math.abs(nums[i]);
                break;
            }
        }
        return ans;
    }
}