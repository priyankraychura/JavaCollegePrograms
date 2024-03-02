import java.util.HashMap;
import java.util.Map;

public class PR38_Map {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Carol", 35);

        for (Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
