class Solution {
    public int maxWidthRamp(int[] nums) {
        Stack<Integer> st = new Stack<Integer>();
        int max = 0;
        for(int i=0; i<nums.length; i++) {
            if(st.size() == 0 || nums[st.peek()] > nums[i]) st.push(i);
        }
        for(int i=nums.length-1; i>=0; i--) {
            while(st.size() > 0 && nums[st.peek()] <= nums[i]) {
                max = Math.max(max, i-st.peek());
                st.pop();
            }
        }
        return max;
    }
}