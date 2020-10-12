import java.util.Stack;

/**
 * https://leetcode.com/problems/reverse-words-in-a-string-iii/
 * 
 * Given a string, you need to reverse the order of characters in each word
 * within a sentence while still preserving whitespace and initial word order.
 * 
 * Input: "Let's take LeetCode contest" Output: "s'teL ekat edoCteeL tsetnoc"
 */
public class ReverseWordsInAStringIII557 {
    public static void main(String[] args) {
        ReverseWordsInAStringIII557 main = new ReverseWordsInAStringIII557();
        main.reverseWords("Let's take LeetCode contest");
    }

    public String reverseWords(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder newString = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                while (stack.size() > 0) {
                    newString.append(stack.pop());
                }
                newString.append(' ');
            } else {
                stack.push(c);
            }
        }
        while (stack.size() > 0) {
            newString.append(stack.pop());
        }
        return newString.toString();
    }
}
