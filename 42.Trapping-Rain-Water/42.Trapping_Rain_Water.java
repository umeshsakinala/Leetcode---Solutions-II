class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length-1;
        int iMax = Integer.MIN_VALUE;
        int jMax = Integer.MIN_VALUE;
        int maxTrap = 0;
        while(left <= right) {
            iMax = Math.max(iMax, height[left]);
            jMax = Math.max(jMax, height[right]);
            if(iMax < jMax) {
                maxTrap = maxTrap + iMax-height[left];
                left++;
            }
            else {
                maxTrap = maxTrap + jMax-height[right];
                right--;
            }
        }
        return maxTrap;
    }
}