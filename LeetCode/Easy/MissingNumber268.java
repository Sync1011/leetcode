/**
 * https://leetcode.com/problems/missing-number
 * 
 * Given an array nums containing n distinct numbers in the range [0, n], 
 * return the only number in the range that is missing from the array.
 * 
 * Input: nums = [3,0,1]
 * Output: 2
 */
public class MissingNumber268 {
    public static void main(String[] args) {
        MissingNumber268 main = new MissingNumber268();
        System.out.println(main.missingNumber(new int[]{3,0,1}));
    }

    public int missingNumber(int[] nums) {
        int[] count = new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            int index = nums[i];
            count[index]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}
