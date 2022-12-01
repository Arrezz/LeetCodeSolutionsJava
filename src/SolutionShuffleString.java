public class SolutionShuffleString {
    public SolutionShuffleString() {
        restoreString("codeleet", new int[]{4,5,6,7,0,2,1,3});
    }


    public static void main(String[] args){
        new SolutionShuffleString();
    }


    public String restoreString(String s, int[] indices) {
        char[] answer = new char[indices.length];
        for (int i = 0; i < s.length(); i++){
            answer[indices[i]] = s.charAt(i);
        }
        System.out.println(new String(answer));
        return new String(answer);
    }
}
