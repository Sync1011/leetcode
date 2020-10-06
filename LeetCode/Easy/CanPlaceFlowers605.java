/**
 * https://leetcode.com/problems/can-place-flowers/
 * 
 * Suppose you have a long flowerbed in which some of the plots are planted and some are not. 
 * However, flowers cannot be planted in adjacent plots - they would compete for water and both would die.
 * Given a flowerbed (represented as an array containing 0 and 1, where 0 means empty and 1 means not empty), and a number n, 
 * return if n new flowers can be planted in it without violating the no-adjacent-flowers rule.
 * 
 * Input: flowerbed = [1,0,0,0,1], n = 1
 * Output: True
 */
public class CanPlaceFlowers605 {
    public static void main(String[] args) {
        CanPlaceFlowers605 main = new CanPlaceFlowers605();
        System.out.println(main.canPlaceFlowers(new int[]{1,0,0,0,1}, 1));
        System.out.println(main.canPlaceFlowers(new int[]{1,0,0,0,1}, 2));
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        /**
         * For every 0 value, check if both adjacent values are also zeros.
         * For the first and last elements, 
         *      we need not check the previous and the next adjacent positions respectively.
         */
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 &&
                (i == 0 || flowerbed[i-1] == 0) &&
                (i == flowerbed.length-1 || flowerbed[i+1] == 0)) {
                    count++;
                    flowerbed[i] = 1;
                }
        }
        return count >= n;
    }
}
