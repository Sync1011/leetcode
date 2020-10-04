/**
 * https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero
 * 
 * Given a non-negative integer num, return the number of steps to reduce it to zero. 
 * If the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
 */
public class NumberOfStepsToReduceANumberToZero1342 {
    public static void main(String[] args) {
        NumberOfStepsToReduceANumberToZero1342 main = new NumberOfStepsToReduceANumberToZero1342();
        System.out.println(main.numberOfSteps(14));
        System.out.println(main.numberOfSteps(8));
        System.out.println(main.numberOfSteps(123));
    }

    public int numberOfSteps (int num) {
        int step = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num = (num/2);
            } else {
                num = (num - 1);
            }
            step++;
        }
        return step;
    }
}
