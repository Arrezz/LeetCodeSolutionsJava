public class SolutionNumberOfStringsThatAppearAsSubStringsInWord {
    public SolutionNumberOfStringsThatAppearAsSubStringsInWord() {
        numOfStrings(new String[]{"a", "abc", "bc", "d"}, "abc");
    }

    public static void main(String[] args) {
        new SolutionNumberOfStringsThatAppearAsSubStringsInWord();
    }

    public int numOfStrings(String[] patterns, String word) {
        int ans = 0;
        for(String pattern : patterns) {
            if (word.contains(pattern)) {
                ans++;
            }
        }
        return ans;
    }
}
