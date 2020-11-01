/**
 * https://leetcode.com/problems/transpose-matrix/
 * 
 * Given a matrix A, return the transpose of A.
 * The transpose of a matrix is the matrix flipped over it's main diagonal, 
 * switching the row and column indices of the matrix.
 */
public class TransposeMatrix867 {
    public static void main(String[] args) {
        TransposeMatrix867 main = new TransposeMatrix867();
        // main.transpose(new int[][]{{1,2,3},
        //                            {4,5,6},
        //                            {7,8,9}});
        main.transpose(new int[][]{{2,4,-1},
                                   {-10,5,11},
                                   {18,-7,6}});
    }

    public int[][] transpose(int[][] A) {
        /**
         * Traverse the matrix left->right
         * Fill the answer matrix top->bottom
         */
        int R = A.length, C = A[0].length;
        int[][] ans = new int[C][R];
        for (int r = 0; r < R; r++)
            for (int c = 0; c < C; c++) {
                int value = A[r][c];
                ans[c][r] = value;
            }
        return ans;
    }
}
