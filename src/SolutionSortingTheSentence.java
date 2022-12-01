import java.util.HashMap;
import java.util.Map;

public class SolutionSortingTheSentence {

    public static void main(String[] args){
        new SolutionSortingTheSentence();
    }

    public SolutionSortingTheSentence() {
        sortSentence("is2 sentence4 This1 a3");
    }
    public String sortSentence(String s) {
        String answer = "";
        String[] words = s.split(" ");
        Map<Integer, String> integerStringMap = new HashMap<>();
        for (String word: words) {
            System.out.println(word.charAt(word.length()-1));
            integerStringMap.put(Integer.parseInt(String.valueOf(word.charAt(word.length()-1))), word.substring(0,word.length()-1));
        }
        for (String value:integerStringMap.values()) {
            answer += value;
            answer += " ";
        }
        return answer.trim();
    }
}
