class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int[] ans = new int[nums.length];
        int[] XOR = new int[nums.length];
        XOR[0] = nums[0];
        for(int i = 1; i < nums.length; i++) {
            XOR[i] = XOR[i - 1] ^ nums[i];
        }
        int mask = (1 << maximumBit) - 1;
        for(int i = 0; i < nums.length; i++) {
            int currentXOR = XOR[XOR.length - 1 - i];
            ans[i] = currentXOR ^ mask;
        }
        return ans;
    }
}