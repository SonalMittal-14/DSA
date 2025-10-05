package HashMaps;
import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        // country (key), population (value)
        HashMap<String, Integer> map = new HashMap<>();

        // insertion
        map.put("India", 120);
        map.put("USA", 30);
        map.put("China", 150);

        System.out.println(map);

        map.put("China", 200);
        System.out.println(map);
    }
}
