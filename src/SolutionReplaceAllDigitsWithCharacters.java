import java.util.ArrayList;
import java.util.Arrays;

public class SolutionReplaceAllDigitsWithCharacters {
    public SolutionReplaceAllDigitsWithCharacters() {
        replaceDigits("a1c1e1");
    }

    public static void main(String[] args) {
        new SolutionReplaceAllDigitsWithCharacters();
    }

    ArrayList<Character> alphabet = new ArrayList<>(Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'));

    public String replaceDigits(String s) {
        StringBuilder builder = new StringBuilder(s);
        for(int i = 1; i < s.length(); i = i + 2) {
            int shiftAmount = alphabet.indexOf(builder.charAt(i-1)) + builder.charAt(i) - 48;
            builder.replace(i, i+1, String.valueOf(alphabet.get(shiftAmount % 26)));
        }
        return builder.toString();
    }
}
