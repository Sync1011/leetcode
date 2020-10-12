/**
 * https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/
 * 
 * Given a sentence that consists of some words separated by a single space, and a searchWord.
 * You have to check if searchWord is a prefix of any word in sentence.
 * Return the index of the word in sentence where searchWord is a prefix of this word (1-indexed).
 */
public class CheckIfAWordOccursAsAPrefixOfAnyWordInASentence1455 {
    public static void main(String[] args) {
        CheckIfAWordOccursAsAPrefixOfAnyWordInASentence1455 main = new CheckIfAWordOccursAsAPrefixOfAnyWordInASentence1455();
        System.out.println(main.isPrefixOfWord("i love eating burger", "burg"));
    }

    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(searchWord)) {
                return i+1;
            }
        }
        return -1;
    }
}
