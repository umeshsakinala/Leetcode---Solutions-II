class Solution {
    public String reversePrefix(String word, char ch) {
        int a = 0;
        for(int i=0; i<word.length(); i++) {
            if(word.charAt(i) == ch) {
                a = i;
                break;
            }
        }
        StringBuilder sb = new StringBuilder(word.substring(0, a+1));
        sb.reverse();
        return word.replaceFirst(word.substring(0, a+1), sb.toString());
    }
}