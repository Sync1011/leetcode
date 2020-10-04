/**
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 * 
 * Given an array nums of integers, return how many of them contain an even number of digits.
 */
public class FindNumbersWithEvenNumberOfDigits1295 {
    public static void main(String[] args) {
        FindNumbersWithEvenNumberOfDigits1295 main = new FindNumbersWithEvenNumberOfDigits1295();
        System.out.println(main.findNumbers(new int[]{12,345,2,6,7896}));
        System.out.println(main.findNumbers(new int[]{555,901,482,1771}));
    }

    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (isEvenNumber(num)) {
                count++;
            }
        }
        return count;
    }

    private boolean isEvenNumber(int num) {
        int steps = 0;
        while (num > 0) {
            num = num / 10;
            steps++;
        }
        return steps % 2 == 0;
    }
}
