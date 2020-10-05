/**
 * https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts/
 * 
 * Given an integer n, return a string with n characters such that each character in such string occurs an odd number of times.
 * The returned string must contain only lowercase English letters. 
 * If there are multiples valid strings, return any of them.  
 * 
 */

public class GenerateAStringWithCharactersThatHaveOddCounts1374 {
    public static void main(String[] args) {
        GenerateAStringWithCharactersThatHaveOddCounts1374 main = new GenerateAStringWithCharactersThatHaveOddCounts1374();
        System.out.println(main.generateTheString(4));
    }

    public String generateTheString(int n) {
        /**
         * If n is odd, generate "bbbb.....b"
         * if n is even, generate "baaaaaa....a"
         */
        String result = "";
        if (n % 2 != 0) {
            for (int i = 0; i < n; i++) {
                result += "b";
            }
        } else {
            result += "b";
            for (int i = 0; i < n-1; i++) {
                result += "a";
            }
        }
        return result;
    }
}
