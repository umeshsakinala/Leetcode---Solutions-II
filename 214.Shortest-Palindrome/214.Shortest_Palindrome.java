class Solution {
    public String shortestPalindrome(String s) {
        int n = s.length();
        String reverse = new StringBuilder(s).reverse().toString();
        for(int i=0; i<n; i++) {
            String temp = s.substring(0, n-i);
            if(temp.equals(reverse.substring(i))) {
                return new StringBuilder(reverse.substring(0, i)).append(s).toString();
            }
        }
        return new String();
    }
}