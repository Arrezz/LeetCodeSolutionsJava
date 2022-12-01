public class SolutionCountBinarySubstrings {
    public SolutionCountBinarySubstrings() {
        countBinarySubstrings("00110011");
    }

    public static void main(String[] args) {
        new SolutionCountBinarySubstrings();
    }


    public int countBinarySubstrings(String s) {
        int ans = 0;
        int prevSameCount = 0;
        int currSameCount = 1;
        for(int i = 1; i < s.length();i++) {
            if (s.charAt(i) == s.charAt(i-1)) {
                currSameCount += 1;
            } else {
                prevSameCount = currSameCount;
                currSameCount = 1;
            }
            if (prevSameCount >= currSameCount) {
                ans += 1;
            }
        }
        return ans;
    }



    /*
    public int countBinarySubstrings(String s) {
        int consecZero = 0;
        int consecOne = 0;
        int ans = 0;
        for(Character character : s.toCharArray()) {
            if (character == '1') {
                if(consecZero <= consecOne) {
                    consecZero = 0;
                    consecOne = 0;
                }
                consecOne += 1;
                if (consecOne != 0 && consecOne == consecZero) {
                    ans += 1;
                }

            } else {
                if(consecZero <= consecOne) {
                    consecZero = 0;
                    consecOne = 0;
                }
                consecZero += 1;
                if (consecOne != 0 && consecOne == consecZero) {
                    ans += 1;
                }
            }
        }
        System.out.println(ans);
        return ans;
    }*/
}
