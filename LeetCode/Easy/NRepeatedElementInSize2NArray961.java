/**
 * https://leetcode.com/problems/n-repeated-element-in-size-2n-array
 * 
 * In a array A of size 2N, there are N+1 unique elements, 
 * and exactly one of these elements is repeated N times.
 * Return the element repeated N times.
 * 
 * Input: [1,2,3,3]
 * Output: 3
 */
public class NRepeatedElementInSize2NArray961 {
    public static void main(String[] args) {
        NRepeatedElementInSize2NArray961 main = new NRepeatedElementInSize2NArray961();
        System.out.println(main.repeatedNTimes(new int[]{5,1,5,2,5,3,5,4}));
    }

    public int repeatedNTimes(int[] A) {
        int[] count = new int[10000];
        for (int a : A) {
            count[a]++;
        }
        for (int a : A) {
            if (count[a] > 1) {
                return a;
            }
        }
        return -1;
    }
}
