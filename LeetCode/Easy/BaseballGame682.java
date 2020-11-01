import java.util.Stack;

/**
 * https://leetcode.com/problems/baseball-game/
 */
public class BaseballGame682 {
    public static void main(String[] args) {
        BaseballGame682 main = new BaseballGame682();
        System.out.println(main.calPoints(new String[]{"5","2","C","D","+"}));
    }

    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for (String word : ops) {
            if (word.equals("C")) {
                stack.pop();
            } else if (word.equals("D")) {
                stack.push(stack.peek() * 2);
            } else if (word.equals("+")) {
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
            } else {
                stack.push(Integer.valueOf(word));
            }
        }

        int answer = 0;
        for (int score : stack) {
            answer += score;
        }
        return answer;
    }
}
