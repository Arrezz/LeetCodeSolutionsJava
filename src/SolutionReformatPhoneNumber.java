public class SolutionReformatPhoneNumber {
    public SolutionReformatPhoneNumber() {
        //reformatNumber("1-23-45 6");
        reformatNumber("12");
    }
    public static void main(String[] args) {
        new SolutionReformatPhoneNumber();
    }

    public String reformatNumber(String number) {
        number = number.replace(" ", "");
        number = number.replace("-","");

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < number.length() - 4;i++) {
            if (i % 3 == 0 && i != 0) {
                stringBuilder.append('-');
            }
            stringBuilder.append(number.charAt(i));
        }

        if (number.length() < 4) {
            return number;
        }
        if (number.length() == 4) {
            stringBuilder.append(number, 0, 2);
            stringBuilder.append('-');
            stringBuilder.append(number, 2, 4);
            return stringBuilder.toString();
        }

        if (number.length() % 3 == 0) {
            stringBuilder.append(number, number.length()-4, number.length()-3);
            stringBuilder.append('-');
            stringBuilder.append(number.substring(number.length()-3));
        } else if (number.length() % 3 == 1) {
            stringBuilder.append('-');
            stringBuilder.append(number, number.length()-4, number.length()-2);
            stringBuilder.append('-');
            stringBuilder.append(number, number.length()-2, number.length());
        } else {
            stringBuilder.append(number, number.length()-4, number.length()-2);
            stringBuilder.append('-');
            stringBuilder.append(number.substring(number.length()-2));
        }
        return stringBuilder.toString();
    }
}
