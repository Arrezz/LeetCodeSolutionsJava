import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SolutionCheckIfAllCharactersHaveEqualNumberOfOccurences {
    public SolutionCheckIfAllCharactersHaveEqualNumberOfOccurences() {
        areOccurrencesEqual("abacbc");
    }

    public static void main(String[] args) {
        new SolutionCheckIfAllCharactersHaveEqualNumberOfOccurences();
    }

    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> occurenceMap = new HashMap<>();
        for(Character character : s.toCharArray()) {
            occurenceMap.merge(character, 1,  Integer::sum);
        }
        return (new HashSet(occurenceMap.values()).size() == 1);
    }
}
