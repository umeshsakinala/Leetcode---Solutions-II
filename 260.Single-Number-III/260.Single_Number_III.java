class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for(int i: nums) {
            int value = 0;
            if(mp.containsKey(i)) {
                value = mp.get(i);
            }
            value++;
            mp.put(i, value);
        }
        int arr[] = new int[2];
        int j = 0;
        for(Map.Entry<Integer, Integer> i : mp.entrySet()) {
            if(i.getValue() == 1) {
                arr[j] = i.getKey();
                j++;
            }
            if(j == 2) break;
        }
        return arr;
    }
}