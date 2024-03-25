class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ll = new ArrayList<Integer>();
        Stack<Integer> st = new Stack<Integer>();
        Arrays.sort(nums);
        st.add(nums[0]);
        for(int i=1; i<nums.length; i++) {
            if(st.peek() == nums[i]) {
                ll.add(nums[i]);
                continue;
            }
            else {
                st.pop();
                st.add(nums[i]);
            }
        }
        return ll;
    }
}