class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int mod = (int)1e9+7;
        int N = n*(n+1)/2;
        int range[] = new int[N];
        int index = 0;
        for(int i=0; i<n; i++) {
            int sum = 0;
            for(int j=i; j<n; j++) {
                sum = sum + nums[j];
                range[index++] = sum;
            }
        } 
        Arrays.sort(range);
        int sum = 0;
        for(int i=left-1; i<=right-1; i++) {
            sum = (sum + range[i])%mod;
        }
        return sum;
    }
}