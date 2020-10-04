import java.util.HashMap;

/**
 * Given a string s formed by digits ('0' - '9') and '#' . We want to map s to
 * English lowercase characters as follows: Characters ('a' to 'i') are
 * represented by ('1' to '9') respectively. Characters ('j' to 'z') are
 * represented by ('10#' to '26#') respectively. Return the string formed after
 * mapping. It's guaranteed that a unique mapping will always exist.
 * 
 * Input: s = "10#11#12" Output: "jkab" Explanation: "j" -> "10#" , "k" -> "11#"
 * , "a" -> "1" , "b" -> "2".
 */

public class DecryptStringFromAlphabetToIntegerMapping {
    public static void main(String[] args) {
        DecryptStringFromAlphabetToIntegerMapping main = new DecryptStringFromAlphabetToIntegerMapping();
        System.out.println(main.freqAlphabets("10#11#12"));
    }

    public String freqAlphabets(String str) {
        HashMap<String, Character> map = new HashMap<>();
        int k = 1;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (ch < 'j')
                map.put(String.valueOf(k++), ch);
            else
                map.put(String.valueOf(k++)+"#", ch);
        }

        StringBuilder sb = new StringBuilder();
        int i = str.length() - 1;
        while (i >= 0) {
            if (str.charAt(i) == '#') {
                sb.append(map.get(str.substring(i - 2, i+1)));
                i -= 3;
            } else {
                sb.append(map.get(str.substring(i, i + 1)));
                i--;
            }
        }

        return sb.reverse().toString();
    }
}
