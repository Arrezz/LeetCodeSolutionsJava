public class SolutionCountPrefixesOfAGivenString {
    public SolutionCountPrefixesOfAGivenString() {
        countPrefixes(new String[]{"a","b","c","ab","bc","abc"}, "abc");
    }

    public static void main(String [] args) {
        new SolutionCountPrefixesOfAGivenString();
    }

    public int countPrefixes(String[] words, String s) {
        int count = 0;
        for(String word : words) {
            if (s.startsWith(word)) count++;
        }
        return count;
    }
}
