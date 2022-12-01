import java.util.*;

public class SolutionFindWordsThatCanBeFormedByCharacters {
    public SolutionFindWordsThatCanBeFormedByCharacters() {
        countCharacters(new String[]{"cat","bt","hat","tree"}, "atach");
    }

    public static void main(String[] args) {
        new SolutionFindWordsThatCanBeFormedByCharacters();
    }

    public int countCharacters(String[] words, String character) {
        int ans = 0;
        Map<Character, Integer> occurrenceMap = new HashMap<>();
        for(Character c : character.toCharArray()) {
            occurrenceMap.put(c, occurrenceMap.getOrDefault(c,0) + 1);
        }
        for(String word : words) {
            boolean goodWord = true;
            Map<Character, Integer> occurrenceMapCopy = new HashMap<>(occurrenceMap);
            for(Character cw : word.toCharArray()) {
                if(occurrenceMapCopy.getOrDefault(cw,0) == 0) {
                    goodWord = false;
                    break;
                } else {
                    occurrenceMapCopy.put(cw, occurrenceMapCopy.get(cw) - 1);
                }
            }
            if (goodWord) {
                ans += word.length();
            }
        }
        return ans;
    }
}

