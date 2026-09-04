import java.util.*;
public class Example {
    public static void main(String[] args) {
        Deque<String> deque=new ArrayDeque<String>();
        deque.add("Jahnavi");
        deque.add("Pranathi");
        deque.add("Shanmukha");
        for (String str:deque) {
            System.out.println(str);
        }
    }
} 