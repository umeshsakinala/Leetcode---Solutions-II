class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        Arrays.sort(items, (a, b) -> Integer.compare(a[0], b[0]));
        int n = items.length;
        int[] maxBeautyUpToPrice = new int[n];
        maxBeautyUpToPrice[0] = items[0][1];
        for(int i = 1; i < n; i++) {
            maxBeautyUpToPrice[i] = Math.max(maxBeautyUpToPrice[i - 1], items[i][1]);
        }
        int[] ans = new int[queries.length];
        for(int i = 0; i < queries.length; i++) {
            int budget = queries[i];
            int left = 0, right = n - 1, index = -1;
            while(left <= right) {
                int mid = left + (right - left) / 2;
                if(items[mid][0] <= budget) {
                    index = mid;
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }
            ans[i] = (index == -1) ? 0 : maxBeautyUpToPrice[index];
        }        
        return ans;
    }
}