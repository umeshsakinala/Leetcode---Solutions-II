class Solution {
    public String maximumOddBinaryNumber(String s) {
        /*
        To get the maximum Odd number in binary number
        We need to keep one "1" in last place to get odd number
        and to get maximum odd number we need to place "1" at the 
        left most positions;
        */
        int one_count = 0;
        int zero_count = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '1') one_count++;
            else zero_count++;
        }
        String answer = "";
        answer += "1".repeat(one_count-1);
        answer += "0".repeat(zero_count);
        answer += "1";
        return answer;
    }
}