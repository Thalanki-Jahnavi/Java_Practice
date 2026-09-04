import java.util.*;
class Student2 {
    int rollno;
    String name;
    int age;
    Student2(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}
class NameComparator implements Comparator<Student2> {
    public int compare(Student2 s1, Student2 s2) {
        return s1.name.compareTo(s2.name);
    }
}
public class Comparator1 {
    public static void main(String[] args) {
        ArrayList<Student2> list = new ArrayList<>();
        list.add(new Student2(101, "Vijay", 23));
        list.add(new Student2(106, "Ajay", 27));
        list.add(new Student2(105, "Jai", 21));
        Collections.sort(list, new NameComparator());
        for (Student2 st : list) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
    }
}