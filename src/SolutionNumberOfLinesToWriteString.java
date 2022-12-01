public class SolutionNumberOfLinesToWriteString {
    public SolutionNumberOfLinesToWriteString() {
        numberOfLines(new int[]{10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10}, "abcdefghijklmnopqrstuvwxyz");
    }

    public static void main(String[] args) {
        new SolutionNumberOfLinesToWriteString();
    }

    public int[] numberOfLines(int[] widths, String s) {
        int lines = 1;
        int width = 0;
        for(char character : s.toCharArray()) {
            int currCharacterWidth = widths[character - 97];
            if (currCharacterWidth + width > 100) {
                width = 0;
                lines += 1;
            }
            width += currCharacterWidth;
        }
        return new int[]{lines,width};
    }
}
