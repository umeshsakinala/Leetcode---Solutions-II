class Solution {
    public void sortColors(int[] nums) {
        int red = 0;
        int white = 0;
        int blue = 0;
        for(int i=0; i<nums.length; i++) {
            switch(nums[i]) {
                case 0:
                    red++;
                    break;
                case 1:
                    white++;
                    break;
                case 2:
                    blue++;
                    break;
            }
        }
        int i=0;
        while(red-- > 0) {
            nums[i] = 0;
            i++;
        }
        while(white-- > 0) {
            nums[i] = 1;
            i++;
        }
        while(blue-- > 0) {
            nums[i] = 2;
            i++;
        }
    }
}