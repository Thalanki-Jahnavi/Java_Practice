import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        double first,second,result;
        System.out.println("Enter 2 numbers: ");
        Scanner sc=new Scanner(System.in);
        first=sc.nextDouble();
        second= sc.nextDouble();
        System.out.println("Select any operator(+,-,*,/,%): ");
        char operator=sc.next().charAt(0);
        switch (operator){
            case '+':
                result=first+second;
                System.out.println(first+" "+operator+" "+second+" = "+result);
                break;
            case '-':
                result=first-second;
                System.out.println(first+" "+operator+" "+second+" = "+result);
                break;
            case '*':
                result=first*second;
                System.out.println(first+" "+operator+" "+second+" = "+result);
                break;
            case '/':
                result=first/second;
                System.out.println(first+" "+operator+" "+second+" = "+result);
                break;
            case '%':
                result=first%second;
                System.out.println(first+" "+operator+" "+second+" = "+result);
                break;
            default:
                System.out.println("Invalid Operator");break;
        }
    }
}
