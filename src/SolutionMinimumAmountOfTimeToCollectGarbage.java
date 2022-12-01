public class SolutionMinimumAmountOfTimeToCollectGarbage {
    public SolutionMinimumAmountOfTimeToCollectGarbage() {
        //garbageCollection(new String[]{"G", "P", "GP", "GG"}, new int[]{2,4,3});
        garbageCollection(new String[]{"MMM", "PGM", "GP"}, new int[]{3,10});
    }

    public static void main(String[] args){
        new SolutionMinimumAmountOfTimeToCollectGarbage();
    }

    public int garbageCollection(String[] garbage, int[] travel) {
        int minutes = 0;

        for (String s : garbage) {
            minutes += s.length();
        }

        int gindex = highestIndexOfGarbage(garbage, 'G');
        int pindex = highestIndexOfGarbage(garbage, 'P');
        int mindex = highestIndexOfGarbage(garbage, 'M');

        for (int i = 0; i < travel.length; i++) {
            if (gindex > i) {
                minutes += travel[i];
            }
            if (pindex > i) {
                minutes += travel[i];
            }
            if (mindex > i) {
                minutes += travel[i];
            }
        }
        return minutes;
    }


    public int highestIndexOfGarbage(String[] garbage, Character garbagetype) {
        int index = 0;
        for (int i = garbage.length - 1; i > 0; i--) {
            if (garbage[i].contains(garbagetype.toString())) {
                index = i;
                break;
            }
        }
        return index;
    }
}
