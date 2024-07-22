class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> mp = new HashMap<Integer, String>();
        for(int i=0; i<heights.length; i++) {
            mp.put(heights[i], names[i]);
            heights[i] = -1*heights[i];
        }
        String[] people = new String[names.length];
        Arrays.sort(heights);
        for(int i=0; i<heights.length; i++) {
            heights[i] = -1*heights[i];
            people[i] = mp.get(heights[i]);
        }
        return people;
    }
}