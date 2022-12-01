public class SolutionReverseWordsInAStringIII {
    public SolutionReverseWordsInAStringIII() {
        reverseWords("Let's take LeetCode contest");
    }
    public static void main(String[] args) {
        new SolutionReverseWordsInAStringIII();
    }

    public String reverseWords(String s) {
        String[] split = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for(String word : split) {
            StringBuilder reversed = new StringBuilder();
            ans.append(reversed.append(word).reverse());
            ans.append(" ");
        }
        System.out.println(ans);
        return ans.toString().trim();
    }
}
