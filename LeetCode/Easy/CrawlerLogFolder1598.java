import java.util.Stack;

/**
 * https://leetcode.com/problems/crawler-log-folder/
 */
public class CrawlerLogFolder1598 {
    public static void main(String[] args) {
        CrawlerLogFolder1598 main = new CrawlerLogFolder1598();
        System.out.println(main.minOperations(new String[]{"d1/","d2/","../","d21/","./"}));
        System.out.println(main.minOperations(new String[]{"d1/","d2/","./","d3/","../","d31/"}));
        System.out.println(main.minOperations(new String[]{"d1/","../","../","../"}));
        System.out.println(main.minOperations(new String[]{"./","../","./"}));
    }

    public int minOperations(String[] logs) {
        Stack<String> stack = new Stack<>();
        for (String log : logs) {
            if (log.equals("./")) {
                continue;
            }
            if (log.equals("../") && !stack.empty()) {
                stack.pop();
                continue;
            } else if (log.equals("../") && stack.isEmpty()) {
                continue;
            } else {
                stack.push(log);
            }
        }
        return stack.size();
    }
}
