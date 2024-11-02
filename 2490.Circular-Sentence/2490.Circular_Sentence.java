class Solution {
    public boolean isCircularSentence(String sentence) {
        String li[] = sentence.split(" ");
        if(li.length == 1) {
            if(sentence.charAt(0) == sentence.charAt(sentence.length()-1)) return true;
            else return false;
        }
        for(int i=0; i<li.length-1; i++) {
            String temp = li[i];
            char c = temp.charAt(temp.length()-1);
            String flag = li[i+1];
            char d = flag.charAt(0);
            if(c != d) return false;
        }
        char c = li[li.length - 1].charAt(li[li.length - 1].length() - 1);
        char d = li[0].charAt(0);
        return c == d;
    }
}