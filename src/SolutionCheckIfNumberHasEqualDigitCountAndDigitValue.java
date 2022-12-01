public class SolutionCheckIfNumberHasEqualDigitCountAndDigitValue {
    public SolutionCheckIfNumberHasEqualDigitCountAndDigitValue() {
        digitCount("1210");
    }

    public static void main(String[] args) {
        new SolutionCheckIfNumberHasEqualDigitCountAndDigitValue();
    }

    public int stringMatches(String word, String match) {
        return word.length() - word.replace(match, "").length();
    }

    public boolean digitCount(String num) {
        for(int i = 0; i < num.length(); i++) {
            if (!(stringMatches(num, String.valueOf(i)) == num.charAt(i) - 48)) {
                return false;
            }
        }
        return true;
    }
}
