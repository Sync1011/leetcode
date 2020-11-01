import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/check-if-n-and-its-double-exist/
 * 
 * Given an array arr of integers, 
 * check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).
 */
public class CheckIfNAndItsDoubleExist1346 {
    public static void main(String[] args) {
        CheckIfNAndItsDoubleExist1346 main = new CheckIfNAndItsDoubleExist1346();
        System.out.println(main.checkIfExist(new int[]{7,1,14,11}));
    }

    public boolean checkIfExist(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            if (map.containsKey(num*2)) {
                return true;
            } else if (num % 2 == 0 && map.containsKey(num/2)) {
                return true;
            }
            map.put(num, 1);
        }
        return false;
    }
}
