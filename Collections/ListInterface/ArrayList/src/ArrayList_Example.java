import java.util.*;
public class ArrayList_Example {
    public static void main(String[] args) {
        ArrayList<Object> list=new ArrayList<>();
        list.add(1);
        list.add("Jahnavi");
        list.add(true);
        list.add(99.8);
        list.add('A');
        System.out.println(list.get(2));
        System.out.println(list.get(0));
        System.out.println(list.get(3));
    }
}
