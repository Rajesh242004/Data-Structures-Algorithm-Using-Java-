package Lists.LinkedList;
import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(26);
        list.add(76);
        list.addFirst(0);
        list.addLast(100);

        System.out.println("LinkedList :"+list);

        list.remove(2);
        list.removeFirst();
        list.removeLast();

        System.out.println("After removal: "+list);

    }
}
