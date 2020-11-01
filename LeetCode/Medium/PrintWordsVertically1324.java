import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/print-words-vertically/
 */
public class PrintWordsVertically1324 {
    public static void main(String[] args) {
        PrintWordsVertically1324 main = new PrintWordsVertically1324();
        main.printVertically("TO BE OR TO BE NOT");
    }
    public List<String> printVertically(String s) {
        int maxWordLength = 0;
        for (String word : s.split(" ")) {
            maxWordLength = Math.max(maxWordLength, word.length());
        }

        List<String> ans = new ArrayList<>();
        for (int i = 0; i < maxWordLength; i ++) {
            StringBuilder sb = new StringBuilder();
            for (String word : s.split(" ")) {
                if (i < word.length()) {
                    sb.append(word.charAt(i));
                } else {
                    sb.append(" ");
                }
            }
            while (sb.charAt(sb.length() - 1) == ' ') {
                sb.deleteCharAt(sb.length()-1);
            }
            ans.add(sb.toString());
        }
        return ans;
    }
}
