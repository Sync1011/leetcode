/**
 * https://leetcode.com/problems/valid-palindrome/
 * 
 * Given a string, determine if it is a palindrome, 
 * considering only alphanumeric characters and ignoring cases.
 * 
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 */

public class ValidPalindrome125 {
    public static void main(String[] args) {
        ValidPalindrome125 main = new ValidPalindrome125();
        main.isPalindrome("A man, a plan, a canal: Panama");
    }

    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        char[] c = s.toCharArray();
        while (left < right) {
            if (!Character.isLetterOrDigit(c[left])) {
                left++;
            } else if (!Character.isLetterOrDigit(c[right])) {
                right--;
            } else if (Character.toLowerCase(c[left++]) != Character.toLowerCase(c[right--])) {
                return false;
            }
        }
        return true;
    }
}
