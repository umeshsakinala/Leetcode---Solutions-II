class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();
        li.add(new ArrayList<>());
        for(int i=0; i<nums.length; i++) {
            int temp =  li.size();
            for(int j=0; j<temp; j++) {
                List<Integer> subset = new ArrayList<Integer>(li.get(j));
                subset.add(nums[i]);
                li.add(subset);
            }
        }
        return li;
    }
}