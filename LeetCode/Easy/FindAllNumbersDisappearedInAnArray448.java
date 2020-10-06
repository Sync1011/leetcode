import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 * 
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some
 * elements appear twice and others appear once. Find all the elements of [1, n]
 * inclusive that do not appear in this array.
 * 
 * Input: [4,3,2,7,8,2,3,1] Output: [5,6]
 */

public class FindAllNumbersDisappearedInAnArray448 {
    public static void main(String[] args) {
        FindAllNumbersDisappearedInAnArray448 main = new FindAllNumbersDisappearedInAnArray448();
        List<Integer> list = main.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1});
        for (int num : list) {
            System.out.println(num);
        }
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i+1);
            }
        }
        return result;
    }
}
