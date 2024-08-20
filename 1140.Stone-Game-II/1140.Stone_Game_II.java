class Solution {
    public int stones(int dp[], int max, int i, int[][] memo) {
        if(i+2 * max >= dp.length) return dp[i];
        if(memo[i][max] > 0) return memo[i][max];
        int ans = Integer.MAX_VALUE;
        for(int a=1; a<=2*max; a++) {
            ans = Math.min(ans, stones(dp, Math.max(a, max), i+a, memo));
        }
        return memo[i][max] = dp[i]-ans;
    }
    public int stoneGameII(int[] piles) {
        int dp[] = piles;
        for(int i=dp.length-2; i>=0; i--) dp[i] = dp[i] + dp[i+1];
        return stones(dp, 1, 0, new int[piles.length][piles.length]);
    }
}