import java.io.*;
public class Exception5 {
    public static void main(String[] args) {
        try{
            int a=10/2;
            System.out.println(a);
            int arr[] =new int[1];
            arr[0]=10;
            arr[1]=20;
        }
        catch (ArithmeticException e){
            System.out.println("check denominator");
        }
        catch (Exception e){
            System.out.println("check denominator");
        }
    }
}
