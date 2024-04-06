class Solution {
    public String minRemoveToMakeValid(String s) {
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if(Character.isLowerCase(c))
                continue;
            if(c == '(') {
                st.push(i);
            }
            else {
                if(!st.isEmpty()) {
                    st.pop();
                }
                else {
                    sb.setCharAt(i, '#');
                }
            }
        }
        while(!st.isEmpty()) {
            sb.setCharAt(st.pop(), '#');
        }
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < n; i++) {
            if(sb.charAt(i) != '#')
                ans.append(sb.charAt(i));
        }
        return ans.toString();
    }
}