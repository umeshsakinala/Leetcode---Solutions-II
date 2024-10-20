class Solution {
    public boolean parseBoolExpr(String expression) {
        Stack<Character> st = new Stack<Character>();
        for(int i=0; i<expression.length(); i++) {
            if(expression.charAt(i) == 't' || expression.charAt(i) == 'f' || expression.charAt(i) == '!' || expression.charAt(i) == '&' || expression.charAt(i) == '|') {
                st.push(expression.charAt(i));
            }
            else if(expression.charAt(i) == ')') {
                int isTrue = 0;
                int isFalse = 0;
                while(st.peek() != '!' && st.peek() != '&' && st.peek() != '|') {
                    char temp = st.pop();
                    if(temp == 't') isTrue = 1;
                    if(temp == 'f') isFalse = 1;
                }
                char operation = st.pop();
                if(operation == '!') {
                    if(isTrue == 1) {
                        st.push('f');
                    }
                    else {
                        st.push('t');
                    }
                }
                else if(operation == '&') {
                    if(isFalse == 1) {
                        st.push('f');
                    }
                    else {
                        st.push('t');
                    }
                }
                else {
                    if(isTrue == 1) {
                        st.push('t');
                    }
                    else {
                        st.push('f');
                    }
                }
            }
        }
        return st.peek() == 't';
    }
}