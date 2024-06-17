class Solution {
    public boolean judgeSquareSum(int c) {
        for(long i = 0; i*i <= c; i++) {
            double temp = Math.sqrt(c - i*i);
            if(temp == (int)temp) return true;
        }
        return false;
    }
}