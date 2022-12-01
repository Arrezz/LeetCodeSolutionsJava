public class SolutionTruncateSentence {
    public SolutionTruncateSentence() {
        truncateSentence("Hello how are you Contestant", 4);
    }

    public static void main(String[] args) {
        new SolutionTruncateSentence();
    }

    public String truncateSentence(String s, int k) {
        int wordCount = 0;
        int i;
        for(i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                wordCount++;
            }
            if (wordCount == k) {
                break;
            }
        }
        return s.substring(0, i);
    }
}
