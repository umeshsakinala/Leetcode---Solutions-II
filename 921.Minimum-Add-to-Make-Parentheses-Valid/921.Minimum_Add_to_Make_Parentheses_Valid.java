class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character>st = new Stack<Character>();
        st.add(s.charAt(0));
        for(int i=1; i<s.length(); i++) {
            if(st.size() > 0 && st.peek() == '(') {
                if(s.charAt(i) == ')') {
                    st.pop();
                    continue;
                }
            }
            st.add(s.charAt(i));
        }
        return st.size();
    }
}