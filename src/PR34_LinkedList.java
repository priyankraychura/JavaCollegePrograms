import java.util.LinkedList;

public class PR34_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Hello");
        linkedList.add("World");

        System.out.println(linkedList);

        linkedList.remove(0);
        System.out.println(linkedList);
    }
}
