class Trie {
    Trie[] children;
    int count;
    Trie() {
        children = new Trie[26];
        count = 0;
    }

}
class Solution {
    public int[] sumPrefixScores(String[] words) {
        Trie trie = new Trie();
        for(String i: words) {
            Trie current = trie;
            for(char c: i.toCharArray()) {
                int index = c - 'a';
                if(current.children[index] == null) current.children[index] = new Trie();
                current = current.children[index];
                current.count++;
            }
        }
        int arr[] = new int[words.length];
        for(int i=0; i<words.length; i++) {
            Trie current = trie;
            int score = 0;
            for(char c: words[i].toCharArray()) {
                int index = c - 'a';
                current = current.children[index];
                score = score + current.count;
            }
            arr[i] = score;
        }
        return arr;
    }
}