import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/intersection-of-two-arrays
 * 
 * Given two arrays, write a function to compute their intersection.
 * 
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4] Output: [9,4]
 */
public class IntersectionOfTwoArraysII350 {
    public static void main(String[] args) {
        IntersectionOfTwoArraysII350 main = new IntersectionOfTwoArraysII350();
        int[] result = main.intersect(new int[]{4,9,5}, new int[]{9,4,9,8,4});
        for (int num : result) {
            System.out.println(num);
        }
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> results = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            if (map.containsKey(num)) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            } else {
                map.put(num, 1);
            }
        }

        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                results.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        int[] r = new int[results.size()];
        for(int i = 0; i < results.size(); i++) {
           r[i] = results.get(i);
        }
    
       return r;
    }
}
