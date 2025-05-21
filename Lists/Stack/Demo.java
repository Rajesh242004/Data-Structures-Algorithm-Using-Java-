package Lists.Stack;
import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("java");
        stack.push("python");
        stack.pop();
        stack.push("C");
        
        stack.push("C++");

        System.out.println(stack);
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Stack size: " + stack.size());



       
    }
}
