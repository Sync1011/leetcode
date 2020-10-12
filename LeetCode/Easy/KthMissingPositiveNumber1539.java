import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/kth-missing-positive-number/
 * 
 * Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
 * Find the kth positive integer that is missing from this array.
 * 
 * Input: arr = [2,3,4,7,11], k = 5
 * Output: 9
* Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. 
The 5th missing positive integer is 9.
 */
public class KthMissingPositiveNumber1539 {
    public static void main(String[] args) {
        KthMissingPositiveNumber1539 main = new KthMissingPositiveNumber1539();
        System.out.println(main.findKthPositive(new int[]{2,3,4,7,11}, 5));
    }

    public int findKthPositive(int[] arr, int k) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int i = 1;
        while (k > 0) {
            if (!set.contains(i++)) {
                k--;
            }
        }
        return i - 1;
    }
}
