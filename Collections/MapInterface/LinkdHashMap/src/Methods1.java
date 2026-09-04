import java.util.*;
public class Methods1 {
    public static void main(String args[]) {
        Map<Integer,String> map=new LinkedHashMap<Integer,String>();
        map.put(101,"Aman");
        map.put(102,"Bindu");
        map.put(103,"Shresti");
        System.out.println(map);
        map.remove(102);
        System.out.println(map);
    }
}