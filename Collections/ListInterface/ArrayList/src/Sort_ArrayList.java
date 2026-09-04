import java.util.*;
public class Sort_ArrayList {
    public static void main(String[] args) {
        List<String> list1=new ArrayList<>();
        list1.add("Mango");
        list1.add("Apple");
        list1.add("Kiwi");
        Collections.sort(list1);
        for (String fruits:list1){
            System.out.println(fruits);
        }
        System.out.println("Sorting numbers: ");
        List<Integer> list2=new ArrayList<>();
        list2.add(20);
        list2.add(44);
        list2.add(8);
        Collections.sort(list2);
        for(Integer num:list2){
            System.out.println(num);
        }
    }
}
