import java.util.*;
public class Vector_Example {
    public static void main(String[] args) {
        Vector v1=new Vector();
        v1.add("Jahnavi");
        v1.add("Pranathi");
        v1.add(0,"Shanmukha");
        System.out.println(v1);
        System.out.println(v1.size());
        System.out.println(v1.capacity());
        Vector v2=new Vector();
        v2.add("Teja");
        v2.add("Manasa");
        v1.addAll(v2);
        System.out.println(v2);
        for(int i=0;i<v2.size();i++){
            v1.add(v2.get(i));
        }
        System.out.println(v1);
        System.out.println(v1.get(2));
        Object[] ar=v1.toArray();
        System.out.println(Arrays.toString(ar));
        v1.remove(0);
        System.out.println(v1);
        v1.removeAll(v2);
        System.out.println(v1);
        System.out.println(v1.contains("Pranathi"));
        System.out.println(v1.containsAll(v2));
        v1.set(1,"Chandu");
        System.out.println(v1);
        v1.clear();
        System.out.println(v1);
    }
}
