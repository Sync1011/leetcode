/**
 * https://leetcode.com/problems/detect-capital/
 * 
 * Given a word, you need to judge whether the usage of capitals in it is right or not.
 * We define the usage of capitals in a word to be right when one of the following cases holds:
 * All letters in this word are capitals, like "USA".
 * All letters in this word are not capitals, like "leetcode".
 * Only the first letter in this word is capital, like "Google".
 * Otherwise, we define that this word doesn't use capitals in a right way.
 */
public class DetectCapital520 {
    public static void main(String[] args) {
        DetectCapital520 main = new DetectCapital520();
        System.out.println(main.detectCapitalUse("USA"));
        System.out.println(main.detectCapitalUse("FlaG"));
        System.out.println(main.detectCapitalUse("Google"));
    }

    public boolean detectCapitalUse(String word) {
        int capitalCount = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                capitalCount++;
            }
        }
        if (capitalCount == 1 && Character.isUpperCase(word.charAt(0))) {
            return true;
        }

        return capitalCount == 0 || capitalCount == word.length();
    }
}
