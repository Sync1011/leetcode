import java.util.Stack;

/**
 * https://leetcode.com/problems/valid-parentheses/
 * 
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 * 
 * Input: s = "()" Output: true
 */

public class ValidParentheses20 {
    public static void main(String[] args) {
        ValidParentheses20 main = new ValidParentheses20();
        System.out.println(main.isValid(new String("()")));
        System.out.println(main.isValid(new String("()[]{}")));
        System.out.println(main.isValid(new String("(]")));
        System.out.println(main.isValid(new String("(]")));
        System.out.println(main.isValid(new String("([)]")));
        System.out.println(main.isValid(new String("{[]}")));
    }
    
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}
