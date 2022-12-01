public class SolutionFindFirstPalindromicStringInTheArray {
    public SolutionFindFirstPalindromicStringInTheArray() {
        firstPalindrome(new String[]{"abc","car","ada","racecar","cool"});
    }
    public static void main(String[] args) {
        new SolutionFindFirstPalindromicStringInTheArray();
    }

    public String firstPalindrome(String[] words) {
        String ans = "";
        for(String word : words) {
            StringBuilder stringBuilder = new StringBuilder();
            String reversed = stringBuilder.append(word).reverse().toString();
            if (reversed.equals(word)) {
                ans += word;
                break;
            }
        }
        return ans;
    }
}
