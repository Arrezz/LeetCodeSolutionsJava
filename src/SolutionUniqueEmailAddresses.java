import java.util.HashSet;
import java.util.Set;

public class SolutionUniqueEmailAddresses {
    public SolutionUniqueEmailAddresses() {
        numUniqueEmails(new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"});
    }

    public static void main(String[] args) {
        new SolutionUniqueEmailAddresses();
    }

    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        for(String email : emails) {
            boolean domainPart = false;
            boolean plusSign = false;
            StringBuilder stringBuilder = new StringBuilder();
            for(Character character : email.toCharArray()) {
                if (character == '@') {
                    domainPart = true;
                }
                if (character == '+') {
                    plusSign = true;
                }
                if (domainPart) {
                    stringBuilder.append(character);
                }
                if (!domainPart && character != '.' && !plusSign) {
                    stringBuilder.append(character);
                }
            }
            uniqueEmails.add(stringBuilder.toString());
        }
        return uniqueEmails.size();
    }
}
