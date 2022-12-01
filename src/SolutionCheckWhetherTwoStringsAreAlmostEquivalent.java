public class SolutionCheckWhetherTwoStringsAreAlmostEquivalent {
    public SolutionCheckWhetherTwoStringsAreAlmostEquivalent() {
        checkAlmostEquivalent("abaaacc", "abcdeef");
    }

    public static void main(String[] args) {
        new SolutionCheckWhetherTwoStringsAreAlmostEquivalent();
    }

    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] frequenciesWord1 = new int[26];
        int[] frequenciesWord2 = new int[26];

        for(char character : word1.toCharArray()) {
            frequenciesWord1[character - 'a'] += 1;
        }

        for(char character : word2.toCharArray()) {
            frequenciesWord2[character - 'a'] += 1;
        }

        for(int i = 0; i < frequenciesWord1.length; i++) {
            if (Math.abs(frequenciesWord1[i] - frequenciesWord2[i]) > 3) {
                return false;
            }
        }
        return true;
    }
}
