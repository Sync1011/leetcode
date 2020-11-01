import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/reformat-date/
 */
public class ReformatData1507 {
    public static void main(String[] args) {
        ReformatData1507 main = new ReformatData1507();
        main.reformatDate("20th Oct 2052");
    }

    public String reformatDate(String date) {
        Map<String, String> monthMap = new HashMap<>();
        monthMap.put("Jan", "01");
        monthMap.put("Feb", "02");
        monthMap.put("Mar", "03");
        monthMap.put("Apr", "04");
        monthMap.put("May", "05");
        monthMap.put("Jun", "06");
        monthMap.put("Jul", "07");
        monthMap.put("Aug", "08");
        monthMap.put("Sep", "09");
        monthMap.put("Oct", "10");
        monthMap.put("Nov", "11");
        monthMap.put("Dec", "12");
        String res = "";
        String[] words = date.split(" ");
        res += words[2] + "-" + monthMap.get(words[1]) + "-";
        if (words[0].length() == 3) {
            res += "0" + words[0].substring(0, 1);
        } else {
            res += words[0].substring(0, 2);
        }
        return res;
    }
}
