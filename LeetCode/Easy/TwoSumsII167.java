/**
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 * 
 * Given an array of integers that is already sorted in ascending order, 
 * find two numbers such that they add up to a specific target number.
 * 
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 */
public class TwoSumsII167 {
    public static void main(String[] args) {
        TwoSumsII167 main = new TwoSumsII167();
        main.twoSum(new int[]{2,7,11,15}, 9);
    }

    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        while (numbers[left] + numbers[right] != target) {
            if (numbers[left] + numbers[right] > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{left+1, right+1};
    }
}
