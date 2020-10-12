import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/isomorphic-strings/
 * 
 * Given two strings s and t, determine if they are isomorphic.
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * 
 * Input: s = "egg", t = "add"
 * Output: true
 */
public class IsomorphicStrings205 {
    public static void main(String[] args) {
        IsomorphicStrings205 main = new IsomorphicStrings205();
        System.out.println(main.isIsomorphic("egg", "add"));
    }

    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null) {
            return false;
        }
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i), b = t.charAt(i);
            if (map.containsKey(a)) {
                if (map.get(a) != b) {
                    return false;
                }
            } else if (!map.containsValue(b)) {
                map.put(a, b);
            } else {
                return false;
            }
        }
        return true;
    }
}
