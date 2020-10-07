import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/contains-duplicate/
 * 
 * Given an array of integers, find if the array contains any duplicates.
 */
public class ContainsDuplicate217 {
    public static void main(String[] args) {
        ContainsDuplicate217 main = new ContainsDuplicate217();
        main.containsDuplicate(new int[]{1,2,3,1});
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.contains(num)) {
                set.add(num);
            } else {
                return false;
            }
        }
        return true;
    }
}
