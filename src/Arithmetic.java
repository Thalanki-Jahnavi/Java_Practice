import java.util.*;
public class Arithmetic {
    public static void main(String[] args) {
        int a,b,sum,sub,mul,div,mod;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a: ");
        a=sc.nextInt();
        System.out.print("Enter b: ");
        b=sc.nextInt();
        sum=a+b;
        sub=a-b;
        mul=a*b;
        div=a/b;
        mod=a%b;
        System.out.println("Addition: "+sum);
        System.out.println("Subtraction: "+sub);
        System.out.println("Multiplication: "+mul);
        System.out.println("Division: "+div);
        System.out.println("Modulus: "+mod);
    }
}
