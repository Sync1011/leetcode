import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/destination-city/
 * 
 * You are given the array paths, where paths[i] = [cityAi, cityBi] means there
 * exists a direct path going from cityAi to cityBi. Return the destination
 * city, that is, the city without any path outgoing to another city. It is
 * guaranteed that the graph of paths forms a line without any loop, therefore,
 * there will be exactly one destination city.
 * 
 * Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao
 * Paulo"]] Output: "Sao Paulo"
 */

public class DestinationCity1436 {
    public static void main(String[] args) {
        DestinationCity1436 main = new DestinationCity1436();
        List<String> one = new ArrayList<>();
        List<String> two = new ArrayList<>();
        List<String> three = new ArrayList<>();
        List<List<String>> external = new ArrayList<>();
        one.add("London");
        one.add("New York");
        two.add("New York");
        two.add("Lima");
        three.add("Lima");
        three.add("Sao Paulo");
        external.add(one);
        external.add(two);
        external.add(three);
        System.out.println(main.destCity(external));
    }
    
    public String destCity(List<List<String>> paths) {
        Map<String, String> cityToCityMap = new HashMap<>();
    
        // Make a map of all origin to destination and then which ever destination is not also a key, is the answer
        for (List<String> pathDuo : paths) {
            cityToCityMap.put(pathDuo.get(0), pathDuo.get(1));
        }

        for (String path : cityToCityMap.values()) {
            if (cityToCityMap.get(path) == null) {
                return path;
            }
        }
    
        return null;
    }
}
