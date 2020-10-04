public class RobotReturnToOrigin657 {
    public static void main(String[] args) {
        RobotReturnToOrigin657 main = new RobotReturnToOrigin657();
        System.out.println(main.judgeCircle("UD"));
        System.out.println(main.judgeCircle("LL"));
        System.out.println(main.judgeCircle("RRDD"));
        System.out.println(main.judgeCircle("LDRRLRUULR"));
    }

    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for (char c : moves.toCharArray()) {
            if (c == 'R') {
                x++;
            } else if (c == 'L') {
                x--;
            } else if (c == 'U') {
                y++;
            } else {
                y--;
            }
        }
        return x == 0 && y == 0;
    }
}
