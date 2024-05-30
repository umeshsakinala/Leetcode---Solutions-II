class Solution {
    public int countTriplets(int[] arr) {
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            int temp = arr[i];
            for(int k=i+1; k<arr.length; k++) {
                temp = temp ^ arr[k];
                if(temp == 0) count = count + (k-i);
            }
        }
        return count;
    }
}