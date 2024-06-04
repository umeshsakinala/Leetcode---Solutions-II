public class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> mp = new HashSet<>();
        int l = 0;
        for(char c : s.toCharArray()) {
            if(mp.contains(c)) {
                mp.remove(c);
                l += 2;
            }
            else {
                mp.add(c);
            }
        }
        if(mp.isEmpty() == false) l++;
        return l;
    }
} {
    
}
