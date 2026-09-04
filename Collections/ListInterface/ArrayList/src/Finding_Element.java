import java.util.*;
public class Finding_Element {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Jahnavi");
        list.add("Pranathi");
        list.add("Shanmukha");
        if (list.contains("Jahnavi")) {
            System.out.println("Jahnavi is present");
        } else {
            System.out.println("Jahnavi is not present");
        }
    }
}