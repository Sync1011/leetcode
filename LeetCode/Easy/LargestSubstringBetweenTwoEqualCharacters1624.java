import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/largest-substring-between-two-equal-characters/
 * 
 * Given a string s, return the length of the longest substring between two equal characters, 
 * excluding the two characters. If there is no such substring return -1.
 */
public class LargestSubstringBetweenTwoEqualCharacters1624 {
    public static void main(String[] args) {
        LargestSubstringBetweenTwoEqualCharacters1624 main = new LargestSubstringBetweenTwoEqualCharacters1624();
        System.out.println(main.maxLengthBetweenEqualCharacters("cabbac"));
    }

    public int maxLengthBetweenEqualCharacters(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int max = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, i);
            } else {
                max = Math.max(max, i - map.get(c) - 1);
            }
        }
        return max;
    }
}
