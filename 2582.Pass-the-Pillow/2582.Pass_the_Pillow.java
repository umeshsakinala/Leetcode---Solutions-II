class Solution {
    public int passThePillow(int n, int time) {
        int part = time/(n-1);
        if(part%2 == 0) {
            return (time%(n-1) + 1);
        }
        else {
            return n - time%(n-1);
        }
    }
}