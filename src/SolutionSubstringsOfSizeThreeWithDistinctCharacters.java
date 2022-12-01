import java.util.stream.Stream;

public class SolutionSubstringsOfSizeThreeWithDistinctCharacters {
    public SolutionSubstringsOfSizeThreeWithDistinctCharacters() {
        countGoodSubstrings("xyzzaz");
    }

    public static void main(String[] args) {
        new SolutionSubstringsOfSizeThreeWithDistinctCharacters();
    }

    public int countGoodSubstrings(String s) {
        int ans = 0;
        for(int i = 1; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i-1) && s.charAt(i) != s.charAt(i+1) && s.charAt(i+1) != s.charAt(i-1)) {
                ans++;
            }
        }
        return ans;
    }
}
