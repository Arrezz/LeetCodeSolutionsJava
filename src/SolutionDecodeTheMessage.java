public class SolutionDecodeTheMessage {
    public static void main(String[] args) {
        new SolutionDecodeTheMessage();
    }

    public SolutionDecodeTheMessage() {
        decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv");
    }

    public String decodeMessage(String key, String message) {
        final String alphabet = "abcdefghijklmnopqrstuvwxyz";
        final char[] alphabetArray = alphabet.toCharArray();
        key = key.replaceAll("\\s","");
        String deDuplicatedKey = "";
        for (int i = 0; i < key.length(); i++) {
            if(!deDuplicatedKey.contains(String.valueOf(key.charAt(i)))) {
                deDuplicatedKey += String.valueOf(key.charAt(i));
            }
        }
        StringBuilder answer = new StringBuilder();
        for (char character: message.toCharArray()) {
            if (character != ' ') {
                answer.append(alphabetArray[deDuplicatedKey.indexOf(character)]);
            } else {
                answer.append(' ');
            }
        }
        System.out.println(answer);
        return answer.toString();
    }
}
