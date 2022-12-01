public class SolutionGoalParserInterpretation {
    public static void main(String[] args){
        new SolutionGoalParserInterpretation();
    }

    public SolutionGoalParserInterpretation() {
        interpret("G()(al)");
    }

    public String interpret(String command) {
        return command.replace("(al)", "al").replace("()", "o");
    }
}
