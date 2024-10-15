class Solution {
    public long minimumSteps(String s) {
        long count = 0;
        long zeroes = 0;
        for(int i=s.length()-1; i>=0; i--) {
            if(s.charAt(i) == '0') zeroes++;
            else count = count + zeroes;
        }
        return count;
    }
}