import java.util.EnumSet;
enum Week {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}
public class EnumSet2{
    public static void main(String[] args) {
        EnumSet<Week> set1 = EnumSet.allOf(Week.class);
        EnumSet<Week> set2 = EnumSet.noneOf(Week.class);
        System.out.println("All Days: " + set1);
        System.out.println("Empty Set: " + set2);
    }
}