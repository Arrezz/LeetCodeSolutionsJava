public class SolutionCountAsterisks {
    public SolutionCountAsterisks() {
        countAsterisks("l|*e*et|c**o|*de|");
    }

    public static void main(String[] args) {
        new SolutionCountAsterisks();
    }

    public int countAsterisks(String s) {
        int ans = 0;
        boolean counting = true;
        for(char character : s.toCharArray()) {
            if (character == '|') {
                counting = !counting;
            }
            if (character == '*' && counting) {
                ans++;
            }
        }
        return ans;
    }
}
