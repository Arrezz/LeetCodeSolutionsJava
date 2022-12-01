import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SolutionCheckIfTwoStringArraysAreEquivalent {
    public SolutionCheckIfTwoStringArraysAreEquivalent() {
        arrayStringsAreEqual(new String[]{"a","bc"}, new String[]{"ab", "c"});
    }

    public static void main(String[] args) {
        new SolutionCheckIfTwoStringArraysAreEquivalent();
    }

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String combined1 = Stream.of(word1).map(String::new).collect(Collectors.joining());
        String combined2 = Stream.of(word2).map(String::new).collect(Collectors.joining());
        return combined1.equals(combined2);
    }
}
