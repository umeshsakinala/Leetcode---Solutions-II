class Solution {
    public int numSteps(String s) {
        int count = 0;
        int carry = 0;
        int length = s.length()-1;
        while(length > 0) {
            if(Character.getNumericValue(s.charAt(length)) + carry == 0) {
                carry = 0;
                count++;
            }
            else if(Character.getNumericValue(s.charAt(length)) + carry == 2) {
                carry = 1;
                count++;
            }
            else {
                carry = 1;
                count = count + 2;
            }
            length--;
        }
        if(carry == 1) count++;
        return count;
    }
}