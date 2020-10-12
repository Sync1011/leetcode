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
        int[] result = main.shortestToChar("loveleetcode", 'e');
        for (int num : result) {
            System.out.print(num + ", ");
        }
    }

    public int[] shortestToChar(String S, char C) {
        int cIndex = 0, sIndex = 0, lastC = -1;
        int[] arr = new int[S.length()];
        while (cIndex < S.length()){
            // Find the first/next occurrence of C in S
			while (cIndex < S.length() && S.charAt(cIndex) != C) {
				cIndex++;
            }
            // Move the S pointer until C and fill the result with the shortest distance
            while (sIndex < cIndex) {
                if (lastC == -1) {
                    // Initial stage where there is no previous occurrence of C in S yet
                    arr[sIndex] = cIndex - sIndex;
                } else if (cIndex < S.length() && S.charAt(cIndex) == C) {
                    // You have both previous and the next occurrences of C in S - Get the minimum
                    int val1 = cIndex - sIndex;
                    int val2 = sIndex - lastC;
                    arr[sIndex] = Math.min(val1, val2);
                } else {
					// Last stage where you crossed the last occurrence of C in S
					arr[sIndex] = sIndex - lastC;
                }
                sIndex++;
            }

            lastC = cIndex;
            cIndex++;
            sIndex++;
        }
        return arr;
    }
}
