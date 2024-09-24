class Solution {
    class TrieNode {
        TrieNode[] children = new TrieNode[10];
    }
    class Trie {
        TrieNode root;
        Trie() {
            root = new TrieNode();
        }
        void insert(String num) {
            TrieNode node = root;
            for(char c : num.toCharArray()) {
                int index = c - '0';
                if(node.children[index] == null) {
                    node.children[index] = new TrieNode();
                }
                node = node.children[index];
            }
        }
        int getLongestCommonPrefix(String num) {
            TrieNode node = root;
            int length = 0;
            for(char c : num.toCharArray()) {
                int index = c - '0';
                if(node.children[index] == null) {
                    break;
                }
                length++;
                node = node.children[index];
            }
            return length;
        }
    }
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Trie trie = new Trie();
        for(int num : arr1) {
            trie.insert(String.valueOf(num));
        }
        int maxPrefixLength = 0;
        for(int num : arr2) {
            maxPrefixLength = Math.max(maxPrefixLength, trie.getLongestCommonPrefix(String.valueOf(num)));
        }
        return maxPrefixLength;
    }
}