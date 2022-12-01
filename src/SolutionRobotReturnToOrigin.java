public class SolutionRobotReturnToOrigin {
    public SolutionRobotReturnToOrigin() {
        judgeCircle("UD");
    }

    public static void main(String[] args) {
        new SolutionRobotReturnToOrigin();
    }

    public boolean judgeCircle(String moves) {
        int y = 0;
        int x = 0;

        for(char character : moves.toCharArray()) {
            if (character == 'U') {
                y++;
            } else if (character == 'D') {
                y--;
            } else if (character == 'R') {
                x++;
            } else {
                x--;
            }
        }
        return x == 0 && y == 0;
    }
}
