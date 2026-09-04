import java.util.*;
class Student1{
    int rollno;
    String name;
    int age;
    Student1(int r, String n, int a){
        rollno=r;
        name=n;
        age=a;
    }
}
public class Student {
    public static void main(String[] args) {
        ArrayList<Student1> list=new ArrayList<>();
        list.add(new Student1(101,"Teja",21));
        list.add(new Student1(102,"Janu",21));
        for (Student1 s:list){
            System.out.println(s.rollno+" "+s.name+" "+s.age);
        }
    }
}
