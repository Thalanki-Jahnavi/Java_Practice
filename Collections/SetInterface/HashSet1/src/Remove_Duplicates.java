import java.util.*;
class Remove_Duplicates{
    public static void main(String[] args) {
        int[] arr={10,20,30,20,10,40};
        HashSet<Integer> set=new HashSet<>();
        for (int x:arr) {
            set.add(x);
        }
        System.out.println(set);
    }
}