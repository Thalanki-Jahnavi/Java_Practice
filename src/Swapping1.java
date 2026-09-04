import java.util.*;
public class Swapping1 {
    public static void main(String[] args) {
        int a,b,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a, b values: ");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Before Swapping a= "+a+" and b= "+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping a= "+a+" and b= "+b);
    }
}
