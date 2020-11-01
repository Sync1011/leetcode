import java.util.Stack;

/**
 * https://leetcode.com/problems/make-the-string-great/
 */
public class MakeTheStringGreat1544 {
    public static void main(String[] args) {
        MakeTheStringGreat1544 main = new MakeTheStringGreat1544();
        System.out.println(main.makeGood("leEeetcode"));
    }

    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if (!stack.isEmpty() && Math.abs(stack.peek() - s.charAt(i)) == 32) {
                stack.pop();
            } else{
                stack.push(s.charAt(i));
            }
        }

        char[] res = new char[stack.size()];
        int index = stack.size()-1;
        while (!stack.isEmpty()) {
            res[index] = stack.pop();
            index--;
        }
        return new String(res);
    }
}
