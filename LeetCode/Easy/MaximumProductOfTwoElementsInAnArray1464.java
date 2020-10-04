/**
 * https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
 * 
 * Given the array of integers nums, you will choose two different indices i and j of that array. 
 * Return the maximum value of (nums[i]-1)*(nums[j]-1).
 */

public class MaximumProductOfTwoElementsInAnArray1464 {
    public static void main(String[] args) {
        MaximumProductOfTwoElementsInAnArray1464 main = new MaximumProductOfTwoElementsInAnArray1464();
        System.out.println(main.maxProduct(new int[]{3,4,5,2}));
        System.out.println(main.maxProduct(new int[]{1,5,4,5}));
        System.out.println(main.maxProduct(new int[]{3,7}));
    }

    public int maxProduct(int[] nums) {
        int highest = 0;
        int secondHighest = 0;
        for (int num : nums) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest) {
                secondHighest = num;
            }
        }
        return (highest-1)*(secondHighest-1);
    }
}
