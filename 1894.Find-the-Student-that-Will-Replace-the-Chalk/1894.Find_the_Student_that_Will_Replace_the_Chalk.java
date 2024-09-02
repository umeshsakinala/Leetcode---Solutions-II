class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum = 0;
        for(int i: chalk) sum = sum + i;
        long K = (long)k;
        K = K%sum;
        // else if(k == 0) return k;
        int index = 0;
        for(int i=0; i<chalk.length; i++) {
            if(K < (long)chalk[i]) return i;
            K = K-chalk[i];
        }
        return -1;
        // while(k >= chalk[index]) {
        //     // if(k < chalk[index]) return index;
        //     k = k - chalk[index];
        //     index++;
        //     index = index%chalk.length;
        // }
        // return index;
    }
}