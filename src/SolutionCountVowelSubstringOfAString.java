import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SolutionCountVowelSubstringOfAString {
    public SolutionCountVowelSubstringOfAString() {
        countVowelSubstrings("cuaieuouac");
    }

    public static void main(String[] args) {
        new SolutionCountVowelSubstringOfAString();
    }

    public int countVowelSubstrings(String word){
        int ans = 0;
        Set<Character> foundVowels;
        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a','e','i','o','u'));
        for(int i = 0; i < word.length(); i++) {
            foundVowels = new HashSet<>();
            for(int j = i; j < word.length(); j++) {
                if (!vowels.contains(word.charAt(j))) {
                    break;
                }
                foundVowels.add(word.charAt(j));
                if(foundVowels.size() == 5) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
