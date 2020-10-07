import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/reverse-vowels-of-a-string/
 * 
 * Write a function that takes a string as input and reverse only the vowels of
 * a string.
 * 
 * Input: "hello" Output: "holle"
 */

public class ReverseVowelsOfAString345 {
    public static void main(String[] args) {
        ReverseVowelsOfAString345 main = new ReverseVowelsOfAString345();
        System.out.println(main.reverseVowels("hello"));
    }

    public String reverseVowels(String s) {
        Set<Character> set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        int left = 0;
        int right = s.length()-1;
        char[] arr = s.toCharArray();
        while (left < right) {
            if (!set.contains(arr[left])) {
                left++;
                continue;
            }
            if (!set.contains(arr[right])) {
                right--;
            }
            char tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
        return String.valueOf(arr);
    }
}
