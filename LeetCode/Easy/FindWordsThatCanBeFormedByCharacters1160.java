import java.util.Arrays;

/**
 * https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/
 * 
 * You are given an array of strings words and a string chars. A string is good
 * if it can be formed by characters from chars (each character can only be used
 * once). Return the sum of lengths of all good strings in words.
 */
public class FindWordsThatCanBeFormedByCharacters1160 {
    public static void main(String[] args) {
        FindWordsThatCanBeFormedByCharacters1160 main = new FindWordsThatCanBeFormedByCharacters1160();
        main.countCharacters(new String[]{"hello", "world", "leetcode"}, "welldonehoneyr");
    }

    public int countCharacters(String[] words, String chars) {
        int[] seen = new int[26];
        for (char c : chars.toCharArray()) {
            seen[c -'a']++;
        }
        int result = 0;
        for (String s : words) {
            int[] tSeen = Arrays.copyOf(seen, seen.length); 
            int Tcount = 0;
            for (char c : s.toCharArray()) {
                if (tSeen[c - 'a'] > 0) {
                    tSeen[c-'a']--;
                    Tcount++;
                }
            }
            if (Tcount == s.length()) {
                result += Tcount;
            }
        }
        return result;
    }
}
