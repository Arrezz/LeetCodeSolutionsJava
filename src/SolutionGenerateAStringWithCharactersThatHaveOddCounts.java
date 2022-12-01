public class SolutionGenerateAStringWithCharactersThatHaveOddCounts {
    public SolutionGenerateAStringWithCharactersThatHaveOddCounts() {
        generateTheString(4);
    }

    public static void main(String[] args) {
        new SolutionGenerateAStringWithCharactersThatHaveOddCounts();
    }

    public String generateTheString(int n) {
        String s = "n";
        if (n % 2 == 0) {
            return s.repeat(n-1) + "m";
        } else {
            return s.repeat(n);
        }
    }
}
