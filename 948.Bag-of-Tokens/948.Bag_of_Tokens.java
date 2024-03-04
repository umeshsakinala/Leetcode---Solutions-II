class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int start = 0;
        int maximum = 0;
        int left = 0;
        int right = tokens.length-1;
        while(left <= right) {
            if(power >= tokens[left]) {
                power = power-tokens[left];
                start++;
                left++;
                maximum = Math.max(maximum, start);
            }
            else if(start >= 1) {
                power = power + tokens[right];
                start--;
                right--;
            }
            else {
                break;
            }
        }
        return maximum;
    }
}