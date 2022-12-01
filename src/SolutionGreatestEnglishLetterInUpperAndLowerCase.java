import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SolutionGreatestEnglishLetterInUpperAndLowerCase {
    public SolutionGreatestEnglishLetterInUpperAndLowerCase() {
        System.out.println(greatestLetter("nzmguNAEtJHkQaWDVSKxRCUivXpGLBcsjeobYPFwTZqrhlyOIfdM"));
    }

    public static void main(String[] args) {
        new SolutionGreatestEnglishLetterInUpperAndLowerCase();
    }

    public String greatestLetter(String s) {
        ArrayList<Character> seenCharacters = new ArrayList<>();
        ArrayList<Character> lowerAndUpperPresent = new ArrayList<>();
        for(char character : s.toCharArray()) {
            if (character < 91) {
                if (seenCharacters.contains(Character.toLowerCase(character))) {
                    lowerAndUpperPresent.add(Character.toUpperCase(character));
                }
            } else {
                if (seenCharacters.contains(Character.toUpperCase(character))) {
                    lowerAndUpperPresent.add(Character.toUpperCase(character));
                }
            }
            seenCharacters.add(character);
        }
        Collections.sort(lowerAndUpperPresent);
        if (lowerAndUpperPresent.size() != 0) {
            return String.valueOf(lowerAndUpperPresent.get(lowerAndUpperPresent.size()-1));
        }
        return "";
    }
}
