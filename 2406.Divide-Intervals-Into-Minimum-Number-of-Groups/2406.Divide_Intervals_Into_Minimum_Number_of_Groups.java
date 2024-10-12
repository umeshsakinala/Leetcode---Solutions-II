class Solution {
    public int minGroups(int[][] intervals) {
        TreeMap<Integer, Integer> mp = new TreeMap<>();
        for(int i[]: intervals) {
            mp.put(i[0], mp.getOrDefault(i[0], 0) + 1);
            mp.put(i[1]+1, mp.getOrDefault(i[1]+1, 0) - 1);
        }
        int interval = 0;
        int max = 0;
        for(Map.Entry<Integer, Integer> i: mp.entrySet()) {
            interval = interval + i.getValue();
            max = Math.max(max, interval);
        }
        return max;
    }
}