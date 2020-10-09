/**
 * https://leetcode.com/problems/find-pivot-index/
 * 
 * 
 * Given an array of integers nums, write a method that returns the "pivot" index of this array.
 * We define the pivot index as the index where the sum of all the numbers to the left of the index is equal to the sum of all the numbers to the right of the index.
 * If no such index exists, we should return -1. If there are multiple pivot indexes, you should return the left-most pivot index.
 *
 * Input: nums = [1,7,3,6,5,6]
 * Output: 3
 */

public class FindPivotIndex724 {
    public static void main(String[] args) {
        FindPivotIndex724 main = new FindPivotIndex724();
        System.out.println(main.pivotIndex(new int[]{1,7,3,6,5,6}));
    }

    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            currentSum += value;
            int currentRightSum = totalSum - currentSum;
            int currentleftSum = currentSum - value;
            if (currentleftSum == currentRightSum) {
                return i;
            }
        }
        return -1;
    }
}
