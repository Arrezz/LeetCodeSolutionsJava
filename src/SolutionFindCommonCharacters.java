import java.util.ArrayList;
import java.util.List;

public class SolutionFindCommonCharacters {
    public SolutionFindCommonCharacters() {
        commonChars(new String[]{"cool","lock","cook"});
    }

    public static void main(String[] args) {
        new SolutionFindCommonCharacters();
    }

    public List<String> commonChars(String[] words) {
        ArrayList<String> foundCharacters = new ArrayList<>();
        ArrayList<String> removedCharacters = new ArrayList<>();
        for(char character : words[0].toCharArray()) {
            foundCharacters.add(String.valueOf(character));
        }
        for(int i = 0; i < words.length; i++) {
            for(String character : foundCharacters) {
                if (!words[i].contains(character)) {
                    removedCharacters.add(character);
                }
            }
        }
        for(String character : removedCharacters) {
            foundCharacters.remove(character);
        }
        return foundCharacters;
    }
}
