import java.util.*;
class Methods {
    public static void main(String args[]){
        LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>();
        map.put(101,"Amit");
        map.put(102,"Vijay");
        map.put(103,"Rahul");
        System.out.println("Keys: "+map.keySet());
        System.out.println("Values: "+map.values());
        System.out.println("Key-Value pairs: "+map.entrySet());
    }
}
