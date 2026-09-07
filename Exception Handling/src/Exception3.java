import java.io.*;
public class Exception3 {
    public static void main(String[] args) {
        try{
            int a=10/0;
            System.out.println(a);
        }
        catch(ArithmeticException e){
            System.out.println("check the logic");
        }
        System.out.println("rest of the program");
    }
}
