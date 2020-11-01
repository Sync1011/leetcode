/**
 * https://leetcode.com/problems/longest-common-prefix/
 * 
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 */
public class LongestCommonPrefix14 {
    public static void main(String[] args) {
        LongestCommonPrefix14 main = new LongestCommonPrefix14();
        main.longestCommonPrefix(new String[]{"flower","flow","flight"});
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        /**
         * Start by setting the prefix to the first word.
         * Then check if the first word is fully in the next word.
         * If it is not, start taking one letter off the current `prefix` word until all of the word
         * is within the next word
         */
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
