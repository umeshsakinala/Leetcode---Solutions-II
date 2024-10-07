class Solution {
    public int minLength(String s) {
        Stack<Character> st = new Stack<Character>();
        st.add(s.charAt(0));
        for(int i=1; i<s.length(); i++) {
            if(s.charAt(i) == 'B' && st.size() > 0 && st.peek() == 'A') {
                st.pop();
            }
            else if(s.charAt(i) == 'D' && st.size() > 0 && st.peek() == 'C') {
                st.pop();
            }
            else {
                st.add(s.charAt(i));
            }
        }
        return st.size();
    }
}