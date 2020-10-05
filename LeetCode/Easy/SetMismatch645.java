/**
 * Given an array nums representing the data status of this set after the error. 
 * Your task is to firstly find the number occurs twice and then find the number that is missing. 
 * Return them in the form of an array.
 * 
 * Input: nums = [1,2,2,4]
 * Output: [2,3]
 */

public class SetMismatch645 {
    public static void main(String[] args) {
        SetMismatch645 main = new SetMismatch645();
        int[] res = main.findErrorNums(new int[]{1,2,2,4});
        for (int num : res) {
            System.out.println(num);
        }
    }

    public int[] findErrorNums(int[] nums) {
        int[] count = new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        int[] res = new int[2];
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 1) {
                res[0] = i;
            }
            if (count[i] == 0) {
                res[1] = i;
            }
        }
        return res;
    }
}
