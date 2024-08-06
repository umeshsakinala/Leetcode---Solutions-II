class Solution {
    public int minimumPushes(String word) {
        TreeMap<Character, Integer> mp = new TreeMap<Character, Integer>();
        for(int i=0; i<word.length(); i++) {
            mp.put(word.charAt(i), mp.getOrDefault(word.charAt(i), 0) + 1);
        }
        PriorityQueue<Integer> qu = new PriorityQueue<>((a, b) -> b-a);
        qu.addAll(mp.values());
        int push = 0;
        int i=0;
        while(qu.size() > 0) {
            push = push + (i++/8 + 1)*qu.poll();
        }
        return push;
    }
}