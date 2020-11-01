import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/reformat-the-string/
 * 
 * Given alphanumeric string s. (Alphanumeric string is a string consisting of lowercase English letters and digits).
 * You have to find a permutation of the string where no letter is followed by another letter 
 * and no digit is followed by another digit. 
 * That is, no two adjacent characters have the same type.
 * Return the reformatted string or return an empty string 
 * if it is impossible to reformat the string.
 */
public class ReformatTheString1417 {
    public static void main(String[] args) {
        ReformatTheString1417 main = new ReformatTheString1417();
        System.out.println(main.reformat("a0b1c2"));
    }

    public String reformat(String s) {
        List<Character> digits = new ArrayList<>();
        List<Character> letters = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                digits.add(c);
            } else {
                letters.add(c);
            }
        }

        if (Math.abs(digits.size() - letters.size()) >= 2) {
            return "";
        }

        String result = "";
        boolean appendDigit = digits.size() >= letters.size() ? true : false;
        for (int i = 0; i < s.length(); i++) {
            if (appendDigit && digits.size() > 0) {
                result += digits.remove(0);
            } else if (letters.size() > 0) {
                result += letters.remove(0);
            }
            appendDigit = !appendDigit;
        }
        return result;
    }
}
