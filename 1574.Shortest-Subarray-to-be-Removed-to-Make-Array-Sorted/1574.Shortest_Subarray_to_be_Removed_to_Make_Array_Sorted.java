class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int first = 0;
        int last = arr.length-1;
        while(last > 0 && arr[last] >= arr[last-1]) last--;
        int ans = last;
        while(first < last && (first == 0 || arr[first-1] <= arr[first])) {
            while(last < arr.length && arr[first] > arr[last]) last++;
            ans = Math.min(ans, last-first-1);
            first++;
        }
        return ans;
    }
}