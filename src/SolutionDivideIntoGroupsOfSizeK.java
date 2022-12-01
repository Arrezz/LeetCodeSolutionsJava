import java.util.ArrayList;



public class SolutionDivideIntoGroupsOfSizeK {
    public SolutionDivideIntoGroupsOfSizeK() {
        divideString("abcdefghi", 3, 'x');
    }

    public static void main(String[] args) {
        new SolutionDivideIntoGroupsOfSizeK();
    }

    public String[] divideString(String s, int k, char fill) {
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 0; i <= s.length() - k;i = i + k) {
            ans.add(s.substring(i, i+k));
        }
        int remainder = s.length() % k;
        if (remainder == 0) {
            return ans.toArray(new String[0]);
        }
        ans.add(s.substring(s.length() - remainder) + String.valueOf(fill).repeat(Math.abs(remainder-k)));
        return ans.toArray(new String[0]);
    }
}
