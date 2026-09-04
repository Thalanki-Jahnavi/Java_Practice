import java.util.ArrayDeque;
import java.util.Deque;
public class Dequeue {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(10);
        deque.addLast(20);
        deque.addFirst(5);
        deque.addLast(30);
        System.out.println("Deque: " + deque);
        System.out.println("First: " + deque.peekFirst());
        System.out.println("Last: " + deque.peekLast());
        deque.removeFirst();
        deque.removeLast();
        System.out.println("After removing: " + deque);
    }
}