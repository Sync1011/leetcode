/**
 * https://leetcode.com/problems/add-digits/
 * 
 * Given a non-negative integer num, 
 * repeatedly add all its digits until the result has only one digit.
 * 
 * Input: 38
 * Output: 2 
 * Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2.  Since 2 has only one digit, return it.
 */

public class AddDigits258 {
    public static void main(String[] args) {
        AddDigits258 main = new AddDigits258();
        System.out.println(main.addDigits(38));
    }

    public int addDigits(int num) {
        if (num < 10) {
            return num;
        }
        int digit = 0;
        while (num > 0) {
            digit += num % 10;
            num = num / 10;

            if (num == 0 && digit > 9) {
                num = digit;
                digit = 0;
            }
        }
        return digit;
    }
}
