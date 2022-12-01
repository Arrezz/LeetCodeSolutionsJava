public class SolutionMaximumNumberOfWordsYouCanType {
    public SolutionMaximumNumberOfWordsYouCanType() {
        canBeTypedWords("hello world", "ad");
    }

    public static void main(String[] args) {
        new SolutionMaximumNumberOfWordsYouCanType();
    }

    public int canBeTypedWords(String text, String brokenLetters) {
        int ans = text.split(" ").length;

        for(String word: text.split(" ")) {
            for(char Character : brokenLetters.toCharArray()) {
                if (word.contains(String.valueOf(Character))) {
                    ans--;
                    break;
                }
            }
        }
        return ans;
    }
}
