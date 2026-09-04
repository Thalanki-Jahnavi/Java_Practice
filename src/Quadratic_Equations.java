import java.util.*;
public class Quadratic_Equations {
    public static void main(String[] args) {
        double a,b,c,d,root1,root2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a,b,c values: ");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        d=(b*b)-4*a*c;
        if(d==0){
            System.out.println("Roots are real and equal");
            root1=-b/(2*a);
            root2=-b/(2*a);
            System.out.println("Root1: "+root1);
            System.out.println("Root2: "+root2);
        }
        else if(d>0){
            System.out.println("Roots are real and different");
            root1 = (-b+Math.sqrt(d))/(2*a);
            root2 = (-b-Math.sqrt(d))/(2*a);
            System.out.println("Root1: "+root1);
            System.out.println("Root2: "+root2);
        }
        else{
            System.out.println("Roots are imaginary");
        }
    }
}
