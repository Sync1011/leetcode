/**
 * https://leetcode.com/problems/sort-an-array/
 */
public class SortAnArray912 {
    public static void main(String[] args) {
        SortAnArray912 main = new SortAnArray912();
        main.sortArray(new int[]{5,2,3,1});
    }

    public int[] sortArray(int[] nums) {
        int[] count = new int[100001];
        for (int num : nums) {
            // add 50000 to make it positive and that is the lowest/highest value can be
            count[num+50000]++;
        }
        
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                nums[index] = i-50000;
                count[i]--;
                index++;
            }
        }
        return nums;
    }
}
