/**
 * https://leetcode.com/problems/product-of-array-except-self/
 */
public class ProductOfArrayExceptSelf238 {
    public static void main(String[] args) {
        ProductOfArrayExceptSelf238 main = new ProductOfArrayExceptSelf238();
        main.productExceptSelf(new int[]{1,2,3,4});
    }

    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = 1;
        // Calculate the product of everything to the left of i.
        // start 0 with 1 since there is nothing to the left of it
        for (int i = 1; i < nums.length; i++) {
            ans[i] = ans[i - 1] * nums[i-1];
        }

        // calculate everything to the right of i.
        // start end with 1 since there is nothing to the right of it
        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] *= right;
            right *= nums[i];
        }

        return ans;
    }
}
