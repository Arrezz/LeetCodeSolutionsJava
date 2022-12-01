public class SolutionCheckIfWordEqualsSummationOfTwoWords {
    public SolutionCheckIfWordEqualsSummationOfTwoWords() {
        isSumEqual("acb", "cba", "cdb");
    }

    public static void main(String[] args) {
        new SolutionCheckIfWordEqualsSummationOfTwoWords();
    }


    public int sumString(String word) {
        String result = "";
        for(char c : word.toCharArray()) {
            result += c-97;
        }
        return Integer.parseInt(result);
    }

    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return sumString(firstWord) + sumString(secondWord) == sumString(targetWord);
    }
}
