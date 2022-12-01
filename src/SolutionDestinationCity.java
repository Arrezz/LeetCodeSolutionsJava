import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SolutionDestinationCity {
    public SolutionDestinationCity() {
        destCity(Arrays.asList(Arrays.asList("London", "New York"), Arrays.asList("New York", "Lima"), Arrays.asList("Lima", "Sao Paulo")));
    }

    public static void main(String[] args) {
        new SolutionDestinationCity();
    }

    public String destCity(List<List<String>> paths) {
        Map<String, String> mapPaths = new HashMap<>();

        for(List<String> path : paths) {
            mapPaths.put(path.get(0), path.get(1));
        }

        for(String city : mapPaths.values()) {
            if (!mapPaths.containsKey(city)) {
                return city;
            }
        }
        return "";
    }
}
