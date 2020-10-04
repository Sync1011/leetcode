/**
 * https://leetcode.com/problems/shuffle-string/
 * 
 * Given a string s and an integer array indices of the same length.
 * The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
 * Return the shuffled string.
 * 
 * Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
 * Output: "leetcode"
 */
public class ShuffleString1528 {
    public static void main(String[] args) {
        ShuffleString1528 main = new ShuffleString1528();
        System.out.println(main.restoreString("codeleet", new int[]{4,5,6,7,0,2,1,3}));
    }

    public String restoreString(String s, int[] indices) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[indices[i]] = s.charAt(i);
        }
        return String.valueOf(arr);
    }
}
