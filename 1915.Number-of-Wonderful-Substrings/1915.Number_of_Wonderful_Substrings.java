class Solution {
    public long wonderfulSubstrings(String word) {
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        count.put(0, 1);
        long result = 0;
        int x = 0;
        for(char i: word.toCharArray()) {
            int j = i-'a';
            x = x ^ (1 << j);
            result = result + count.getOrDefault(x, 0);
            for(int k=0; k<10; k++) { // a to j, there are 10 letters
                result = result+count.getOrDefault(x ^ (1 << k), 0);
            }
            count.put(x, count.getOrDefault(x, 0) + 1);
        }
        return result;

    }
}