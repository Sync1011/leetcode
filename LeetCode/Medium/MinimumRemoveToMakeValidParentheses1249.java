import java.util.Stack;

public class MinimumRemoveToMakeValidParentheses1249 {
    public static void main(String[] args) {
        MinimumRemoveToMakeValidParentheses1249 main = new MinimumRemoveToMakeValidParentheses1249();
        main.minRemoveToMakeValid("le)e(t(c)o)de)");
    }

    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> st = new Stack<>();

        /**
         * Everytime we see an open pren, we add the index to the stack
         * When we see a close pren, we pop from stack, if its empty, that means we have to remove that close pren
         * So we use * as a place holder, at the end we remove all the * from the string and return
         */
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                st.add(i);
            } 
            if (c == ')') {
                if (!st.empty()) {
                    st.pop();
                } else {
                    sb.setCharAt(i, '*');
                }
            }
        }
        
        while (!st.empty()) {
            sb.setCharAt(st.pop(), '*');
        }
        
        return sb.toString().replaceAll("\\*", "");
      }
}
