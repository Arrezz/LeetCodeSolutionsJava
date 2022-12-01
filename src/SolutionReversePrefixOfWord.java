public class SolutionReversePrefixOfWord {
    public SolutionReversePrefixOfWord() {
        reversePrefix("abcdefd", 'd');
    }

    public static void main(String[] args) {
        new SolutionReversePrefixOfWord();
    }

    public String reversePrefix(String word, char ch) {
        int i;
        for(i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                break;
            }
        }
        if (i != word.length()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(word, 0, i+1).reverse();
            stringBuilder.append(word.substring(i+1));
            return stringBuilder.toString();
        }
        return word;
    }
}
