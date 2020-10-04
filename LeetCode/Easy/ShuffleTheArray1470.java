/**
 * https://leetcode.com/problems/shuffle-the-array
 * 
 * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
 * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 * 
 * Input: nums = [2,5,1,3,4,7], n = 3
 * Output: [2,3,5,4,1,7] 
 * Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
 */

public class ShuffleTheArray1470 {
    public static void main(String[] args) {
        ShuffleTheArray1470 main = new ShuffleTheArray1470();
        int[] arr = main.shuffle(new int[]{2,5,1,3,4,7}, 3);
        for (int num : arr) {
            System.out.println(num);
        }
    }

    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[n*2];
        for (int i = 0, j = n, index = 0; index < arr.length; i++, j++) {
            arr[index++] = nums[i];
            arr[index++] = nums[j];
        }
        return arr;
    }
}
