class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i : nums) {
            set.add(i);
        }
        int i = 1;
        int n = nums.length;
        while(i <= n) {
            if(set.contains(i)) {
                i++;
            }
            else return i;
        }
        return nums.length + 1;
    }
}