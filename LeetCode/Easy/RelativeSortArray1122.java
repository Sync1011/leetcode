/**
 * https://leetcode.com/problems/relative-sort-array/
 */
public class RelativeSortArray1122 {
    public static void main(String[] args) {
        RelativeSortArray1122 main = new RelativeSortArray1122();
        main.relativeSortArray(new int[]{2,3,1,3,2,4,6,7,9,2,19}, new int[]{2,1,4,3,9,6});
    }

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];
        for (int num : arr1) {
            count[num]++;
        }

        int i = 0;
        for (int num : arr2) {
            while (count[num] > 0) {
                arr1[i] = num;
                count[num]--;
                i++;
            }
        }
        for (int j = 0; j < count.length; j++) {
            while (count[j] > 0) {
                arr1[i] = j;
                i++;
                count[j]--;
            }
        }
        return arr1;
    }
}
