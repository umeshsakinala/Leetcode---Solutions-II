class Solution {
    public int findConsistent(int hash[], String word) {
        for(int i=0; i<word.length(); i++) {
            if(hash[word.charAt(i) - 'a'] == 0) return 0;
        }
        return 1;
    }
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        int hash[] = new int[26];
        for(int i=0; i<allowed.length(); i++) {
            hash[allowed.charAt(i) - 'a'] = 1;
        }
        for(int i=0; i<words.length; i++) {
            count = count + findConsistent(hash, words[i]);
        }
        return count;
    }
}