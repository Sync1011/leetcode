/**
 * https://leetcode.com/problems/three-consecutive-odds/
 * 
 * Given an integer array arr, return true if there are three consecutive odd numbers in the array. 
 * Otherwise, return false.
 */
public class ThreeConsecutiveOdds1550 {
    public static void main(String[] args) {
        ThreeConsecutiveOdds1550 main = new ThreeConsecutiveOdds1550();
        System.out.println(main.threeConsecutiveOdds(new int[]{2,6,4,1}));
        System.out.println(main.threeConsecutiveOdds(new int[]{1,2,34,3,4,5,7,23,12}));
    }

    public boolean threeConsecutiveOdds(int[] arr) {
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            } else {
                oddCount = 0;
            }
            if (oddCount == 3) {
                return true;
            }
        }
        return false;
    }
}

