/**
 * https://leetcode.com/problems/rotate-array/
 * 
 * Given an array, rotate the array to the right by k steps, where k is non-negative.
 */

public class RotateArray189 {
    public static void main(String[] args) {
        RotateArray189 main = new RotateArray189();
        main.rotate(new int[]{1,2,3,4,5,6,7}, 3);
    }

    public void rotate(int[] nums, int k) {
        k %= nums.length;
        rotateHelper(nums, 0, nums.length-1);
        rotateHelper(nums, 0, k-1);
        rotateHelper(nums, k, nums.length-1);
    }

    private void rotateHelper(int[] nums, int start, int end) {
        while (start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }
}
