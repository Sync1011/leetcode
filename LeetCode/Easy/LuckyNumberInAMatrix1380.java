import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/lucky-numbers-in-a-matrix/
 * 
 * Given a m * n matrix of distinct numbers, return all lucky numbers in the
 * matrix in any order. A lucky number is an element of the matrix such that it
 * is the minimum element in its row and maximum in its column.
 */
public class LuckyNumberInAMatrix1380 {
    public static void main(String[] args) {
        LuckyNumberInAMatrix1380 main = new LuckyNumberInAMatrix1380();
        main.luckyNumbers(new int[][]{{3,7,8},
                                      {9,11,13},
                                      {15,16,17}});  
    }

    public List<Integer> luckyNumbers (int[][] matrix) {
        int matrixLength = matrix.length;
        int rowLength = matrix[0].length;
        int[] min = new int[matrixLength]; // min per row
        int[] max = new int[rowLength]; // max per column
        Arrays.fill(min, Integer.MAX_VALUE);
        /**
         * Get the min and max of each row and colum
         * min = [3,9,15] max = [15,16,17]
         * Where ever the min and max are the same is the lucky number
         */
        for (int i = 0; i < matrixLength; i++) {
            for (int j = 0; j < rowLength; j++) {
                min[i] = Math.min(matrix[i][j], min[i]);
                max[j] = Math.max(matrix[i][j], max[j]);
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrixLength; i++) {
            for (int j = 0; j < rowLength; j++) {
                if (min[i] == max[j]) {
                    list.add(min[i]);
                }
            }
        }
        return list;
    }
}
