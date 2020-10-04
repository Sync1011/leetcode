/**
 * https://leetcode.com/problems/split-a-string-in-balanced-strings/
 * 
 * Balanced strings are those who have equal quantity of 'L' and 'R' characters.
 * Given a balanced string s split it in the maximum amount of balanced strings.
 * Return the maximum amount of splitted balanced strings.
 * 
 * Input: s = "RLRRLLRLRL"
 * Output: 4
 * Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'
 */
public class SplitAStringInBalancedStrings1221 {
    public static void main(String[] args) {
        SplitAStringInBalancedStrings1221 main = new SplitAStringInBalancedStrings1221();
        System.out.println(main.balancedStringSplit("RLRRLLRLRL"));
        System.out.println(main.balancedStringSplit("RLLLLRRRLR"));
        System.out.println(main.balancedStringSplit("LLLLRRRR"));
        System.out.println(main.balancedStringSplit("RLRRRLLRLL"));
    }

    public int balancedStringSplit(String s) {
        int result = 0;
        int count = 0;
        /**
         * Greedy approach.
         * For every L we see, we add 1 and for ever R, subtract 1
         * If we reach 0, that means we have a valid pair.
         */
        for (char c : s.toCharArray()) {
            count += c == 'L' ? 1 : -1;
            if (count == 0) {
                result++;
            }
        }
        return result;
    }
}
