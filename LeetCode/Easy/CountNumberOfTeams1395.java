import java.util.HashMap;
import java.util.Map;

public class CountNumberOfTeams1395 {
    public static void main(String[] args) {
        CountNumberOfTeams1395 main = new CountNumberOfTeams1395();
        main.numTeams(new int[]{2,5,3,4,1});
    }

    public int numTeams(int[] rating) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : rating) {
            map.put(num, num);
        }

        int count = 0;

        for (int num : rating) {
            int current = 0;
        }
        return 0;
    }
}
