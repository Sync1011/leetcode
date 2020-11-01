import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/goat-latin/
 */
public class GoatLatin824 {
    public static void main(String[] args) {
        GoatLatin824 main = new GoatLatin824();
        System.out.println(main.toGoatLatin("I speak Goat Latin"));
    }

    public String toGoatLatin(String S) {
        String[] words = S.split(" ");
        String res = "";
        String a = "a";
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        for (String word : words) {
            if (!res.equals("")) {
                res += " ";
            }
            if (vowels.contains(word.charAt(0))) {
                res += word;
            } else {
                res += word.substring(1);
                res += word.charAt(0);
            }
            res += "ma";
            res += a;
            a += "a";
        }
        return res;
    }
}
