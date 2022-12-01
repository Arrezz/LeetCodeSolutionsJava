public class SolutionCheckIfNumbersAreAscendingInASentence {
    public SolutionCheckIfNumbersAreAscendingInASentence() {
        areNumbersAscending("1 box has 3 blue 4 red 6 green and 12 yellow marbles");
    }

    public static void main(String[] args) {
        new SolutionCheckIfNumbersAreAscendingInASentence();
    }

    public boolean areNumbersAscending(String s) {
        int prev = 0;
        for(String word : s.split(" ")){
            if (word.matches("-?\\d+")) {
                if (Integer.parseInt(word) <= prev) {
                    return false;
                } else {
                    prev = Integer.parseInt(word);
                }
            }
        }
        return true;
    }
}
