import java.util.*;
public class Largest {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(50);
        list.add(20);
        list.add(80);
        list.add(30);
        int max=list.get(0);
        for (int i=1;i<list.size();i++) {
            if (list.get(i)>max) {
                max=list.get(i);
            }
        }
        System.out.println("Largest = "+max);
    }
}