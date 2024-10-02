class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        TreeSet<Integer> set = new TreeSet<Integer>();
        int rank = 1;
        for(int i: arr) set.add(i);
        for(int i: set) {
            mp.put(i, rank++);
        }
        for(int i=0; i<arr.length; i++) {
            arr[i] = mp.get(arr[i]);
        }
        return arr;
    }
}