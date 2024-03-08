class Solution {
    public int maxFrequencyElements(int[] nums) {
        int count = 0;
        int maxFrequency = 0;
        int n = nums[nums.length-1];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(int i : map.values()) {
            maxFrequency = Math.max(i, maxFrequency);
        }
        for(int i : map.values()) {
            if(i == maxFrequency) count = count+maxFrequency;
        }
        return count;
    }
}