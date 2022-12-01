import java.util.LinkedList;
import java.util.List;

public class SolutionFizzBuzz {
    public SolutionFizzBuzz() {
        fizzBuzz(15);
    }

    public static void main(String[] args) {
        new SolutionFizzBuzz();
    }

    public List<String> fizzBuzz(int n) {
        StringBuilder stringBuilder = new StringBuilder();

        List<String> ans = new LinkedList<>();
        for(int i = 1; i <= n;i++) {
            stringBuilder.setLength(0);
            if(i % 3 == 0) {
                stringBuilder.append("Fizz");
            }
            if(i % 5 == 0) {
                stringBuilder.append("Buzz");
            }
            if(i % 5 != 0 && i % 3 != 0) {
                stringBuilder.append(i);
            }
            ans.add(stringBuilder.toString());
        }
        return ans;
    }
}