/**
 * https://leetcode.com/problems/remove-element/
 * 
 * Given an array nums and a value val, 
 * remove all instances of that value in-place and return the new length.
 * 
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */

public class RemoveElement27 {
    public static void main(String[] args) {
        RemoveElement27 main = new RemoveElement27();
       // System.out.println(main.removeElement(new int[]{3,2,2,3}, 3));
        System.out.println(main.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }

    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
