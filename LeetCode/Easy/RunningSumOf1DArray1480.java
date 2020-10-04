/**
 * https://leetcode.com/problems/running-sum-of-1d-array/
 * 
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 * Return the running sum of nums.
 * 
 * Examples:
 * 
 * Input: nums = [1,2,3,4]
 * Output: [1,3,6,10]
 * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 * 
 * Input: nums = [1,1,1,1,1]
 * Output: [1,2,3,4,5]
 * Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
 * 
 * Input: nums = [3,1,2,10,1]
 * Output: [3,4,6,16,17]
 */

 public class RunningSumOf1DArray1480 {
    public static void main(String[] args) {
        RunningSumOf1DArray1480 main = new RunningSumOf1DArray1480();
        int[] arr = main.runningSum(new int[]{1,2,3,4});
        for (int num : arr) {
            System.out.println(num);
        }
    }

    public int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        arr[0] = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
            arr[i] = sum;
        }
        return arr;
    }
 }