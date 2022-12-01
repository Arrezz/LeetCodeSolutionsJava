public class SolutionCheckDistancesBetweenSameLetters {
    public SolutionCheckDistancesBetweenSameLetters() {
        checkDistances("abaccb", new int[]{1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0});
    }

    public static void main(String[] args) {
        new SolutionCheckDistancesBetweenSameLetters();
    }

    public boolean checkDistances(String s, int[] distance) {
        for(int i = 0; i < s.length();i++) {
            if (!(distance[s.charAt(i) - 97] == s.lastIndexOf(s.charAt(i)) - s.indexOf(s.charAt(i)) - 1)) {
                return false;
            }
        }
        return true;
    }
}
