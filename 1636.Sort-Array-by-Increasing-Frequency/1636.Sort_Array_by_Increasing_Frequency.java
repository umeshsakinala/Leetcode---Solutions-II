class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        Integer li[] = new Integer[nums.length];
        int a = 0;
        for(int i: nums) {
            mp.put(i, mp.getOrDefault(i, 0) + 1);
            li[a++] = i;
        }
        Arrays.sort(li, (x, y) -> {
            if(mp.get(x).equals(mp.get(y))) {
                return Integer.compare(y, x);
            }
            return Integer.compare(mp.get(x), mp.get(y));
        });
        a = 0;
        for(int i: li) {
            nums[a++] = i;
        }
        return nums;
    }
}