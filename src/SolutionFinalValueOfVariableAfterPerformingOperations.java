public class SolutionFinalValueOfVariableAfterPerformingOperations {

    public static void main(String[] args) {
        new SolutionFinalValueOfVariableAfterPerformingOperations();
    }

    public SolutionFinalValueOfVariableAfterPerformingOperations() {
        finalValueAfterOperations(new String[] {"--X","X++","X++"});
    }

    public int finalValueAfterOperations(String[] operations) {
        int value = 0;
        for (String operation: operations) {
            if (operation.contains("-")) {
                value--;
            } else
            {
                value++;
            }
        }
        return value;
    }
}
