class Solution {
    public void Merge(int[] nums, int l, int mid, int r) {
        int m = mid-l+1;
        int n = r-mid;
        int left[] = new int[m];
        int right[] = new int[n];
        for(int i=0; i<m; i++) {
            left[i] = nums[l+i];
        }
        for(int i=0; i<n; i++) {
            right[i] = nums[mid+1+i];
        }
        int i=0;
        int j=0;
        int k=l;
        while(i < m && j < n) {
            if(left[i] <= right[j]) {
                nums[k++] = left[i++];
            }
            else {
                nums[k++] = right[j++];
            }
        }
        while(i < m) {
            nums[k++] = left[i++];
        }
        while(j < n) {
            nums[k++] = right[j++];
        }
    }
    public void Arraysort(int[] nums, int l, int r) {
        if(l < r) {
            int mid = l + (r-l)/2;
            Arraysort(nums, l, mid);
            Arraysort(nums, mid+1, r);
            Merge(nums, l, mid, r);
        }
    }
    public int[] sortArray(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        Arraysort(nums, l, r);
        return nums;
    }
}