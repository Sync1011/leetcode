/**
 * https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
 * 
 * Given a string S of lowercase letters, a duplicate removal consists of choosing two adjacent and equal letters, and removing them.
 * We repeatedly make duplicate removals on S until we no longer can.
 * Return the final string after all such duplicate removals have been made.  It is guaranteed the answer is unique.
 */

public class RemoveAllAdjacentDuplicatesInString1047 {
    public static void main(String[] args) {
        RemoveAllAdjacentDuplicatesInString1047 main = new RemoveAllAdjacentDuplicatesInString1047();
        System.out.println(main.removeDuplicates("abbaca"));
    }

    public String removeDuplicates(String S) {
        StringBuilder sb = new StringBuilder();
        for (char c : S.toCharArray()) {
            int sbSize = sb.length();
            if (sbSize > 0 && sb.charAt(sbSize - 1) == c) {
                sb.deleteCharAt(sbSize-1);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
