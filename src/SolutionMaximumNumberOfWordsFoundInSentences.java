public class SolutionMaximumNumberOfWordsFoundInSentences {
    public static void main(String[] args) {
        new SolutionMaximumNumberOfWordsFoundInSentences();
    }

    public SolutionMaximumNumberOfWordsFoundInSentences() {
        mostWordsFound(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"});
    }

    public int mostWordsFound(String[] sentences) {
        int count = 0;
        int countmax = 0;
        for (String sentence: sentences) {
            count = (int) sentence.chars().filter(ch -> ch == ' ').count();
            if (count > countmax) {
                countmax = count;
            }
        }
        return countmax + 1;
    }
}
