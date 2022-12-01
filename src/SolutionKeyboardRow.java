import java.util.stream.Stream;

public class SolutionKeyboardRow {
    public SolutionKeyboardRow() {
        findWords(new String[]{"Hello","Alaska","Dad","Peace"});
    }

    public static void main(String[] args) {
        new SolutionKeyboardRow();
    }

    public String[] findWords(String[] words) {
        return Stream.of(words).filter(s -> s.toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*")).toArray(String[]::new);
    }
}
