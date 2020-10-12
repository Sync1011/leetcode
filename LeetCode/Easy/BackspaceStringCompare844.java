import java.util.Stack;

/**
 * https://leetcode.com/problems/backspace-string-compare/
 * 
 * Given two strings S and T, return if they are equal when both are typed into
 * empty text editors. # means a backspace character. Note that after
 * backspacing an empty text, the text will continue empty.
 */
public class BackspaceStringCompare844 {
    public static void main(String[] args) {
        BackspaceStringCompare844 main = new BackspaceStringCompare844();
        System.out.println(main.backspaceCompare("ab#c", "ad#c"));
    }

    public boolean backspaceCompare(String S, String T) {
        Stack<Character> s = new Stack<>();
        Stack<Character> t = new Stack<>();
        for (char c : S.toCharArray()) {
            if (c == '#') {
                if (!s.empty()) {
                    s.pop();
                } else {
                    continue;
                }
            } else {
                s.push(c);
            }
        }
        for (char c : T.toCharArray()) {
            if (c == '#') {
                if (!t.empty()) {
                    t.pop();
                } else {
                    continue;
                }
            } else {
                t.push(c);
            }
        }
        return s.equals(t);
    }
}
