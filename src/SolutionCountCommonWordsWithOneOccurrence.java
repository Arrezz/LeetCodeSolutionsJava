import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SolutionCountCommonWordsWithOneOccurrence {
    public SolutionCountCommonWordsWithOneOccurrence() {
        countWords(new String[]{"leetcode","is","amazing","as","is"}, new String[]{"amazing","leetcode","is"});
    }

    public static void main(String[] args) {
        new SolutionCountCommonWordsWithOneOccurrence();
    }

    public int countWords(String[] words1, String[] words2) {
        int ans = 0;
        Map<String, Integer> occurrenceMapWords1 = new HashMap<>();
        Map<String, Integer> occurrenceMapWords2 = new HashMap<>();

        for(String word : words1) {
            occurrenceMapWords1.put(word, occurrenceMapWords1.getOrDefault(word,0) + 1);
        }

        for(String word : words2) {
            occurrenceMapWords2.put(word, occurrenceMapWords2.getOrDefault(word,0) + 1);
        }

        for(String word : occurrenceMapWords1.keySet()) {
            if (occurrenceMapWords1.get(word) == 1 && occurrenceMapWords2.getOrDefault(word,0) == 1) {
                ans++;
            }
        }
        return ans;
    }
}
