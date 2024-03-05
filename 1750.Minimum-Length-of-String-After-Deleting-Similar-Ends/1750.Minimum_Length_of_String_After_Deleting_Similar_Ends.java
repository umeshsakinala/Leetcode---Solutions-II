class Solution {
    public int minimumLength(String s) {
        int n = s.length();
        int left = 0;
        int right = n-1;
        for(; left < right && s.charAt(left) == s.charAt(right); left++, right--) {
            while(s.charAt(left) == s.charAt(left+1) && left+1 < right) {
                left++;
            }
            while(s.charAt(left) == s.charAt(right-1) && left < right-1) {
                right--;
            }
        }
        return right - left + 1;
    }
}