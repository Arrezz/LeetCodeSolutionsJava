import java.util.ArrayList;
import java.util.HashMap;

public class SolutionRingsAndRods {
    public SolutionRingsAndRods() {
        countPoints("B0B6G0R6R0R6G9");
    }

    public static void main(String[] args) {
        new SolutionRingsAndRods();
    }

    public int countPoints(String rings) {
        int ans = 0;

        HashMap<Integer,String> rods= new HashMap<>();

        for(int i = 0; i < rings.length(); i=i+2) {
            int rodIndex = Integer.parseInt(String.valueOf(rings.charAt(i+1)));
            if (rods.get(rodIndex) != null) {
                rods.put(rodIndex,(rings.charAt(i)) + rods.get(rodIndex));
            } else
            {
                rods.put(rodIndex,String.valueOf(rings.charAt(i)));
            }
        }

        for(String rod : rods.values()) {
            if (rod.contains("B") && rod.contains("R") && rod.contains("G")) {
                ans++;
            }
        }
        return ans;
    }
}
