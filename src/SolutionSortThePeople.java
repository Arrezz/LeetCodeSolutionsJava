import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SolutionSortThePeople {

    public static void main(String[] args) {
        new SolutionSortThePeople();
    }
    public SolutionSortThePeople() {
        sortPeople(new String[]{"Mary", "John", "Emma"}, new int[]{180,165,170});
    }

    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> heightToPeople = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            heightToPeople.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        int i = names.length - 1;
        for(int height : heights) {
            names[i--] = heightToPeople.get(height);
        }
        return names;
    }
}
