class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        int target[] = times[targetFriend];
        Arrays.sort(times, (a, b) -> Integer.compare(a[0], b[0]));
        int chair[] = new int[times.length];
        for(int i[]: times) {
            for(int j=0; j<times.length; j++) {
                if(chair[j] <= i[0]) {
                    chair[j] = i[1];
                    if(Arrays.equals(i, target)) return j;
                    break;
                }
            }
        }
        return 0;
    }
}