/**
 * https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
 * 
 * Given a m * n matrix grid which is sorted in non-increasing order both row-wise and column-wise.
 */
public class CountNegativeNumbersInASortedMatrix1352 {
    public static void main(String[] args) {
        CountNegativeNumbersInASortedMatrix1352 main = new CountNegativeNumbersInASortedMatrix1352();
        System.out.println(main.countNegatives(new int[][]{{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}}));
        System.out.println(main.countNegatives(new int[][]{{5,1,0},{-5,-5,-5}}));
    }

    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = grid[i].length - 1; j >= 0; j--) {
                int value = grid[i][j];
                if (isNegative(value)) {
                    count++;
                } else {
                    break;
                }
            }
        }
        return count;
    }

    private boolean isNegative(final int value) {
        return value < 0;
    }
}
