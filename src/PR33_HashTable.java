import java.util.Hashtable;

public class PR33_HashTable {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        hashtable.put("One", 1);

        int value = hashtable.get("One");
        System.out.println(value);

        boolean containsTwo = hashtable.containsKey("Two");
        System.out.println(containsTwo);
    }
}
