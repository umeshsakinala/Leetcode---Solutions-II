class Solution {
    public int findKthNumber(int n, int k) {
        int num = 1;
        k--;
        while(k > 0) {
            long count = getCount(num, n); 
            if(count <= k) {
                k -= count;
                num++;
            }
            else {
                num *= 10;
                k--;
            }
        }
        return num;
    }
    public long getCount(long prefix, int n) {
        long current = prefix;
        long next = prefix + 1;
        long count = 0;
        while(current <= n) {
            count += Math.min(n + 1, next) - current;
            current *= 10;
            next *= 10;
        }
        return count;
    }
}
