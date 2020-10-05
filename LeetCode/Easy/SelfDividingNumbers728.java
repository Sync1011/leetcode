import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/self-dividing-numbers
 * 
 * A self-dividing number is a number that is divisible by every digit it
 * contains. For example, 128 is a self-dividing number because 128 % 1 == 0,
 * 128 % 2 == 0, and 128 % 8 == 0. Also, a self-dividing number is not allowed
 * to contain the digit zero. Given a lower and upper number bound, output a
 * list of every possible self dividing number, including the bounds if
 * possible.
 * 
 * Input: left = 1, right = 22 Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15,
 * 22]
 */
public class SelfDividingNumbers728 {
    public static void main(String[] args) {
        SelfDividingNumbers728 main = new SelfDividingNumbers728();
        List<Integer> res = main.selfDividingNumbers(1, 22);
        for (int num : res) {
            System.out.println(num);
        }
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                result.add(i);
            }
        }
        return result;
    }

    private boolean isSelfDividing(int num) {
        char[] s = Integer.toString(num).toCharArray();
        for (int i = 0; i < s.length; i++) {
            int currentDigit = Integer.parseInt(String.valueOf(s[i]));
            if (currentDigit == 0 || num % currentDigit != 0) {
                return false;
            }
        }
        return true;
    }
}
