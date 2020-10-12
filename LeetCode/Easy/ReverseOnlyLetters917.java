import java.util.Stack;

/**
 * https://leetcode.com/problems/reverse-only-letters/
 * 
 * Given a string S, return the "reversed" string where all characters that are
 * not a letter stay in the same place, and all letters reverse their positions.
 * 
 * Input: "Test1ng-Leet=code-Q!" Output: "Qedo1ct-eeLg=ntse-T!"
 */

public class ReverseOnlyLetters917 {
    public static void main(String[] args) {
        ReverseOnlyLetters917 main = new ReverseOnlyLetters917();
        System.out.println(main.reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }

    public String reverseOnlyLetters(String S) {
        Stack<Character> stack = new Stack<>();
        String reverse = "";
        for (char c : S.toCharArray()) {
            if (Character.isLetter(c)) {
                stack.push(c);
            }
        }
        for (int i = 0; i < S.length(); i++) {
            if (!Character.isLetter(S.charAt(i))) {
                reverse += S.charAt(i);
            } else {
                reverse += stack.pop();
            }
        }
        return reverse;
    }
}
