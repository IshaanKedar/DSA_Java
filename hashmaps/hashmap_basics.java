package hashmaps;

// used to link key value pairs
// keys are unique
// hashmaps are unordered
import java.util.*;


public class hashmap_basics {
    public static void main(String[] args) {
        //country(key,string) population(value,int)
        HashMap<String, Integer> map = new HashMap<>();
        //insertion
        map.put("India", 120);
        map.put("USA", 30);
        map.put("China", 150);

        System.out.println(map);

        map.put("China", 180);
        System.out.println(map); //updates the value for the specific key

        //search (lookup)
        if (map.containsKey("Indo")) {
            System.out.println("present in the map");
        }
        else {
            System.out.println("key not present");
        }

        //get
        System.out.println(map.get("China"));
        System.out.println(map.get("Indo"));

        //iteration
        

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }

}
