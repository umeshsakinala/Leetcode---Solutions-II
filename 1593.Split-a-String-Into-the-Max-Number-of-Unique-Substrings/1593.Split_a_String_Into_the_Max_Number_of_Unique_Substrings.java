class Solution {
    public int uniqueSplits(String s, Set<String> set) {
        if(s.length() == 0) return 0;
        int count = 0;
        for(int i = 1; i <= s.length(); i++) {
            String temp = s.substring(0, i);
            if(!set.contains(temp)) {
                set.add(temp);
                count = Math.max(count, 1 + uniqueSplits(s.substring(i), set));
                set.remove(temp);
            }
        }
        return count;
    }
    public int maxUniqueSplit(String s) {
        Set<String> set = new HashSet<>();
        return uniqueSplits(s, set);
    }
}