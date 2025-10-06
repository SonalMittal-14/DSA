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


        if(map.containsKey("america")){
            System.out.println("key is present in the map");
        }else{
            System.out.println("key is not present in the map");
        }

        System.out.println(map.get("India"));
        System.out.println(map.get("america")); // does not exist 



        // Iteration in HashMap
        int arr[] = {12,5,18};
        for(int i=0; i<3; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        for(int val : arr){
            System.out.print(val + " ");
        }

        System.out.println();



        for(Map.Entry<String , Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }


        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + " " + map.get(key));
        }


        // Removing key from the HashMap
        map.remove("China");
        System.out.println(map);
    }
}
