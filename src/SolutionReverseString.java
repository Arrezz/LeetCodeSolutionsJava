public class SolutionReverseString {
    public SolutionReverseString() {
        reverseString(new char[]{'h','e','l','l','o'});
    }

    public static void main(String[] args) {
        new SolutionReverseString();
    }

    public void reverseString(char[] s) {
        int i;
        int j = s.length - 1;

        for(i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            j--;
        }
    }
}
