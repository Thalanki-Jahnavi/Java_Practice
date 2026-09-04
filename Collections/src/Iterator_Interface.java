import java.util.*;
public class Iterator_Interface {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("Jahnavi");
        list.add("Pranathi");
        list.add("Shanmukha");
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
