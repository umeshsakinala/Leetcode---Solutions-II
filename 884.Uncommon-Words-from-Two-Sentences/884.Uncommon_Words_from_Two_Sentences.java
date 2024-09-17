class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> mp = new HashMap<String, Integer>();
        String[] s_one = s1.split(" ");
        String[] s_two = s2.split(" ");
        for(int i=0; i<s_one.length; i++) {
            mp.put(s_one[i], mp.getOrDefault(s_one[i], 0)+1);
        }
        for(int i=0; i<s_two.length; i++) {
            mp.put(s_two[i], mp.getOrDefault(s_two[i], 0)+1);
        }
        int count = 0;
        for(Map.Entry<String, Integer> i: mp.entrySet()) {
            if(i.getValue() == 1) count++;
        }
        String answer[] = new String[count];
        int index = 0;
        for(Map.Entry<String, Integer> i: mp.entrySet()) {
            if(i.getValue() == 1) answer[index++] = i.getKey();
        }
        return answer;
    }
}