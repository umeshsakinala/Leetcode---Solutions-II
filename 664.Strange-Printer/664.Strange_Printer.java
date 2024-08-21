class Solution {
    public int printer(int i, int j, int dp[][], char letters[]) {
        if(i > j) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        int first = letters[i];
        int answer = 1 + printer(i+1, j, dp, letters);
        for(int k=i+1; k<=j; k++) {
            if(letters[k] == first) {
                int min = printer(i, k-1, dp, letters) + printer(k+1, j, dp, letters);
                answer = Math.min(answer, min);
            }
        }
        return dp[i][j] = answer;
    }
    public int strangePrinter(String s) {
        char letters[] = s.toCharArray();
        int dp[][] = new int[s.length()][s.length()];
        for(int i=0; i<s.length(); i++) {
            Arrays.fill(dp[i], -1);
        }
        return printer(0, s.length()-1, dp, letters);
    }
}