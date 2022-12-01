import java.util.ArrayList;

public class SolutionFirstLetterToAppearTwice {

    public static void main(String[] args)
    {
        new SolutionFirstLetterToAppearTwice();
    }

    public SolutionFirstLetterToAppearTwice() {
        repeatedCharacter("abcdd");
    }

    public char repeatedCharacter(String s) {
        ArrayList<Character> foundCharacters = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (foundCharacters.contains(s.charAt(i))){
                System.out.println(s.charAt(i));
                return s.charAt(i);
            }
            foundCharacters.add(s.charAt(i));
        }
        return 0;
    }
}
