import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/find-all-duplicates-in-an-array/
 * 
 * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), 
 * some elements appear twice and others appear once.
 * Find all the elements that appear twice in this array.
 */
public class FindAllDuplicatesInAnArray442 {
    public static void main(String[] args) {
        FindAllDuplicatesInAnArray442 main = new FindAllDuplicatesInAnArray442();
        List<Integer> result = main.findDuplicates(new int[]{4,3,2,7,8,2,3,1});
        for (int num : result) {
            System.out.println(num);
        }
    }
    
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                result.add(index+1);
            } else {
                nums[index] = -nums[index];
            }
        }
        return result;
    }
}
