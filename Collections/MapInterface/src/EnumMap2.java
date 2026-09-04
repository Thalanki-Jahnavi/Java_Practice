import java.util.*;
public class EnumMap2{
    enum Days {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY
    }
    public static void main(String[] args) {
        // 1. Creating EnumMap using constructor
        EnumMap<Days, String> map=new EnumMap<>(Days.class);
        // 2. put() - Add key-value pairs
        map.put(Days.MONDAY,"Java");
        map.put(Days.TUESDAY,"SQL");
        map.put(Days.WEDNESDAY,"HTML");
        map.put(Days.THURSDAY,"CSS");
        System.out.println("Original Map: " +map);
        // 3. get() - Get value using key
        System.out.println("Value of MONDAY: "+map.get(Days.MONDAY));
        // 4. containsKey() - Check whether key exists
        System.out.println("Contains MONDAY? " +map.containsKey(Days.MONDAY));
        // 5. containsValue() - Check whether value exists
        System.out.println("Contains Java? "+map.containsValue("Java"));
        // 6. size() - Number of mappings
        System.out.println("Size: "+map.size());
        // 7. keySet() - Get all keys
        System.out.println("Keys: "+map.keySet());
        // 8. values() - Get all values
        System.out.println("Values: "+map.values());
        // 9. entrySet() - Get key-value pairs
        System.out.println("Entries:");
        for (Map.Entry<Days, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
        // 10. putAll() - Copy mappings from another map
        EnumMap<Days, String> map2=new EnumMap<>(Days.class);
        map2.put(Days.FRIDAY,"Spring Boot");
        map.putAll(map2);
        System.out.println("After putAll(): "+map);
        // 11. remove() - Remove a mapping
        map.remove(Days.THURSDAY);
        System.out.println("After remove(THURSDAY): "+map);
        // 12. clone() - Create a copy
        EnumMap<Days, String> map3=map.clone();
        System.out.println("Cloned Map: "+map3);
        // 13. equals() - Compare two maps
        System.out.println("map equals map3? "+map.equals(map3));
        // 14. hashCode() - Get hash code
        System.out.println("HashCode: "+map.hashCode());
        // 15. clear() - Remove all mappings
        map.clear();
        System.out.println("After clear(): "+map);
    }
}