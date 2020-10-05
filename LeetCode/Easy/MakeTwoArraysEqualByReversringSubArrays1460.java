/**
 * https://leetcode.com/problems/make-two-arrays-equal-by-reversing-sub-arrays
 * 
 * Given two integer arrays of equal length target and arr.
 * In one step, you can select any non-empty sub-array of arr and reverse it. 
 * You are allowed to make any number of steps.
 * Return True if you can make arr equal to target, or False otherwise.
 * 
 * Input: target = [1,2,3,4], arr = [2,4,1,3]
 * Output: true
 */

public class MakeTwoArraysEqualByReversringSubArrays1460 {
    public static void main(String[] args) {
        MakeTwoArraysEqualByReversringSubArrays1460 main = new MakeTwoArraysEqualByReversringSubArrays1460();
        System.out.println(main.canBeEqual(new int[]{1,2,3,4}, new int[]{2,4,1,3}));
    }

    public boolean canBeEqual(int[] target, int[] arr) {
        int[] res = new int[1001];
        for (int i = 0; i < target.length; i++) {
            res[target[i]]++;
            res[arr[i]]--;
        }
        for (int i = 0; i < 1001; i++) {
            if (res[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
