/**
 * https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
 * 
 * Given two non-negative integers low and high. 
 * Return the count of odd numbers between low and high (inclusive).
 */
public class CountOddNumbersInAnIntervalRange1523 {
    public static void main(String[] args) {
        CountOddNumbersInAnIntervalRange1523 main = new CountOddNumbersInAnIntervalRange1523();
        System.out.println(main.countOdds(3, 7));
    }

    public int countOdds(int low, int high) {
        int count = 0;
        int increment = (low % 2) == 0 ? 1 : 2;
        for (int i = low; i <= high; i += increment) {
            if (i % 2 != 0) {
                count++;
            }
        }
        return count;
    }
}
