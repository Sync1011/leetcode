import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/top-k-frequent-elements/
 * 
 * Given a non-empty array of integers, return the k most frequent elements.
 */
public class TopKFrequentElements347 {
    public static void main(String[] args) {
        TopKFrequentElements347 main = new TopKFrequentElements347();
        int[] result = main.topKFrequent(new int[]{1,1,1,2,2,3}, 2);
        for (int num : result) {
            System.out.println(num);
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        // First get the frequency of each number
        // 1:3, 2:2, 3:1
        for(int n: nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        // At the count of each value, put the value it self
        // bucket [3] = 1, [2] = 2, [1] = 3
        List<Integer>[] bucket = new List[nums.length + 1];
        for (Integer c : map.keySet()) {
            int count = map.get(c);
            if (bucket[count] == null) {
                bucket[count] = new ArrayList<>();
            }
            bucket[count].add(c);
        }

        // Traverse backwards on the list above, adding the highest indexes that appear first
        // k value is decremented by the size of the list above. This is because incase two numbers appear the same amount of time
        List<Integer> resultList = new ArrayList<>();
        for (int i = bucket.length - 1; i >= 0 && k > 0; i--) {
            if (bucket[i] != null) {
                List<Integer> list = bucket[i];
                resultList.addAll(list);
                k -= list.size();
            }
        }

        int[] result = new int[resultList.size()];
        int i = 0;
        for (int num : resultList) {
            result[i++] = num;
        }
        return result;
    }
}
