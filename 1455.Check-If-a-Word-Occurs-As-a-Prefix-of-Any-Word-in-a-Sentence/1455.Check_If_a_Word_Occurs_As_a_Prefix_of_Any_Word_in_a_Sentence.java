class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        if(sentence.contains(searchWord) == false) return -1;
        String regex = "[\\s]";
        String[] words = sentence.split(regex);
        for(int i=0; i<words.length; i++) {
            if(words[i].startsWith(searchWord)) return i+1;
        }
        return -1;
    }
}