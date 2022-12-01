import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class SolutionCountItemsMatchingARule {

    public static void main(String[] args){
        new SolutionCountItemsMatchingARule();
    }
    public SolutionCountItemsMatchingARule() {
        List<List<String>> combinations = new LinkedList<>();
        List<String> object1 = Arrays.asList("computer","silver","lenovo");
        List<String> object2 = Arrays.asList("phone","gold","iphone");
        List<String> object3 = Arrays.asList("phone","blue","pixel");
        combinations.add(object1);
        combinations.add(object2);
        combinations.add(object3);
        countMatches(combinations,"color","silver");
    }

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int answer = 0;
        int index = 0;
        if (Objects.equals(ruleKey, "color")) {
            index = 1;
        } else if (Objects.equals(ruleKey, "name")) {
            index = 2;
        }
        for (List<String> item: items) {
            if (Objects.equals(item.get(index), ruleValue)) {
                answer++;
            }
        }
        return answer;
    }
}
