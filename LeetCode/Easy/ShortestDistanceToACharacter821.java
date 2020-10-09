/**
 * NOT DONE
 * 
 * https://leetcode.com/problems/shortest-distance-to-a-character/
 * 
 * Given a string S and a character C, 
 * return an array of integers representing the shortest distance from the character C in the string.
 *
 * Input: S = "loveleetcode", C = 'e'
 * Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
 */

public class ShortestDistanceToACharacter821 {
    public static void main(String[] args) {
        ShortestDistanceToACharacter821 main = new ShortestDistanceToACharacter821();
        main.shortestToChar("loveleetcode", 'e');
    }

    public int[] shortestToChar(String S, char C) {
        int i = 0;
        int j = 0;
        int[] arr = new int[S.length()];
        while (j < S.length()) {
            while (j != S.length() && S.charAt(j) != C) {
                j++;
            }
            while (i < j) {
                arr[i] = (j+1) - (i+1);
                i++;
            }
            if (i == j) {
                arr[i] = 0;
                i++;
                j++;
            }
        }
        return arr;
    }
}
