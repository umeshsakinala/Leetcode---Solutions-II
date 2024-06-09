class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        mp.put(0, 1);
        for(int i=0; i<nums.length; i++) {
            sum = sum + nums[i];
            int rem = (sum%k + k)%k;
            if(mp.containsKey(rem)) {
                count = count + mp.get(rem);
            }
            mp.put(rem, mp.getOrDefault(rem, 0) + 1);
        }
        return count;
    }
}