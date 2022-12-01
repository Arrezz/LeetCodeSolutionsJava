public class SolutionPercentageOfLetterInString {


    public SolutionPercentageOfLetterInString() {
        percentageLetter("foobar", 'o');
    }

    public static void main(String[] args) {
        new SolutionPercentageOfLetterInString();
    }

    public int percentageLetter(String s, char letter) {
        int count = 0;
        for(char character : s.toCharArray()) {
            if (character == letter) {
                count++;
            }
        }
        return (count*100/s.length()*100)/100;
    }
}
