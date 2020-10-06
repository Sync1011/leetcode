/**
 * https://leetcode.com/problems/move-zeroes/
 * 
 * Given an array nums, 
 * write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * 
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 */

public class MoveZeroes283 {
    public static void main(String[] args) {
        MoveZeroes283 main = new MoveZeroes283();
        main.moveZeroes(new int[]{4,2,4,0,0,3,0,5,1,0});
    }

    public void moveZeroes(int[] nums) {
        int i = 0, zeroes = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            } else {
                zeroes++;
            }
        }

        int length = nums.length-1;
        while (zeroes != 0) {
            nums[length] = 0;
            zeroes--;
            length--;
        }
    }
}
