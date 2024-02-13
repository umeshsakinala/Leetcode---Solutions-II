class Solution {
    public boolean isPalindrome(String word) {
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        return sb.toString().equals(word);
    }
    public String firstPalindrome(String[] words) {
        for(int i=0; i<words.length; i++) {
            boolean palindrome = isPalindrome(words[i]);
            if(palindrome == true) {
                return words[i];
            }
        }
        return "";
    }
}