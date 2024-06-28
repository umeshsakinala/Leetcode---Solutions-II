class Solution {
    public long maximumImportance(int n, int[][] roads) {
        int degree[] = new int[n];
        for(int i[]: roads) {
            degree[i[0]]++;
            degree[i[1]]++;
        }
        Integer cities[] = new Integer[n];
        for(int i=0; i<n; i++) cities[i] = i;
        Arrays.sort(cities, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return Integer.compare(degree[b], degree[a]);
            }
        });
        long total = 0;
        for(int i=0; i<n; i++) {
            total = total + (long) (n-i)*degree[cities[i]];
        }
        return total;
    }
}