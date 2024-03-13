class Solution {
    public int pivotInteger(int n) {
        for(int i=1; i<=n; i++) {
            int a = i;
            int b = i;
            int a_sum = (a*(a+1)/2);
            int b_sum = (n*(n+1)/2) - a_sum + i;
            if(a_sum == b_sum) return i;
        }
        return -1;
    }
}