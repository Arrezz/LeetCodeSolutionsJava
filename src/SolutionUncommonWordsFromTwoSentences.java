import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SolutionUncommonWordsFromTwoSentences {
    public SolutionUncommonWordsFromTwoSentences() {
        uncommonFromSentences("this apple is sweet", "this apple is sour");
    }

    public static void main(String[] args) {
        new SolutionUncommonWordsFromTwoSentences();
    }

    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String,Integer> occurrenceS1 = new HashMap<>();
        Map<String,Integer> occurrenceS2 = new HashMap<>();
        ArrayList<String> uncommonWords = new ArrayList<>();
        for(String word : s1.split(" ")) {
            occurrenceS1.merge(word, 1, Integer::sum);
        }
        for(String word : s2.split(" ")) {
            occurrenceS2.merge(word, 1, Integer::sum);
        }

        for(String word : occurrenceS1.keySet()) {
            if (occurrenceS1.get(word) == 1 && occurrenceS2.getOrDefault(word, 0) == 0) {
                uncommonWords.add(word);
            }
        }

        for(String word : occurrenceS2.keySet()) {
            if (occurrenceS2.get(word) == 1 && occurrenceS1.getOrDefault(word, 0) == 0) {
                uncommonWords.add(word);
            }
        }
        return uncommonWords.toArray(new String[0]);
    }
}
