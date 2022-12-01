import java.util.HashMap;
import java.util.Map;

public class SolutionCheckIfTheSentenceIsPangram {
    public SolutionCheckIfTheSentenceIsPangram() {
        //checkIfPangram("thequickbrownfoxjumpsoverthelazydog");
        checkIfPangram("thebrownfoxjumpsoverthelazydog");
    }

    public static void main(String[] args) {
        new SolutionCheckIfTheSentenceIsPangram();
    }

    public boolean checkIfPangram(String sentence) {
        boolean ans = true;
        Map<Character , Integer> alphabetCount = new HashMap<>();
        for(char character : sentence.toCharArray()) {
            alphabetCount.merge(character, 1, Integer::sum);
        }

        if (alphabetCount.values().size() != 26) {
            ans = false;
        }
        System.out.println(ans);
        return ans;
    }
}
