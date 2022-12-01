import java.util.LinkedList;
import java.util.List;

public class SolutionCellsInARangeOnAnExcelSheet {
    public SolutionCellsInARangeOnAnExcelSheet() {
        cellsInRange("K1:L2");
    }

    public static void main(String[] args) {
        new SolutionCellsInARangeOnAnExcelSheet();
    }

    public List<String> cellsInRange(String s) {
        char cellCharacterFirst = s.charAt(0);
        int cellIntFirst = Integer.parseInt(String.valueOf(s.charAt(1)));
        char cellCharacterSecond = s.charAt(3);
        int cellIntSecond = Integer.parseInt(String.valueOf(s.charAt(4)));

        LinkedList<String> ans= new LinkedList<>();

        for(int i = cellCharacterFirst; i <= cellCharacterSecond; i++) {
            for(int j = cellIntFirst; j <= cellIntSecond; j++) {
                ans.add((char) i + String.valueOf(j));
            }
        }
        return ans;
    }
}
