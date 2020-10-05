import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/intersection-of-two-arrays
 * 
 * Given two arrays, write a function to compute their intersection.
 * 
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4]
 */

public class IntersectionOfTwoArrays349 {
    public static void main(String[] args) {
        IntersectionOfTwoArrays349 main = new IntersectionOfTwoArrays349();
        int[] res = main.intersection(new int[]{1,2,2,1}, new int[]{2,2});
        for (int num : res) {
            System.out.println(num);
        }
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                list.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
