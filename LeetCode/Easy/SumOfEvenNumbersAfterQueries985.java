/**
 * https://leetcode.com/problems/sum-of-even-numbers-after-queries/
 */
public class SumOfEvenNumbersAfterQueries985 {
    public static void main(String[] args) {
        SumOfEvenNumbersAfterQueries985 main = new SumOfEvenNumbersAfterQueries985();
        main.sumEvenAfterQueries(new int[]{1,2,3,4}, new int[][]{{1,0},{-3,1},{-4,0},{2,3}});
    }
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] ans = new int[A.length];
        int sum = 0;
        for (int num : A) {
            if (num % 2 == 0) {
                sum += num;
            }
        }

        for (int i = 0; i < queries.length; i++) {
            int value = queries[i][0];
            int index = queries[i][1];

            if (A[index] % 2 == 0) { 
                sum -= A[index]; 
            }

            A[index] += value;
            if (A[index] % 2 == 0) { 
                sum += A[index]; 
            }
            ans[i] = sum;
        }

        return ans;
    }
}
