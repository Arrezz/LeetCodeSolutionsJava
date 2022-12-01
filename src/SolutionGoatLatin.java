import java.util.ArrayList;
import java.util.Arrays;

public class SolutionGoatLatin {
    public SolutionGoatLatin() {
        toGoatLatin("I speak Goat Latin");
    }

    public static void main(String[] args) {
        new SolutionGoatLatin();
    }

    public String toGoatLatin(String sentence) {
        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        String[] words = sentence.split(" ");
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < words.length; i++){
            if (vowels.contains(words[i].charAt(0))) {
                builder.append(words[i]);
            } else {
                String firstCharacter = String.valueOf(words[i].charAt(0));
                builder.append(words[i].substring(1));
                builder.append(firstCharacter);
            }
            builder.append("ma");
            builder.append("a".repeat(i+1));
            builder.append(" ");
        }
        return builder.toString().strip();
    }
}
