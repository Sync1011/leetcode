/**
 * https://leetcode.com/problems/to-lower-case
 * 
 * Implement function ToLowerCase() 
 * that has a string parameter str, and returns the same string in lowercase.
 */
public class ToLowerCase709 {
    public static void main(String[] args) {
        ToLowerCase709 main = new ToLowerCase709();
        System.out.println(main.toLowerCase("Hello"));
    }

    public String toLowerCase(String str) {
        char[] a = str.toCharArray();
        for (int i = 0; i < a.length; i++){
            if ('A' <= a[i] && a[i] <= 'Z') {
                a[i] = (char) (a[i] - 'A' + 'a');
            }
        }
        return new String(a);
    }
}
