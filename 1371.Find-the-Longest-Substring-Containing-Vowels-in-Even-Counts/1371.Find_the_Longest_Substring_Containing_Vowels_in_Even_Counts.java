class Solution {
    public int findTheLongestSubstring(String s) {
        int xor = 0;
        int maxLength = 0;
        int vowels[] = new int[26];
        vowels['a'-'a'] = 1;
        vowels['e'-'a'] = 2;
        vowels['i'-'a'] = 4;
        vowels['o'-'a'] = 8;
        vowels['u'-'a'] = 16;
        int hash[] = new int[32];
        Arrays.fill(hash, -1);
        for(int i=0; i<s.length(); i++) {
            xor = xor ^ (vowels[s.charAt(i) - 'a']);
            if(hash[xor] == -1 && xor != 0) {
                hash[xor] = i;
            }
            maxLength = Math.max(maxLength, i-hash[xor]);
        }
        return maxLength;
    }
}