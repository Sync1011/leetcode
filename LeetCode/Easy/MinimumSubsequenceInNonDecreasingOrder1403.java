import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/minimum-subsequence-in-non-increasing-order/
 */
public class MinimumSubsequenceInNonDecreasingOrder1403 {
    public static void main(String[] args) {
        MinimumSubsequenceInNonDecreasingOrder1403 main = new MinimumSubsequenceInNonDecreasingOrder1403();
        main.minSubsequence(new int[]{4,3,10,9,8});
    }

    public List<Integer> minSubsequence(int[] nums) {
        int totalSum = 0;
        int[] count = new int[101];
        for (int num : nums) {
            count[num]++;
        }

        List<Integer> res = new ArrayList<>();
        int currentSum = 0;
        for (int i = count.length-1; i >= 0; i--) {
            while (count[i] > 0) {
                res.add(i);
                currentSum += i;
                count[i]--;
                if (currentSum > (totalSum - currentSum)) {
                    i = -1;
                    break;
                }
            }
        }
        return res;
    }
}
