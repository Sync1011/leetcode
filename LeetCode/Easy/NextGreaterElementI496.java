import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * https://leetcode.com/problems/next-greater-element-i/
 * 
 * You are given two arrays (without duplicates) nums1 and nums2 where nums1’s
 * elements are subset of nums2. Find all the next greater numbers for nums1's
 * elements in the corresponding places of nums2. The Next Greater Number of a
 * number x in nums1 is the first greater number to its right in nums2. If it
 * does not exist, output -1 for this number.
 */
public class NextGreaterElementI496 {
    public static void main(String[] args) {
        NextGreaterElementI496 main = new NextGreaterElementI496();
        main.nextGreaterElement(new int[]{2,4}, new int[]{1,2,3,4});
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>(); // map from x to next greater element of x
        Stack<Integer> stack = new Stack<>();
        /**
         * Key thing to note is that the question is asking for next greater element to the right
         * So we push to the stack and every time we see a greater element to its right, 
         * We add to the map numberAtTopofStack->nextGreaterElement to its right. 
         */
        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }   
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = map.getOrDefault(nums1[i], -1);
        }
        return nums1;
    }
}
