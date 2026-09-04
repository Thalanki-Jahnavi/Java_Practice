import java.util.*;
public class Subject_marks {
    public static void main(String[] args) {
        int s1,s2,s3,s4,s5,total,avg;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 subject marks: ");
        s1=sc.nextInt();
        s2=sc.nextInt();
        s3=sc.nextInt();
        s4=sc.nextInt();
        s5=sc.nextInt();
        if(s1<35 || s2<35 || s3<35 || s4<35 || s5<35){
            System.out.println("Fail");
        }
        else{
            System.out.println("Pass");
        }
    }
}
