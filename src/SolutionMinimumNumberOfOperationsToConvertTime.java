public class SolutionMinimumNumberOfOperationsToConvertTime {
    public SolutionMinimumNumberOfOperationsToConvertTime() {
        convertTime("02:30","04:35");
    }

    public static void main(String [] args) {
        new SolutionMinimumNumberOfOperationsToConvertTime();
    }

    public int convertTime(String current, String correct) {
        int currHour = (current.charAt(0) - '0') * 10 + current.charAt(1) - '0';
        int currMinute = (current.charAt(3) - '0') * 10 + current.charAt(4) - '0';
        int toHour = (correct.charAt(0) - '0') * 10 + correct.charAt(1) - '0';
        int toMinute = (correct.charAt(3) - '0') * 10 + correct.charAt(4) - '0';

        int currTime = currHour * 60 + currMinute;
        int toTime = toHour * 60 + toMinute;

        int diffTime = Math.abs(currTime - toTime);
        int ans = 0;

        while(diffTime >= 60) {
            diffTime -= 60;
            ans++;
        }
        while(diffTime >= 15) {
            diffTime -= 15;
            ans++;
        }
        while (diffTime >= 5) {
            diffTime -= 5;
            ans++;
        }
        while (diffTime >= 1) {
            diffTime -= 1;
            ans++;
        }
        return ans;
    }
}
