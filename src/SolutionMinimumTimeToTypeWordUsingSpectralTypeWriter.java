import java.util.ArrayList;
import java.util.Arrays;

public class SolutionMinimumTimeToTypeWordUsingSpectralTypeWriter {
    public SolutionMinimumTimeToTypeWordUsingSpectralTypeWriter() {
        minTimeToType("abc");
    }

    public static void main(String[] args) {
        new SolutionMinimumTimeToTypeWordUsingSpectralTypeWriter();
    }

    public int minTimeToType(String word) {
        int ans = word.length();
        char previous = 'a';
        for(int i = 0; i < word.length();i++) {
            char current = word.charAt(i);
            int diff = Math.abs(current - previous);
            ans += Math.min(diff, 26-diff);
            previous = current;
        }
        return ans;
    }
}
