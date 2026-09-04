import java.util.*;
public class EnumMap1{
    enum Days {
        Monday,
        Tuesday,
        Wednesday,
        Thursday
    }
    public static void main(String[] args) {
        EnumMap<Days, String> map = new EnumMap<>(Days.class);
        map.put(Days.Monday, "1");
        map.put(Days.Tuesday, "2");
        map.put(Days.Wednesday, "3");
        map.put(Days.Thursday, "4");
        for (Map.Entry<Days, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}