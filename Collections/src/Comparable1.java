import java.util.*;
class Student1 implements Comparable<Student1> {
    int rollno;
    String name;
    int age;
    Student1(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
    // Compare students based on age
    public int compareTo(Student1 st) {
        if (age==st.age)
            return 0;
        else if (age>st.age)
            return 1;
        else
            return -1;
    }
}
public class Comparable1 {
    public static void main(String[] args) {
        ArrayList<Student1> list=new ArrayList<>();
        list.add(new Student1(101, "Vijay", 23));
        list.add(new Student1(106, "Ajay", 27));
        list.add(new Student1(105, "Jai", 21));
        // Sort using compareTo()
        Collections.sort(list);
        System.out.println("Students sorted by age:");
        for (Student1 st : list) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
    }
}