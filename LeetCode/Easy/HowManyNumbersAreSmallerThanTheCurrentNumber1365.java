/**
 * https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 * 
 * Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. 
 * That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
 * 
 * Input: nums = [8,1,2,2,3]
 * Output: [4,0,1,1,3]
 */
public class HowManyNumbersAreSmallerThanTheCurrentNumber1365 {
    public static void main(String[] args) {
        HowManyNumbersAreSmallerThanTheCurrentNumber1365 main = new HowManyNumbersAreSmallerThanTheCurrentNumber1365();
        main.smallerNumbersThanCurrent(new int[]{8,1,2,2,3});
    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] bucket = new int[101];
        for (int num : nums) {
            bucket[num]++;
        }

        /**
         * After the count has been populated in the bucket above.
         * We then iterate the bucket again and add the previous count to the current index.
         * This tells us how many numbers are smaller than the current index.
         */
        for (int i = 1; i < 100; i++) {
            bucket[i] += bucket[i-1];
        }

        /**
         * Finally we iterate the original nums array 
         * get the index from bucket corresponding to the value of the number from nums - 1 
         * (minus one because without it we also get the ones equal to it and we only want smaller). 
         */
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if (val == 0) {
                res[i] = 0;
            } else {
                int val2 = bucket[val - 1];
                res[i] = val2;
            }
        }
        return res;
    }
}
