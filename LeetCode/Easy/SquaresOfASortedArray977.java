/**
 * https://leetcode.com/problems/squares-of-a-sorted-array
 * 
 * Given an array of integers A sorted in non-decreasing order, 
 * return an array of the squares of each number, also in sorted non-decreasing order.
 * 
 * Input: [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 */
public class SquaresOfASortedArray977 {
    public static void main(String[] args) {
        SquaresOfASortedArray977 main = new SquaresOfASortedArray977();
        int[] res = main.sortedSquares(new int[]{-4,-1,0,3,10});
        for (int num : res) {
            System.out.println(num);
        }
    }

    public int[] sortedSquares(int[] A) {
        int[] res = new int[A.length];
        int left = 0;
        int right = A.length-1;
        int index = A.length-1;
        while (index >= 0) {
            int currentLeft = A[left] * A[left];
            int currentRight = A[right] * A[right];
            if (currentLeft > currentRight) {
                res[index] = currentLeft;
                left++;
            } else {
                res[index] = currentRight;
                right--;
            }
            index--;
        }
        return res;
    }
}
