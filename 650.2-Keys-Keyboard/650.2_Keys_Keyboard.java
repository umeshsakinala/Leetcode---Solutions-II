class Solution {
    public int minimum(int a, int b, int n) {
        if(a == n) return 0;
        if(a > n) return 1000;
        int x = 2 + minimum(a*2, a, n);
        int y = 1 + minimum(a+b, b, n);
        return Math.min(x, y);
    }
    public int minSteps(int n) {
        if(n == 1) return 0;
        return 1 + minimum(1, 1, n);
    }
}