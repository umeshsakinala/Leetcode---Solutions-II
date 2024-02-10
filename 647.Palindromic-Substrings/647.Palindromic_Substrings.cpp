class Solution {
public:
int isPalindrome(string s, int left, int right) {
    int count = 0;
    while(left >= 0 && right < s.size() && s[left] == s[right]) {
        count++;
        left--;
        right++;
    }
    return count;
}
    int countSubstrings(string s) {
        int count = 0;
        for(int i=0; i<s.size(); i++) {
            int j = i;
            int oddlength = isPalindrome(s, i, j);
            int evenlength = isPalindrome(s, i, j+1);
            count = count + oddlength + evenlength;
        }
        return count;
    }
};