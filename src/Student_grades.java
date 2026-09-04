import java.util.*;
public class Student_grades {
    public static void main(String[] args) {
        int s1,s2,s3,s4,s5,total,avg;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 subject marks: ");
        s1=sc.nextInt();
        s2=sc.nextInt();
        s3=sc.nextInt();
        s4=sc.nextInt();
        s5=sc.nextInt();
        total=s1+s2+s3+s4+s5;
        avg=total/5;
        System.out.println("Average: "+avg);
        if(avg>=90){
            System.out.println("O grade");
        }
        else if(avg>=80 && avg<=89){
            System.out.println("A grade");
        }
        else if(avg>=70 && avg<=79){
            System.out.println("B grade");
        }
        else if(avg>=60 && avg<=69){
            System.out.println("C grade");
        }
        else if(avg>=50 && avg<=59){
            System.out.println("D grade");
        }
        else if(avg>=40 && avg<=49){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}
