class Solution {
    public int longestIdealString(String s, int k) {
        int dp[] = new int[27];
        for(int i=s.length()-1; i>=0; i--) {
            char cc = s.charAt(i);
            int index = cc-'a';
            int max = Integer.MIN_VALUE;
            int left = Math.max((index-k), 0);
            int right = Math.min((index+k), 26);
            for(int j=left; j<=right; j++) {
                max = Math.max(max, dp[j]);
            }
            dp[index] = max+1;
        }
        int max = Integer.MIN_VALUE;
        for(int i: dp) {
            max = Math.max(i, max);
        }
        return max;
    }
}