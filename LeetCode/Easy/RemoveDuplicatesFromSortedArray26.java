/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * 
 * Given a sorted array nums, 
 * remove the duplicates in-place such that each element appears only once and returns the new length.
 */

public class RemoveDuplicatesFromSortedArray26 {
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray26 main = new RemoveDuplicatesFromSortedArray26();
        System.out.println(main.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }

    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                ++i;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
