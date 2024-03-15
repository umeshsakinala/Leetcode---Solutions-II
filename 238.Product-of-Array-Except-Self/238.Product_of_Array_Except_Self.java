class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int flag = 0;
        int z_count = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != 0) product = product * nums[i];
            else {
                z_count++;
                flag = 1;
            }
        }
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0 && z_count == 1) {
                nums[i] = product;
            }
            else if(nums[i] == 0 && z_count > 1) {
                nums[i] = 0;
            }
            else if(nums[i] != 0 && flag != 1) {
                nums[i] = product/nums[i];
            }
            else if(nums[i] != 0 && flag == 1) {
                nums[i] = 0;
            }
        }
        return nums;
    }
}