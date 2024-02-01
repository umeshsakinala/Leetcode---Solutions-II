class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int index = 0;
        int ans[][] = new int[nums.length/3][3];
        Arrays.sort(nums);
        for(int i=0; i<ans.length; i++)
        {
            for(int j=0; j<3; j++)
            {
                ans[i][j] = nums[index];
                index++;
            }
            if(ans[i][2] - ans[i][0] > k)
            {
                return new int[0][0];
            }
        }
        return ans;
    }
}