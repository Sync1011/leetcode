/**
 * https://leetcode.com/problems/maximum-69-number/
 * 
 * Given a positive integer num consisting only of digits 6 and 9.
 * Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6)
 * 
 * Input: num = 9669
 * Output: 9969
 */
public class Maximum69Number {
    public static void main(String[] args) {
        Maximum69Number main = new Maximum69Number();
        System.out.println(main.maximum69Number(9669));
        System.out.println(main.maximum69Number(9996));
        System.out.println(main.maximum69Number(9999));
    }

    public int maximum69Number (int num) {
        char[] s = Integer.toString(num).toCharArray();
        for (int i = 0; i < s.length; i++) {
            if (s[i] != '9') {
                s[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(s));
    }
}
