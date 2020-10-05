import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode.com/problems/unique-number-of-occurrences
 * 
 * Given an array of integers arr, 
 * write a function that returns true if and only if the number of occurrences of each value in the array is unique.
 *
 * Input: arr = [1,2,2,1,1,3]
 * Output: true
 */

public class UniqueNumberOfOccurences1207 {
    public static void main(String[] args) {
        UniqueNumberOfOccurences1207 main = new UniqueNumberOfOccurences1207();
        System.out.println(main.uniqueOccurrences(new int[]{1,2,2,1,1,3}));
    }

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        Set<Integer> set = new HashSet<>();
        for (int num : map.values()) {
            if (set.contains(num)) {
                return false;
            } else {
                set.add(num);
            }
        }
        return true;
    }
}
