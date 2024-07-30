class Solution {
    public int minimumDeletions(String s) {
        int a = 0;
        int b = 0;
        int min = s.length();
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == 'a') {
                a++;
            }
        }
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == 'a') {
                a--;
            }
            min = Math.min(min, a+b);
            if(s.charAt(i) == 'b') {
                b++;
            }
        }
        return min;
    }
}