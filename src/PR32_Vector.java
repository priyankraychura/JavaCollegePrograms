import java.util.Vector;

public class PR32_Vector {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        vector.add("One");
        vector.add("Two");
        vector.add("Three");

        String elementAtOne = vector.get(1);
        System.out.println(elementAtOne);

        vector.remove(0);

        boolean containsThree = vector.contains("Three");
        System.out.println(containsThree);
    }
}
