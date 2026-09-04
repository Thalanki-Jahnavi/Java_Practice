import java.util.*;
public class Remove_Duplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);
        ArrayList<Integer> unique=new ArrayList<>();
        for (Integer num:list) {
            if (!unique.contains(num)) {
                unique.add(num);
            }
        }
        System.out.println(unique);
    }
}