import java.util.*;
public class Occurances {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(10);
        int key=10;
        int count=0;
        for(Integer n:list) {
            if(n==key) {
                count++;
            }
        }
        System.out.println("Count = "+count);
    }
}