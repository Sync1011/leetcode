/**
 * https://leetcode.com/problems/sort-array-by-parity/
 * 
 * Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.
 * You may return any answer array that satisfies this condition.
 * 
 * Input: [3,1,2,4]
 * Output: [2,4,3,1]
 * The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 */

public class SortArrayByParity905 {
    public static void main(String[] args) {
        SortArrayByParity905 main = new SortArrayByParity905();
        main.sortArrayByParity(new int[]{3,1,2,4});
    }

    public int[] sortArrayByParity(int[] A) {
        int left = 0;
        int right = A.length-1;
        while (left < right) {
            if (A[left] % 2 > A[right] % 2) {
                int tmp = A[left];
                A[left] = A[right];
                A[right] = tmp;
            }
            if (A[left] % 2 == 0) {
                left++;
            }
            if (A[right] % 2 != 0) {
                right--;
            }
        }
        return A;
    }
}
