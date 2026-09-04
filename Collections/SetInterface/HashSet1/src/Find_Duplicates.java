import java.util.*;
public class Find_Duplicates {
    public static void main(String[] args) {
        int[] arr={10,20,30,20,40,10,50};
        HashSet<Integer> set=new HashSet<>();
        for (int x:arr) {
            if (!set.add(x)) {
                System.out.println("Duplicate: " + x);
            }
        }
    }
}