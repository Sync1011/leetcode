import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/majority-element/
 * 
 * Given an array of size n, find the majority element. 
 * The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 */

public class MajorityElement169 {
    public static void main(String[] args) {
        MajorityElement169 main = new MajorityElement169();
        System.out.println(main.majorityElement(new int[]{3,2,3}));
    }

    public int majorityElement(int[] nums) {
        int n = nums.length/2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : nums) {
            if (map.get(num) > n) {
                return num;
            }
        }
        return -1;
    }
}
