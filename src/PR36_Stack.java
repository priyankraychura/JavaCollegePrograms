import java.util.Stack;

public class PR36_Stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Size of stack: " + stack.size());
        System.out.println("Is the stack empty?: " + stack.isEmpty());

        int element = stack.pop();
        System.out.println("Element removed from the stack: " + element);

        System.out.println("Size of stack: " + stack.size());
    }
}
