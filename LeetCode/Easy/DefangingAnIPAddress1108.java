/**
 * https://leetcode.com/problems/defanging-an-ip-address
 * 
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
 * A defanged IP address replaces every period "." with "[.]".
 * 
 * Input: address = "1.1.1.1"
 * Output: "1[.]1[.]1[.]1"
 */
public class DefangingAnIPAddress1108 {
    public static void main(String[] args) {
        DefangingAnIPAddress1108 main = new DefangingAnIPAddress1108();
        System.out.println(main.defangIPaddr("1.1.1.1"));
    }

    public String defangIPaddr(String address) {
        String result = "";
        for (char c : address.toCharArray()) {
            if (c == '.') {
                result += "[.]";
            } else {
                result += c;
            }
        }
        return result;
    }
}
