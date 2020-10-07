/**
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 * 
 * Given a string, find the first non-repeating character in it and return its index. 
 * If it doesn't exist, return -1.
 * 
 * s = "leetcode"
 * return 0.
 * 
 * s = "loveleetcode"
 * return 2.
 */
public class FirstUniqueCharacterInAString387 {
    public static void main(String[] args) {
        FirstUniqueCharacterInAString387 main = new FirstUniqueCharacterInAString387();
        System.out.println(main.firstUniqChar("leetcode"));
        System.out.println(main.firstUniqChar("loveleetcode"));
    }

    public int firstUniqChar(String s) {
        int freq [] = new int[26];
        for(int i = 0; i < s.length(); i ++) {
            freq[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < s.length(); i ++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
