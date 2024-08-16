class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int max = arrays.get(0).get(arrays.get(0).size()-1);
        int min = arrays.get(0).get(0);
        int distance = 0;
        for(int i=1; i<arrays.size(); i++) {
            int m = arrays.get(i).get(arrays.get(i).size()-1);
            int n = arrays.get(i).get(0);
            distance = Math.max(distance, Math.abs(m-min));
            distance = Math.max(distance, Math.abs(n-max));
            max = Math.max(m, max);
            min = Math.min(n, min);
        }
        return distance;
    }
}