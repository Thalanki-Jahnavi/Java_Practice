import java.util.*;
public class Methods {
    public static void main(String[] args) {
        Deque<String> deque=new ArrayDeque<String>();
        deque.offer("Jahnavi");
        deque.offer("Pranathi");
        deque.add("Shanmukha");
        deque.offerFirst("Teja");
        System.out.println("After offerFirst Traversal...");
        for(String s:deque){
            System.out.println(s);
        }
        deque.pollLast();
        System.out.println("After pollLast() Traversal...");
        for(String s:deque){
            System.out.println(s);
        }
    }
}