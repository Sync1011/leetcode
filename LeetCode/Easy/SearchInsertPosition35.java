/**
 * https://leetcode.com/problems/search-insert-position/
 * 
 * Given a sorted array of distinct integers and a target value, 
 * return the index if the target is found. 
 * If not, return the index where it would be if it were inserted in order.
 */
public class SearchInsertPosition35 {
    public static void main(String[] args) {
        SearchInsertPosition35 main = new SearchInsertPosition35();
        System.out.println(main.searchInsert(new int[]{1,3,5,6}, 5));
    }

    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target || nums[i] > target) {
                return i;
            }
            if (i == nums.length-1 && nums[i] < target) {
                return i + 1;
            }
        }
        return -1;
    }
}
