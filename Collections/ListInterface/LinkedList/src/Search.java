import java.util.*;
public class Search {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        int key = 20;
        if(list.contains(key)) {
            System.out.println("Element found");
        }
        else {
            System.out.println("Element not found");
        }
    }
}