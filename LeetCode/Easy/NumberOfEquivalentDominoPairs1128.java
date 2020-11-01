import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/number-of-equivalent-domino-pairs/
 * 
 * Given a list of dominoes, dominoes[i] = [a, b] is equivalent to dominoes[j] =
 * [c, d] if and only if either (a==c and b==d), or (a==d and b==c) that is, one
 * domino can be rotated to be equal to another domino.
 */
public class NumberOfEquivalentDominoPairs1128 {
    public static void main(String[] args) {
        NumberOfEquivalentDominoPairs1128 main = new NumberOfEquivalentDominoPairs1128();
        System.out.println(main.numEquivDominoPairs(new int[][]{{1,2},{2,1},{3,4},{5,6}}));
    }

    public int numEquivDominoPairs(int[][] dominoes) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] domino : dominoes) {
            // For [1,2] and [2,1] this will give us 12
            // Times by 10 because the problem says each value is <9 so this avoids collisions in the map
            int value = Math.min(domino[0], domino[1]) * 10 + Math.max(domino[0], domino[1]);
            int currentVal = map.getOrDefault(value, 0);
            result += currentVal;
            map.put(value, currentVal + 1);
        }
        return result;
    }
}
