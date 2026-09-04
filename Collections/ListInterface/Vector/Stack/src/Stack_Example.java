import java.util.*;
public class Stack_Example {
    public static void main(String[] args) {
        Stack<String> books=new Stack<>();
//        books.add("Red");
//        books.add("Black");
//        books.add(0,"White");
//        System.out.println(books);
//        books.remove(0);
//        System.out.println(books);
//        books.set(1,"Yellow");
//        System.out.println(books);
//        System.out.println(books.get(1));
//        books.clear();
//        System.out.println(books);
//        System.out.println(books.contains("White"));
        books.push("Red");
        books.push("Black");
        books.push("White");
        System.out.println(books.isEmpty());
        System.out.println(books.peek());
        System.out.println(books.search("White"));
        System.out.println(books.indexOf("White"));
        System.out.println(books.pop());
    }
}
