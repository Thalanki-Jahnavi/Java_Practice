import java.util.*;
public class CollectionsExample {
    public static void main(String[] args) {
        // 1. addAll() - Add multiple elements
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "Java", "SQL", "HTML", "CSS");
        System.out.println("Original List: " + list);
        // 2. sort() - Sort elements in ascending order
        Collections.sort(list);
        System.out.println("After sort(): " + list);
        // 3. reverse() - Reverse the list
        Collections.reverse(list);
        System.out.println("After reverse(): " + list);
        // 4. shuffle() - Randomly rearrange elements
        Collections.shuffle(list);
        System.out.println("After shuffle(): " + list);
        // 5. max() - Find maximum element
        System.out.println("Maximum: " + Collections.max(list));
        // 6. min() - Find minimum element
        System.out.println("Minimum: " + Collections.min(list));
        // 7. binarySearch() - Search an element
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int position = Collections.binarySearch(numbers, 30);
        System.out.println("Position of 30: " + position);
        // 8. frequency() - Count occurrence of an element
        List<String> languages = new ArrayList<>(
                Arrays.asList(
                        "Java",
                        "SQL",
                        "Java",
                        "HTML",
                        "Java"
                )
        );
        System.out.println("Frequency of Java: " + Collections.frequency(languages, "Java"));
        // 9. swap() - Swap two elements
        List<String> names = new ArrayList<>(Arrays.asList("Jahnavi", "Priya", "Anu"));
        Collections.swap(names, 0, 2);
        System.out.println("After swap(): " + names);
        // 10. fill() - Replace all elements
        List<String> fillList = new ArrayList<>(Arrays.asList("A", "B", "C"));
        Collections.fill(
                fillList, "Java"
        );
        System.out.println("After fill(): " + fillList);
        // 11. replaceAll() - Replace matching elements
        List<String> replaceList = new ArrayList<>(Arrays.asList("Java", "SQL", "Java", "HTML"));
        Collections.replaceAll(replaceList, "Java", "Spring");
        System.out.println("After replaceAll(): " + replaceList);
        // 12. copy() - Copy elements from one list to another
        List<String> source = new ArrayList<>(Arrays.asList("Java", "SQL", "HTML"));
        List<String> destination = new ArrayList<>(Arrays.asList("A","B", "C"));
        Collections.copy(destination, source);
        System.out.println("After copy(): " + destination);
    }
}