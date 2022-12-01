import java.util.Arrays;

public class SolutionTwoSum {

    public static void main(String[] args)
    {
        new SolutionTwoSum();
    }

    public SolutionTwoSum() {
        twoSum(new int[]{3,2,4}, 6);
    }

    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    System.out.println(i);
                    System.out.println(j);
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}