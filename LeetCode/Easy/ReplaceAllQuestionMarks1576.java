/**
 * NOT DONE 
 * 
 * https://leetcode.com/problems/replace-all-s-to-avoid-consecutive-repeating-characters/
 * 
 * Given a string s containing only lower case English letters and the '?' character, 
 * convert all the '?' characters into lower case letters such that the final string does not contain any consecutive repeating characters. 
 * You cannot modify the non '?' characters.
 * 
 * Input: s = "?zs"
 * Output: "azs"
 */
public class ReplaceAllQuestionMarks1576 {
    public static void main(String[] args) {
        ReplaceAllQuestionMarks1576 main = new ReplaceAllQuestionMarks1576();
     //   System.out.println(main.modifyString("?zs"));
        System.out.println(main.modifyString("??yw?ipkj?"));
    }

    public String modifyString(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '?') {
                for (int j = 0; j < 3; j++) {
                    if (i > 0 ) {
                        int value = arr[i - 1] - 'a';
                        if (value == j) {
                            continue;
                        }
                    }
                    if (i + 1 < arr.length) {
                        int value2 = arr[i + 1] - 'a';
                        if (value2 == j) {
                            continue;
                        }
                    }
                    char tmp = (char) ('a' + j);
                    arr[i] = tmp;
                }
            }
        }
        return String.valueOf(arr);
    }
}
