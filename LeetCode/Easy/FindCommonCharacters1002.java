import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/find-common-characters/
 * 
 * Given an array A of strings made only from lowercase letters, return a list
 * of all characters that show up in all strings within the list (including
 * duplicates). For example, if a character occurs 3 times in all strings but
 * not 4 times, you need to include that character three times in the final
 * answer.
 * 
 * Input: ["bella","label","roller"] Output: ["e","l","l"]
 */
public class FindCommonCharacters1002 {
    public static void main(String[] args) {
        FindCommonCharacters1002 main = new FindCommonCharacters1002();
        main.commonChars(new String[]{"bella","label","roller"});
    }

    public List<String> commonChars(String[] A) {
        int[] dict = new int[26];
        for (char c : A[0].toCharArray()) {
            dict[c - 'a']++;
        }

        for (int i = 1; i < A.length; i++) {
            int[] curr = new int[26];
            for (char c : A[i].toCharArray()) {
                curr[c - 'a']++;
            }

            for (int j = 0; j < 26; j++) {
                if (curr[j] < dict[j]) {
                    dict[j] = curr[j];
                }
            }
        }

        List<String> ans = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < dict[i]; j++) {
                ans.add(Character.toString((char) ('a' + i)));
            }
        }
        return ans;
    }
}
