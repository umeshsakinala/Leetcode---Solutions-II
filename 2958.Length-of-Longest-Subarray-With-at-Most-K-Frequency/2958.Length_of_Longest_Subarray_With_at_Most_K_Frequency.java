class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int count = 0;
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        int i = 0;
        int j = 0;
        while(i < nums.length && j < nums.length) {
            mp.put(nums[j], mp.getOrDefault(nums[j], 0)+1);
            while(mp.get(nums[j]) > k) {
                mp.put(nums[i], mp.get(nums[i])-1);
                i++;
            }
            count = Math.max(count, j-i+1);
            j++;
        }
        return count;
    }
}