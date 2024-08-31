class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++) {
            int second = target-nums[i];
            if(mp.containsKey(second)) return new int[] {mp.get(second), i};
            mp.put(nums[i], i);
        }
        return new int[]{};
    }
}