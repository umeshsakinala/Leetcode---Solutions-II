class Solution {
    public int minSwaps(String s) {
        Stack<Character> st = new Stack<Character>();
        int count = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '[') {
                st.push(s.charAt(i));
            }
            else {
                if(st.size() > 0) {
                    st.pop();
                }
                else {
                    count++;
                }
            }
        }
        return (count+1)/2;
    }
}