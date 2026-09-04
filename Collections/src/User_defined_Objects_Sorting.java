import java.util.*;
class Student implements Comparable<Student> {
    String name;
    Student(String name) {
        this.name = name;
    }
    @Override
    public int compareTo(Student student) {
        return this.name.compareTo(student.name);
    }
}
public class User_defined_Objects_Sorting{
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Jahnavi"));
        list.add(new Student("Priya"));
        list.add(new Student("Pranathi"));
        list.add(new Student("Sai"));
        // Sort Student objects
        Collections.sort(list);
        System.out.println("Sorted Students:");
        for (Student student : list) {
            System.out.println(student.name);
        }
    }
}