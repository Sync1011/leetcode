/**
 * https://leetcode.com/problems/third-maximum-number/
 * 
 * Given a non-empty array of integers, return the third maximum number in this array. 
 * If it does not exist, return the maximum number. The time complexity must be in O(n).
 */

public class ThirdMaximumNumber414 {
    public static void main(String[] args) {
        ThirdMaximumNumber414 main = new ThirdMaximumNumber414();
        System.out.println(new int[]{3,2,1});
    }

    public int thirdMax(int[] nums) {
        Integer max1 = null, max2 = null, max3 = null;

        for (int num : nums) {
            if (max1.equals(num) || max2.equals(num) || max3.equals(num)) {
                continue;
            }
            if (max1 == null || num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (max2 == null || num > max2) {
                max3 = max2;
                max2 = num;
            } else if (max3 == null || num > max3) {
                max3 = num;
            }
        }
        return max3 == null ? max1 : max3;
    }
}
