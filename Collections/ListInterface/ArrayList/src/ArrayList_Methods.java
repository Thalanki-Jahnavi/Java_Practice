import java.util.*;
public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<Object> list=new ArrayList<>();
        list.add(10);
        list.add("Jahnavi");
        list.add('A');
        list.add(88.8);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        ArrayList<Object> list1=new ArrayList<>();
        list1.add("Shanmukha");
        list1.add("Jahnavi");
        list.addAll(list1);
        System.out.println(list);
        list.retainAll(list1);
        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.size());
    }
}
