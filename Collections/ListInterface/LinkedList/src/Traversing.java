import java.util.*;
public class Traversing {
    public static void main(String[] args) {
        LinkedList<String> al=new LinkedList<>();
        al.add("Jahnavi");
        al.add("Pranathi");
        al.add("Shanmukha");
        Iterator<String> itr= al.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
