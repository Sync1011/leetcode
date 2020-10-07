/**
 * https://leetcode.com/problems/reverse-string/
 * 
 * Write a function that reverses a string. 
 * The input string is given as an array of characters char[].
 * 
 * Input: ['h','e','l','l','o']
 * Output: ['o','l','l','e','h']
 */
public class ReverseString344 {
    public static void main(String[] args) {
        ReverseString344 main = new ReverseString344();
        main.reverseString(new char[]{'h','e','l','l','o'});
    }

    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;
        while (left < right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            left++;
            right--;
        }
    }
}
