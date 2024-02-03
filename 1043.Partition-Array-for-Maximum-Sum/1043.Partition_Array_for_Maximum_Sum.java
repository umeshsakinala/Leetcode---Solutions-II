class Solution {
    public int findMax(int index, int[] arr, int k, int[] nums)
    {
        int n = arr.length;
        if(index == n)
        {
            return 0;
        }
        if(nums[index] != -1)
        {
            return nums[index];
        }
        int length = 0;
        int maxAns = Integer.MIN_VALUE;
        int maxi = Integer.MIN_VALUE;
        for(int i=index; i<Math.min(n, index+k); i++)
        {
            length++;
            maxi = Math.max(maxi, arr[i]);
            int sum = length*maxi + findMax(i+1, arr, k, nums);
            maxAns = Math.max(maxAns, sum);
        }
        return nums[index] = maxAns;
    }
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        int[] nums = new int[n];
        Arrays.fill(nums, -1);
        return findMax(0, arr, k, nums);
    }
}