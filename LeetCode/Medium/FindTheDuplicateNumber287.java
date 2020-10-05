/**
 * https://leetcode.com/problems/find-the-duplicate-number
 * 
 * Given an array of integers nums containing n + 1 integers 
 * where each integer is in the range [1, n] inclusive.
 * There is only one duplicate number in nums, return this duplicate number.
 * 
 * Input: nums = [1,3,4,2,2]
 * Output: 2
 */

public class FindTheDuplicateNumber287 {
    public static void main(String[] args) {
        FindTheDuplicateNumber287 main = new FindTheDuplicateNumber287();
        System.out.println(main.findDuplicate(new int[]{1,3,4,2,2}));
    }

    public int findDuplicate(int[] nums) {
        int[] count = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] > 1) {
                return i;
            }
        }
        return -1;
    }
}
