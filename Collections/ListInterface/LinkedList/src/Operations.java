import java.util.*;
public class Operations {
    public static void main(String[] args) {
        LinkedList<Object> ll=new LinkedList<>();
        ll.add(10);
        ll.add(56);
        ll.add(10);
        ll.add(0,"John");
        LinkedList<String> ll1=new LinkedList<>();
        ll1.add("Bob");
        ll1.add("Alice");
        ll.addAll(ll1);
        ll.addFirst("Catheline");
        ll.add(56);
        ll.addLast("Mary");
        System.out.println(ll);
        System.out.println(ll.size());
        System.out.println(ll.contains("Bob"));

        ll.remove("Bob");
        System.out.println(ll);
        ll.removeAll(ll1);
        System.out.println(ll);
        ll.removeFirst();
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);
        ll.removeFirstOccurrence(10);
        System.out.println(ll);
        ll.removeLastOccurrence(56);
        System.out.println(ll);
        ll.clear();
        System.out.println(ll);
    }
}
