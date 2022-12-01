public class SolutionDetermineColorOfAChessboardSquare {
    public SolutionDetermineColorOfAChessboardSquare() {
        squareIsWhite("a1");
    }

    public static void main(String[] args) {
        new SolutionDetermineColorOfAChessboardSquare();
    }

    public boolean squareIsWhite(String coordinates) {
        int coordinate2 = Integer.parseInt(coordinates.substring(1,2));
        int coordinate1 = coordinates.toCharArray()[0] - 96; //ascii conversion with -97

        if (coordinate2 % 2 == 0) {
            if (coordinate1 % 2 == 0) {
                return false;
            }
            else {
                return true;
            }
        } else {
            if (coordinate1 % 2 == 0) {
                return true;
            } else {
                return false;
            }
        }
    }
}
