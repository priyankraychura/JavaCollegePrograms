import java.util.ArrayList;
import java.util.Collection;

public class PR31_CollectionEg {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        collection.add("One");
        collection.add("Two");
        collection.add("Three");

        for (String element: collection){
            System.out.println(element);
        }
    }
}
