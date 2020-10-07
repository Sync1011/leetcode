/**
 * https://leetcode.com/problems/valid-anagram/
 * 
 * Given two strings s and t , write a function to determine if t is an anagram of s.
 * 
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 */
public class ValidAnagram242 {
    public static void main(String[] args) {
        ValidAnagram242 main = new ValidAnagram242();
        System.out.println(main.isAnagram("anagram", "nagaram"));
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] arr = new int[26];
        for (char c : s.toCharArray()) {
            arr[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            arr[c - 'a']--;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                return false;
            }
        }

        return true;
    }
}
