import java.util.ArrayList;

public class SolutionShortestDistanceToACharacter {
    public SolutionShortestDistanceToACharacter() {
        shortestToChar("loveleetcode",'e');
    }
    public static void main(String[] args) {
        new SolutionShortestDistanceToACharacter();
    }

    public int[] shortestToChar(String s, char c) {

        ArrayList<Integer> positionsForChar = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                positionsForChar.add(i);
            }
        }
        return new int[]{1};
    }
}
