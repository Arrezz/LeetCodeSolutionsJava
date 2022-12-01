public class SolutionDefangingAnIpAddress {
    public static void main(String[] args) {
        new SolutionDefangingAnIpAddress();
    }

    public SolutionDefangingAnIpAddress() {
        defangIPaddr("1.1.1.1");
    }
    public String defangIPaddr(String address) {
        System.out.println(address.replace(".", "[.]"));
        return address.replace(".", "[.]");
    }
}
