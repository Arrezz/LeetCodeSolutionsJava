public class SolutionRemoveOutermostParentheses {
    public SolutionRemoveOutermostParentheses() {
        removeOuterParentheses("(()())(())");
    }

    public static void main(String[] args) {
        new SolutionRemoveOutermostParentheses();
    }

    public String removeOuterParentheses(String s) {
        int count = 0;
        StringBuilder ans = new StringBuilder();
        for(Character c : s.toCharArray()) {
            if (c == '(') {
                if (count != 0) {
                    ans.append('(');
                }
                count++;
            } else {
                if (count > 1) {
                    ans.append(')');
                }
                count--;
            }
        }
        return ans.toString();
    }
}
