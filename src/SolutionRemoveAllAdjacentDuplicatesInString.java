public class SolutionRemoveAllAdjacentDuplicatesInString {
    public SolutionRemoveAllAdjacentDuplicatesInString() {
        removeDuplicates("abbaca");
    }

    public static void main(String[] args) {
        new SolutionRemoveAllAdjacentDuplicatesInString();
    }


    public String removeDuplicates(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char character : s.toCharArray()) {
            int len = stringBuilder.length();
            if (len > 0 && stringBuilder.charAt(len - 1) == character) {
                stringBuilder.deleteCharAt(len - 1);
            } else {
                stringBuilder.append(character);
            }
        }
        return stringBuilder.toString();
    }
}
