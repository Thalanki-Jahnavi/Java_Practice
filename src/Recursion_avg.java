import java.util.*;
public class Recursion_avg {
    static int sum_natural_numbers(int n) {
        if(n==1) {
            return 1;
        }
        return n+sum_natural_numbers(n-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        System.out.println("Sum = " + sum_natural_numbers(n));
    }
}
