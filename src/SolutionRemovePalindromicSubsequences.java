public class SolutionRemovePalindromicSubsequences {
    public SolutionRemovePalindromicSubsequences() {
        removePalindromeSub("abb");
    }

    public static void main(String[] args) {
        new SolutionRemovePalindromicSubsequences();
    }

    public int removePalindromeSub(String s) {
        if (new StringBuilder(s).reverse().toString().equals(s)) {
            return 1;
        } else {
            return 2;
        }
    }
}
