public class SolutionCountTheNumberOfConsistentStrings {
    public SolutionCountTheNumberOfConsistentStrings() {
        countConsistentStrings("ab", new String[]{"ad", "bd", "aaab", "baa", "badab"});
    }

    public static void main(String[] args) {
        new SolutionCountTheNumberOfConsistentStrings();
    }

    public int countConsistentStrings(String allowed, String[] words) {
        int ans = 0;
        for(String word: words) {
            for(char character : word.toCharArray()) {
                if (allowed.indexOf(character) == -1) {
                    ans++;
                    break;
                }
            }
        }
        return words.length-ans;
    }
}
