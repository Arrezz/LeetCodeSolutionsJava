public class SolutionJewelsAndStones {
    public SolutionJewelsAndStones() {
     numJewelsInStones("aA", "aAAbbbb");
    }

    public static void main(String[] args) {
        new SolutionJewelsAndStones();
    }

    public int numJewelsInStones(String jewels, String stones) {
        long count = 0;
        for (Character character: jewels.toCharArray()) {
            count += stones.chars().filter(ch -> ch == character).count();
        }
        return (int) count;
    }
}
