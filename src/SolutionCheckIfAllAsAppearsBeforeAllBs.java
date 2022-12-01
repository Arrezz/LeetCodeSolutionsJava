public class SolutionCheckIfAllAsAppearsBeforeAllBs {
    public SolutionCheckIfAllAsAppearsBeforeAllBs() {
        checkString("aaabbbb");
    }

    public static void main(String[] args) {
        new SolutionCheckIfAllAsAppearsBeforeAllBs();
    }

    public boolean checkString(String s) {
        return !s.contains("ba");
    }
}
