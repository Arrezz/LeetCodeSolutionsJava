import java.util.ArrayList;

public class SolutionUniqueMorseCodeWords {
    public SolutionUniqueMorseCodeWords() {
        uniqueMorseRepresentations(new String[]{"gin","zen","gig","msg"});
    }

    public static final String[] alphabet = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    public static void main(String[] args) {
        new SolutionUniqueMorseCodeWords();
    }

    public int uniqueMorseRepresentations(String[] words) {
        int asciiConversion = 97;
        ArrayList<String> alreadyExistingCodes = new ArrayList<>();
        for(String word : words) {
            StringBuilder asciiRepresentation = new StringBuilder();
            for(char singleChar : word.toCharArray()) {
                asciiRepresentation.append(alphabet[singleChar - asciiConversion]);
            }
            if(!alreadyExistingCodes.contains(asciiRepresentation.toString())){
                alreadyExistingCodes.add(asciiRepresentation.toString());
            }
        }
        return alreadyExistingCodes.size();
    }
}
