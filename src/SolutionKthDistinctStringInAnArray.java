import java.util.LinkedHashMap;
import java.util.Map;

public class SolutionKthDistinctStringInAnArray {
    public SolutionKthDistinctStringInAnArray() {
        kthDistinct(new String[]{"d","b","c","b","c","a"}, 2);
    }

    public static void main(String[] args) {
        new SolutionKthDistinctStringInAnArray();
    }

    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> occurenceMap = new LinkedHashMap<>();
        int count = 0;
        for(String word : arr) {
            occurenceMap.merge(word, 1, Integer::sum);
        }
        for(String key : occurenceMap.keySet()) {
            if (occurenceMap.get(key) == 1) {
                count++;
                if (count == k) {
                    return key;
                }
            }
        }
        return "";
    }
}
