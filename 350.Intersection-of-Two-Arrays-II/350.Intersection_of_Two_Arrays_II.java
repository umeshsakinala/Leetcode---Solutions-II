class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int nums[] = new int[1001];
        int arr[] = new int[1001];
        for(int i : nums1) {
            arr[i]++;
        }
        int count = 0;
        for(int i=0; i<nums2.length; i++) {
            if(arr[nums2[i]] > 0) {
                nums[count++] = nums2[i];
                arr[nums2[i]]--;
            }
        }
        return Arrays.copyOfRange(nums, 0, count);
    }
}