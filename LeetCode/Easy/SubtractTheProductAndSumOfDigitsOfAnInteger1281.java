/**
 * https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
 * 
 * Given an integer number n, 
 * return the difference between the product of its digits and the sum of its digits.
 * 
 * Input: n = 234
 * Output: 15 
 * Explanation: 
 * Product of digits = 2 * 3 * 4 = 24 
 * Sum of digits = 2 + 3 + 4 = 9 
 * Result = 24 - 9 = 15
 */
public class SubtractTheProductAndSumOfDigitsOfAnInteger1281 {
    public static void main(String[] args) {
        SubtractTheProductAndSumOfDigitsOfAnInteger1281 main = new SubtractTheProductAndSumOfDigitsOfAnInteger1281();
        System.out.println(main.subtractProductAndSum(234));
        System.out.println(main.subtractProductAndSum(4421));
    }

    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            product *= digit;
            sum += digit;
            n = n / 10;
        }
        return product - sum;
    }
}