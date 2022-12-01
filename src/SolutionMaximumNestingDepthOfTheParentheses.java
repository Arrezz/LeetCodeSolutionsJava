public class SolutionMaximumNestingDepthOfTheParentheses {

    public static void main(String[] args) {
        new SolutionMaximumNestingDepthOfTheParentheses();
    }
    public SolutionMaximumNestingDepthOfTheParentheses() {
        maxDepth("(1+(2*3)+((8)/4))+1");
    }
    public int maxDepth(String s) {
        int curr = 0;
        int max = 0;
        for(char character: s.toCharArray()) {
            if (character == '(') {
                curr++;
            } else if (character == ')') {
                curr--;
            }
            if (curr > max) {
                max = curr;
            }
        }
        return max;
    }
}
