import java.util.*;
public class Methods{
    public static void main(String[] args) {
        TreeMap<Integer, String> map=new TreeMap<>();
        map.put(10,"A");
        map.put(20,"B");
        map.put(30,"C");
        map.put(40,"D");
        map.put(50,"E");
        System.out.println("TreeMap: "+map);
        System.out.println("Value of key 30: "+map.get(30));
        System.out.println("Contains key 20: "+map.containsKey(20));
        System.out.println("Contains value C: "+map.containsValue("C"));
        System.out.println("Size: "+map.size());
        System.out.println("First Key: "+map.firstKey());
        System.out.println("Last Key: "+map.lastKey());
        int key=30;
        System.out.println("Lower Key of "+key+": " +map.lowerKey(key));
        System.out.println("Floor Key of "+key+": " +map.floorKey(key));
        System.out.println("Higher Key of "+key+": " +map.higherKey(key));
        System.out.println("Ceiling Key of "+key+": " +map.ceilingKey(key));
        map.remove(20);
        System.out.println("\nAfter removing key 20: "+map);
        System.out.println("\nTreeMap Traversal:");
        for (Map.Entry<Integer, String> entry:map.entrySet()) {
            System.out.println("Key: "+entry.getKey()+", Value: "+entry.getValue());
        }
        System.out.println("\nDescending Map: "+map.descendingMap());
    }
}