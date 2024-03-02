import java.util.SortedSet;
import java.util.TreeSet;

public class PR35_ShortedSet {
    public static void main(String[] args) {
        SortedSet<String> animals = new TreeSet<>();

        animals.add("Dog");
        animals.add("Bird");
        animals.add("Cat");
        animals.add("Snake");

        for (String animal: animals){
            System.out.println(animal);
        }
    }
}
