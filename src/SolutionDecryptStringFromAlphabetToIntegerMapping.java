import java.util.ArrayList;
import java.util.Arrays;

public class SolutionDecryptStringFromAlphabetToIntegerMapping {
    public SolutionDecryptStringFromAlphabetToIntegerMapping() {
        freqAlphabets("10#11#12");
    }

    public static void main(String[] args) {
        new SolutionDecryptStringFromAlphabetToIntegerMapping();
    }

    ArrayList<Character> alphabet = new ArrayList<>(Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'));

    public String freqAlphabets(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);

        for(int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) == '#') {
                Integer number = Integer.parseInt(String.valueOf(stringBuilder.charAt(i - 2)) + stringBuilder.charAt(i - 1));
                stringBuilder.replace(i-2, i+1, String.valueOf(alphabet.get(number-1)));
            }
        }

        for(int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) < 58) {
                stringBuilder.replace(i, i+1, String.valueOf(alphabet.get(Integer.parseInt(String.valueOf(stringBuilder.charAt(i))) - 1)));
            }
        }
        return stringBuilder.toString();
    }
}
