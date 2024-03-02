import java.util.LinkedList;
import java.util.Queue;

public class PR37_Queue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Alice");
        queue.add("Bob");
        queue.add("Carol");

        while (!queue.isEmpty()){
            String element = queue.poll();
            System.out.println(element);
        }
    }
}
