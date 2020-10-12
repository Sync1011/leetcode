import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/buddy-strings/
 * 
 * Given two strings A and B of lowercase letters, 
 * return true if you can swap two letters in A so the result is equal to B, 
 * otherwise, return false.
 * Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j 
 * and swapping the characters at A[i] and A[j]. 
 * For example, swapping at indices 0 and 2 in "abcd" results in "cbad".
 */

public class BuddyStrings859 {
    public static void main(String[] args) {
        BuddyStrings859 main = new BuddyStrings859();
        System.out.println(main.buddyStrings("ab", "ba"));
    }

    public boolean buddyStrings(String A, String B) {
        if (A == null || B == null) {
            return false;
        }
        if (A.length() != B.length()) {
            return false;
        }

        Set<Character> set = new HashSet<>();
        if (A.equals(B)) {
            for (char c : A.toCharArray()) {
                set.add(c);
            }
            return set.size() < A.length();
        }

        int firstIndex = -1;
        int secondIndex = -1;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                if (firstIndex == -1) {
                    firstIndex = i;
                } else if (secondIndex == -1) {
                    secondIndex = i;
                } else {
                    return false;
                }
            }
        }

        return (secondIndex != -1 && A.charAt(firstIndex) == B.charAt(secondIndex) 
            && A.charAt(secondIndex) == B.charAt(firstIndex));
    }
}
