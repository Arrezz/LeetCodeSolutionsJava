public class SolutionCheckIfAWordOccursAsAPrefixOfAnyWordInASentence {
    public SolutionCheckIfAWordOccursAsAPrefixOfAnyWordInASentence() {
        isPrefixOfWord("i love eating burgers", "burg");
    }

    public static void main(String[] args) {
        new SolutionCheckIfAWordOccursAsAPrefixOfAnyWordInASentence();
    }

    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        for(int i = 0; i < words.length; i++) {
            if (words[i].startsWith(searchWord)) {
                return i + 1;
            }
        }
        return -1;
    }
}
