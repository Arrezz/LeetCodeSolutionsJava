public class SolutionCrawlerLogFolder {
    public SolutionCrawlerLogFolder() {
        minOperations(new String[]{"./","../","./"});
    }

    public static void main(String[] args) {
        new SolutionCrawlerLogFolder();
    }

    public int minOperations(String[] logs) {
        int ans = 0;
        for(String command : logs) {
            if(command.equals("../") && ans != 0) {
                ans--;
            } else if (!command.endsWith("./")) {
                ans++;
            }
        }
        return ans;
    }
}
