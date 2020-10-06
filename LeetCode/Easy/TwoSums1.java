import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/
 * 
 * Given an array of integers nums and an integer target, 
 * return indices of the two numbers such that they add up to target.
 * 
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 */
public class TwoSums1 {
    public static void main(String[] args) {
        TwoSums1 main = new TwoSums1();
        main.twoSum(new int[]{2,7,11,15}, 9);
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int remainder = target-nums[i];
            if (map.containsKey(remainder)) {
                return new int[]{map.get(remainder), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
