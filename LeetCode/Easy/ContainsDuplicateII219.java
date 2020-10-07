import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/contains-duplicate-ii/
 * 
 * Given an array of integers and an integer k, find out whether there are two
 * distinct indices i and j in the array such that nums[i] = nums[j] and the
 * absolute difference between i and j is at most k.
 * 
 * Input: nums = [1,2,3,1], k = 3 Output: true
 */
public class ContainsDuplicateII219 {
    public static void main(String[] args) {
        ContainsDuplicateII219 main = new ContainsDuplicateII219();
        main.containsNearbyDuplicate(new int[]{1,2,3,1}, 3);
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
