/**
 * https://leetcode.com/problems/matrix-diagonal-sum/
 * 
 * Given a square matrix mat, return the sum of the matrix diagonals.
 */
public class MatrixDiagonalSum1572 {
    public static void main(String[] args) {
        MatrixDiagonalSum1572 main = new MatrixDiagonalSum1572();
        System.out.println(main.diagonalSum(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
    }

    public int diagonalSum(int[][] mat) {
        int result = 0;
        int length = mat.length;
        /**
         * Start at the top of the matrix and at the bottom left of the matrix.
         * Each time you iterate, you move down one and the right and the other pointer moves up one and to the right.
         */
        for (int i = 0; i < length; i++) {
            result += mat[i][i];
            int val = length-1-i;
            result += mat[val][i];
        }

        // If the length is odd, that means you added the middle value twice, so remove it once.
        return length % 2 == 0 ? result : result - mat[length/2][length/2];
    }
}
