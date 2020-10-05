import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Given a non-empty array of integers nums, every element appears twice except for one. 
 * Find that single one.
 */

public class SingleNumber136 {
    public static void main(String[] args) {
        SingleNumber136 main = new SingleNumber136();
        System.out.println(main.singleNumber(new int[]{4,1,2,1,2}));
    }

    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : nums) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }
}
