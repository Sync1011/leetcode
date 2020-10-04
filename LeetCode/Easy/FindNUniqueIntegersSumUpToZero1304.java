/**
 * https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
 * 
 * Given an integer n, return any array containing n unique integers such that they add up to 0.
 */

public class FindNUniqueIntegersSumUpToZero1304 {
    public static void main(String[] args) {
        FindNUniqueIntegersSumUpToZero1304 main = new FindNUniqueIntegersSumUpToZero1304();
        int[] arr = main.sumZero(5);
        for (int num : arr) {
            System.out.println(num);
        }
    }

    public int[] sumZero(int n) {
        int[] res = new int[n];
        int left = 0, right = n - 1, start = 1;
        while (left < right) {
            res[left++] = start;
            res[right--] = -start;
            start++;
        }
        return res;
    }
}
