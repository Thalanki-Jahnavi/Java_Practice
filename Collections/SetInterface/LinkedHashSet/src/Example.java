import java.util.*;
public class Example {
    public static void main(String[] args) {
        int[] arr={10,20,10,30,20,40,30};
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        for (int x:arr) {
            set.add(x);
        }
        System.out.println(set);
    }
}