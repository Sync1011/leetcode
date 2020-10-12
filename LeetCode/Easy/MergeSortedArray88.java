/**
 * https://leetcode.com/problems/merge-sorted-array/
 * 
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * 
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * Output: [1,2,2,3,5,6]
 */
public class MergeSortedArray88 {
    public static void main(String[] args) {
        MergeSortedArray88 main = new MergeSortedArray88();
        main.merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mTail = m - 1;
        int nTail = n - 1;
        int index = nums1.length - 1;
        int valueToUse = 0;
        while (mTail >= 0 && nTail >= 0) {
            if (nums1[mTail] > nums2[nTail]) {
                valueToUse = nums1[mTail];
                mTail--;
            } else {
                valueToUse = nums2[nTail];
                nTail--;
            }
            nums1[index] = valueToUse;
            index--;
        }

        while (nTail >= 0) {
            nums1[index] = nums2[nTail];
            index--;
            nTail--;
        }
    }
}
