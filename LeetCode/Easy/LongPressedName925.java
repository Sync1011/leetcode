/**
 * https://leetcode.com/problems/long-pressed-name/
 * 
 * Your friend is typing his name into a keyboard.  
 * Sometimes, when typing a character c, 
 * the key might get long pressed, and the character will be typed 1 or more times.
 * You examine the typed characters of the keyboard.  
 * Return True if it is possible that it was your friends name, 
 * with some characters (possibly none) being long pressed.
 * 
 * Input: name = "alex", typed = "aaleex"
 * Output: true
 */
public class LongPressedName925 {
    public static void main(String[] args) {
        LongPressedName925 main = new LongPressedName925();
        System.out.println(main.isLongPressedName("alex", "aaleex"));
      //  System.out.println(main.isLongPressedName("saeed", "ssaaedd"));
    }

    public boolean isLongPressedName(String name, String typed) {
        int index = 0;
        for (int j = 0; j < typed.length(); j++) {
            if (index < name.length() && name.charAt(index) == typed.charAt(j)) {
                index++;
            } else if (j == 0 || typed.charAt(j) != typed.charAt(j-1)) {
                return false;
            }
        }
        return index == name.length();
    }
}
