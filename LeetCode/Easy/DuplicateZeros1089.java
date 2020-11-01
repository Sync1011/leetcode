/**
 * https://leetcode.com/problems/duplicate-zeros/
 * 
 * Given a fixed length array arr of integers, 
 * duplicate each occurrence of zero, shifting the remaining elements to the right.
 */
public class DuplicateZeros1089 {
    public static void main(String[] args) {
        DuplicateZeros1089 main = new DuplicateZeros1089();
        main.duplicateZeros(new int[]{1,0,2,3,0,4,5,0});
    }

    public void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                shift(arr, i, arr.length);
            }
        }
    }

    public void shift(int[] arr, int startIndex, int endIndex) {
        int countZero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) countZero++;
        }
        int len = arr.length + countZero;
        //We just need O(1) space if we scan from back
        //i point to the original array, j point to the new location
        for (int i = arr.length - 1, j = len - 1; i < j; i--, j--) {
            if (arr[i] != 0) {
                if (j < arr.length) arr[j] = arr[i];
            } else {
                if (j < arr.length) arr[j] = arr[i];
                j--;
                if (j < arr.length) arr[j] = arr[i]; //copy twice when hit '0'
            }
        }
    }
}
