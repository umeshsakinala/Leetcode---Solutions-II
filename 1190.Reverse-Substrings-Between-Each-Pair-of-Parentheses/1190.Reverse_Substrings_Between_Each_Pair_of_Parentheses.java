class Solution {
    public String reverseParentheses(String s) {
        Stack<StringBuilder> st = new Stack<StringBuilder>();
        StringBuilder ans = new StringBuilder();
        for(char i : s.toCharArray()) {
            switch(i) {
                case '(':
                    st.push(ans);
                    ans = new StringBuilder();
                    break;
                case ')':
                    ans.reverse();
                    StringBuilder temp = st.pop();
                    temp.append(ans);
                    ans = temp;
                    break;
                default:
                    ans.append(i);
                    break;
            }
        }
        return ans.toString();
    }
}