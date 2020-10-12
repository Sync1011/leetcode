import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/word-pattern/
 * 
 * Given a pattern and a string s, find if s follows the same pattern. Here
 * follow means a full match, such that there is a bijection between a letter in
 * pattern and a non-empty word in s.
 */
public class WordPattern290 {
    public static void main(String[] args) {
        WordPattern290 main = new WordPattern290();
        System.out.println(main.wordPattern("abba", "dog cat cat dog"));
    }

    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        String[] words = s.split(" ");
        if(words.length != pattern.length()) {
            return false;
        }
        for (int i = 0; i < words.length; i++) {
            if (map.containsKey(pattern.charAt(i))) {
                if (!map.get(pattern.charAt(i)).equals(words[i])) {
                    return false;
                }
            } else if (!map.containsValue(words[i])) {
                map.put(pattern.charAt(i), words[i]);
            } else {
                return false;
            }
        }
        return true;
    }
}
