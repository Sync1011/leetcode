/**
 * https://leetcode.com/problems/valid-palindrome-ii/
 * 
 * Given a non-empty string s, you may delete at most one character. 
 * Judge whether you can make it a palindrome.
 * 
 * Input: "abca"
 * Output: True
 * Explanation: You could delete the character 'c'.
 */

public class ValidPalindromeII680 {
    public static void main(String[] args) {
        ValidPalindromeII680 main = new ValidPalindromeII680();
        System.out.println(main.validPalindrome("abc"));
        System.out.println(main.validPalindrome("aba"));
        System.out.println(main.validPalindrome("abca"));
    }

    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        char[] c = s.toCharArray();
        /**
         * Keep incrementing and decrementing while they are equal.
         * If they are ever not equal, we first try removing one from the left side (left+1)
         * If that fails we then try removing one from the right side (right-1)
         */
        while (left < right) {
            if (c[left] == c[right]) {
                left++;
                right--;
            } else if (helper(s, left+1, right)) {
                return true;
            } else if (helper(s, left, right-1)) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    private boolean helper(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
}
