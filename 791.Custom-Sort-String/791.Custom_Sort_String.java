class Solution {
    public String customSortString(String order, String s) {
        int freq[] = new int[26];
        for(char i : s.toCharArray()) {
            freq[i - 'a']++;
        }
        StringBuilder str = new StringBuilder();
        for(char i : order.toCharArray()) {
            while(freq[i-'a'] > 0) {
                freq[i-'a']--;
                str.append(i);
            }
        }
        for(int i=0; i<26; i++) {
            while(freq[i] > 0) {
                str.append(Character.toString(i+'a'));
                freq[i]--;
            }
        }
        return str.toString();
    }
}