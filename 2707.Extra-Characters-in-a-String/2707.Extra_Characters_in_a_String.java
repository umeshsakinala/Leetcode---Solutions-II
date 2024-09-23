class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        int dp[] = new int[s.length()+1];
        for(int i=0; i<=s.length(); i++) {
            dp[i] = i;
        }
        Set<String> set = new HashSet<>();
        for(String word: dictionary) {
            set.add(word);
        }
        for(int i=1; i<=s.length(); i++) {
            for(int j=0; j<i; j++) {
                String temp = s.substring(j, i);
                if(set.contains(temp)) {
                    dp[i] = Math.min(dp[i], dp[j]);
                }
            }
            dp[i] = Math.min(dp[i], dp[i-1]+1);
        }
        return dp[s.length()];
    }
}