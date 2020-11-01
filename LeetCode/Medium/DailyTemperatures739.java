import java.util.Stack;

/**
 * https://leetcode.com/problems/daily-temperatures/
 * 
 * For example, given the list of temperatures T = [73, 74, 75, 71, 69, 72, 76,
 * 73], your output should be [1, 1, 4, 2, 1, 1, 0, 0].
 */
public class DailyTemperatures739 {
    public static void main(String[] args) {
        DailyTemperatures739 main = new DailyTemperatures739();
        int[] result = main.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
        for(int num : result) {
            System.out.println(num);
        }
    }

    public int[] dailyTemperatures(int[] T) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[T.length];
        for (int i = 0; i < T.length; i++) {
            while (!stack.isEmpty() && T[i] > T[stack.peek()]) {
                int index = stack.pop();
                result[index] = i - index;
            }
            stack.push(i);
        }
        return result;
    }
}
