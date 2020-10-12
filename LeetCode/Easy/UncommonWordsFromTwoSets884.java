import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/uncommon-words-from-two-sentences/
 * 
 * We are given two sentences A and B. (A sentence is a string of space
 * separated words. Each word consists only of lowercase letters.) A word is
 * uncommon if it appears exactly once in one of the sentences, and does not
 * appear in the other sentence.
 * 
 * Input: A = "this apple is sweet", B = "this apple is sour" Output:
 * ["sweet","sour"]
 */
public class UncommonWordsFromTwoSets884 {
    public static void main(String[] args) {
        UncommonWordsFromTwoSets884 main = new UncommonWordsFromTwoSets884();
        main.uncommonFromSentences("this apple is sweet", "this apple is sour");
    }

    public String[] uncommonFromSentences(String A, String B) {
        Set<String> distinct = new HashSet<>();
        Set<String> common = new HashSet<>();
        String[] a = A.split("\\s");
        for (String s : a) {
            if (!common.contains(s) && !distinct.contains(s)) {
                distinct.add(s);
            } else {
                distinct.remove(s);
                common.add(s);
            }
        }
        String[] b = B.split("\\s");
        for (String s : b) {
            if (!common.contains(s) && !distinct.contains(s)) {
                distinct.add(s);
            } else {
                distinct.remove(s);
                common.add(s);
            }
        }
        return distinct.toArray(new String[0]);
    }
}
