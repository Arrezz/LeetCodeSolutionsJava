import java.util.ArrayList;

public class SolutionSplitAStringInBalancedStrings {
    public static void main(String[] args) {
        new SolutionSplitAStringInBalancedStrings();
    }

    public SolutionSplitAStringInBalancedStrings() {
        balancedStringSplit("RLRRLLRLRL");
    }

    public int balancedStringSplit(String s) {
        int answer = 0;
        int lcount = 0;
        int rcount = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'L') {
                lcount++;
            } else {
                rcount++;
            }
            if (rcount == lcount) {
                answer++;
                rcount = 0;
                lcount = 0;
            }
        }
        return answer;
    }
}
