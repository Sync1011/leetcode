import java.util.Arrays;

/**
 * https://leetcode.com/problems/create-target-array-in-the-given-order/
 * 
 * Given two arrays of integers nums and index. Your task is to create target array under the following rules:

 * Initially target array is empty.
 * From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
 * Repeat the previous step until there are no elements to read in nums and index.
 * Return the target array.

 * It is guaranteed that the insertion operations will be valid.
 * 
 * Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
 * Output: [0,4,1,3,2]
 * Explanation:
 * nums       index     target
 * 0            0        [0]
 * 1            1        [0,1]
 * 2            2        [0,1,2]
 * 3            2        [0,1,3,2]
 * 4            1        [0,4,1,3,2]
 */
public class CreateTargetArrayInTheGivenOrder1389 {
    public static void main(String[] args) {
        CreateTargetArrayInTheGivenOrder1389 main = new CreateTargetArrayInTheGivenOrder1389();
        int[] arr = main.createTargetArray(new int[]{0,1,2,3,4}, new int[]{0,1,2,2,1});
        for (int num : arr) {
            System.out.println(num);
        }
    }

    public int[] createTargetArray(int[] nums, int[] index) {
        int[] res = new int[nums.length];
        Arrays.fill(res, -1);

        for (int i = 0; i < nums.length; i++) {
            if (res[index[i]] != -1) {
                shiftElement(res, index[i]);
            }
            res[index[i]] = nums[i];
        }
        return res;
    }

    private void shiftElement(int[] arr, int startIndex) {
        /**
         * This has to start at minus 2 length because you need at least two elements to shift.
         * Starting at minus 1 length won't allow you to shift anymore to the right of the array,
         *      because there will only be one element.
         */
        for (int i = arr.length-2; i >= startIndex; i--) {
            arr[i+1] = arr[i];
        }
    }
}