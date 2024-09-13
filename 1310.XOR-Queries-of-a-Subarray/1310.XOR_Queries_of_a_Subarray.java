class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int xor_hash[] = new int[arr.length];
        xor_hash[0] = arr[0];
        for(int i=1; i<arr.length; i++) {
            xor_hash[i] = xor_hash[i-1]^arr[i];
        }
        int ans[] = new int[queries.length];
        int index = 0;
        for(int i[]: queries) {
            int a = i[0];
            int b = i[1];
            if(a == 0) ans[index++] = xor_hash[b];
            else ans[index++] = xor_hash[a-1]^xor_hash[b];
        }
        return ans;
    }
}