import java.util.*;
enum Days {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}
public class EnumSet1 {
    public static void main(String[] args) {
        EnumSet<Days> set = EnumSet.of(Days.MONDAY, Days.FRIDAY);
        System.out.println(set);
    }
}