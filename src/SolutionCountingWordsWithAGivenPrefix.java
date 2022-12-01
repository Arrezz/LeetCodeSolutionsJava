import java.util.Arrays;

public class SolutionCountingWordsWithAGivenPrefix {
    public SolutionCountingWordsWithAGivenPrefix() {
        prefixCount(new String[]{"pay", "attention", "practice", "attend"}, "at");
    }


    public static void main(String[] args) {
        new SolutionCountingWordsWithAGivenPrefix();
    }

    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for(String word : words) {
            if (word.startsWith(pref)) {
                count++;
            }
        }
        return count;
    }
}
