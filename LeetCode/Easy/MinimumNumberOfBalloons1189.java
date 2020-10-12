/**
 * https://leetcode.com/problems/maximum-number-of-balloons/
 * 
 * Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.
 * You can use each character in text at most once. 
 * Return the maximum number of instances that can be formed.
 */
public class MinimumNumberOfBalloons1189 {
    public static void main(String[] args) {
        MinimumNumberOfBalloons1189 main = new MinimumNumberOfBalloons1189();
        System.out.println(main.maxNumberOfBalloons("nlaebolko"));
    }

    public int maxNumberOfBalloons(String text) {
        int[] count = new int[26];
        for (char c : text.toCharArray()) {
            count[c - 'a']++;
        }

        int b_index = 'b' - 'a';
        int a_index = 'b' - 'a';
        int l_index = 'l' - 'a';
        int o_index = 'o' - 'a';
        int n_index = 'n' - 'a';

        int result;
        result = count[b_index];
        result = Math.min(result, count[a_index]);
        result = Math.min(result, count[l_index] / 2);
        result = Math.min(result, count[o_index] / 2);
        result = Math.min(result, count[n_index]);

        return result;
    }
}
