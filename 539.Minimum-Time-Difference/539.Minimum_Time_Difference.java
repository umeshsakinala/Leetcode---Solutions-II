class Solution {
    public int findMinDifference(List<String> timePoints) {
        List<Integer> times = new ArrayList<Integer>();
        for(int i=0; i<timePoints.size(); i++) {
            String str = timePoints.get(i);
            int hour = Integer.valueOf(str.substring(0, 2));
            // if(hour == 0) hour = 24;
            int minute = Integer.valueOf(str.substring(3));
            int time = hour*60 + minute;
            // time = Math.min(time, Math.abs(1440-time));
            times.add(time);
        }
        Collections.sort(times);
        int min = Integer.MAX_VALUE;
        for(int i=1; i<times.size(); i++) {
            int diff = Math.abs(times.get(i) - times.get(i-1));
            min = Math.min(min, diff);
        }
        int temp = 1440 - times.get(times.size()-1) + times.get(0);
        min = Math.min(min, temp);
        return min;
    }
}