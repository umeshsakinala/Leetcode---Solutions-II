class Solution {
    public String makeFancyString(String s) {
        if(s.length() < 3) return s;
        if(s.length() <= 3) {
            if(s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2)) return s.substring(0, 2);
            else return s;
        }
        Stack<Character> st = new Stack<Character>();
        st.push(s.charAt(0));
        int count = 1;
        for(int i = 1; i < s.length(); i++) {
            char temp = st.peek();
            if(temp == s.charAt(i)) count++;
            else count = 1;
            if(count < 3) st.push(s.charAt(i));
        }
        StringBuilder result = new StringBuilder();
        for(char c : st) result.append(c);
        return result.toString();
    }
}
