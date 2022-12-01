import java.util.Arrays;
import java.util.List;

public class SolutionDetermineIfTwoStringHalvesAreAlike {
    public SolutionDetermineIfTwoStringHalvesAreAlike() {
        halvesAreAlike("book");
    }


    public static void main(String[] args) {
        new SolutionDetermineIfTwoStringHalvesAreAlike();
    }

    List<Character> vowels = Arrays.asList('a','e','i','o','u','A','E','I','O','U');

    public boolean halvesAreAlike(String s) {

        int count1 = 0;
        int count2 = 0;

        for(int i = 0; i < s.length();i++) {
            if (i < s.length()/2 && vowels.contains(s.charAt(i))) {
                count1++;
            } else if (vowels.contains(s.charAt(i))){
                count2++;
            }
        }
        return count1 == count2;
    }
}
