class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int ans = 0;
        int temp = 0;
        int left = 0;
        for(int i=0; i<s.length(); i++) {
            temp = temp + Math.abs(s.charAt(i) - t.charAt(i));
            while(temp > maxCost) {
                temp = temp - Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }
            ans = Math.max(ans, i-left+1);
        }
        return ans;
    }
}