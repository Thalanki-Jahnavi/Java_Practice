import java.util.*;
class Sorting{
    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Janu");
        map.put(2, "Chandu");
        map.put(3, "Teja");
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .forEach(System.out::println);
    }
}  