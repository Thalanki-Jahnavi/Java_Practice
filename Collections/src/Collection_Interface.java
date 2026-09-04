import java.util.*;
public class Collection_Interface {
    public static void main(String[] args) {
        Collection<String> list=new ArrayList<>();
        list.add("Jahnavi");
        list.add("Pranathi");
        list.add("Shanmukha");
        for(String name:list){
            System.out.println(name);
        }
    }
}
