/**
 * https://leetcode.com/problems/find-lucky-integer-in-an-array/
 * 
 * Given an array of integers arr, a lucky integer is an integer which has a frequency in the array equal to its value.
 * Return a lucky integer in the array. 
 * If there are multiple lucky integers return the largest of them. 
 * If there is no lucky integer return -1.
 * 
 * Input: arr = [1,2,2,3,3,3]
 * Output: 3
 */
public class FindLuckyIntegerInAnArray1394 {
    public static void main(String[] args) {
        FindLuckyIntegerInAnArray1394 main = new FindLuckyIntegerInAnArray1394();
        System.out.println(main.findLucky(new int[]{1,2,2,3,3,3}));
    }

    public int findLucky(int[] arr) {
        int[] count = new int[501];
        for (int num : arr) {
            count[num]++;
        }

        int max = -1;
        for (int i = 1; i < count.length-1; i++) {
            if (i == count[i]) {
                if (i > max) {
                    max = i;
                }
            }
        }
        return max;
    }
}
