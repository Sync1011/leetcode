/**
 * https://leetcode.com/problems/maximum-subarray/
 * 
 * Given an integer array nums, 
 * find the contiguous subarray (containing at least one number) 
 * which has the largest sum and return its sum.
 */

public class MaximumSubarray53 {
    public static void main(String[] args) {
        MaximumSubarray53 main = new MaximumSubarray53();
        System.out.println(main.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
    
    public int maxSubArray(int[] nums) {
        int maxSoFar = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int num : nums) {
            currentSum += num;
            if (currentSum > maxSoFar) {
                maxSoFar = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSoFar;
    }
}
