/**
 * https://leetcode.com/problems/sort-array-by-parity-ii/
 * 
 * Given an array A of non-negative integers, half of the integers in A are odd, and half of the integers are even.
 * Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.
 * 
 * Input: [4,2,5,7]
 * Output: [4,5,2,7]
 */
public class SortArrayByParityII922 {
    public static void main(String[] args) {
        SortArrayByParityII922 main = new SortArrayByParityII922();
        int[] result = main.sortArrayByParityII(new int[]{4,2,5,7});
        for (int num : result) {
            System.out.println(num);
        }
    }

    public int[] sortArrayByParityII(int[] A) {
        int[] arr = new int[A.length];
        int even = 0;
        int odd = 1;
        for (int i = 0; i < A.length; i++) {
            int value = A[i];
            if (value % 2 == 0) {
                arr[even] = value;
                even += 2;
            } else {
                arr[odd] = value;
                odd += 2;
            }
        }
        return arr;
    }
}
