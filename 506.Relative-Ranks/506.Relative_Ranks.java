class Solution {
    public String[] findRelativeRanks(int[] score) {
        Map<Integer, String> mp = new HashMap<Integer, String>();
        Integer[] sorted_score = Arrays.stream(score).boxed().sorted(Collections.reverseOrder()).toArray(Integer[]::new);
        for(int i=0; i<sorted_score.length; i++) {
            if(i == 0) mp.put(sorted_score[i], "Gold Medal");
            else if(i == 1) mp.put(sorted_score[i], "Silver Medal");
            else if(i == 2) mp.put(sorted_score[i], "Bronze Medal");
            else mp.put(sorted_score[i], String.valueOf(i+1));
        }
        String result[] = new String[score.length];
        for(int i=0; i<score.length; i++) result[i] = mp.get(score[i]);
        return result;
    }
}