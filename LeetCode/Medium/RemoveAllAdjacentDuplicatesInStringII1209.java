import java.util.Stack;

/**
 * https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/
 * 
 * Given a string s, a k duplicate removal consists of choosing k adjacent and
 * equal letters from s and removing them causing the left and the right side of
 * the deleted substring to concatenate together. We repeatedly make k duplicate
 * removals on s until we no longer can. Return the final string after all such
 * duplicate removals have been made.
 */

public class RemoveAllAdjacentDuplicatesInStringII1209 {
    public static void main(String[] args) {
        RemoveAllAdjacentDuplicatesInStringII1209 main = new RemoveAllAdjacentDuplicatesInStringII1209();
        System.out.println(main.removeDuplicates("abcd", 2));
    }

    public String removeDuplicates(String S, int k) {
        Stack<Character> stackChar = new Stack<>();
        Stack<Integer> stackAdjCnt = new Stack<>();

        for (char c : S.toCharArray()) {
            if (!stackChar.isEmpty() && stackChar.peek() == c) {
                stackAdjCnt.push(stackAdjCnt.peek() + 1);
            } else {
                stackAdjCnt.push(1);
            }

            stackChar.push(c);
            if (stackAdjCnt.peek() == k) {
                for (int i = 0; i < k; i++) {
                    stackAdjCnt.pop();
                    stackChar.pop();
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stackChar.isEmpty()) {
            sb.append(stackChar.pop());
        }
        return sb.reverse().toString();
    }
}
